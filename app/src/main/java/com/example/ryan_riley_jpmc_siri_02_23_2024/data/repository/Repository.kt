package com.example.ryan_riley_jpmc_siri_02_23_2024.data.repository

import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast.Forecast
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.geocoding.Geocoding
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather.Weather

interface Repository {
    suspend fun getWeather(latitude: Double?, longitude: Double?, units: String, apiKey: String): Weather
    suspend fun getCoordinates(query: String, limit: Int, apiKey: String): List<Geocoding>
    suspend fun getForecast(latitude: Double?, longitude: Double?, units: String, apiKey: String): Forecast
}