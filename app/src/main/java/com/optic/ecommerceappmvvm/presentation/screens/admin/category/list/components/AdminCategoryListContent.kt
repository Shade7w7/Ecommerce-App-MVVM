package com.optic.ecommerceappmvvm.presentation.screens.admin.category.list.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.optic.ecommerceappmvvm.domain.model.Category

@Composable
fun AdminCategoryListContent(navController: NavHostController, categories: List<Category>, paddingValues: PaddingValues) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues = paddingValues)
    ) {
        items(
            items = categories
        ) {category ->
            AdminCategoryListItem(navController, category)
        }
    }
}