package com.example.baseadapter.baseAdapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<OBJ>(itemView: View) : RecyclerView.ViewHolder(itemView){
    abstract fun bind(obj: OBJ)
}