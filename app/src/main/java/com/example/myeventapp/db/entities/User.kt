package com.example.myeventapp.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User (

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    val id: Int = 0,

    @ColumnInfo(name="name")
    val name: String,

    @ColumnInfo(name="email")
    val email: String,

    @ColumnInfo(name="password")
    val password: String

)