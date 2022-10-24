package com.example.seminarmanagmentsystem.presentation.screen.home

import androidx.compose.foundation.layout.height
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.seminarmanagmentsystem.ui.theme.White

@Composable
fun HomeScreen() {
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = White,
            elevation = 0.dp,
            modifier = Modifier.height(200.dp)
        ) {
            HomeTopBar()
        }
    }) {}
}

@Preview(showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    HomeScreen()
}