package com.example.meditationui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color


/**
 * Created by Abhinay on 08/01/25.
 *
 *
 */
data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)
