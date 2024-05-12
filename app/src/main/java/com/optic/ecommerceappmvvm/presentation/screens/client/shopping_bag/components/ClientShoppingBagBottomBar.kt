package com.optic.ecommerceappmvvm.presentation.screens.client.shopping_bag.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ShoppingBagScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.shopping_bag.ClientShoppingBagViewModel
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray100

@Composable
fun ClientShoppingBagBottomBar(navController: NavHostController, vm: ClientShoppingBagViewModel = hiltViewModel()) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Gray100),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.padding(vertical = 15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "TOTAL",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
            Text(
                text = vm.total.toString() + "$",
                fontSize = 16.sp
            )
        }

        DefaultButton(
            modifier = Modifier
                .padding(vertical = 15.dp),
            text = "Confirmar orden",
            onClick = { navController.navigate(route = ShoppingBagScreen.AddressList.route) }
        )
    }

}