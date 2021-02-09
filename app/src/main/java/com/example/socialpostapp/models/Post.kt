package com.example.socialpostapp.models

data class Post(
    val text: String = "",
    val createdBy: com.google.firebase.firestore.auth.User = User(),
    val createdAt: Long = 0L,
    val likedBy: ArrayList<String> = ArrayList())