package com.optic.ecommerceappmvvm.presentation.screens.client.product

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultSearchView
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.client.category.list.components.ClientCategoryListContent
import com.optic.ecommerceappmvvm.presentation.screens.client.product.list.ClientProductListViewModel
import com.optic.ecommerceappmvvm.presentation.screens.client.product.list.components.ClientProductListContent
import com.optic.ecommerceappmvvm.presentation.screens.client.product.list.components.GetProducts

@Composable
fun ClientProductListScreen(navController: NavHostController, vm: ClientProductListViewModel = hiltViewModel()) {

    vm.getProducts()

    Scaffold(
        topBar = {
            DefaultSearchView(
                value = vm.search,
                onValueChange = { text ->
                    vm.onSearchInput(text)
                },
                navController = navController,
                onClick = {
                    if (vm.search.isNotBlank()) {
                        vm.getProductsByName(vm.search)
                    }
                }
            )
        }
    ) {paddingValues ->
        GetProducts(navController = navController, paddingValues = paddingValues)
    }

}