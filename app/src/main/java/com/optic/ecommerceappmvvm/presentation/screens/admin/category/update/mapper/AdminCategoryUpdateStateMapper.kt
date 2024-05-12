package com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.mapper

import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.AdminCategoryCreateState
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.update.AdminCategoryUpdateState

fun AdminCategoryUpdateState.toCategory(): Category {
    return Category(
        name = name,
        description = description
    )
}