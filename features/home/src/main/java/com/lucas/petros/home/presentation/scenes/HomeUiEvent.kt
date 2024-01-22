package com.lucas.petros.home.presentation.scenes

sealed class HomeUiEvent {
    object OnRetryButtonClicked : HomeUiEvent()
    object OnRequestNumber : HomeUiEvent()
}