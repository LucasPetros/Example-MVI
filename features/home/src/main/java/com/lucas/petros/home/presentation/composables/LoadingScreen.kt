package com.lucas.petros.home.presentation.composables

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.lucas.petros.ui.theme.Purple40


const val LoadingScreenTestTag = "LoadingScreenTestTag"

@Composable
@SuppressLint("ModifierParameter")
fun LoadingScreen(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .testTag(LoadingScreenTestTag),
    size: Dp = 44.dp
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator(
            modifier = Modifier.size(size),
            color = Purple40
        )
    }
}