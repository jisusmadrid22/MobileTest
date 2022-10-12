package com.yzdev.mobiletest.domain.model.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ArchivedNotices")
data class ArchivedNotices(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val author: String,
    val createdAt: String,
    val story_id: String,
    val url: String
)
