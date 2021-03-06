package com.holkins.football

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.holkins.football.R

/**
 * A simple [Fragment] subclass.
 */
class RulesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "Game Rules"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rules, container, false)
    }

}
