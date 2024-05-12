package com.optic.ecommerceappmvvm.domain.useCase.orders

import com.optic.ecommerceappmvvm.domain.repository.OrdersRepository

class FindAllOrdersUseCase(private val repository: OrdersRepository) {

    operator fun invoke() = repository.findAll()

}