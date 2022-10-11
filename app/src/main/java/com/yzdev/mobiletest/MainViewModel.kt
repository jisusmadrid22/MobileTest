package com.yzdev.mobiletest

import android.util.Log
import androidx.lifecycle.ViewModel
import com.yzdev.mobiletest.domain.repository.NoticeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val noticeRepositoryImp: NoticeRepository
): ViewModel() {

    suspend fun getNotice(){
        Log.d("NoticeList", "get list")
        val notice = noticeRepositoryImp.getNoticeListApi()
        Log.d("NoticeList", notice.hits.first().created_at)
    }
}