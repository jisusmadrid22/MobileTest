package com.yzdev.mobiletest

import android.util.Log
import androidx.lifecycle.ViewModel
import com.yzdev.mobiletest.data.NoticeRepositoryImp
import com.yzdev.mobiletest.repository.NoticeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val noticeRepositoryImp: NoticeRepository
): ViewModel() {

    suspend fun getNotice(){
        val notice = noticeRepositoryImp.getNoticeList()
        Log.d("NoticeList", notice.toString())
    }
}