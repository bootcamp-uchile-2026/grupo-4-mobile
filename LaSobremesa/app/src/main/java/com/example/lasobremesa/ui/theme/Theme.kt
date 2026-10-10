package com.example.lasobremesa.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.lasobremesa.ui.theme.LaSobremesaThemeColors

private val DarkColorScheme = darkColorScheme(
        // En modo oscuro
        // botones principales
        primary = LaSobremesaThemeColors.Action.Accent,
        onPrimary = LaSobremesaThemeColors.Text.OnBrand,
        secondary = LaSobremesaThemeColors.Action.Primary,
        onSecondary = LaSobremesaThemeColors.Text.OnBrand,
        // fondo general de la app
        background = LaSobremesaThemeColors.Background.DarkBase,
        onBackground = LaSobremesaThemeColors.Text.OnBrand,
        // superficies tarjetas (card, contenedores, barras inferiores)
        surface = LaSobremesaThemeColors.Background.DarkBase,
        onSurface = LaSobremesaThemeColors.Text.OnBrand,
        // textos secundarios, subtitulos y borde
        onSurfaceVariant = LaSobremesaThemeColors.Text.Disabled,
        outline = LaSobremesaThemeColors.Border.Strong
    )

private val LightColorScheme = lightColorScheme(
    primary = LaSobremesaThemeColors.Action.Primary,
    onPrimary = LaSobremesaThemeColors.Action.ContentPrimary.Default,
    secondary = LaSobremesaThemeColors.Action.Accent,
    onSecondary = LaSobremesaThemeColors.Action.ContentPrimary.Default,
    background = LaSobremesaThemeColors.Background.Primary,
    onBackground = LaSobremesaThemeColors.Text.Primary,
    surface = LaSobremesaThemeColors.Background.Secondary,
    onSurface = LaSobremesaThemeColors.Text.Primary,
    outline = LaSobremesaThemeColors.Border.Default
)

@Composable
fun LaSobremesaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

