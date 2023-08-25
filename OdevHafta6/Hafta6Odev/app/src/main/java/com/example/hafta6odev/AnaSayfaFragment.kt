package com.example.hafta6odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.hafta6odev.databinding.ActivityMainBinding
import com.example.hafta6odev.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentAnaSayfaBinding.inflate(inflater,container,false)
        binding.buttonAnaSayfa.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.AraSayfayaGecis)
        }
        return (binding.root)
    }

}