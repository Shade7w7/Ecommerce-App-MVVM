package com.optic.ecommerceappmvvm.presentation.screens.admin.category.create

import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.components.AdminCategoryCreateContent
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.components.CreateCategory
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray100
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray200

@Composable
fun AdminCategoryCreateScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Nueva Categoria",
                upAvailable = true,
                navController = navController
            )
        },
        backgroundColor = Gray100
    ) { paddingValues ->
        AdminCategoryCreateContent(paddingValues = paddingValues)
    }
    CreateCategory()

}