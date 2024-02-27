package com.example.ryan_riley_jpmc_siri_02_23_2024.data.utils

import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast.Forecast
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.geocoding.Geocoding
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather.Weather
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiRequest {
    @GET(ApiDetails.FORECAST)
    suspend fun getForecast(
        @Query("lat") latitude: Double?,
        @Query("lon") longitude: Double?,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): Forecast

    @GET(ApiDetails.WEATHER)
    suspend fun getWeather(
        @Query("lat") latitude: Double?,
        @Query("lon") longitude: Double?,
        @Query("units") units: String,
        @Query("appid") apiKey: String
    ): Weather

    @GET(ApiDetails.GEOCODING)
    suspend fun getCoordinates(
        @Query("q") query: String,
        @Query("limit") limit: Int,
        @Query("appid") apiKey: String
    ): List<Geocoding>
}