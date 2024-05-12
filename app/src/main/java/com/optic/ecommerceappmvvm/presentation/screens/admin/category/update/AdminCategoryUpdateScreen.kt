package com.optic.ecommerceappmvvm.presentation.screens.admin.category.update

import android.util.Log
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.components.AdminCategoryCreateContent
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.components.CreateCategory
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.components.AdminCategoryUpdateContent
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.components.UpdateCategory
import com.optic.ecommerceappmvvm.presentation.ui.theme.Gray200

@Composable
fun AdminCategoryUpdateScreen(navController: NavHostController, categoryParam: String) {

    Log.d("AdminCategoryUpdateScreen", "Data: $categoryParam")

    Scaffold(
        topBar = {
            DefaultTopBar(
                title = "Actualizar Categoria",
                upAvailable = true,
                navController = navController
            )
        },
        backgroundColor = Gray200
    ) { paddingValues ->
        AdminCategoryUpdateContent(paddingValues = paddingValues)
    }
    UpdateCategory()

}