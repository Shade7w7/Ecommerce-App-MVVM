package com.optic.ecommerceappmvvm.domain.useCase.categories

import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.domain.repository.CategoriesRepository
import java.io.File

class CreateCategoryUseCase(private val repository: CategoriesRepository) {
    suspend operator fun invoke(category: Category, file: File) = repository.create(category, file)
}