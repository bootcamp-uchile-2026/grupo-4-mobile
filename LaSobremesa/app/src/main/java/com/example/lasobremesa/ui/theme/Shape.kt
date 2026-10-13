package com.tuproyecto.ui.shape

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

// Definición de formas personalizadas basadas en el sistema de diseño
val LaSobremesaShapes = Shapes(
    // Para botones principales y secundarios alargados (estilo píldora)
    small = RoundedCornerShape(percent = 50),

    // Para contenedores o tarjetas medianas si los necesitas
    medium = RoundedCornerShape(16.dp),

    // Para contenedores grandes
    large = RoundedCornerShape(28.dp)
)


// También puedes declarar formas específicas para usarlas directamente en tus botones si no quieres usar los tamaños predeterminados de Material Theme:
object AppButtonShapes {
    // Botón de forma de píldora (para los botones primarios, secundarios y terciarios alargados)
    val pillShape = RoundedCornerShape(50.dp) // O usa RoundedCornerShape(percent = 50)

    // Botón completamente circular (para los íconos de botones redondos que se ven abajo en el diseño)
    val circularShape = RoundedCornerShape(percent = 50)

    // Si algún botón tuviera esquinas ligeramente redondeadas (por ejemplo, 8dp)
    val subtleRoundedShape = RoundedCornerShape(8.dp)
}
