package com.example.baseadapter.baseAdapter

interface OnClickAdapterListener<OBJ> {
    fun onClick(item: OBJ)
}

fun interface OnClickListener<OBJ> {
    fun onClick(item: OBJ)
}