package com.example.meditationui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path


/**
 * Created by Abhinay on 08/01/25.
 *
 *
 */

fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        (from.x + to.x) / 2f,
        (from.y + to.y) / 2f
    )
}