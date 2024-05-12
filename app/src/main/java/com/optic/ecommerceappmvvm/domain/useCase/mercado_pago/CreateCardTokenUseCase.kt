package com.optic.ecommerceappmvvm.domain.useCase.mercado_pago

import com.optic.ecommerceappmvvm.domain.model.CardTokenBody
import com.optic.ecommerceappmvvm.domain.repository.MercadoPagoRepository

class CreateCardTokenUseCase(private val repository: MercadoPagoRepository) {

    suspend operator fun invoke(cardTokenBody: CardTokenBody) = repository.createCardToken(cardTokenBody)

}