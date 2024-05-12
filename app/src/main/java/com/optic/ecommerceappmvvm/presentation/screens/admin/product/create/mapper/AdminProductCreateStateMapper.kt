package com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.mapper

import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.AdminProductCreateState

fun AdminProductCreateState.toProduct(): Product {
    return Product(
        name = name,
        description = description,
        idCategory = idCategory,
        price = price
    )
}