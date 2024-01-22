package com.lucas.petros.home.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.lucas.petros.examplemvi.ui.ExampleMVITheme
import com.lucas.petros.home.presentation.navigation.NavigationActions
import com.lucas.petros.home.presentation.navigation.navgraph.HomeNavGraph

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeMainScreen()
        }
    }

    @Composable
    private fun HomeMainScreen() {
        ExampleMVITheme {
            val navController = rememberNavController()
            val navigationActions = remember(navController) {
                NavigationActions(navController)
            }

            HomeNavGraph(
                navController = navController,
                navigationActions = navigationActions
            )
        }
    }
}