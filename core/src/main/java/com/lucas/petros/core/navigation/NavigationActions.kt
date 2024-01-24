package com.lucas.petros.core.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

class NavigationActions(navController: NavHostController) {

    val navigateToHome: () -> Unit = {
        navController.navigate(Route.HOME) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
        }
    }
}