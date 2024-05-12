package com.optic.ecommerceappmvvm.domain.useCase.shopping_bag

import com.optic.ecommerceappmvvm.domain.repository.ShoppingBagRepository

class FindAllShoppingBagUseCase(private val repository: ShoppingBagRepository) {
    operator fun invoke() = repository.findAll()
}