package com.example.kwizapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.kwizapp.R

// Set of Material typography styles to start with

val amaticBold = FontFamily(Font(R.font.amatic_sc_bold))
val amaticRegular = FontFamily(Font(R.font.amatic_sc_regular))
val indieFlower = FontFamily(Font(R.font.indie_flower_regular))

val Typography = Typography(

    h1 = TextStyle(
        fontFamily = indieFlower,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    ),

    h2 = TextStyle(
        fontFamily = amaticBold,
        fontSize = 20.sp
    ),

    h3 = TextStyle(
        fontFamily = amaticRegular,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),

    body1 = TextStyle(
        fontFamily = amaticRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),

    caption = TextStyle(
        fontFamily = amaticRegular,
        fontWeight = FontWeight.Thin,
        fontSize = 12.sp
    ),

    button = TextStyle(
        fontFamily = amaticBold,
        fontWeight = FontWeight.SemiBold,
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