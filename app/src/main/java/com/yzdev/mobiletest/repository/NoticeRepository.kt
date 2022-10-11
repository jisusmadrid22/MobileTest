package com.yzdev.mobiletest.repository

interface NoticeRepository {
    suspend fun getNoticeList()
}