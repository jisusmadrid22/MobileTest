package com.yzdev.mobiletest.domain.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "NoticeTable")
data class NoticeEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val author: String,
    val createdAt: String
)
