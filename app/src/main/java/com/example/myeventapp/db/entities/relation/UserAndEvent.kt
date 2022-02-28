package com.example.myeventapp.db.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.myeventapp.db.entities.Event
import com.example.myeventapp.db.entities.User

data class UserAndEvent (

    @Embedded val user: User,
    @Relation(
        parentColumn = "id",
        entityColumn = "userId"
    )
    val event: List<Event>

)