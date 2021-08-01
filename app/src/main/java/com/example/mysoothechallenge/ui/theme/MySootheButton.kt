package com.example.mysoothechallenge.ui.theme

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MySootheButton(
    onClick: () -> Unit,
    buttonText: String,
    backgroundColor: Color = MaterialTheme.colors.primary
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .height(72.dp)
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor
        )

    ) {
        Text(text = buttonText.uppercase())
    }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
private fun ButtonPreview() {
    MySootheChallengeTheme() {
        MySootheButton(onClick = { /*TODO*/ }, buttonText = "Button Preview")
    }
}