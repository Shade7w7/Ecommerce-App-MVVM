package com.optic.ecommerceappmvvm.domain.useCase.auth

import com.optic.ecommerceappmvvm.domain.repository.AuthRepository
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

abstract class GetSessionDataUseCaseTest{

    @RelaxedMockK
    abstract val repository: AuthRepository

    lateinit var getSessionDataUseCase: GetSessionDataUseCase

    @Before
    fun onBefore(){
        MockKAnnotations.init(this)
        getSessionDataUseCase = GetSessionDataUseCase(repository)
    }

    @Test
    fun getSessionInfo() = runBlocking{
        //given
        coEvery { repository.getSessionData() } returns emptyFlow()
        //when
        getSessionDataUseCase
        //then
        coVerify {  }
    }
}