package com.optic.ecommerceappmvvm.presentation.screens.client.address.list.components

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.domain.util.Resource
import com.optic.ecommerceappmvvm.presentation.components.ProgressBar
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.list.AdminCategoryListViewModel
import com.optic.ecommerceappmvvm.presentation.screens.client.address.list.ClientAddressListViewModel

@Composable
fun GetAddress(paddingValues: PaddingValues, vm: ClientAddressListViewModel = hiltViewModel()) {
    when(val response = vm.addressResponse) {
        Resource.Loading -> {
            ProgressBar()
        }
        is Resource.Success -> {
           ClientAddressListContent(paddingValues, response.data)
        }
        is Resource.Failure -> {
            Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_LONG).show()
        }
        else -> {
            if (response != null) {
                Toast.makeText(LocalContext.current, "Hubo error desconocido", Toast.LENGTH_LONG).show()
            }
        }
    }
}