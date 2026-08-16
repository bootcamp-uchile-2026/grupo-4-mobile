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
                title = { Text("SaborOnLine")}
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
            composable(BottomNavItem.Home.route) { HomeScreen() }
            composable(BottomNavItem.Products.route) { ProductsScreen() }
            composable(BottomNavItem.History.route) { HistoryScreen() }
            composable(BottomNavItem.Cart.route) { CartScreen() }
            composable(BottomNavItem.Account.route) { AccountScreen() }
        }
    }
}

@Composable
fun HomeScreen() {
    //pantalla de inicio
}
@Composable
fun ProductsScreen() {
    //pantalla de inicio
}
@Composable
fun HistoryScreen() {
    //pantalla de inicio
}
@Composable
fun CartScreen() {
    //pantalla de inicio
}
@Composable
fun AccountScreen() {
    //pantalla de inicio
}