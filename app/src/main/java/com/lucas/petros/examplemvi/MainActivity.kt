package com.lucas.petros.examplemvi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController
import com.lucas.petros.core.navigation.NavigationActions
import com.lucas.petros.examplemvi.navgraph.MainNavGraph
import com.lucas.petros.ui.theme.ExampleMVITheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }

    @Composable
    private fun MainScreen() {
        ExampleMVITheme {
            val navController = rememberNavController()
            val navigationActions = remember(navController) {
                NavigationActions(navController)
            }

            MainNavGraph(
                navController = navController,
                navigationActions = navigationActions
            )
        }
    }
}