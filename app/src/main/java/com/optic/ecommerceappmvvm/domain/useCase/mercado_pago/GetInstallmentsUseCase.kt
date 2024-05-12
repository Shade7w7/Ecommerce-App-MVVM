package com.optic.ecommerceappmvvm.domain.useCase.mercado_pago

import com.optic.ecommerceappmvvm.domain.repository.MercadoPagoRepository

class GetInstallmentsUseCase(private val repository: MercadoPagoRepository) {

    operator fun invoke(firstSixDigits: Int, amount: Double) = repository.getInstallments(firstSixDigits, amount)

}