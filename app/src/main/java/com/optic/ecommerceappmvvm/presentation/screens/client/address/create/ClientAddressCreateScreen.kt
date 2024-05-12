package com.optic.ecommerceappmvvm.presentation.screens.client.address.create

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.client.address.create.components.ClientAddressCreateContent
import com.optic.ecommerceappmvvm.presentation.screens.client.address.create.components.CreateAddress
import com.optic.ecommerceappmvvm.presentation.screens.client.address.list.components.ClientAddressListContent
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray100
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray200

@Composable
fun ClientAddressCreateScreen(navController: NavHostController, vm: ClientAddressCreateViewModel = hiltViewModel()) {

    vm.getSessionData()

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Nueva direccion",
                navController = navController,
                upAvailable = true
            )
        },
        backgroundColor = Gray100
    ) { paddingValues ->
        ClientAddressCreateContent(paddingValues)
    }
    CreateAddress()
    
}