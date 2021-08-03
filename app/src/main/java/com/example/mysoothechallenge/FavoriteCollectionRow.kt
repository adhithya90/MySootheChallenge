package com.example.mysoothechallenge

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothechallenge.ui.theme.MySootheChallengeTheme


@Composable
fun FavoriteCollectionRow(
    collections: List<Collection>,
) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        items(collections) { collection ->
            FavoriteCollectionCard(collection = collection)
        }
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
private fun FavoriteCollectionRowPreview() {

    MySootheChallengeTheme {
        FavoriteCollectionRow(favoriteCollectionOne)
    }

}
