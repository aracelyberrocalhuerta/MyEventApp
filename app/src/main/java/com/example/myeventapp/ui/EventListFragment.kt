package com.example.myeventapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myeventapp.databinding.FragmentEventListBinding
import com.example.myeventapp.db.entities.Event
import com.example.myeventapp.db.entities.User

class EventListFragment : Fragment() {

    private var _binding: FragmentEventListBinding? = null
    private val binding
        get() = _binding!!

    private val adapter = EventAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentEventListBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        //db.eventDao().deleteAll()
        //db.userDao().insert(User(name="Cely", email = "cely@gmail.com", password = "1234"))
        //db.eventDao().insert(Event(name = "CaffeTime", description = "with marta", userId = 1, date = "14/05/2000", time = "14:20"))

        binding.floatingActionButton.setOnClickListener{
            val action = EventListFragmentDirections.actionEventListFragmentToEventAddFragment()
            findNavController().navigate(action)
        }

        //adapter.submitList(db.eventDao().getAll())
        binding.rv.layoutManager = LinearLayoutManager(this.context)
        binding.rv.adapter = adapter
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}