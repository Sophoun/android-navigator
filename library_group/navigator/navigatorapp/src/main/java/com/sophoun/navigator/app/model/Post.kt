package com.sophoun.navigator.app.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "posts")
data class Post(
    @PrimaryKey val id: Int = 0,
    val body: String = "",
    val title: String = "",
    val userId: Int = 0
)