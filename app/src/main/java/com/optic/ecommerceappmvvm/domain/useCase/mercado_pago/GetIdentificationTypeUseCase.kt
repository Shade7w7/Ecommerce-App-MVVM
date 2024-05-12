package com.optic.ecommerceappmvvm.domain.useCase.mercado_pago

import com.optic.ecommerceappmvvm.domain.repository.MercadoPagoRepository

class GetIdentificationTypeUseCase(private val repository: MercadoPagoRepository) {

    operator fun invoke() = repository.getIdentificationTypes()

}