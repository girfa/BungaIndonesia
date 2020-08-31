package com.bunga.husnayain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class BungaAdapter(val list: ArrayList<Bunga>, val listener: AdapterView.OnItemClickListener) : RecyclerView.Adapter<BungaAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemGambar: CircleImageView = itemView.findViewById(R.id.item_gambar)
        val itemNama: TextView = itemView.findViewById(R.id.item_nama)
        val itemLatin : TextView = itemView.findViewById(R.id.item_latin)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bunga = list[position]
        holder.itemGambar.setImageResource(bunga.gambar)
        holder.itemNama.setText(bunga.nama)
        holder.itemLatin.setText(bunga.latin)
        holder.itemView.setOnClickListener(View.OnClickListener {
            listener.onItemClick(null, holder.itemView, position, holder.itemId)
        })
    }

}