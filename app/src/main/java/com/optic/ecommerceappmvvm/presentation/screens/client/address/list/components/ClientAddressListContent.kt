package com.optic.ecommerceappmvvm.presentation.screens.client.address.list.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.domain.model.Address

@Composable
fun ClientAddressListContent(paddingValues: PaddingValues, addressList: List<Address>) {
    
    LazyColumn() {
        items(
            items = addressList
        ) {address ->
            ClientAddressListItem(address = address)
        }
    }
    
}