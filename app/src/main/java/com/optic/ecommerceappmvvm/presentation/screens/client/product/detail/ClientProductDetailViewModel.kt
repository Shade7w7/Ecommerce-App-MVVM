package com.optic.ecommerceappmvvm.presentation.screens.client.product.detail

import androidx.compose.runtime.*
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.optic.ecommerceappmvvm.domain.model.Product
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ClientProductDetailViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {

    var data = savedStateHandle.get<String>("product")
    var product = Product.fromJson(data!!)
    var productImages = listOf<String>(product.image1 ?: "", product.image2 ?: "")

    var quantity by mutableStateOf(0)
        private set

    var price by mutableStateOf(0.0)
        private set
    
    fun add()  {
        quantity = quantity + 1
        price = product.price * quantity
    }

    fun remove()  {
        if (quantity > 0) {
            quantity = quantity - 1
            price = product.price * quantity
        }
    }

}