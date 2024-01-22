package com.lucas.petros.home.presentation.scenes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(

) : ViewModel() {

    private val _uiState = mutableStateOf<HomeUiState>(HomeUiState.HomeLoaded(null))
    val uiState: State<HomeUiState>
        get() = _uiState

    fun refreshScreen() {
        _uiState.value = HomeUiState.HomeLoaded(0)
    }

    fun loadData() {}

    fun onEvent(event: HomeUiEvent) {
        when (event) {
            is HomeUiEvent.OnRetryButtonClicked -> loadData()
            is HomeUiEvent.OnRequestNumber -> {}
        }
    }
}