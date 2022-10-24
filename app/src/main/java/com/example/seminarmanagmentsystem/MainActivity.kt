package com.example.seminarmanagmentsystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.seminarmanagmentsystem.navigation.SetupNavGraph
import com.example.seminarmanagmentsystem.ui.theme.SeminarManagmentSystemTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint//this annotation tells dagger hilt library where to inject those dependencies which we provide
class MainActivity : ComponentActivity() {
    //initialize nav controller and pass it to navGraph in navigation directory
    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SeminarManagmentSystemTheme {
                navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}