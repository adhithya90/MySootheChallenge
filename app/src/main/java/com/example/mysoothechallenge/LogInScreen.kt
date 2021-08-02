package com.example.mysoothechallenge

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothechallenge.ui.theme.MySootheButton
import com.example.mysoothechallenge.ui.theme.MySootheChallengeTheme


@Composable
fun LogInScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        LoginBackground()

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LoginHeader()

            Spacer(modifier = Modifier.height(32.dp))

            MySootheTextField(labelText = "Email Address")

            Spacer(modifier = Modifier.height(8.dp))

            MySootheTextField(labelText = "Password")

            Spacer(modifier = Modifier.height(8.dp))

            MySootheButton(onClick = { }, buttonText = "Log in")

            SignUpLabel()

        }
    }
}

@Composable
private fun SignUpLabel() {
    val labelText = buildAnnotatedString {
        append("Don't have an account?")
        withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
            append("Sign up")
        }
    }
    Text(
        text = labelText,
        modifier = Modifier.paddingFromBaseline(32.dp)
    )
}

@Composable
private fun LoginHeader() {
    Text(
        text = "Log In",
        style = MaterialTheme.typography.h1,
        modifier = Modifier.paddingFromBaseline(200.dp)
    )
}

@Composable
private fun LoginBackground() {
    val isLight = MaterialTheme.colors.isLight
    val backgroundRes = if (isLight) {
        R.drawable.ic_light_login
    } else {
        R.drawable.ic_dark_login
    }

    Image(
        painter = painterResource(id = backgroundRes),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
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
private fun LogInScreenPreview() {
    MySootheChallengeTheme {
        LogInScreen()
    }
}