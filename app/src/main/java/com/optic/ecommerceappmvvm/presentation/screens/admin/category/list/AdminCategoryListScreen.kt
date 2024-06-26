package com.optic.ecommerceappmvvm.presentation.screens.admin.category.list

import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.presentation.components.DefaultTopBar
import com.optic.ecommerceappmvvm.presentation.navigation.Graph
import com.optic.ecommerceappmvvm.presentation.navigation.screen.admin.AdminCategoryScreen
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.list.components.AdminCategoryListContent
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.list.components.DeleteCategory
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.list.components.GetCategories
import com.optic.ecommerceappmvvm.presentation.screens.client.category.list.components.ClientCategoryListContent
import com.optic.ecommerceappmvvm.presentation.ui.theme.Green500

@Composable
fun AdminCategoryListScreen(navController: NavHostController) {

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(bottom = 60.dp),
                onClick = {
                    navController.navigate(route = Graph.ADMIN_CATEGORY)
                },
                backgroundColor = Green500
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "",
                    tint = Color.White
                )
            }
        }
    ) {paddingValues ->
        GetCategories(navController, paddingValues)
    }
    DeleteCategory()

}