package com.lucas.petros.home.presentation.scenes

sealed class HomeUiState {
    data class HomeLoaded(val number: Int) : HomeUiState()
    object Processing : HomeUiState()
    class Error(val error: Throwable) : HomeUiState()
    object Navigate : HomeUiState()

}