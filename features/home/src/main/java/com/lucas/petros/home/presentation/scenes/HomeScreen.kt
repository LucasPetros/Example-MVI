package com.lucas.petros.home.presentation.scenes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.lucas.petros.core.navigation.NavigationActions
import com.lucas.petros.home.presentation.composables.ErrorScreen
import com.lucas.petros.home.presentation.composables.LoadingScreen


@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onHomeUiEvent: (HomeUiEvent) -> Unit,
    navigationActions: NavigationActions
) {
    Scaffold { paddingValues ->
        when (uiState) {

            is HomeUiState.HomeLoaded -> {
                HomeScreenContent(paddingValues, uiState.number)
            }

            is HomeUiState.Processing -> {
                LoadingScreen()
            }

            is HomeUiState.Success -> {

            }

            is HomeUiState.Navigate -> {
                navigationActions.navigateToHome
            }

            is HomeUiState.Error -> {
                HomeErrorScreen(uiState.error, onHomeUiEvent)
            }
        }
    }
}

@Composable
fun HomeScreenContent(
    paddingValues: PaddingValues,
    value: Int?
) {

}


@Composable
fun HomeErrorScreen(error: Throwable, onHomeUiEvent: (HomeUiEvent) -> Unit) {
    val message = if (error is Exception) {
        "Invalid request"
    } else "Invalid"

    ErrorScreen(
        errorMessage = message,
        onRetryButtonClick = {
            onHomeUiEvent(HomeUiEvent.OnRetryButtonClicked)
        }
    )
}