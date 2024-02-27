package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather

import com.google.gson.annotations.SerializedName

data class Main(
    @SerializedName("temp_max")
    val maxTemp: Double? = 0.0,
    @SerializedName("temp_min")
    val minTemp: Double? = 0.0,
    @SerializedName("feels_like")
    val seemsLike: Double? = 0.0,
    @SerializedName("humidity")
    val moisture: Int? = 0,
    @SerializedName("pressure")
    val pressure: Int? = 0,
    @SerializedName("temp")
    val temperature: Double? = 0.0
)
