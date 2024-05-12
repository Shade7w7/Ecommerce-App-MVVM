package com.optic.ecommerceappmvvm.presentation.screens.client.category.list

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.domain.useCase.categories.CategoriesUseCase
import com.optic.ecommerceappmvvm.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClientCategoryListViewModel @Inject constructor(private val categoriesUseCase: CategoriesUseCase): ViewModel() {

    var categoriesResponse by mutableStateOf<Resource<List<Category>>?>(null)
        private set

    init {
        getCategories()
    }

    fun getCategories() = viewModelScope.launch {
        categoriesResponse = Resource.Loading
        categoriesUseCase.getCategories().collect() {
            categoriesResponse = it
        }
    }

}