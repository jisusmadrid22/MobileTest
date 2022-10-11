package com.yzdev.mobiletest.domain.repository

import com.yzdev.mobiletest.domain.model.NoticeResponse
import com.yzdev.mobiletest.domain.model.entities.ArchivedNotices
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import kotlinx.coroutines.flow.Flow

interface NoticeRepository {
    suspend fun getNoticeListApi(): NoticeResponse
    fun getNoticeListDb(): Flow<List<NoticeEntity>>
    suspend fun getNoticeDb(id: Int): NoticeEntity?
    suspend fun deleteNotice()

    fun getArchivedList(): Flow<List<ArchivedNotices>>
}