package com.example.filmleralistirmasorusu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.filmleralistirmasorusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var FilmList:ArrayList<DataFilm>
    private lateinit var recyclerView: RecyclerView
    private lateinit var filmAdapter: Film_adapter

    override fun onCreate(savedInstanceState: Bundle?) {
       val binding=ActivityMainBinding.inflate(LayoutInflater.from(applicationContext))
   super.onCreate(savedInstanceState)
   setContentView(binding.root)
        recyclerView=findViewById(R.id.RV)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val girilenFilAd:String?=intent.getStringExtra("isim")
        val girilenYonetmen:String?=intent.getStringExtra("yonetmen")
        //val girilenPuan:Int?=intent.getStringExtra("puan")
        FilmList= ArrayList()
        FilmList.add(DataFilm(R.drawable.r1,girilenFilAd.toString(),girilenYonetmen.toString(),5))
       // FilmList.add(DataFilm(R.drawable.r2,"Veri giriniz","Veri giriniz",0))

        filmAdapter= Film_adapter(FilmList)
        recyclerView.adapter=filmAdapter
        binding.verigirisegitbutton.setOnClickListener{
            intent= Intent(applicationContext,VeriGirisi::class.java)
            startActivity(intent)
        }
    }
}