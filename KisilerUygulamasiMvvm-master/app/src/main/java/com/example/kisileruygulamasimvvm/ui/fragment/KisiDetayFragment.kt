package com.example.kisileruygulamasimvvm.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.kisileruygulamasimvvm.R
import com.example.kisileruygulamasimvvm.databinding.FragmentKisiDetayBinding

class KisiDetayFragment : Fragment() {
private lateinit var tasarim: FragmentKisiDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentKisiDetayBinding.inflate(inflater,container,false)
        tasarim.toolbarKisiDetay.title="Kişi Detay"
        val bundle:KisiDetayFragmentArgs by navArgs()
        val gelenKisi=bundle.kisi

        tasarim.editTextKisiAd.setText(gelenKisi.kisiAd)
        tasarim.editTextKisiTel.setText(gelenKisi.kisiTel)

        tasarim.buttonGuncelle.setOnClickListener{
            val kisiAd=tasarim.editTextKisiAd.text.toString()
            val tel=tasarim.editTextKisiTel.text.toString()

            guncelle(gelenKisi.kisiId,kisiAd,tel)
        }


        return tasarim.root
    }
    fun guncelle(kisiId:Int,KisiAd:String,KisiTel:String){
        Log.e("Kişi guncelle","$KisiAd-$KisiTel")
    }
}