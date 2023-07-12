package com.jpegsinng.todocompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.jpegsinng.todocompose.util.Constants
import com.jpegsinng.todocompose.util.Action
import com.jpegsinng.todocompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(
            navArgument(Constants.TASK_ARGUMENTS_KEY) {
                type = NavType.StringType
            })
    ) {

    }
}