// SaborOnline
// estado de la pantalla principal de navegacion
//
package com.example.saboronline.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.saboronline.ui.BottomNavItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _selectedTab = MutableStateFlow<BottomNavItem>(BottomNavItem.Home)
    val selectedTab: StateFlow<BottomNavItem> = _selectedTab

    fun selectTab(item: BottomNavItem) {
        _selectedTab.value = item
    }
}