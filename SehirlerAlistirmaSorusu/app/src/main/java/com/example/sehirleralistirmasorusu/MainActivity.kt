package com.example.sehirleralistirmasorusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var sehirList:ArrayList<SehirData>
    private lateinit var recyclerView: RecyclerView
    private lateinit var sehiradapter:SehirAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.Rv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)
        sehirList= ArrayList()
        sehirList.add(SehirData(R.drawable.london,"LONDRA"))
        sehirList.add(SehirData(R.drawable.rome,"ROMA"))
        sehirList.add(SehirData(R.drawable.paris,"PARİS"))
        sehirList.add(SehirData(R.drawable.newyork,"NEW YORK"))
        sehirList.add(SehirData(R.drawable.saopaulo,"SAO PAULO"))
        sehiradapter=SehirAdapter(sehirList)
        recyclerView.adapter=sehiradapter

    }
}