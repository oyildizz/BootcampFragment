package com.example.bootcampfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampfragment.databinding.FragmentBBinding


class BFragment : Fragment() {
    private lateinit var binding:FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentBBinding.inflate(inflater, container, false)
        binding.buttonToY.setOnClickListener{
            val gecis = BFragmentDirections.actionBFragment2ToYFragment2()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }

}