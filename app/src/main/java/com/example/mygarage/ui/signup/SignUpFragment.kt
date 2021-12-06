package com.example.mygarage.ui.signup

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.mygarage.R
import com.example.mygarage.databinding.FragmentSignUpBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SignUpFragment : Fragment() {

    private val signUpViewModel by viewModel<SignUpViewModel>()
    private lateinit var binding: FragmentSignUpBinding

    // This property is only valid between onCreateView and
    // onDestroyView.

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sign_up, container, false
        )
        binding.viewModel = signUpViewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goBackTxt.setOnClickListener {
            findNavController().navigate(
                R.id.action_signUpFragment_to_signInFragment
            )
        }
        binding.signUpBtn.setOnClickListener {
            signUpViewModel.signUpBtnClick()
        }
        signUpViewModel.signUp.observe(viewLifecycleOwner, {
            Log.d("signUP", it.fullName)
            findNavController().navigate(R.id.action_signUpFragment_to_navigation_home)
        })
        signUpViewModel.isEnabled.observe(viewLifecycleOwner, {
            binding.signUpBtn.isEnabled = it
            setStyle(it)
        })
    }

    private fun setStyle(isEnabled: Boolean) {
        binding.run {
            if (isEnabled) {
                signUpBtn.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.primary_blue))
                errorText.visibility = View.GONE

            } else {
                signUpBtn.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.list_color5))
                errorText.text = getString(R.string.please_fill_all_fields)
            }
        }

    }
}