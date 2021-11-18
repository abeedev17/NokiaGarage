package com.example.mygarage.ui.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.mygarage.R
import kotlinx.android.synthetic.main.fragment_third_onboarding_screen.view.*

class ThirdOnboardingScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_onboarding_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.txtNext3.setOnClickListener {
            if (viewPager != null) {
                viewPager.currentItem = viewPager.currentItem + 1
            }
        }

        view.txtPrevious3.setOnClickListener {
            if (viewPager != null) {
                viewPager.currentItem = viewPager.currentItem - 1
            }
        }

        return view
    }
}