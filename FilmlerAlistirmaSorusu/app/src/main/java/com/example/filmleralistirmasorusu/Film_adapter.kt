package com.example.filmleralistirmasorusu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Film_adapter(val Film_list:ArrayList<DataFilm>):RecyclerView.Adapter<Film_adapter.FilmViewHolder>() {
    class FilmViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imageView:ImageView=itemView.findViewById(R.id.filmResim)
        val textView:TextView=itemView.findViewById(R.id.film_isim)
        val filmYonetmen:TextView=itemView.findViewById(R.id.film_yonetmen)
        val filmPuan:TextView=itemView.findViewById(R.id.film_puan)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)
        return FilmViewHolder(view)
    }

    override fun getItemCount(): Int {
        return Film_list.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val film=Film_list[position]
        holder.imageView.setImageResource(film.Image)
        holder.textView.text=film.name
        holder.filmYonetmen.text=film.yonetmen
        holder.filmPuan.text=film.puan.toString()
    }
}