package com.yzdev.mobiletest.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yzdev.mobiletest.domain.model.entities.ArchivedNotices
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity

@Database(entities = [NoticeEntity::class, ArchivedNotices::class], version = 2)
abstract class DbDataSource(): RoomDatabase() {

    abstract fun noticeDao(): NoticeDao
}