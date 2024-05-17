package com.optic.ecommerceappmvvm.presentation.navigation.graph.client

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.graph.profile.ProfileNavGraph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ClientScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.category.list.ClientCategoryListScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.order.list.ClientOrderListScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.product.ClientProductListScreen
import com.optic.ecommerceappmvvm.presentation.screens.profile.info.ProfileScreen

@Composable
fun ClientNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.CLIENT,
        startDestination = ClientScreen.ProductList.route
    ) {

        composable(route = ClientScreen.ProductList.route) {
            ClientProductListScreen(navController)
        }

        composable(route = ClientScreen.CategoryList.route) {
            ClientCategoryListScreen(navController)
        }
/*
        composable(route = ClientScreen.OrderList.route) {
            ClientOrderListScreen(navController)
        }
*/
        composable(route = ClientScreen.Profile.route) {
            ProfileScreen(navController)
        }

        ProfileNavGraph(navController)
        ClientCategoryNavGraph(navController)
        ClientProductNavGraph(navController)
        ShoppingBagNavGraph(navController)
        ClientOrderNavGraph(navController)

    }
}