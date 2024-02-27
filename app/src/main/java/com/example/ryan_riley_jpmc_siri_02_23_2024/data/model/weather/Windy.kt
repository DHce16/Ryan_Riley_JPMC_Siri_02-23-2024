package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather

import com.google.gson.annotations.SerializedName

data class Windy(
    @SerializedName("deg")
    val deg: Int? = 0,
    @SerializedName("speed")
    val velocity: Double? = 0.0
)
