package com.optic.ecommerceappmvvm.presentation.screens.client.product.list.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.list.components.AdminProductListItem

@Composable
fun ClientProductListContent(navController: NavHostController, paddingValues: PaddingValues, products: List<Product>) {



    LazyColumn(
        modifier = Modifier
            .padding(paddingValues = paddingValues)
            .padding(bottom = 55.dp)
            .fillMaxSize()
    ) {
        items(items = products) { product ->
            ClientProductListItem(navController, product)
        }
    }
}