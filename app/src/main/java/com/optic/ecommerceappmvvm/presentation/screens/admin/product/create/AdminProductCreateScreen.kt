package com.optic.ecommerceappmvvm.presentation.screens.admin.product.create

import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.components.AdminProductCreateContent
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.components.CreateProduct
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray100
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray200

@Composable
fun AdminProductCreateScreen(navController: NavHostController, categoryParam: String) {

    Log.d("AdminProductListScreen", "Category: ${categoryParam}")
    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Nuevo producto",
                upAvailable = true,
                navController = navController
            )
        },
        backgroundColor = Gray100
    ) {paddingValues ->
        AdminProductCreateContent(paddingValues = paddingValues)
    }
    CreateProduct()
}