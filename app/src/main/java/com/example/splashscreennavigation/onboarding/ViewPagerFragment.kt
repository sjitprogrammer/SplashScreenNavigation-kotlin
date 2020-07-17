package com.example.splashscreennavigation.onboarding


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.splashscreennavigation.R
import com.example.splashscreennavigation.onboarding.screens.FirstFragment
import com.example.splashscreennavigation.onboarding.screens.SecondFragment
import com.example.splashscreennavigation.onboarding.screens.ThirdFragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )

        var adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)
        view.viewPager2.adapter = adapter
        return view
    }


}
