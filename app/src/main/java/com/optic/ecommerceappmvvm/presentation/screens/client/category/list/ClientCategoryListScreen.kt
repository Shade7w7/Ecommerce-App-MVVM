package com.optic.ecommerceappmvvm.presentation.screens.client.category.list

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.screens.client.category.list.components.ClientCategoryListContent
import com.optic.ecommerceappmvvm.presentation.screens.client.category.list.components.GetCategories
import com.optic.ecommerceappmvvm.presentation.screens.profile.info.components.ProfileContent

@Composable
fun ClientCategoryListScreen(navController: NavHostController) {

    Scaffold() {paddingValues ->
        GetCategories(paddingValues, navController)
    }

}