package com.yzdev.mobiletest

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yzdev.mobiletest.data.dataSource.DbDataSource
import com.yzdev.mobiletest.data.repository.UiStatus
import com.yzdev.mobiletest.domain.model.NoticeResponse
import com.yzdev.mobiletest.domain.model.entities.ArchivedNotices
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import com.yzdev.mobiletest.domain.repository.NoticeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val noticeRepositoryImp: NoticeRepository,
    private val database: DbDataSource
): ViewModel() {

    val noticeApi = mutableStateOf<UiStatus<List<NoticeEntity>>>(UiStatus.Loading())
    val notice = noticeRepositoryImp.getNoticeListDb().map { if (it.isEmpty()) UiStatus.Loading() else UiStatus.Success(it) }
    val archive = noticeRepositoryImp.getArchivedList()

    fun getNoticeApi(){
        Log.d("NOTICE", "GET")
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
                                createdAt = it.created_at,
                                story_id = it.story_id.toString(),
                                url = it.story_url ?: it.url ?: ""
                            )
                        }
                    )

                    notice.collect {item->

                        response.hits.forEach {
                            if(database.noticeDao().getNoticeByCode(it.story_id.toString()) == null){
                                database.noticeDao().insertUniqueNotice(
                                    NoticeEntity(
                                        title = it.story_title ?: it.title ?: "",
                                        author = it.author,
                                        createdAt = it.created_at,
                                        story_id = it.story_id.toString(),
                                        url = it.story_url ?: it.url ?: ""
                                    )
                                )
                            }
                        }
                    }
                }else{
                    noticeApi.value = UiStatus.Failure("600")
                }
                Log.d("NOTICE", "Success no catch GET")
            }catch (e: Exception){
                Log.d("NOTICE", "Catch ${e.message}")
                noticeApi.value = UiStatus.Failure("400")
            }
            /*try {

            }catch (e: Exception){
                noticeApi.value = UiStatus.Failure("Error")
                Log.d("NOTICE", "Catch")
            }*/
        }
    }

    fun deleteNotice(noticeEntity: NoticeEntity){
        viewModelScope.launch {
            database.noticeDao().insetArchived(
                ArchivedNotices(
                    noticeEntity.id,
                    noticeEntity.title,
                    noticeEntity.author,
                    noticeEntity.createdAt,
                    noticeEntity.story_id,
                    noticeEntity.url
                )
            )
        }
    }

    suspend fun getNoticeById(id: Int): NoticeEntity?{
        return database.noticeDao().getNotice(id)
    }
}