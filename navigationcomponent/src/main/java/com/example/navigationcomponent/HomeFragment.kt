package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.findViewById<Button>(R.id.btnPageA).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_pageA)
        }

        view.findViewById<Button>(R.id.btnPageX).setOnClickListener {
            findNavController().navigate(R.id.action_home_to_pageX)
        }

        return view
    }
}