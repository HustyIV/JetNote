package com.hutsy4.jetnote.data

data class Note(
    val id: String,
    val title: String,
    val content: String,
    val createdDate: Long = System.currentTimeMillis(),

)
