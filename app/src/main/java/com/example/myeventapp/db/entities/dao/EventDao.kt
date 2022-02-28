package com.example.myeventapp.db.entities.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myeventapp.db.entities.Event
import com.example.myeventapp.db.entities.User

@Dao
interface EventDao {

    /* --- GET --- */
    @Query("SELECT * FROM events ORDER BY name ASC")
    fun  getAll() : List<Event>

    @Insert
    fun insert(event: Event)

    /* --- DELETE --- */

    @Query("Delete from events")
    fun deleteAll()
}