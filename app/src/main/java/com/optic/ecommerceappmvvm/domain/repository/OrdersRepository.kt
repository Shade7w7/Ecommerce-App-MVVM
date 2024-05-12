package com.optic.ecommerceappmvvm.domain.repository

import com.optic.ecommerceappmvvm.domain.model.Order
import com.optic.ecommerceappmvvm.domain.util.Resource
import kotlinx.coroutines.flow.Flow

interface OrdersRepository {
    fun findAll(): Flow<Resource<List<Order>>>
    fun findByClient(idClient: String): Flow<Resource<List<Order>>>
    suspend fun updateStatus(id: String): Resource<Order>
}