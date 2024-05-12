package com.optic.ecommerceappmvvm.presentation.navigation.graph.admin

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminOrderScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.order.detail.AdminOrderDetailScreen

    fun NavGraphBuilder.AdminOrderNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.ADMIN_ORDER,
        startDestination = AdminOrderScreen.OrderDetail.route
    ) {

        composable(
            route = AdminOrderScreen.OrderDetail.route,
            arguments = listOf(navArgument("order") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("order")?.let {
                AdminOrderDetailScreen(navController, it)
            }
        }


    }
}