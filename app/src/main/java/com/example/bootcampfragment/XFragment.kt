package com.example.bootcampfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampfragment.databinding.FragmentXBinding


class XFragment : Fragment() {
private lateinit var binding:FragmentXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXBinding.inflate(inflater, container, false)
        binding.buttonToYFromX.setOnClickListener{
            val gecis = XFragmentDirections.actionXFragment2ToYFragment2()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }

}