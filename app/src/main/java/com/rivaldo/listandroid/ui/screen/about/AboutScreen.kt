package com.rivaldo.listandroid.ui.screen.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.rivaldo.listandroid.R
import com.rivaldo.listandroid.ui.theme.ListAndroidTheme
import com.rivaldo.listandroid.ui.theme.detailSubtitle
import com.rivaldo.listandroid.ui.theme.detailTitle

@Composable
fun AboutScreen(navigateBack: () -> Unit) {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "About Me")
            },
                navigationIcon = {
                    IconButton(onClick = { navigateBack() }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                })
        },
        backgroundColor = MaterialTheme.colors.primary
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier
                    .height(200.dp)
                    .width(200.dp)
                    .padding(8.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.rivaldo),
                contentDescription = "Rivaldo",
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Rivaldo Hadi Winata",
                style = detailTitle,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "rivaldohadiwinata@gmail.com",
                style = detailSubtitle,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun PreviewAboutScreen() {
    ListAndroidTheme() {
        AboutScreen(navigateBack = {})
    }

}