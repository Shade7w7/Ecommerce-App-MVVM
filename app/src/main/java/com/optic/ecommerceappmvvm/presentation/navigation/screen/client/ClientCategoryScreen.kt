package com.optic.ecommerceappmvvm.presentation.navigation.screen.client

import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminCategoryScreen

sealed class ClientCategoryScreen(val route: String) {

    object ProductList: ClientCategoryScreen("client/category/products/list/{category}") {
        fun passCategory(category: String) = "client/category/products/list/$category"
    }

    object ProductDetail: ClientCategoryScreen("client/category/products/detail/{product}") {
        fun passProduct(product: String) = "client/category/products/detail/$product"
    }

    object ProductCreate: ClientCategoryScreen("client/category/products/create/{category}") {
        fun passCategory(category: String) = "client/category/products/create/$category"
    }

}

