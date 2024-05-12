package com.optic.ecommerceappmvvm.domain.useCase.mercado_pago

import com.optic.ecommerceappmvvm.domain.model.CardTokenBody
import com.optic.ecommerceappmvvm.domain.model.PaymentBody
import com.optic.ecommerceappmvvm.domain.repository.MercadoPagoRepository

class CreatePaymentUseCase(private val repository: MercadoPagoRepository) {

    suspend operator fun invoke(paymentBody: PaymentBody) = repository.createPayment(paymentBody)

}