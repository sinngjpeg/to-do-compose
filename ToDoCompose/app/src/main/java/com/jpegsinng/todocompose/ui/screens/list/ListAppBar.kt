package com.jpegsinng.todocompose.ui.screens.list

import android.content.res.Configuration
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        actions = {

        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            titleContentColor = Color.White,
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Composable
fun DefaultListAppBarActions() {

}

@Composable
fun SearchAction(
    onSearchClicked: () -> Unit
) {
    IconButton(onClick = { /*TODO*/ }) {

    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)

@Composable
@Preview
private fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}