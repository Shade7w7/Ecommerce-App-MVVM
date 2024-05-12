package com.optic.ecommerceappmvvm.presentation.screens.client.shopping_bag

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultButton
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ShoppingBagScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.shopping_bag.components.ClientShoppingBagBottomBar
import com.optic.ecommerceappmvvm.presentation.screens.client.shopping_bag.components.ClientShoppingBagContent
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray100

@Composable
fun ClientShoppingBagScreen(navController: NavHostController, vm: ClientShoppingBagViewModel = hiltViewModel()) {

    vm.getShoppingBag()

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Mi orden",
                upAvailable = true,
                navController = navController
            )
        },
        bottomBar = {
            ClientShoppingBagBottomBar(navController)
        }

    ) { paddingValues ->
        ClientShoppingBagContent(paddingValues, vm.shoppingBag)
    }
}