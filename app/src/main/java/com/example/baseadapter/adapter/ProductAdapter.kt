package com.example.baseadapter.adapter

import android.view.ViewGroup
import com.example.baseadapter.baseAdapter.BaseAdapter
import com.example.baseadapter.baseAdapter.BaseViewHolder
import com.example.baseadapter.model.Product

class ProductAdapter(context: ViewGroup) : BaseAdapter<Product, BaseViewHolder<Product>>(ProductViewHolder(context)) {

}