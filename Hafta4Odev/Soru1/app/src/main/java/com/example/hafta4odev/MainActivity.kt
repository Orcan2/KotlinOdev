package com.example.hafta4odev

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hafta4odev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKaydet.setOnClickListener(){
            var isim=binding.Ad.text.toString()
            var numara=binding.numara.text
            if(isim.isNotEmpty()&&numara.isNotEmpty()) {

                var prefs = this.getSharedPreferences("rehber", MODE_PRIVATE)
                var editor = prefs.edit()
                editor.putString("isim", "$isim").apply()
                editor.putString("numara", "$numara").apply()
                Toast.makeText(applicationContext, "kayıt başarılı", Toast.LENGTH_LONG).show()
                binding.Ad.text.clear()
                binding.numara.text.clear()

                intent = Intent(applicationContext, Kayitlar::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(getApplicationContext(),"Kayıt başarısız",Toast.LENGTH_LONG).show();
            }
        }
    }
}