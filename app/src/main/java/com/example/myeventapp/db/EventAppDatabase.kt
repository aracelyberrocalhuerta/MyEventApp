package com.example.myeventapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myeventapp.db.entities.Event
import com.example.myeventapp.db.entities.User
import com.example.myeventapp.db.entities.dao.EventDao
import com.example.myeventapp.db.entities.dao.UserDao

@Database(
    entities = [
        User::class,
        Event::class
    ],
    version = 1,
    exportSchema = true
)
abstract class EventAppDatabase : RoomDatabase() {
    abstract fun eventDao(): EventDao
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: EventAppDatabase? = null

        fun getInstance(context: Context): EventAppDatabase = INSTANCE ?: synchronized(this){
            INSTANCE ?: buildDatabase(context).also { INSTANCE = it}
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,EventAppDatabase::class.java,"EventAppDatabase.db")
                .allowMainThreadQueries()
                .build()

    }
}