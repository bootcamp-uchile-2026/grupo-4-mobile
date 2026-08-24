package com.example.lasobremesa.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
//import com.example.lasobremesa.ui.viewmodel.Product
import com.example.lasobremesa.data.Product

class ProductsComponents {
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FiltrosSection(onDismiss: () -> Unit) {
   // ModalBottomSheet(onDismissRequest = onDismiss) {
        val scrollState = rememberScrollState()

        Column(modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .verticalScroll(scrollState)) {
            Text("Filtros", style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 16.dp))

            Spacer(modifier = Modifier.height(12.dp))
            Text("CATEGORÍAS", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(16.dp))
            // checkbox: Quesos, Mermeladas, Aceite de oliva, Vinos, Conservas, Dulces
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Quesos")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Mermeladas")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Aceite Oliva")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Vinos")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Conservas")
            }


            Spacer(modifier = Modifier.height(12.dp))
            Text("PRODUCTOR", style = MaterialTheme.typography.labelMedium)
            // Opciones de productores con checkbox
            Spacer(modifier = Modifier.height(12.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Don Pedro")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("La Emilia")
            }

            Spacer(modifier = Modifier.height(12.dp))
            Text("CONSERVACIÓN", style = MaterialTheme.typography.labelMedium)
//            FilterCheckbox(label = "Refrigerado")
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Refrigerado")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Congelado")
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = false, onCheckedChange = {})
                Text("Ambiente")
            }

            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onDismiss, modifier = Modifier.fillMaxWidth()) {
                Text("Aplicar")
            }
        }
}



@Composable
fun ProductCard(product: Product) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(8.dp)) {
            // Imagen desde drawable o Coil
            Box(modifier = Modifier.height(120.dp).fillMaxWidth().background(Color.LightGray))
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = product.name, style = MaterialTheme.typography.bodyMedium)
            Text(text = product.producer, style = MaterialTheme.typography.bodySmall, color = Color.Gray)
            Text(text = "${product.price}", style = MaterialTheme.typography.titleMedium)
        }
    }
}