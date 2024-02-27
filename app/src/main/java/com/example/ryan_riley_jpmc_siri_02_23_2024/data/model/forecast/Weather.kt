package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast

import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("icon")
    val icon: String? = "",
    @SerializedName("id")
    val id: Int? = 0,
    @SerializedName("main")
    val main: String? = ""
)
