package com.optic.ecommerceappmvvm.presentation.screens.client.address.create.mapper

import com.optic.ecommerceappmvvm.domain.model.Address
import com.optic.ecommerceappmvvm.presentation.screens.client.address.create.ClientAddressCreateState

fun ClientAddressCreateState.toAddress(): Address {
    return Address(
        address = address,
        neighborhood = neighborhood,
        idUser = idUser
    )
}