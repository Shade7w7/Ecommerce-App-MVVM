package com.optic.ecommerceappmvvm.presentation.screens.client.address.list

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.optic.ecommerceappmvvm.domain.model.Address
import com.optic.ecommerceappmvvm.domain.model.User
import com.optic.ecommerceappmvvm.domain.useCase.address.AddressUseCase
import com.optic.ecommerceappmvvm.domain.useCase.auth.AuthUseCase
import com.optic.ecommerceappmvvm.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClientAddressListViewModel @Inject constructor(
    private val addressUseCase: AddressUseCase,
    private val authUseCase: AuthUseCase
): ViewModel() {

    var addressResponse by mutableStateOf<Resource<List<Address>>?>(null)
        private set
    var selectedAddress by mutableStateOf("")
        private set
    var user: User? = null

    fun getSessionData() = viewModelScope.launch {
        user = authUseCase.getSessionData().first().user
        Log.d("ClientAddressListViewModel", "User: ${user}")

        getAddress(user?.id ?: "")
        if (user?.address != null) {
            selectedAddress = user?.address?.id ?: ""
        }
    }

    fun getAddress(idUser: String) = viewModelScope.launch {
        addressResponse = Resource.Loading
        addressUseCase.findByUserAddress(idUser).collect() {
            Log.d("ClientAddressListViewModel", "Data: ${it}")
            addressResponse = it
        }
    }

    fun onSelectedAddressInput(address: Address) = viewModelScope.launch {
        selectedAddress = address.id ?: ""
        user?.address = address
        if (user != null) authUseCase.updateSession(user!!)
    }

}