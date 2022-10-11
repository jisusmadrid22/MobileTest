package com.yzdev.mobiletest.data.dataSource

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import com.yzdev.mobiletest.presentation.screens.notice.NoticeList
import kotlinx.coroutines.flow.Flow

@Dao
interface NoticeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotice(noticeList: List<NoticeEntity>)

    @Query("SELECT * FROM NoticeTable")
    suspend fun getAllNotice(): Flow<List<NoticeEntity>>

    @Query("SELECT * FROM NoticeTable WHERE id = :id")
    suspend fun getNotice(id: Int): NoticeEntity
}