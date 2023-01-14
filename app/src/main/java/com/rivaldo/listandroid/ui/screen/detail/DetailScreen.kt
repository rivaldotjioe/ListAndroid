package com.rivaldo.listandroid.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rivaldo.listandroid.AndroidItem
import com.rivaldo.listandroid.R
import com.rivaldo.listandroid.listAndroidOs
import com.rivaldo.listandroid.ui.theme.ListAndroidTheme
import com.rivaldo.listandroid.ui.theme.detailSubtitle
import com.rivaldo.listandroid.ui.theme.detailTitle

@Composable
fun DetailScreen(
    id: Int,
    navigateBack: () -> Unit
) {
    val androidItem = listAndroidOs.find { it.id == id } as AndroidItem
    val scrollState = rememberScrollState()
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = "Detail Screen")
        },
        navigationIcon = {
            IconButton(onClick = { navigateBack() }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }
        })
    }) { paddingValue ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValue)
            .verticalScroll(scrollState), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
                    .padding(16.dp),
                painter = painterResource(id = androidItem.image),
                contentDescription = null
            )
            Text(text = androidItem.name, modifier = Modifier.padding(16.dp), style = detailTitle)
            Text(text = androidItem.versionNumber, modifier = Modifier.padding(16.dp), style = detailSubtitle)
            Divider(modifier = Modifier.padding(8.dp))
            Text(text = androidItem.description, modifier = Modifier.padding(16.dp), style = detailSubtitle)
        }

    }

}

@Preview
@Composable
fun PreviewDetailScreen() {
    ListAndroidTheme() {
        DetailScreen(id = 1, navigateBack = {})
    }

}