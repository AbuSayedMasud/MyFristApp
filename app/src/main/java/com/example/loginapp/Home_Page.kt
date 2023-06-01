package com.example.loginapp

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.loginapp.databinding.FragmentProductBinding

class Home_Page : Fragment() {
    private var topBarTitleChangeListener: TopBarTitleChangeListener? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is TopBarTitleChangeListener) {
            topBarTitleChangeListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        topBarTitleChangeListener = null
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_home__page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            topBarTitleChangeListener?.updateTopBarTitle("Home")

    }



}