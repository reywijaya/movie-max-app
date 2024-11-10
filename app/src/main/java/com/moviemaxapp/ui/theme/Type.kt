package com.moviemaxapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.moviemaxapp.R

private val RobotFontFamily = FontFamily(
    Font(R.font.font_roboto_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.font_roboto_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.font_roboto_black, FontWeight.Black, FontStyle.Normal)
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = RobotFontFamily,
        fontWeight = FontWeight.Black,
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        fontFamily = RobotFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    bodySmall = TextStyle(
        fontFamily = RobotFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)