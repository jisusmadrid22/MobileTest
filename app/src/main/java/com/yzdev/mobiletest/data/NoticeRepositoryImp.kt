package com.yzdev.mobiletest.data

import com.yzdev.mobiletest.dataSource.RestDataSource
import com.yzdev.mobiletest.repository.NoticeRepository
import javax.inject.Inject

class NoticeRepositoryImp @Inject constructor(
    private val dataSource: RestDataSource
): NoticeRepository {
    override suspend fun getNoticeList() {
        val notice = dataSource.getNotice()
    }
}