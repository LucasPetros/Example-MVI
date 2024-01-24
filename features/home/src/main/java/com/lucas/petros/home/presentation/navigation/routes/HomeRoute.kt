package com.lucas.petros.home.presentation.navigation.routes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.lucas.petros.core.navigation.NavigationActions
import com.lucas.petros.home.presentation.scenes.HomeScreen
import com.lucas.petros.home.presentation.scenes.HomeViewModel


@Composable
fun HomeRoute(navigationActions: NavigationActions) {
    val viewModel = hiltViewModel<HomeViewModel>()

    LaunchedEffect(viewModel){
        viewModel.loadData()
    }

    HomeScreen(
        uiState = viewModel.uiState.value,
        onHomeUiEvent = viewModel::onEvent,
        navigationActions = navigationActions
    )
}