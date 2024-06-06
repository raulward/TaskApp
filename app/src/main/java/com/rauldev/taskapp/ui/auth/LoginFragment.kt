package com.rauldev.taskapp.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rauldev.taskapp.R
import com.rauldev.taskapp.databinding.FragmentLoginBinding
import com.rauldev.taskapp.databinding.FragmentSplashScreenBinding


class LoginFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textForgotPassword.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(v: View) {
        if (v.id == R.id.text_forgot_password) {
            findNavController().navigate(R.id.action_loginFragment_to_recoverFragment)
        } else if (v.id == R.id.text_create_account) {
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
    }


}