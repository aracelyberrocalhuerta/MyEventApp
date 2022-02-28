package com.example.myeventapp.db.entities.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myeventapp.db.entities.User

@Dao
interface UserDao {

    /* --- GET --- */
    @get:Query("SELECT * FROM users order by name asc")
    val allUsers : LiveData<List<User>>

    @Query("select * from users where id = :id limit 1")
    suspend fun findUserById(id: Int): User?

    @Query("select * from users where name = :name limit 1")
    suspend fun findUserByName(name: Int): User?

    /* --- POST --- */
    @Insert
    fun insert(user: User)

    @Insert
    fun insertAll(users: List<User>): List<Long>

    /* --- DELETE --- */
    @Delete
    fun delete(user: User)

    @Query("Delete from users")
    suspend fun deleteAll()

    /* --- PUT --- */
    @Update
    fun update(user: User)
}