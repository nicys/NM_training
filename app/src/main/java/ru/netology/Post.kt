package ru.netology

data class Post(
    val id: Int,
    val author: String,
    val published: String,
    val content: String,
    val likeByMe: Boolean
)