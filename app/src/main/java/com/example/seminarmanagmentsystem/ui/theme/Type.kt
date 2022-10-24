package com.example.seminarmanagmentsystem.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.seminarmanagementsystem.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
val aileron = FontFamily(
    Font(R.font.aileron_heavy,FontWeight.Bold)
)
val aileronTypography = Typography(
        h1 = TextStyle(
        fontFamily = aileron,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp
    )
)
val dmsans = FontFamily(
    Font(R.font.dmsans_regular,FontWeight.Medium)
)
val dmsansTypography = Typography(
    h1 = TextStyle(
        fontFamily = dmsans,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    ),
    h2 = TextStyle(
        fontFamily = dmsans,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    )
)
val poppins = FontFamily(
    Font(R.font.poppins_light,FontWeight.ExtraLight)
)
val poppinsTypography = Typography(
    h1 = TextStyle(
        fontFamily = poppins,
        fontWeight = FontWeight.ExtraLight,
        fontSize = 12.sp
    )
)