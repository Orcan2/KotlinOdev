package com.example.hobileralistirmasorusu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobiAdapter(private val hobiList:ArrayList<HobiData>):RecyclerView.Adapter<HobiAdapter.HobiViewHolder>() {

    class HobiViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val textView:TextView=itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobiViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return HobiViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobiList.size
    }

    override fun onBindViewHolder(holder: HobiViewHolder, position: Int) {
       val hobi=hobiList[position]
        holder.imageView.setImageResource(hobi.image)
        holder.textView.text=hobi.name
    }
}