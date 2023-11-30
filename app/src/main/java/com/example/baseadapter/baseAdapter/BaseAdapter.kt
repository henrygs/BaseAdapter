package com.example.baseadapter.baseAdapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<OBJ, VH: BaseViewHolder<OBJ>>(private val viewHolder: VH): RecyclerView.Adapter<VH>() {

    private var items: List<OBJ> = listOf()
    var onClickListener: OnClickListener<OBJ>? = null

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
       return viewHolder
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
            onClickListener?.onClick(items[position])
        }
    }

    open fun setList(items: List<OBJ>) {
        this.items = items
    }
}