package com.optic.ecommerceappmvvm.domain.useCase.products

import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.domain.repository.ProductsRepository

class DeleteProductUseCase(private val repository: ProductsRepository) {
    suspend operator fun invoke(id: String) = repository.delete(id)
}