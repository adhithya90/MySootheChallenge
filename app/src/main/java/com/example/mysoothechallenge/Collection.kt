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

val alignYourBodyList = listOf(
    Collection("Inversions", R.drawable.inversions),
    Collection("Quick Yoga", R.drawable.quick_yoga),
    Collection("Stretching", R.drawable.stretching),
    Collection("Tabata", R.drawable.tabata),
    Collection("HIIT", R.drawable.hiit),
    Collection("Pre-natal Yoga", R.drawable.pre_natal_yoga)
)

val alignYourMind = listOf(
    Collection("Meditate", R.drawable.meditate),
    Collection("With kids", R.drawable.with_kids),
    Collection("With pets", R.drawable.with_pets),
    Collection("Aromatherapy", R.drawable.aromatherapy),
    Collection("On the go", R.drawable.on_the_go),
    Collection("High Stress", R.drawable.high_stress),

)

