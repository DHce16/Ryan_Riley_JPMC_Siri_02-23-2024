package com.example.ryan_riley_jpmc_siri_02_23_2024.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.forecast.Forecast
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.weather.Weather
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.model.geocoding.Geocoding
import com.example.ryan_riley_jpmc_siri_02_23_2024.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class CurrentLocationViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel(){
    private val _weather = MutableStateFlow(Weather())
    val weather: StateFlow<Weather> = _weather.asStateFlow()

    private val _search = MutableStateFlow<List<Geocoding>>(emptyList())
    val search: StateFlow<List<Geocoding>> = _search.asStateFlow()

    private val _forecast = MutableStateFlow(Forecast())
    val forecast : StateFlow<Forecast> = _forecast.asStateFlow()

    fun getWeather(latitude: Double?, longitude: Double?, units: String, apiKey: String) {
        viewModelScope.launch(Dispatchers.IO) {
            withContext(NonCancellable) {
                val responseWeather = repository.getWeather(latitude, longitude, units, apiKey)
                val responseForecast = repository.getForecast(latitude, longitude, units, apiKey)
                _weather.value = responseWeather
                _forecast.value = responseForecast
            }
        }
    }

    fun getLocation(query: String, apiKey: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getCoordinates(query, 5, apiKey)
            _search.value = response

        }
    }
}