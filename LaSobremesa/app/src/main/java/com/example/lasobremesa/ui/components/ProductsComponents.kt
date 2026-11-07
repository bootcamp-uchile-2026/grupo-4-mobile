// LaSobremesa
// componentes del menu :detalle producto
//
package com.example.lasobremesa.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lasobremesa.data.Product

// muestra imagen y detalle de producto
@Composable
fun ProductCard(product: Product, producerName:String, onClick:(String) -> Unit) {
     Card(modifier = Modifier.fillMaxWidth()
         .clickable{
             onClick(product.id)
}) {
         Column(modifier = Modifier.padding(8.dp)) {
             // Imagen desde drawable
             Image(
                 painter = painterResource(id = product.imageRes),
                 contentDescription = producerName,
                 modifier = Modifier
                     .height(120.dp)
                     .fillMaxWidth()
                     .clip(RoundedCornerShape(8.dp)),
                 contentScale = ContentScale.Crop
             )

             Spacer(modifier = Modifier.height(8.dp))
             Text(text = product.name, style = MaterialTheme.typography.bodyMedium)
             Text(
                 text = producerName,
                 style = MaterialTheme.typography.bodySmall,
                 color = MaterialTheme.colorScheme.onSurfaceVariant
             )
             Text(text = "${product.price}", style = MaterialTheme.typography.titleMedium)
         }
     }
}
