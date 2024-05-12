package com.optic.ecommerceappmvvm.domain.repository

import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.domain.model.ShoppingBagProduct
import kotlinx.coroutines.flow.Flow

interface ShoppingBagRepository {
    suspend fun add(product: ShoppingBagProduct)
    suspend fun delete(id: String)
    fun findAll(): Flow<List<ShoppingBagProduct>>
    suspend fun findById(id: String): ShoppingBagProduct?
    suspend fun getTotal(): Double
}