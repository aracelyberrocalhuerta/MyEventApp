package com.example.myeventapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myeventapp.databinding.ActivityAppBinding
import com.example.myeventapp.db.EventAppDatabase


class AppActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAppBinding

    lateinit var db: EventAppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment2)
        binding.bottomNavigationView.setupWithNavController(navController)

        val email = intent.getStringExtra("email").toString()
        Log.d("email", email)
        val bundle = Bundle()
        bundle.putString("email", email)

        val f = HomeFragment()
        f.setArguments(bundle);
    }
}
