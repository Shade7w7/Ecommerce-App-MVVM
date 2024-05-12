package com.optic.ecommerceappmvvm.presentation.screens.client.payments.form.mapper

import com.optic.ecommerceappmvvm.domain.model.CardTokenBody
import com.optic.ecommerceappmvvm.domain.model.Cardholder
import com.optic.ecommerceappmvvm.domain.model.Identification
import com.optic.ecommerceappmvvm.presentation.screens.client.payments.form.ClientPaymentsFormState

fun ClientPaymentsFormState.toCardTokenBody(): CardTokenBody {
    return CardTokenBody(
        cardNumber = cardNumber,
        expirationMonth = expirationMonth.toInt(),
        expirationYear = expirationYear,
        securityCode = securityCode,
        cardholder = Cardholder(
            name = name,
            identification = Identification(
                type = type,
                number = number
            )
        )
    )
}