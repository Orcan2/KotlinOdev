package com.example.sehirleralistirmasorusu

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SehirAdapter(val sehirList:ArrayList<SehirData>):RecyclerView.Adapter<SehirAdapter.SehirViewHolder>() {
     class SehirViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
         val imageView:ImageView=itemView.findViewById(R.id.sehirResim)
         val textView:TextView=itemView.findViewById(R.id.SehirIsim)
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SehirViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.each_city,parent,false)
        return SehirViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sehirList.size
    }

    override fun onBindViewHolder(holder: SehirViewHolder, position: Int) {
        val sehir=sehirList[position]
        holder.imageView.setImageResource(sehir.image)
        holder.textView.text=sehir.name
    }
}