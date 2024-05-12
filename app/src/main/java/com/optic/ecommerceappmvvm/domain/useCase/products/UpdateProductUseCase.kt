package com.optic.ecommerceappmvvm.domain.useCase.products

import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.domain.repository.ProductsRepository

class UpdateProductUseCase(private val repository: ProductsRepository) {
    suspend operator fun invoke(id: String, product: Product) = repository.update(id, product)
}