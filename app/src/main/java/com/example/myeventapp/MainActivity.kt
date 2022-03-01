package com.example.myeventapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.room.Room
import com.example.myeventapp.databinding.ActivityAppBinding
import com.example.myeventapp.databinding.ActivityMainBinding
import com.example.myeventapp.db.EventAppDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    lateinit var db: EventAppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Room
            .databaseBuilder(applicationContext, EventAppDatabase::class.java, "events.db")
            .allowMainThreadQueries()
            .build()
    }
}

val Fragment.db: EventAppDatabase
    get() = (requireActivity() as MainActivity).db
