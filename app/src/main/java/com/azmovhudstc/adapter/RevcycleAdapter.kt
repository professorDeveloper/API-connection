package com.azmovhudstc.exapleApi.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.apiconnection.R
import com.azmovhudstc.exapleApi.src.models.Data

class RecycleAdapter(private var list: ArrayList<Data>,private var activity: Activity):
    RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v=LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (list.isEmpty()){
            Toast.makeText(activity,"List bo`sh",Toast.LENGTH_SHORT).show()
        }
        else{
            var currentItem=list[position]

            holder.text.text=currentItem.englishName

        }
    }


    override fun getItemCount(): Int {
        return list.size
    }
    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var text:TextView = itemView.findViewById(R.id.text1)



    }


}