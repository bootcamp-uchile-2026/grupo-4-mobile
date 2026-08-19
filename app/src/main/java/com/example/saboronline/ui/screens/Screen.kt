// SaborOnline
// diseño de la pantalla, con titulo y menu
//
package com.example.saboronline.ui.screens

import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.saboronline.ui.BottomNavigationBar
import com.example.saboronline.ui.BottomNavItem
import com.example.saboronline.ui.viewmodel.MainViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(mainViewModel: MainViewModel = viewModel()) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("La Sobremesa") }
            )
        },
        bottomBar = {
            BottomNavigationBar(navController = navController) { item ->
                mainViewModel.selectTab(item)
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable(BottomNavItem.Home.route) {
                HomeScreen(
                    onNavigateTo = { route -> navController.navigate(route) },
                    onLogout = {
                        navController.navigate(BottomNavItem.Home.route)
                    })
            }
            composable(BottomNavItem.Products.route) {
                ProductsScreen(
                    onNavigateTo = { route -> navController.navigate(route) },
                    onLogout = {
                        navController.navigate(BottomNavItem.Home.route)
                    })
            }
            composable(BottomNavItem.History.route) {
                HistoryScreen(
                    onNavigateTo = { route -> navController.navigate(route) },
                    onLogout = {
                        navController.navigate(BottomNavItem.Home.route)
                    })
            }
            composable(BottomNavItem.Cart.route) {
                CartScreen(
                    onNavigateTo = { route -> navController.navigate(route) },
                    onLogout = {
                        navController.navigate(BottomNavItem.Home.route)
                    })
            }
            composable(BottomNavItem.Account.route) {
                AccountScreen(
                    paddingValues = innerPadding,
                    sections = listOf(
                        AccountSection(
                            sectionTitle = "MI PERFIL",
                            items = listOf(
                                AccountMenuItem(
                                    title = "Mis datos",
                                    icon = Icons.Default.Person,
                                    onClick = {}
                                ),
                                AccountMenuItem(
                                    title = "Mis direcciones",
                                    icon = Icons.Default.LocationOn,
                                    onClick = {}
                                ),
                                AccountMenuItem(
                                    title = "Mis favoritos",
                                    icon = Icons.Default.Favorite,
                                    onClick = {}
                                )
                            )
                        ),
                        AccountSection(
                            sectionTitle = "MIS COMPRAS Y CUENTAS",
                            items = listOf(
                                AccountMenuItem("Historial de pedidos",
                                    icon = Icons.Default.ShoppingCart,
                                    onClick = {}),
                                AccountMenuItem("Mis tarjetas",
                                    icon = Icons.Default.CreditCard,
                                onClick = {}
                                )
                            )
                        ),
                        AccountSection(
                            sectionTitle = "SUSCRIPCION",
                            items = listOf(
                                AccountMenuItem(
                                    title = "Quiero suscribirme",
                                    icon = Icons.Default.Star,
                                    onClick = {}
                                ),
                            )
                        )
                    ),
                    onLogout = {
                        navController.navigate(BottomNavItem.Home.route)
                    },
                    OnNavigateTo = { route ->
                        navController.navigate(route)
                    }
                )
            }
        }
    }
}
