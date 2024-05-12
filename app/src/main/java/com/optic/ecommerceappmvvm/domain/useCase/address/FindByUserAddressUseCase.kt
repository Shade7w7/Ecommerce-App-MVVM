package com.optic.ecommerceappmvvm.domain.useCase.address

import com.optic.ecommerceappmvvm.domain.model.Address
import com.optic.ecommerceappmvvm.domain.repository.AddressRepository

class FindByUserAddressUseCase(private val repository: AddressRepository) {

    suspend operator fun invoke(idUser: String) = repository.findByUser(idUser)

}