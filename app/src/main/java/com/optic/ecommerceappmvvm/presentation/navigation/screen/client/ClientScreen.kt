package com.optic.ecommerceappmvvm.presentation.navigation.screen.client

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.ui.graphics.vector.ImageVector
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminScreen

sealed class ClientScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object CategoryList: ClientScreen(
        route = "client/category/list",
        title = "Categorias",
        icon = Icons.Default.List
    )
    object ProductList: ClientScreen(
        route = "client/product/list",
        title = "Servicios",
        icon = Icons.Default.ThumbUp
    )

    object Profile: ClientScreen(
        route = "client/profile",
        title = "Perfil",
        icon = Icons.Default.Person
    )

}

