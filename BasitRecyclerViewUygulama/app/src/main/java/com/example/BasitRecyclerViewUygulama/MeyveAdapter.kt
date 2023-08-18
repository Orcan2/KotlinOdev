package com.example.BasitRecyclerViewUygulama

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MeyveAdapter(private val meyveList:ArrayList<MeyveData>):
    RecyclerView.Adapter<MeyveAdapter.MeyveViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeyveViewHolder {

        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.satir,parent,false)
        return MeyveViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return meyveList.size
    }

    override fun onBindViewHolder(holder: MeyveViewHolder, position: Int) {
            val currentFruit=meyveList[position]
        holder.meyveResmi.setImageResource(currentFruit.resim)
        holder.meyveIsmi.text=currentFruit.isim
    }
    class MeyveViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val meyveResmi:ImageView=itemView.findViewById(R.id.meyveResmi)
        val meyveIsmi:TextView=itemView.findViewById(R.id.meyveadi)
    }
}
