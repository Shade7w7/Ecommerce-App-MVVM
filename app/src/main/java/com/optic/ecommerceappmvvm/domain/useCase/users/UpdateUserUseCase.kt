package com.optic.ecommerceappmvvm.domain.useCase.users

import com.optic.ecommerceappmvvm.domain.model.User
import com.optic.ecommerceappmvvm.domain.repository.UsersRepository

class UpdateUserUseCase(private val repository: UsersRepository) {

    suspend operator fun invoke(id: String, user: User) = repository.update(id, user)

}