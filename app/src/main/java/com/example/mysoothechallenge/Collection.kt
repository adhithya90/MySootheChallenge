package com.example.mysoothechallenge

data class Collection(
    val name: String,
    val imageRes: Int
)

val favoriteCollectionOne = listOf(
    Collection("Short Mantras", R.drawable.short_mantras),
    Collection( "Nature meditations", R.drawable.nature_meditations),
    Collection("Stress & Anxiety", R.drawable.stress_and_anxiety),
)

val favoriteCollectionTwo = listOf(
    Collection("Self-massage", R.drawable.self_massage),
    Collection("Overwhelemd", R.drawable.overwhelmed),
    Collection("Nightly wind down", R.drawable.nightly_wind_down)
)

