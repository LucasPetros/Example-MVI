package com.lucas.petros.home.presentation.scenes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.lucas.petros.core.navigation.NavigationActions
import com.lucas.petros.home.presentation.composables.ErrorScreen
import com.lucas.petros.home.presentation.composables.LoadingScreen
import com.lucas.petros.ui.LocalSpacing

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        HomeUiState.HomeLoaded(10), onHomeUiEvent = {}, navigationActions = NavigationActions(
            NavHostController(LocalContext.current)
        )
    )
}

@Composable
fun HomeScreen(
    uiState: HomeUiState,
    onHomeUiEvent: (HomeUiEvent) -> Unit,
    navigationActions: NavigationActions
) {
    Scaffold { paddingValues ->
        when (uiState) {

            is HomeUiState.HomeLoaded -> {
                HomeScreenContent(paddingValues, uiState.number, onHomeUiEvent)
            }

            is HomeUiState.Processing -> {
                LoadingScreen()
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
    value: Int?,
    onHomeUiEvent: (HomeUiEvent) -> Unit
) {
    val spacing = LocalSpacing.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .padding(spacing.spaceMedium),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Número: ${value ?: "N/A"}", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(spacing.spaceMedium))

        Button(onClick = { onHomeUiEvent(HomeUiEvent.OnRequestNumber) }) {
            Text("Fazer Solicitação")
        }
    }
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