package com.rivaldo.listandroid.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rivaldo.listandroid.AndroidItem
import com.rivaldo.listandroid.R


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    listAndroidItem: List<AndroidItem>,
    navigateToDetail: (Int) -> Unit,
    navigateToAboutMe: () -> Unit
) {
    Scaffold(
        topBar = {
            TopBarHome(title = "List Android", onAboutClicked = {
                navigateToAboutMe()
            })
        },
        backgroundColor = MaterialTheme.colors.background
    ) {paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            items(listAndroidItem) { androidItem ->
                CardAndroidItem(
                    modifier = Modifier.clickable { navigateToDetail(androidItem.id) },
                    name = androidItem.name,
                    versionNumber = androidItem.versionNumber,
                    image = androidItem.image
                )
            }
        }
        
    }

}

@Composable
fun TopBarHome(modifier: Modifier = Modifier, title: String, onAboutClicked: () -> Unit = {}) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        modifier = modifier,
        actions = {
            IconButton(onClick = { onAboutClicked() }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = "about_page" )

            }
        }
    )
}

@Composable
fun CardAndroidItem(
    modifier: Modifier = Modifier,
    name: String,
    versionNumber: String,
    image: Int
) {
    Card(modifier = modifier.padding(8.dp),
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .padding(8.dp),
                painter = painterResource(id = image),
                contentDescription = null
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)) {
                Text(text = name)
                Divider(modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, end = 4.dp))
                Text(text = versionNumber)
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    CardAndroidItem(name = "Android 1", versionNumber = "1.0", image = R.drawable.android_10)
}