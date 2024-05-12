package com.optic.ecommerceappmvvm.data.repository

import com.optic.ecommerceappmvvm.data.dataSource.remote.UsersRemoteDataSource
import com.optic.ecommerceappmvvm.domain.model.User
import com.optic.ecommerceappmvvm.domain.repository.UsersRepository
import com.optic.ecommerceappmvvm.domain.util.Resource
import com.optic.ecommerceappmvvm.domain.util.ResponseToRequest
import java.io.File

class UsersRepositoryImpl(
    private val usersRemoteDataSource: UsersRemoteDataSource,
): UsersRepository {

    override suspend fun update(id: String, user: User): Resource<User> = ResponseToRequest.send(
        usersRemoteDataSource.update(id, user)
    )

    override suspend fun updateWithImage(id: String, user: User, file: File) = ResponseToRequest.send(
        usersRemoteDataSource.updateWithImage(id, user, file)
    )

}