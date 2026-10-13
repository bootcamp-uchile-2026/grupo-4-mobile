// LaSobremesa
// la vista del menu del carrito
//
package com.example.lasobremesa.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.lasobremesa.data.CartItem
import com.example.lasobremesa.data.CartRepository
import kotlinx.coroutines.flow.StateFlow

data class CartUiState(
    val items: List<CartItem> = emptyList(),
    val isLoading: Boolean = false
) {
    val subtotal: Int
        get() = items.sumOf { it.price * it.quantity }
    val totalItemsCount: Int
        get() = items.sumOf { it.quantity }
}

class CartViewModel : ViewModel() {
    val cartItems: StateFlow<List<CartItem>> = CartRepository.cartItems
    fun updateQuantity(itemId: String, quantity: Int) {
        CartRepository.updateQuantity(itemId, quantity)
    }

    fun removeItem(itemId: String) {
        CartRepository.removeItem(itemId)
    }

    fun getTotalPrice(): Int {
        return cartItems.value.sumOf { it.price * it.quantity }
    }
}
