package com.optic.ecommerceappmvvm.domain.useCase.shopping_bag

import com.optic.ecommerceappmvvm.domain.model.ShoppingBagProduct
import com.optic.ecommerceappmvvm.domain.repository.ShoppingBagRepository

class GetTotalUseCase(private val repository: ShoppingBagRepository) {
    suspend operator fun invoke()  = repository.getTotal()
}