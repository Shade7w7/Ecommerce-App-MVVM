package com.optic.ecommerceappmvvm.domain.useCase.shopping_bag

import com.optic.ecommerceappmvvm.domain.model.ShoppingBagProduct
import com.optic.ecommerceappmvvm.domain.repository.ShoppingBagRepository

class DeleteUseCase(private val repository: ShoppingBagRepository) {
    suspend operator fun invoke(id: String) {
        repository.delete(id)
    }
}