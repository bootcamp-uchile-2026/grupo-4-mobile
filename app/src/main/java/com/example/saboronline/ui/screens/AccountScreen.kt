package com.example.saboronline.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

data class AccountMenuItem (
    val title:String,
    val icon: ImageVector,
    val onClick: () -> Unit
)

data class AccountSection(
    val sectionTitle: String,
    val items: List<AccountMenuItem>
)

// 2. Pantalla Principal
@Composable
fun AccountScreen(
    paddingValues: PaddingValues,
    sections: List<AccountSection>,
    onLogout: () -> Unit,
    OnNavigateTo: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
    ) {
        // Cabecera del perfil
        item {
            UserProfileHeader(
                userName = "Ftr",
                userEmail = "franciscotapiarozas@gmail.com"
            )
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        }

        // Renderizado dinámico de Secciones y Submenús
        sections.forEach { section ->
            item {
                Text(
                    text = section.sectionTitle,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }

            items(section.items) { menuItem ->
                AccountMenuItemRow(item = menuItem)
            }

            item {
                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
            }
        }

        // Botón de Cerrar Sesión
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = onLogout,
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.error),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Cerrar sesión")
            }
        }
    }
}

// 3. Componentes Auxiliares
@Composable
fun UserProfileHeader(
    userName: String,
    userEmail: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = userName, style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = userEmail, style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
fun AccountMenuItemRow(item: AccountMenuItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { item.onClick() }
            .padding(vertical = 12.dp, horizontal = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = item.title,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}