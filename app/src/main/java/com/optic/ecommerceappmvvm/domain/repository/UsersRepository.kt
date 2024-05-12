package com.optic.ecommerceappmvvm.domain.repository

import com.optic.ecommerceappmvvm.domain.model.User
import com.optic.ecommerceappmvvm.domain.util.Resource
import java.io.File

interface UsersRepository {

    suspend fun update(id: String, user: User): Resource<User>
    suspend fun updateWithImage(id: String, user: User, file: File): Resource<User>

}