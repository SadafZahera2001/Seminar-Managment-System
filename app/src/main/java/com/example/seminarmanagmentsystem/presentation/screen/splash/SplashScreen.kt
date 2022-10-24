package com.example.seminarmanagmentsystem.presentation.screen.splash

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.seminarmanagementsystem.R
import com.example.seminarmanagmentsystem.navigation.Screen
import com.example.seminarmanagmentsystem.ui.theme.LOGO_HEIGHT
import com.example.seminarmanagmentsystem.ui.theme.Red
import com.example.seminarmanagmentsystem.ui.theme.White
import com.example.seminarmanagmentsystem.util.Constants.SPLASH_SCREEN_DELAY
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    //Splash Screen animation
    var startAnimation by remember{
        mutableStateOf(false)
    }
    val offsetState by animateDpAsState(
        targetValue = if(startAnimation) 0.dp else 100.dp,
        animationSpec = tween(
            durationMillis = 1000
        )
    )
    val alphaState by animateFloatAsState(
        targetValue = if(startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 1000
        )
    )
    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(SPLASH_SCREEN_DELAY)
        navController.popBackStack()
        if (true) {
            navController.navigate(Screen.Home.route)
        } else {
            navController.navigate(Screen.Login.route)
        }
    }
    Splash(offsetState = offsetState, alphaState = alphaState)
}

@Composable
fun Splash(offsetState: Dp, alphaState: Float) {
    if(isSystemInDarkTheme()){
        Box(
            modifier = Modifier
                .background(Brush.verticalGradient(listOf(White, Red)))
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_1311),
                contentDescription = stringResource(R.string.app_logo),
                Modifier
                    .size(LOGO_HEIGHT)
                    .offset(y = offsetState)
                    .alpha(alpha = alphaState)
            )
        }
    }else{
        Box(
            modifier = Modifier
                .background(Brush.verticalGradient(listOf(White, White)))
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_1311),
                contentDescription = stringResource(R.string.app_logo),
                Modifier
                    .size(LOGO_HEIGHT)
                    .offset(y = offsetState)
                    .alpha(alpha = alphaState)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SplashScreenPreview() {
    Splash(offsetState = 0.dp, alphaState = 1f)
}

@Preview(showSystemUi = true,
uiMode = UI_MODE_NIGHT_YES)
@Composable
fun SplashScreenDarkPreview() {
    Splash(offsetState = 0.dp, alphaState = 1f)
}