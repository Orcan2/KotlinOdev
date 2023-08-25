package com.example.hobileralistirmasorusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    private lateinit var hobilist:ArrayList<HobiData>
    private lateinit var hobiadapter:HobiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.RV)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        hobilist= ArrayList()

        hobilist.add(HobiData(R.drawable.a,"KİTAP OKUMAK"))
        hobilist.add(HobiData(R.drawable.b,"KİTAP OKUMAK"))
        hobilist.add(HobiData(R.drawable.c,"YAZI YAZMAK"))
        hobilist.add(HobiData(R.drawable.d,"TİYATRO"))
        hobilist.add(HobiData(R.drawable.e,"BAHÇE İŞLERİ"))
        hobilist.add(HobiData(R.drawable.f,"ASTRONOMİ"))
        hobilist.add(HobiData(R.drawable.g,"BALIK TUTMAK"))
        hobilist.add(HobiData(R.drawable.h,"KAYAK"))
        hobilist.add(HobiData(R.drawable.i,"SİNEMA"))
        hobilist.add(HobiData(R.drawable.j,"MOTOSİKLET"))

        hobiadapter=HobiAdapter(hobilist)
        recyclerView.adapter=hobiadapter
    }
}