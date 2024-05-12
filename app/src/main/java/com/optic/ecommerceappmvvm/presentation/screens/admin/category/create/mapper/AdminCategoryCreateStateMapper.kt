package com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.mapper

import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.presentation.screens.admin.category.create.AdminCategoryCreateState

fun AdminCategoryCreateState.toCategory(): Category {
    return Category(
        name = name,
        description = description
    )
}