package com.optic.ecommerceappmvvm.domain.useCase.address

import com.optic.ecommerceappmvvm.domain.model.Address
import com.optic.ecommerceappmvvm.domain.repository.AddressRepository

class CreateAddressUseCase(private val repository: AddressRepository) {

    suspend operator fun invoke(address: Address) = repository.create(address)

}