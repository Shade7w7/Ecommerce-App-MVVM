package com.optic.ecommerceappmvvm.domain.useCase.products

import com.optic.ecommerceappmvvm.domain.repository.ProductsRepository

class FindAllUseCase(private val repository: ProductsRepository) {
    suspend operator fun invoke() = repository.findAll()
}