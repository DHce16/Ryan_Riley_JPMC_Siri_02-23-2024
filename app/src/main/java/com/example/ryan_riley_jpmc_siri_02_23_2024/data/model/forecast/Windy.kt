package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast

import com.google.gson.annotations.SerializedName

data class Windy(
    @SerializedName("speed")
    val velocity: Double? = 0.0,
    @SerializedName("gust")
    val blow: Double? = 0.0,
    @SerializedName("deg")
    val deg: Int? = 0
)
