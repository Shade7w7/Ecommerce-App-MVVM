package com.optic.ecommerceappmvvm.presentation.navigation.graph.client

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminOrderScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ClientOrderScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.order.detail.AdminOrderDetailScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.order.detail.ClientOrderDetailScreen

fun NavGraphBuilder.ClientOrderNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.CLIENT_ORDER,
        startDestination = ClientOrderScreen.OrderDetail.route
    ) {

        composable(
            route = ClientOrderScreen.OrderDetail.route,
            arguments = listOf(navArgument("order") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("order")?.let {
                ClientOrderDetailScreen(navController, it)
            }
        }


    }
}