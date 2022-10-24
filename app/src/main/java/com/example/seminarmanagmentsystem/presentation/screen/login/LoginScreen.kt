package com.example.seminarmanagmentsystem.presentation.screen.login

import android.widget.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.seminarmanagementsystem.R
import com.example.seminarmanagmentsystem.ui.theme.*

@Composable
fun Login() {
    if(isSystemInDarkTheme()){
        PageDesignDark()
    }else{
        PageDesignLight()
    }
}

@Composable
fun PageDesignDark() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1311),
            contentDescription = "App Logo",
            modifier = Modifier.size(200.dp, 200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Login",
            style = aileronTypography.h1,
            color = White
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Enter credential to continue",
            style = poppinsTypography.h1,
            color = Grey
        )
        Spacer(modifier = Modifier.height(4.dp))
        var nameFieldState by remember { mutableStateOf("") }

        OutlinedTextField(
            value = nameFieldState,
            onValueChange = { nameFieldState = it },
            label = { Text(text = "NAME", style = poppinsTypography.h1, fontSize = 15.sp,color = White) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = DarkGrey,
                unfocusedBorderColor = DarkGrey,
                focusedBorderColor = Green,
                cursorColor = Grey,
                focusedLabelColor = White
            ),
            modifier = Modifier.height(56.dp)
        )
        Spacer(modifier = Modifier.height(22.dp))

        var passwordFieldState by remember { mutableStateOf("") }

        OutlinedTextField(
            value = passwordFieldState,
            onValueChange = { passwordFieldState = it },
            label = { Text(text = "PASSWORD", style = poppinsTypography.h1, fontSize = 15.sp,color = White) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = DarkGrey,
                unfocusedBorderColor = DarkGrey,
                focusedBorderColor = Green,
                cursorColor = Grey,
                focusedLabelColor = Color.White
            ),
            modifier = Modifier.height(56.dp)
        )
        Spacer(modifier = Modifier.height(22.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                modifier = Modifier.width(110.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Red,
                    contentColor = White
                ),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Skip", style = dmsansTypography.h1, fontSize = 15.sp)
            }
            Button(
                modifier = Modifier.width(110.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Red,
                    contentColor = White
                ),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Log in", style = dmsansTypography.h1, fontSize = 15.sp)
            }
        }
    }
}

@Composable
fun PageDesignLight() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.img_1311),
            contentDescription = "App Logo",
            modifier = Modifier.size(200.dp, 200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Login",
            style = aileronTypography.h1
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = "Enter credential to continue",
            style = poppinsTypography.h1
        )
        Spacer(modifier = Modifier.height(4.dp))
        var nameFieldState by remember { mutableStateOf("") }

        OutlinedTextField(
            value = nameFieldState,
            onValueChange = { nameFieldState = it },
            label = { Text(text = "NAME", style = poppinsTypography.h1, fontSize = 15.sp) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Grey,
                unfocusedBorderColor = Grey,
                focusedBorderColor = Green,
                cursorColor = Grey,
                focusedLabelColor = Color.Black
            ),
            modifier = Modifier.height(56.dp)
        )
        Spacer(modifier = Modifier.height(22.dp))

        var passwordFieldState by remember { mutableStateOf("") }

        OutlinedTextField(
            value = passwordFieldState,
            onValueChange = { passwordFieldState = it },
            label = { Text(text = "PASSWORD", style = poppinsTypography.h1, fontSize = 15.sp) },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Grey,
                unfocusedBorderColor = Grey,
                focusedBorderColor = Green,
                cursorColor = Grey,
                focusedLabelColor = Color.Black
            ),
            modifier = Modifier.height(56.dp)
        )
        Spacer(modifier = Modifier.height(22.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                modifier = Modifier.width(110.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Red,
                    contentColor = White
                ),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Skip", style = dmsansTypography.h1, fontSize = 15.sp)
            }
            Button(
                modifier = Modifier.width(110.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Red,
                    contentColor = White
                ),
                onClick = { /*TODO*/ }
            ) {
                Text(text = "Log in", style = dmsansTypography.h1, fontSize = 15.sp)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginPagePreview() {
    Login()
}