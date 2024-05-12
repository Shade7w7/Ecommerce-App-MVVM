package com.optic.ecommerceappmvvm.domain.useCase.categories

import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.domain.repository.CategoriesRepository
import java.io.File

class UpdateCategoryUseCase(private val repository: CategoriesRepository) {
    suspend operator fun invoke(id: String, category: Category) = repository.update(id, category)
}