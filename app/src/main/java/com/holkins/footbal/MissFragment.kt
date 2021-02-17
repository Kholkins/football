package com.holkins.footbal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.holkins.football.R
import com.holkins.football.databinding.FragmentMissBinding

/**
 * A simple [Fragment] subclass.
 */
class MissFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentMissBinding>(
            inflater, R.layout.fragment_miss, container, false
        )

        binding.oneMoreTimeButton.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_missFragment_to_quizFragment
            )
        }

        (activity as AppCompatActivity).supportActionBar?.title = "Soccer Quiz"

        return binding.root
    }

}
