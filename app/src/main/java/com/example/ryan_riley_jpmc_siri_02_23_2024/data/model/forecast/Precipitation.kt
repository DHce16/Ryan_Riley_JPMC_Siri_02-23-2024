package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast

import com.google.gson.annotations.SerializedName

data class Precipitation(
    @SerializedName("3h")
    val h: Double? = 0.0
)
