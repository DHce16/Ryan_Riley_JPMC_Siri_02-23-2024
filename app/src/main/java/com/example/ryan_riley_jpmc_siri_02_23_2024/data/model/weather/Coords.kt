package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather

import com.google.gson.annotations.SerializedName

data class Coords(
    @SerializedName("lon")
    val longitude: Double? = 0.0,
    @SerializedName("lat")
    val latitude: Double? = 0.0
)
