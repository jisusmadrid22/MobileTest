package com.yzdev.mobiletest.data.repository

import com.yzdev.mobiletest.data.dataSource.NoticeDao
import com.yzdev.mobiletest.data.dataSource.RestDataSource
import com.yzdev.mobiletest.domain.model.NoticeResponse
import com.yzdev.mobiletest.domain.model.entities.ArchivedNotices
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import com.yzdev.mobiletest.domain.repository.NoticeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoticeRepositoryImp @Inject constructor(
    private val dataSource: RestDataSource,
    private val noticeDao: NoticeDao
): NoticeRepository {
    override suspend fun getNoticeListApi(): NoticeResponse {

        /*noticeDao.deleteNotice()
        delay(1000)
        noticeDao.insertNotice(
            noticeApi.hits.map {
                NoticeEntity(
                    title = it.story_title ?: it.title ?: "",
                    author = it.author,
                    createdAt = it.created_at
                )
            }
        )*/
        return dataSource.getNotice()
    }

    override fun getNoticeListDb(): Flow<List<NoticeEntity>> {
        return noticeDao.getAllNotice()
    }

    override suspend fun getNoticeDb(id: Int): NoticeEntity? {
        return noticeDao.getNotice(id = id)
    }

    override suspend fun deleteNotice() {
        noticeDao.deleteNotice()
    }

    override fun getArchivedList(): Flow<List<ArchivedNotices>> {
        return noticeDao.getAllArchived()
    }
}