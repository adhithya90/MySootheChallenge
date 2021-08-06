package com.example.mysoothechallenge

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mysoothechallenge.ui.theme.MySootheChallengeTheme
import com.google.android.material.bottomappbar.BottomAppBar


@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigation()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {
        HomeScreenContent(
            modifier = Modifier.padding(it)
        )
    }

}

@Composable
private fun HomeScreenContent(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column {
            Spacer(modifier = Modifier.height(72.dp))
            MySootheTextField(
                labelText = "Search",
                leadingIcon = Icons.Default.Search,
                modifier = Modifier.padding(16.dp)
            )
            FavoriteCollectionSection()
            AlignBodySection()
            AlignMindSection()

        }
    }
}


@Composable
private fun BottomNavigation() {
    BottomAppBar(backgroundColor = MaterialTheme.colors.background) {
        BottomNavigationItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(
                    Icons.Default.Spa,
                    contentDescription = null,
                )
            },
            label = {
                Text(text = "Home")
            })

        BottomNavigationItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(Icons.Default.AccountCircle, contentDescription = null)
            })
    }
}


@Composable
fun FavoriteCollectionSection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "FAVORITE COLLECTIONS",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(16.dp),
            style = MaterialTheme.typography.h2

        )
        FavoriteCollectionRow(collections = favoriteCollectionOne)
        FavoriteCollectionRow(collections = favoriteCollectionTwo)
    }
}

@Composable
fun AlignBodySection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "ALIGN YOUR BODY",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(16.dp),
            style = MaterialTheme.typography.h2

        )
        AlignCollectionRow(collections = alignYourBodyList)

    }
}

@Composable
fun AlignMindSection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "ALIGN YOUR MIND",
            modifier = Modifier
                .paddingFromBaseline(40.dp)
                .padding(16.dp),
            style = MaterialTheme.typography.h2

        )
        AlignCollectionRow(collections = alignYourMind)

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