package com.example.androidtesting.data.remote.responses

data class ImageResponse(
    val hits: List<ImageResult>,
    val total: Int,
    val totalHits: Int
)
