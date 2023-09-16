package com.example.bootcampfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.bootcampfragment.databinding.FragmentYBinding


class YFragment : Fragment() {
    private lateinit var binding:FragmentYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentYBinding.inflate( inflater, container, false)
//        val customBackPressedCallback = object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                        isEnabled = false // Geri tuşunun varsayılan davranışını engeller
//                        val fragmentManager = requireActivity().supportFragmentManager
//                        val targetFragment = AnasayfaFragment() // Hedef Fragment'ın örneğini oluşturun
//                        val transaction = fragmentManager.beginTransaction()
//                        transaction.replace(R.id.fragmentContainerView, targetFragment) // Hedef Fragment'ı yerine koyun
//                        transaction.addToBackStack(null) // Geri tuşu ile geri dönülebilmesi için işlemi geri alınabilir kılın
//                        transaction.commit() // İşlemi uygula
//            }
//        }
//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, customBackPressedCallback)
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.action_YFragment2_to_anasayfaFragment2)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this,callback)
    }

    override fun onDestroy() {
        super.onDestroy()
//        binding=null
    }

}