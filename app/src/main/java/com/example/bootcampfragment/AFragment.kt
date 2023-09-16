package com.example.bootcampfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampfragment.databinding.FragmentABinding
import com.example.bootcampfragment.databinding.FragmentBBinding


class AFragment : Fragment() {
    private lateinit var binding:FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.buttonToB.setOnClickListener{
            val gecis = AFragmentDirections.actionAFragment2ToBFragment2()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }
}


