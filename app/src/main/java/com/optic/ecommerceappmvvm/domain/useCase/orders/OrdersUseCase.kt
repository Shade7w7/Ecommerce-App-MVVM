package com.optic.ecommerceappmvvm.domain.useCase.orders

data class OrdersUseCase(
    val findAllOrders: FindAllOrdersUseCase,
    val findByClientOrders: FindByClientOrdersUseCase,
    val updateStatusOrders: UpdateStatusOrdersUseCase
)
