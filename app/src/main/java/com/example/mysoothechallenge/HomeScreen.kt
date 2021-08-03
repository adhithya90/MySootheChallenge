package com.example.mysoothechallenge

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothechallenge.ui.theme.MySootheChallengeTheme


@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Spacer(modifier = Modifier.height(72.dp))
            MySootheTextField(
                labelText = "Search",
                leadingIcon = Icons.Default.Search
            )
            FavoriteCollectionSection()

        }
    }
}


@Composable
fun FavoriteCollectionSection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "FAVORITE COLLECTIONS",
            modifier = Modifier.paddingFromBaseline(40.dp),
            style = MaterialTheme.typography.h2

        )
        FavoriteCollectionRow(collections = favoriteCollectionOne)
        FavoriteCollectionRow(collections = favoriteCollectionTwo)
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
private fun HomeScreenPreview() {
    MySootheChallengeTheme {
        HomeScreen()
    }

}