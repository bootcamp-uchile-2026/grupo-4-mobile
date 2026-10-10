package com.lasobremesa.ui.theme // Mantén el paquete que ya tenga tu archivo

import androidx.compose.ui.graphics.Color

// =====================================================================
// 1. PRIMITIVOS DE COLOR
// =====================================================================

// Green
val Green700 = Color(0xFF144523)
val Green50  = Color(0xFFEFEFEA)
val Green100 = Color(0xFFDCCFEF)
val Green200 = Color(0xFF9BABAB)
val Green300 = Color(0xFF599674)
val Green400 = Color(0xFF348234)
val Green500 = Color(0xFF1B5530)
val Green600 = Color(0xFF154201)
val Green800 = Color(0xFF134A1A)
val Green900 = Color(0xFF022A1A)

// Brown
val Brown800 = Color(0xFF241304)
val Brown50  = Color(0xFFECCEE5)
val Brown100 = Color(0xFFDCAE60)
val Brown200 = Color(0xFFC4ADAD)
val Brown300 = Color(0xFF9DCC59)
val Brown400 = Color(0xFF80756F)
val Brown500 = Color(0xFF6F655E)
val Brown600 = Color(0xFF5A524D)
val Brown700 = Color(0xFF453F3C)
val Brown900 = Color(0xFF1D1A19)

// Orange
val Orange400 = Color(0xFFD56630)
val Orange600 = Color(0xFFCC5634)
val Orange50  = Color(0xFFF3CDEF)
val Orange100 = Color(0xFFFDC5A3)
val Orange200 = Color(0xFFE5A17F)
val Orange300 = Color(0xFFCC7D5B)
val Orange500 = Color(0xFF9E4B28)
val Orange700 = Color(0xFF70351C)
val Orange800 = Color(0xFF572A17)
val Orange900 = Color(0xFF3D1E10)

// Beige
val Beige50   = Color(0xFFF9F7FC)
val Beige100  = Color(0xFFF5F2F9)
val Beige200  = Color(0xFFECE7F5)
val Beige300  = Color(0xFFE4DCF1)
val Beige400  = Color(0xFFDCB1E6)
val Beige500  = Color(0xFFD1B6EA)
val Beige600  = Color(0xFFC4A1DF)
val Beige700  = Color(0xFFB88CD4)
val Beige800  = Color(0xFFAB77C8)
val Beige900  = Color(0xFF9F62BD)

// Cream
val Cream100  = Color(0xFFF9F4EA)


// =====================================================================
// 2. TOKENS SEMÁNTICOS Y DE ESTADO (A continuación de los primitivos)
// =====================================================================

object LaSobremesaThemeColors {

    object Background {
        val Primary = Color(0xFFFBF9EA)
        val Brand = Color(0xFF016330)
        val Accent = Color(0xFFCF3F0B)
        val Secondary = Color(0xFFFCFAEE)
        val Subtle = Color(0xFFFDFCF5)
        val Disabled = Color(0xFFE4E3D5)
        val DarkBase = Brown800
    }

    object Text {
        val Primary = Color(0xFF422307)
        val OnBrand = Color(0xFFFFFEFD)
        val Accent = Color(0xFFCF3F0B)
        val Secondary = Color(0xFF684F39)
        val Strong = Color(0xFF2F1905)
        val Brand = Color(0xFF016330)
        val Disabled = Color(0xFF8A8981)
    }
    object Action {
        val Primary = Color(0xFF014622)
        val Accent = Color(0xFFBC390A)

        object PrimaryState {
            val Default = Color(0xFF016330)
            val Hover = Color(0xFF014622)
            val Pressed = Color(0xFF002A14)
            val Disabled = Color(0xFFB2B1A6)
        }

        object ContentPrimary {
            val Default = Color(0xFFFFFEFD)
            val Disabled = Color(0xFFFFEFD)
        }

        object SecondaryState {
           // val Default = Color()
            val Hover = Color(0xFFE6EFEA)
            val Pressed = Color(0xFFB0CFBF)
            //val Disabled = Color()
        }

        object ContentSecondary {
            val Default = Color(0xFF016330)
            val Hover = Color(0xFF014622)
            val Pressed = Color(0xFF002A14)
            val Disabled = Color(0xFF8A8981)
        }

        object AccentState {
            val Default = Color(0xFFCF3F0B)
            val Hover = Color(0xFFBC390A)
            val Pressed = Color(0xFF932D08)
            val Disabled = Color(0xFFB2B1A6)
        }
    }

    object Border {
        val Default = Color(0xFFB2B1A6)
        val Brand = Color(0xFF016330)
        val Subtle = Color(0xFFE4E3D5)
        val Strong = Color(0xFF806C59)
        val Accent = Color(0xFFCF3F0B)
        val Disabled = Color(0xFFB2B1A6)
    }

    object Icon {
        val Primary = Color(0xFF422307)
        val Brand = Color(0xFF016330)
        val Accent = Color(0xFFCF3F0B)
        val Onbrand = Color(0xFFFFFEFD)
        val Secondary = Color(0xFF684F39)
        val Disabled = Color(0xFF8A8981)
    }

    object Feedback {
        object error {
            val Subtle = Color(0xFFFBEAEA)
            val Default = Color(0xFFC83C3C)
            val Strong = Color(0xFF8F2525)
        }
        object Success {
            val Subtle = Color(0xFFE6EFEA)
            val Default = Color(0xFF016330)
            val Strong = Color(0xFF014622)
        }

        object Warning {
            val Subtle = Color(0xFFFAECE7)
            val Default = Color(0xFFD9653C)
            val Strong = Color(0xFF932D08)
        }

        object Info {
            val Subtle = Color(0xFFEAF2F6)
            val Default = Color(0xFF356A8A)
            val Strong = Color(0xFF244B63)
        }

        object Focus {
            val FocusRing = Color(0xFFCF3F0B)
            val FocusOffset = Color(0xFFFDFCF5)
        }
    }
}
