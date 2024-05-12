package com.optic.ecommerceappmvvm.presentation.navigation.graph.client

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminCategoryScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ClientCategoryScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ClientProductScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.roles.RolesScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.AdminCategoryCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.AdminCategoryUpdateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.home.AdminHomeScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.AdminProductCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.list.AdminProductListScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.update.AdminProductUpdateScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.home.ClientHomeScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.product.detail.ClientProductDetailScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.product.listByCategory.ClientProductByCategoryListScreen
import com.optic.ecommerceappmvvm.presentation.screens.roles.RolesScreen

fun NavGraphBuilder.ClientCategoryNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.CLIENT_CATEGORY,
        startDestination = ClientCategoryScreen.ProductList.route
    ) {

        composable(
            route = ClientCategoryScreen.ProductList.route,
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("category")?.let {
                ClientProductByCategoryListScreen(navController, it)
            }
        }

        composable(
            route = ClientCategoryScreen.ProductDetail.route,
            arguments = listOf(navArgument("product") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("product")?.let {
                ClientProductDetailScreen(navController, it)
            }
        }


    }
}