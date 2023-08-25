package com.example.hafta6odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hafta6odev.databinding.FragmentAnaSayfaBinding
import com.example.hafta6odev.databinding.FragmentAraSayfaBinding

class AraSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAraSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAraSayfaBinding.inflate(inflater,container,false)
        binding.buttonAraSayfa.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.SonSayfayaGecis)
        }
        return (binding.root)
    }

}