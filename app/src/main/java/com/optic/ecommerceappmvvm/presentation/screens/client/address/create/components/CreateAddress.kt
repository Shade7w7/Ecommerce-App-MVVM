package com.optic.ecommerceappmvvm.presentation.screens.client.address.create.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.optic.ecommerceappmvvm.domain.util.Resource
import com.optic.ecommerceappmvvm.presentation.components.ProgressBar
import com.optic.ecommerceappmvvm.presentation.screens.client.address.create.ClientAddressCreateViewModel

@Composable
fun CreateAddress(vm: ClientAddressCreateViewModel = hiltViewModel()) {

    when(val response = vm.addressResponse) {
        Resource.Loading -> {
            ProgressBar()
        }
        is Resource.Success -> {
            // 401 TOKEN
            vm.clearForm()
            Toast.makeText(LocalContext.current, "Los datos se han creado correctamete", Toast.LENGTH_LONG).show()
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