package com.optic.ecommerceappmvvm.domain.useCase.products

import com.optic.ecommerceappmvvm.domain.model.Product
import com.optic.ecommerceappmvvm.domain.repository.ProductsRepository
import java.io.File

class CreateProductUseCase(private val repository: ProductsRepository) {

    suspend operator fun invoke(product: Product, files: List<File>) = repository.create(product, files)

}