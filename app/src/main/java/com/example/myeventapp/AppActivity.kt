package com.example.myeventapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.room.Room
import com.example.myeventapp.databinding.ActivityAppBinding
import com.example.myeventapp.db.EventAppDatabase
import com.example.myeventapp.ui.EventListFragment

class AppActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAppBinding

    lateinit var db: EventAppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment2)
        binding.bottomNavigationView.setupWithNavController(navController)


    }
}
