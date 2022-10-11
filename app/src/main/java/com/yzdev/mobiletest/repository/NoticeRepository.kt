package com.yzdev.mobiletest.repository

import com.yzdev.mobiletest.model.NoticeResponse
import com.yzdev.mobiletest.presentation.screens.notice.NoticeList

interface NoticeRepository {
    suspend fun getNoticeList(): NoticeResponse
}