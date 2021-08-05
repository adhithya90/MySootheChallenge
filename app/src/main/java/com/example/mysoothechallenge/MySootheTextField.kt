package com.example.mysoothechallenge

import android.content.res.Configuration
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.example.mysoothechallenge.ui.theme.MySootheChallengeTheme
import com.example.mysoothechallenge.ui.theme.Shapes


@Composable
fun  MySootheTextField(
    modifier: Modifier = Modifier,
    labelText: String,
    leadingIcon: ImageVector? = null

) {
    TextField(
        value = "",
        onValueChange = { },
        label = {
            Text(text = labelText)
        },
        leadingIcon = {
            if (leadingIcon != null) {
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = null
                )
            }
        },
        modifier = modifier.fillMaxWidth()

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
private fun MySootheTextFieldPreview() {
    MySootheChallengeTheme() {
        MySootheTextField(labelText = "Test")
    }

}