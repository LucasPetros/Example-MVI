package com.lucas.petros.home.presentation.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.lucas.petros.home.presentation.navigation.Destinations.HOME_ROUTE

class NavigationActions(navController: NavHostController) {

    val navigateToHome: () -> Unit = {
        navController.navigate(HOME_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
        }
    }

    val navigateToNextScreen: () -> Unit = {
        navController.navigate("NEXT_ROUTE") {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
        }
    }
}