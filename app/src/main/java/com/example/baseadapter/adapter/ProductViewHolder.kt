package com.example.baseadapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.baseadapter.baseAdapter.BaseViewHolder
import com.example.baseadapter.databinding.ItemProductBinding
import com.example.baseadapter.model.Product

class ProductViewHolder<PRODUCT: Product>(parent: ViewGroup,
                                          private val binding:ItemProductBinding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false) ): BaseViewHolder<PRODUCT>(binding.root) {
    override fun bind(product: PRODUCT) {
        with(binding) {
            product.apply {
                nameTextView.text = name
                valueTextView.text = value.toString()
            }
        }
    }
}