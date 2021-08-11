package com.example.to_doapp

interface UpdateAndDelete {
    fun modifyItem(itemUID:String,isDone:Boolean)
    fun onItemDelete(itemUID: String)
}