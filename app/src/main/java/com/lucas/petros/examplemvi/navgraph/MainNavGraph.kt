package com.lucas.petros.examplemvi.navgraph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lucas.petros.core.navigation.NavigationActions
import com.lucas.petros.core.navigation.Route

import com.lucas.petros.home.presentation.navigation.routes.HomeRoute

@Composable
fun MainNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = Route.HOME,
    navigationActions: NavigationActions
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(route = Route.HOME) {
            HomeRoute(navigationActions)
        }
    }
}