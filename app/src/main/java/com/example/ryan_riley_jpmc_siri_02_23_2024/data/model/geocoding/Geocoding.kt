package com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.geocoding

import com.google.gson.annotations.SerializedName

data class Geocoding(
    @SerializedName("lon")
    val longitude: Double? = 0.0,
    @SerializedName("lat")
    val latitude: Double? = 0.0,
    @SerializedName("country")
    val cntry: String? = "",
    @SerializedName("local_names")
    val localNames: LocalNames? = LocalNames(),
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("state")
    val state: String? = ""
)
