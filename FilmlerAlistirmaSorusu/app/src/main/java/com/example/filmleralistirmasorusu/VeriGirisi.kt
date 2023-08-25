package com.example.filmleralistirmasorusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TextView
import com.example.filmleralistirmasorusu.databinding.ActivityMainBinding
import com.example.filmleralistirmasorusu.databinding.ActivityVeriGirisiBinding

class VeriGirisi : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
     var FilmIsmi : TextView? = null
     var FilmYonetmeni : TextView? = null
    var FilmPuani : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityVeriGirisiBinding.inflate(LayoutInflater.from(applicationContext))
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        FilmIsmi=findViewById<TextView>(R.id.film_ismi)
        FilmYonetmeni=findViewById<TextView>(R.id.film_yonetmeni)
        FilmPuani=findViewById<TextView>(R.id.film_puani)
        binding.uygulabutton.setOnClickListener{
            intent= Intent(applicationContext,MainActivity::class.java)
            intent.putExtra("isim",FilmIsmi!!.text.toString())
            intent.putExtra("yonetmen",FilmYonetmeni!!.text.toString())
            intent.putExtra("puan",FilmPuani!!.text.toString())
            startActivity(intent)
        }

    }

}