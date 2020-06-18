package com.sophoun.navigator.app.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Transaction
import androidx.room.Query
import com.sophoun.navigator.app.model.Post
import kotlinx.coroutines.flow.Flow

@Dao
interface PostDao {
    @Query("SELECT * FROM posts")
    fun getAllAsync(): Flow<List<Post>>

    @Query("SELECT * FROM posts WHERE id = :id")
    fun getByIdAsync(id: Int): Flow<Post>

    @Query("SELECT DISTINCT * FROM posts WHERE ID = (SELECT(MAX(ID)) FROM posts)")
    fun getLastPost(): Post

    @Insert
    suspend fun insert(vararg post: Post)

    @Delete
    suspend fun delete(post: Post)

    @Query("DELETE FROM posts")
    suspend fun deleteAll()

    @Transaction
    suspend fun replaceData(posts: List<Post>) {
        deleteAll()
        posts.forEach { insert(it) }
    }
}