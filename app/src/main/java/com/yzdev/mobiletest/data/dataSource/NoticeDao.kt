package com.yzdev.mobiletest.data.dataSource

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yzdev.mobiletest.domain.model.entities.ArchivedNotices
import com.yzdev.mobiletest.domain.model.entities.NoticeEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface NoticeDao {

    /** notices list*/
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotice(noticeList: List<NoticeEntity>)

    @Query("SELECT * FROM NoticeTable")
    fun getAllNotice(): Flow<List<NoticeEntity>>

    @Query("SELECT * FROM NoticeTable WHERE id = :id")
    fun getNotice(id: Int): NoticeEntity?

    @Query("DELETE FROM NoticeTable")
    suspend fun deleteNotice()

    @Query("DELETE FROM NoticeTable WHERE id = :id")
    suspend fun deleteNoticeId(id: Int)

    /** archive notices*/
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insetArchived(notice: ArchivedNotices)

    @Query("SELECT * FROM ArchivedNotices WHERE id = :id")
    suspend fun getArchive(id: Int): ArchivedNotices?

    @Query("SELECT * FROM ArchivedNotices")
    fun getAllArchived(): Flow<List<ArchivedNotices>>
}