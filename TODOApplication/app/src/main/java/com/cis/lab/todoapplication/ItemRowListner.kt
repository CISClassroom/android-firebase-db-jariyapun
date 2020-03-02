package com.cis.lab.todoapplication

interface ItemRowListner{
    fun modifyItemState(itemID:String,index: Int ,status:Boolean)
    fun OnItemDelete(itemID: String,index: Int)
}