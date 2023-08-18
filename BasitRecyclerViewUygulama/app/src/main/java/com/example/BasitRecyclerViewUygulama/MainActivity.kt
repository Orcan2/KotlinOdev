package com.example.BasitRecyclerViewUygulama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //String m1[]={"Çilek","Karpuz","Erik"};
   private lateinit var newRecyclerView: RecyclerView
   private lateinit var newArrayList: ArrayList<MeyveData>
   lateinit var imageId:Array<Int>
   lateinit var name:Array<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageId= arrayOf(R.drawable.nar,R.drawable.seftali,R.drawable.erik,R.drawable.karpuz)
        name= arrayOf("NAR","ŞEFTALİ","ERİK","KARPUZ")
        newRecyclerView=findViewById(R.id.rv)
        newRecyclerView.layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        newRecyclerView.setHasFixedSize(true)
        newArrayList= arrayListOf<MeyveData>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val Meyvelers=MeyveData(imageId[i],name[i])
            newArrayList.add(Meyvelers)
        }
        newRecyclerView.adapter=MeyveAdapter(newArrayList)
    }
}