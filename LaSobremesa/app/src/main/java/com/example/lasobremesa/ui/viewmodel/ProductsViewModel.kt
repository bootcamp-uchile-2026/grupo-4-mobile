package com.example.lasobremesa.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.example.lasobremesa.data.Product

class ProductsViewModel : ViewModel() {
    private val _uiState = MutableStateFlow<CatalogUiState>(CatalogUiState())
    val uiState: StateFlow<CatalogUiState> = _uiState.asStateFlow()

    fun onCategoryToggled(category: String) {
        // Lógica para actualizar categorías seleccionadas y filtrar productos
    }

    fun onConservationToggled(conservation: String) {
        // Lógica para actualizar conservación (Refrigerado, Congelado, Ambiente)
    }
}

data class CatalogUiState(
    val products: List<Product> = emptyList(),
    val isLoading:Boolean = false
)