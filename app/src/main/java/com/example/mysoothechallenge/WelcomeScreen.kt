package com.example.mysoothechallenge

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothechallenge.ui.theme.MySootheButton
import com.example.mysoothechallenge.ui.theme.MySootheChallengeTheme

@Composable
fun WelcomeScreen(
    loginButtonClicked: () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background)
    ) {
        WelcomeBackground()
        ButtonColumn(modifier = Modifier.align(Alignment.Center),
        loginButtonClicked = loginButtonClicked)
    }

}

@Composable
private fun ButtonColumn(
    modifier: Modifier,
    loginButtonClicked: () -> Unit,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(horizontal = 16.dp)

    ) {
        AppLogo()

        Spacer(modifier = Modifier.height(32.dp))


        MySootheButton(
            onClick = { },
            buttonText = "Sign up"
        )

        Spacer(modifier = Modifier.height(8.dp))

        MySootheButton(
            onClick = loginButtonClicked ,
            buttonText = "Log in",
            backgroundColor = MaterialTheme.colors.secondary
        )
    }
}

@Composable
private fun AppLogo() {
    val isLight = MaterialTheme.colors.isLight
    val appLogoRes = if (isLight) {
        R.drawable.ic_light_logo
    } else {
        R.drawable.ic_dark_logo
    }

    Image(
        painter = painterResource(id = appLogoRes),
        contentDescription = "MySoothe logo",
    )
}

@Composable
private fun WelcomeBackground() {
    val isLight = MaterialTheme.colors.isLight
    val backgroundResource = if (isLight) {
        R.drawable.ic_light_welcome
    } else {
        R.drawable.ic_dark_welcome
    }

    Image(
        painter = painterResource(id = backgroundResource),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.FillBounds
    )
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
private fun WelcomeScreenPreview() {
    MySootheChallengeTheme {
        WelcomeScreen(loginButtonClicked = {})
    }
}
