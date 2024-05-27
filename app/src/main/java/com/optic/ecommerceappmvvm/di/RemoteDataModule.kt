package com.optic.ecommerceappmvvm.di

import com.optic.ecommerceappmvvm.data.dataSource.remote.*
import com.optic.ecommerceappmvvm.data.dataSource.remote.service.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideAuthRemoteDataSource(authService: AuthService): AuthRemoteDataSource = AuthRemoteDataSourceImpl(authService)

    @Provides
    fun provideUsersRemoteDataSource(usersService: UsersService): UsersRemoteDataSource = UsersRemoteDataSourceImpl(usersService)

    @Provides
    fun provideCategoriesRemoteDataSource(categoriesService: CategoriesService): CategoriesRemoteDataSource = CategoriesRemoteDataSourceImpl(categoriesService)

    @Provides
    fun provideProductsRemoteDataSource(productsService: ProductsService): ProductsRemoteDataSource = ProductsRemoteDataSourceImpl(productsService)

    @Provides
    fun provideAddressRemoteDataSource(addressService: AddressService): AddressRemoteDataSource = AddressRemoteDataSourceImpl(addressService)
}