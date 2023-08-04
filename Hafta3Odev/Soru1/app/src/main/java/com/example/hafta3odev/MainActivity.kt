package com.example.hafta3odev

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hafta3odev.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(LayoutInflater.from(applicationContext))
        setContentView(binding.root)
        binding.caydanlik.setOnClickListener{
            //Toast.makeText(getApplicationContext(),"Bilgilendirme mesajı",Toast.LENGTH_LONG).show();

        Toast.makeText(this,"ÇAYDANLIK SATIN ALINDI",Toast.LENGTH_LONG).show()
        }
        binding.bardak.setOnClickListener{
            Toast.makeText(this,"BARDAK SATIN ALINDI",Toast.LENGTH_LONG).show()
        }
        binding.bardakaltligi.setOnClickListener{
            Toast.makeText(this,"BARDAK ALTLIĞI SATIN ALINDI",Toast.LENGTH_LONG).show()
        }
        binding.spoon.setOnClickListener{
            Toast.makeText(this,"KAŞIK SATIN ALINDI",Toast.LENGTH_LONG).show()
        }
        setContentView(R.layout.activity_main)

    }
}