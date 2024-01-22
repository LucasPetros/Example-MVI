package com.lucas.petros.home.presentation.navigation.navgraph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucas.petros.home.presentation.navigation.Destinations.HOME_ROUTE
import com.lucas.petros.home.presentation.navigation.NavigationActions
import com.lucas.petros.home.presentation.navigation.routes.HomeRoute

@Composable
fun HomeNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = HOME_ROUTE,
    navigationActions: NavigationActions
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(route = HOME_ROUTE) {
            HomeRoute(navigationActions)
        }
    }
}