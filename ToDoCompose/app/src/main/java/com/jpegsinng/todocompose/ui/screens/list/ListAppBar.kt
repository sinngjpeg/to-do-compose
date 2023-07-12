package com.jpegsinng.todocompose.ui.screens.list

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DefaultListAppBar() {
    TopAppBar(
        modifier = Modifier,
        title = {
            Text(text = "Tasks")
        },
//        colors = TopAppBarDefaults.smallTopAppBarColors()
    )
}

@Composable
@Preview
private fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}