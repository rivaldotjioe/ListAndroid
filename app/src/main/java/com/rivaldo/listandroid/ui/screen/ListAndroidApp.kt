package com.rivaldo.listandroid.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.rivaldo.listandroid.listAndroidOs
import com.rivaldo.listandroid.ui.navigation.ID_ANDROID
import com.rivaldo.listandroid.ui.navigation.Screen
import com.rivaldo.listandroid.ui.screen.about.AboutScreen
import com.rivaldo.listandroid.ui.screen.detail.DetailScreen
import com.rivaldo.listandroid.ui.screen.home.HomeScreen

@Composable
fun ListAndroidApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = Modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(listAndroidItem = listAndroidOs, navigateToDetail = {
                navController.navigate(Screen.Detail.createRoute(it))
            }, navigateToAboutMe = {
                navController.navigate(Screen.About.route)
            })
        }
        composable(
            route = Screen.About.route
        ) {
            AboutScreen {
                navController.navigateUp()
            }
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(ID_ANDROID) {type = NavType.IntType}),
        ) {
            val id = it.arguments?.getInt(ID_ANDROID) ?: -1
            DetailScreen(
                id = id,
                navigateBack = {
                    navController.navigateUp()
                }
            )

        }

    }

}

