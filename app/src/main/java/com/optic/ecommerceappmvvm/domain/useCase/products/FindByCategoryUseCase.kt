package com.optic.ecommerceappmvvm.domain.useCase.products

import com.optic.ecommerceappmvvm.domain.repository.ProductsRepository

class FindByCategoryUseCase(private val repository: ProductsRepository) {
    suspend operator fun invoke(idCategory: String) = repository.findByCategory(idCategory)
}