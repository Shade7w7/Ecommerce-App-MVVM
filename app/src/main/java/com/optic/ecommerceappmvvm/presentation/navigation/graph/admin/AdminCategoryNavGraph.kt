package com.optic.ecommerceappmvvm.presentation.navigation.graph.admin

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminCategoryScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.roles.RolesScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.AdminCategoryCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.AdminCategoryUpdateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.home.AdminHomeScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.AdminProductCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.list.AdminProductListScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.update.AdminProductUpdateScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.home.ClientHomeScreen
import com.optic.ecommerceappmvvm.presentation.screens.roles.RolesScreen

    fun NavGraphBuilder.AdminCategoryNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.ADMIN_CATEGORY,
        startDestination = AdminCategoryScreen.CategoryCreate.route
    ) {

        composable(route = AdminCategoryScreen.CategoryCreate.route) {
            AdminCategoryCreateScreen(navController)
        }

        composable(
            route = AdminCategoryScreen.CategoryUpdate.route,
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("category")?.let {
                AdminCategoryUpdateScreen(navController, it)
            }
        }

        composable(
            route = AdminCategoryScreen.ProductList.route,
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("category")?.let {
                AdminProductListScreen(navController, it)
            }
        }

        composable(
            route = AdminCategoryScreen.ProductCreate.route,
            arguments = listOf(navArgument("category") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("category")?.let {
                AdminProductCreateScreen(navController, it)
            }
        }
        composable(
            route = AdminCategoryScreen.ProductUpdate.route,
            arguments = listOf(navArgument("product") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("product")?.let {
                AdminProductUpdateScreen(navController, it)
            }
        }

    }
}