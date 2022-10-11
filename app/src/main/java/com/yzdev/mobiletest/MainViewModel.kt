package com.yzdev.mobiletest

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yzdev.mobiletest.data.dataSource.DbDataSource
import com.yzdev.mobiletest.data.repository.UiStatus
import com.yzdev.mobiletest.domain.model.NoticeResponse
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import com.yzdev.mobiletest.domain.repository.NoticeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val noticeRepositoryImp: NoticeRepository,
    private val database: DbDataSource
): ViewModel() {

    private val noticeApi = mutableStateOf<UiStatus<List<NoticeEntity>>>(UiStatus.Default())

    fun getNoticeApi(){
        if (noticeApi.value is UiStatus.Loading ){ return}
        if (noticeApi.value !is UiStatus.Success){ noticeApi.value = UiStatus.Loading()}

        viewModelScope.launch {
            try {
                val response = noticeRepositoryImp.getNoticeListApi()
                if(response.hits.isNotEmpty()){
                    noticeApi.value = UiStatus.Success(
                        response.hits.map {
                            NoticeEntity(
                                title = it.story_title ?: it.title ?: "",
                                author = it.author,
                                createdAt = it.created_at
                            )
                        }
                    )
                    database.noticeDao().insertNotice(
                        response.hits.map {
                            NoticeEntity(
                                title = it.story_title ?: it.title ?: "",
                                author = it.author,
                                createdAt = it.created_at
                            )
                        }
                    )
                }else{
                    noticeApi.value = UiStatus.Failure("Error")
                }
            }catch (e: Exception){
                noticeApi.value = UiStatus.Failure("Error")
            }
        }
    }
}