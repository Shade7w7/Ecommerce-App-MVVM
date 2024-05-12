package com.optic.ecommerceappmvvm.presentation.screens.admin.product.update.mapper

import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.create.AdminProductCreateState
import com.optic.ecommerceappmvvm.presentation.screens.admin.product.update.AdminProductUpdateState

fun AdminProductUpdateState.toProduct(): Product {
    return Product(
        name = name,
        description = description,
        idCategory = idCategory,
        price = price,
        imagesToUpdate = imagesToUpdate.toList(),
        image1 = image1,
        image2 = image2
    )
}