package com.optic.ecommerceappmvvm.domain.repository

import com.optic.ecommerceappmvvm.domain.model.Address
import com.optic.ecommerceappmvvm.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface AddressRepository {

    suspend fun create(address: Address): Resource<Address>
    fun findByUser(idUser: String): Flow<Resource<List<Address>>>

}