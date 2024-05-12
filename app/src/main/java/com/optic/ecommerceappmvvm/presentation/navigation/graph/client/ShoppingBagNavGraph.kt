package com.optic.ecommerceappmvvm.presentation.navigation.graph.client

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminCategoryScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ClientCategoryScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ClientProductScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.client.ShoppingBagScreen
import com.optic.ecommerceappmvvm.presentation.navigation.screen.roles.RolesScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.AdminCategoryCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.AdminCategoryUpdateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.home.AdminHomeScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.AdminProductCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.list.AdminProductListScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.update.AdminProductUpdateScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.address.create.ClientAddressCreateScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.address.list.ClientAddressListScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.home.ClientHomeScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.payments.form.ClientPaymentsFormScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.payments.installments.ClientPaymentsInstallmentsScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.payments.status.ClientPaymentsStatusScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.product.detail.ClientProductDetailScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.product.listByCategory.ClientProductByCategoryListScreen
import com.optic.ecommerceappmvvm.presentation.screens.client.shopping_bag.ClientShoppingBagScreen
import com.optic.ecommerceappmvvm.presentation.screens.roles.RolesScreen

fun NavGraphBuilder.ShoppingBagNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.SHOPPING_BAG,
        startDestination = ShoppingBagScreen.ShoppingBag.route
    ) {

        composable(
            route = ShoppingBagScreen.ShoppingBag.route,
        ) {
            ClientShoppingBagScreen(navController)
        }
        composable(
            route = ShoppingBagScreen.AddressList.route,
        ) {
            ClientAddressListScreen(navController)
        }
        composable(
            route = ShoppingBagScreen.AddressCreate.route,
        ) {
            ClientAddressCreateScreen(navController)
        }
        composable(
            route = ShoppingBagScreen.PaymentsForm.route,
        ) {
            ClientPaymentsFormScreen(navController)
        }
        composable(
            route = ShoppingBagScreen.PaymentsInstallments.route,
            arguments = listOf(navArgument("payment_form") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("payment_form")?.let {
                ClientPaymentsInstallmentsScreen(navController, it)
            }
        }
        composable(
            route = ShoppingBagScreen.PaymentsStatus.route,
            arguments = listOf(navArgument("payment_response") {
                type = NavType.StringType
            })
        ) {
            it.arguments?.getString("payment_response")?.let {
                ClientPaymentsStatusScreen(navController, it)
            }
        }

    }
}