package com.example.myeventapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myeventapp.R
import com.example.myeventapp.databinding.FragmentEventAddBinding

class EventAddFragment : Fragment() {
    private var _binding: FragmentEventAddBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventAddBinding.inflate(inflater, container, false)
        return binding.root    }

}