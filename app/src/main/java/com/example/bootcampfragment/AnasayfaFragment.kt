package com.example.bootcampfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampfragment.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        binding.buttonToA.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragment2ToAFragment2()
            Navigation.findNavController(it).navigate(gecis)
        }
        binding.buttonToX.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragment2ToXFragment2()
            Navigation.findNavController(it).navigate(gecis)
        }
        return binding.root
    }


}