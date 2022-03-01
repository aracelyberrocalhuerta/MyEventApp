package com.example.myeventapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.myeventapp.databinding.FragmentRegisterBinding
import com.example.myeventapp.db.entities.User


class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnRegister.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            val name = binding.etName.text.toString()
            val user2 = db.userDao().findUserByEmail(email)
            if(user2 != null){
                Toast.makeText(requireContext(), "El correo ya existe", Toast.LENGTH_SHORT).show()

            }else{
                val user = User(name = name, email = email, password = password)
                db.userDao().insert(user)
            }

        }
    }


}