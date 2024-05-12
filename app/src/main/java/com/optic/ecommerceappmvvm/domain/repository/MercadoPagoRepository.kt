package com.optic.ecommerceappmvvm.domain.repository

import com.optic.ecommerceappmvvm.domain.model.*
import com.optic.ecommerceappmvvm.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface MercadoPagoRepository {

    fun getIdentificationTypes(): Flow<Resource<List<IdentificationType>>>
    fun getInstallments(firstSixDigits: Int, amount: Double): Flow<Resource<Installment>>
    suspend fun createCardToken(cardTokenBody: CardTokenBody): Resource<CardTokenResponse>
    suspend fun createPayment(paymentBody: PaymentBody): Resource<PaymentResponse>
}