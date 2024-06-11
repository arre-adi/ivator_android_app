package com.example.ivator.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ivator.R

val dongleFontFamily = FontFamily(
    Font(R.font.dongle_regular, FontWeight.W400),
    Font(R.font.dongle_bold, FontWeight.Bold),
    Font(R.font.dongle_light, FontWeight.Light)
)

val urbanistFontFamily = FontFamily(
    Font(R.font.urbanist_normal, FontWeight.W200),
)
val typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = urbanistFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = urbanistFontFamily,
        fontWeight = FontWeight.ExtraLight,
    )
)

