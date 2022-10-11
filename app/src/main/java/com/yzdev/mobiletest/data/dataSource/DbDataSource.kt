package com.yzdev.mobiletest.data.dataSource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity

@Database(entities = [NoticeEntity::class], version = 1)
abstract class DbDataSource(): RoomDatabase() {

    abstract fun noticeDao(): NoticeDao
}