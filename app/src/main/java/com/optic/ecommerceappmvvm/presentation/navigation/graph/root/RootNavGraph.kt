package com.optic.ecommerceappmvvm.presentation.navigation.graph.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.graph.auth.AuthNavGraph
import com.optic.ecommerceappmvvm.presentation.navigation.graph.roles.RolesNavGraph
import com.optic.ecommerceappmvvm.presentation.screens.client.home.ClientHomeScreen

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.AUTH
    ) {
        AuthNavGraph(navController = navController)
        RolesNavGraph(navController = navController)

    }
}