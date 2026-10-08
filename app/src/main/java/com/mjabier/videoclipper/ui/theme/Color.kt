package com.mjabier.videoclipper.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColorScheme(
    primary = Color(0xFF6C63FF),
    secondary = Color(0xFF00C2A8),
    tertiary = Color(0xFFFFB74D),
    background = Color(0xFFF7F8FC),
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFF171A1F),
    onSurface = Color(0xFF171A1F),
)

private val DarkColors = darkColorScheme(
    primary = Color(0xFF8A7DFF),
    secondary = Color(0xFF3AD9C2),
    tertiary = Color(0xFFFFC76E),
    background = Color(0xFF121826),
    surface = Color(0xFF1C2333),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color(0xFFEAF2FF),
    onSurface = Color(0xFFEAF2FF),
)

@Composable
fun VideoClipperTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}
