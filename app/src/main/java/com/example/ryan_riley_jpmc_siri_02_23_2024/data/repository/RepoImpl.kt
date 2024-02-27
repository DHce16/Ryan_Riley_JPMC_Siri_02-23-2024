package com.example.ryan_riley_jpmc_siri_02_23_2024.data.repository

import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast.Forecast
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.geocoding.Geocoding
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather.Weather
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.utils.ApiRequest
import javax.inject.Inject

class RepoImpl @Inject constructor(
    private val apiReq: ApiRequest
): Repository  {

    override suspend fun getWeather(
        latitude: Double?,
        longitude: Double?,
        units: String,
        apiKey: String
    ): Weather = apiReq.getWeather(latitude, longitude, units, apiKey)

    override suspend fun getCoordinates(
        query: String,
        limit: Int,
        apiKey: String
    ): List<Geocoding> = apiReq.getCoordinates(query, limit, apiKey)

    override suspend fun getForecast(
        latitude: Double?,
        longitude: Double?,
        units: String,
        apiKey: String
    ): Forecast = apiReq.getForecast(latitude, longitude, units, apiKey)
}