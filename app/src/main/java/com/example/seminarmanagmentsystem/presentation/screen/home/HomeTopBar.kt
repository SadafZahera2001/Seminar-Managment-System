package com.example.seminarmanagmentsystem.presentation.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.seminarmanagementsystem.R
import com.example.seminarmanagmentsystem.ui.theme.PWhite


@Composable
fun HomeTopBar() {
    TopAppBar(
        title = {
            Column(
                modifier = Modifier.fillMaxHeight()
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.img_1311),
                        contentDescription = "Image",
                        tint = Color.Unspecified,
                        modifier = Modifier.size(120.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    OutlinedTextField(
                        value = "Search",
                        onValueChange = {},
                        singleLine = true,
                        modifier = Modifier
                            .background(PWhite)
                            .fillMaxWidth(0.87f)
                            .height(45.dp)
                            .border(0.dp,Color.White ,RectangleShape),
                    )
                }
            }
        },
        backgroundColor = Color.White,
        modifier = Modifier.height(10000.dp),
        elevation = 0.dp
    )
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTopBar() {
    HomeTopBar()
}


