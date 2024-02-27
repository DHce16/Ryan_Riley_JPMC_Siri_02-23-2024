package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast

import com.google.gson.annotations.SerializedName

data class Forecast(
    @SerializedName("cod")
    val code: String? = "",
    @SerializedName("list")
    val list: List<ForecastList?> = listOf(),
    @SerializedName("cnt")
    val cnt: Int? = 0,
    @SerializedName("message")
    val message: Int? = 0
)
