package com.example.seminarmanagmentsystem.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.seminarmanagmentsystem.presentation.screen.home.HomeScreen
import com.example.seminarmanagmentsystem.presentation.screen.login.Login
import com.example.seminarmanagmentsystem.presentation.screen.splash.SplashScreen
import com.example.seminarmanagmentsystem.util.Constants.ISSUE_ARGUMENT_KEY

/**
 *  navController: passing navController from our main activity
 */
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    )
    {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Login.route) {
            Login()
        }
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.IssueBook.route,
        arguments = listOf(navArgument(ISSUE_ARGUMENT_KEY){
            type = NavType.IntType
        })
        ) {

        }
    }
}