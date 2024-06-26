package com.optic.ecommerceappmvvm.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Green500,
    primaryVariant = Blue700,
    secondary = Teal500
)

private val LightColorPalette = lightColors(
    primary = Green500,
    primaryVariant = Blue700,
    secondary = Teal500
)

@Composable
fun EcommerceAppMVVMTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}