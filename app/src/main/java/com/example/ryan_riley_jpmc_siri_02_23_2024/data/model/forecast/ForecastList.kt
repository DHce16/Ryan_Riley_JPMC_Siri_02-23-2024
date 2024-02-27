package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast

import com.google.gson.annotations.SerializedName

data class ForecastList(
    @SerializedName("pop")
    val pop: Double? = 0.0,
    @SerializedName("dt")
    val dt: Int? = 0,
    @SerializedName("dt_txt")
    val dtText: String? = "",
    @SerializedName("clouds")
    val clouds: Clouds? = Clouds(),
    @SerializedName("main")
    val main: Main? = Main(),
    @SerializedName("visibility")
    val visibility: Int? = 0,
    @SerializedName("rain")
    val precipitations: Precipitation? = Precipitation(),
    @SerializedName("sys")
    val sys: Sys? = Sys(),
    @SerializedName("wind")
    val wind: Windy? = Windy(),
    @SerializedName("weather")
    val weather: List<Weather?>? = listOf()
)
