package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.EachRowViewBinding

class Rvadapter(var datalist : ArrayList<Rvmodel>, var context : Context):RecyclerView.Adapter<Rvadapter.MyViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       var binding=EachRowViewBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.profile.setImageResource(datalist.get(position).profile_pic)
        holder.binding.UserName.text= datalist.get(position).user_namez
        holder.binding.otherinfo.text= datalist.get(position).other_infoz
        holder.itemView.setOnClickListener {
            Toast.makeText(context,datalist.get(position).other_infoz.toString(),Toast.LENGTH_SHORT).show()
        }
    }
    inner class MyViewHolder(var binding :EachRowViewBinding):RecyclerView.ViewHolder(binding.root)
}