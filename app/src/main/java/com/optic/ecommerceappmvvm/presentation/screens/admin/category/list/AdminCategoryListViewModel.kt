package com.optic.ecommerceappmvvm.presentation.screens.admin.category.list

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.optic.ecommerceappmvvm.domain.model.Category
import com.optic.ecommerceappmvvm.domain.useCase.categories.CategoriesUseCase
import com.optic.ecommerceappmvvm.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AdminCategoryListViewModel @Inject constructor(private val categoriesUseCase: CategoriesUseCase): ViewModel() {

    var categoriesResponse by mutableStateOf<Resource<List<Category>>?>(null)
        private set

    var deleteCategoryResponse by mutableStateOf<Resource<Unit>?>(null)
        private set


    init {
        getCategories()
    }

    fun getCategories() = viewModelScope.launch {
        categoriesResponse = Resource.Loading
        categoriesUseCase.getCategories().collect { data ->
            Log.d("GetCategories", "Data: ${data}")
            categoriesResponse = data
        }
    }

    fun deleteCategory(id: String) = viewModelScope.launch {
        deleteCategoryResponse = Resource.Loading
        val result = categoriesUseCase.deleteCategory(id)
        deleteCategoryResponse = result
    }

}