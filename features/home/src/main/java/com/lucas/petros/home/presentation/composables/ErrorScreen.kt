package com.lucas.petros.home.presentation.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.lucas.petros.ui.theme.Pink40
import com.lucas.petros.ui.theme.PurpleGrey80
import com.lucas.petros.ui.theme.Typography


const val ErrorScreenTestTag = "ErrorScreenTestTag"

@Composable
fun ErrorScreen(errorMessage: String, onRetryButtonClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .testTag(ErrorScreenTestTag)
            .background(Color.White)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                modifier = Modifier
                    .padding(16.dp),
                style = Typography.h1,
                color = Color.Black,
                text = "Error Title",
                textAlign = TextAlign.Center
            )

            if (errorMessage.isNotBlank()) {
                Text(
                    modifier = Modifier
                        .padding(16.dp),
                    style = Typography.body1,
                    color = PurpleGrey80,
                    text = errorMessage,
                    textAlign = TextAlign.Center
                )
            }

            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                onClick = { onRetryButtonClick() },
                colors = ButtonDefaults.buttonColors(backgroundColor = Pink40)
            ) {
                Text(
                    text = "error description",
                    color = Color.White
                )
            }
        }
    }
}