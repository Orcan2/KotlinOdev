package com.example.hafta4odev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hafta4odev.databinding.ActivityKayitlarBinding
import com.example.hafta4odev.databinding.ActivityMainBinding

class Kayitlar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding=ActivityKayitlarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnGeri.setOnClickListener {
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)

        }
    }
}