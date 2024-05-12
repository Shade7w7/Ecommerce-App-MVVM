package com.optic.ecommerceappmvvm.presentation.navigation.graph.admin

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.graph.profile.ProfileNavGraph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.list.AdminCategoryListScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.order.list.AdminOrderListScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.list.AdminProductListScreen
import com.optic.ecommerceappmvvm.presentation.screens.profile.info.ProfileScreen

@Composable
fun AdminNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ADMIN,
        startDestination = AdminScreen.CategoryList.route
    ) {

//        composable(route = AdminScreen.ProductList.route) {
//            AdminProductListScreen()
//        }

        composable(route = AdminScreen.CategoryList.route) {
            AdminCategoryListScreen(navController)
        }

        composable(route = AdminScreen.OrderList.route) {
            AdminOrderListScreen(navController)
        }

        composable(route = AdminScreen.Profile.route) {
            ProfileScreen(navController)
        }
        ProfileNavGraph(navController)
        AdminCategoryNavGraph(navController)
        AdminOrderNavGraph(navController)
    }
}