package com.optic.ecommerceappmvvm.domain.useCase.categories

import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.domain.repository.CategoriesRepository
import java.io.File

class DeleteCategoryUseCase(private val repository: CategoriesRepository) {
    suspend operator fun invoke(id: String) = repository.delete(id)
}