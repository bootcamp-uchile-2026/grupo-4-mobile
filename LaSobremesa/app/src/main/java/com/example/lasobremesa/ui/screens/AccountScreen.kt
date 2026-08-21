package com.example.lasobremesa.ui.screens

import android.R.attr.background
import android.R.id.background
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lasobremesa.ui.components.ScreenContainer
import com.example.lasobremesa.ui.viewmodel.AccountViewModel

@Composable
fun AccountScreen(
    viewModel: AccountViewModel = viewModel(),
    onNavigate: (String) -> Unit
){
    val state by viewModel.uiState.collectAsState()

    ScreenContainer
    {
        Spacer(modifier = Modifier.height(16.dp))
            //Color(0xFFF9F9F9)
            Text(
                text = "Mi Sobremesa", fontSize = 22.sp, fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Tarjetas superiores unificadas
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                DashboardCard(
                    "Tu próxima caja",
                    "Llega entre ${state.proximaCajaEntrega}\nCobro: ${state.proximaCajaCobro}",
                    "Ver mi caja"
                ) { onNavigate("ver_caja") }
                DashboardCard(
                    "Último pedido",
                    "${state.ultimoPedidoId}\n🚚 ${state.ultimoPedidoEstado}",
                    "Seguir pedido"
                ) { onNavigate("seguir_pedido") }
            }

            Spacer(modifier = Modifier.height(12.dp))
            Text("Accesos rápidos", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(8.dp))

            // Grid de Accesos Rápidos simplificado
            val accesos = listOf(
                Triple("Pedidos", Icons.Default.Description, "pedidos"),
                Triple("Suscripción", Icons.Default.CardGiftcard, "suscripcion"),
                Triple("Favoritos", Icons.Default.FavoriteBorder, "favoritos"),
                Triple("Direcciones", Icons.Default.LocationOn, "direcciones"),
                Triple("Pagos", Icons.Default.CreditCard, "pagos"),
                Triple("Datos", Icons.Default.Person, "datos"),
                Triple("Ayuda", Icons.Default.HelpOutline, "ayuda")
            )

            LazyVerticalGrid(
                columns = GridCells.Fixed(4),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(accesos) { (titulo, icono, ruta) ->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.clickable { onNavigate(ruta) }
                    ) {
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = Color.White,
                            modifier = Modifier.size(50.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    icono,
                                    titulo,
                                    tint = Color.DarkGray
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(titulo, fontSize = 11.sp, color = Color.DarkGray, maxLines = 1)
                    }
                }
            }
        }
}

@Composable
fun RowScope.DashboardCard(title: String, subtitle: String, buttonText: String, onClick: () -> Unit) {
    Card(modifier = Modifier.weight(1f), colors = CardDefaults.cardColors(containerColor = Color.White)) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(title, fontWeight = FontWeight.Bold, fontSize = 13.sp)
            Spacer(modifier = Modifier.height(6.dp))
            Text(subtitle, fontSize = 11.sp, color = Color.Gray)
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedButton(onClick = onClick, modifier = Modifier.fillMaxWidth(), contentPadding = PaddingValues(4.dp)) {
                Text(buttonText, fontSize = 11.sp)
            }
        }
    }
}
