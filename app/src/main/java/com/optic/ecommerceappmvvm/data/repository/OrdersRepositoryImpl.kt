package com.optic.ecommerceappmvvm.data.repository

import com.optic.ecommerceappmvvm.data.dataSource.remote.OrdersRemoteDataSource
import com.optic.ecommerceappmvvm.domain.model.Order
import com.optic.ecommerceappmvvm.domain.repository.OrdersRepository
import com.optic.ecommerceappmvvm.domain.util.Resource
import com.optic.ecommerceappmvvm.domain.util.ResponseToRequest
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class OrdersRepositoryImpl(private val remoteDataSource: OrdersRemoteDataSource): OrdersRepository {

    override fun findAll(): Flow<Resource<List<Order>>> = flow {
        emit(ResponseToRequest.send(remoteDataSource.findAll()))
    }

    override fun findByClient(idClient: String): Flow<Resource<List<Order>>> = flow {
        emit(ResponseToRequest.send(remoteDataSource.findByClient(idClient)))
    }

    override suspend fun updateStatus(id: String): Resource<Order> = ResponseToRequest.send(
        remoteDataSource.updateStatus(id)
    )
}