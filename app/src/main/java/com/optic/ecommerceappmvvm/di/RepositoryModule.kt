package com.optic.ecommerceappmvvm.di

import com.optic.ecommerceappmvvm.data.dataSource.local.*
import com.optic.ecommerceappmvvm.data.dataSource.remote.*
import com.optic.ecommerceappmvvm.data.repository.*
import com.optic.ecommerceappmvvm.domain.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideAuthRepository(
        authRemoteDataSource: AuthRemoteDataSource,
        authLocalDataSource: AuthLocalDataSource
    ): AuthRepository = AuthRepositoryImpl(authRemoteDataSource, authLocalDataSource)

    @Provides
    fun provideUsersRepository(
        usersRemoteDataSource: UsersRemoteDataSource,
    ): UsersRepository = UsersRepositoryImpl(usersRemoteDataSource)

    @Provides
    fun provideCategoriesRepository(
        categoriesRemoteDataSource: CategoriesRemoteDataSource,
        categoriesLocalDataSource: CategoriesLocalDataSource
    ): CategoriesRepository = CategoriesRepositoryImpl(categoriesRemoteDataSource, categoriesLocalDataSource)

    @Provides
    fun provideProductsRepository(
        productsRemoteDataSource: ProductsRemoteDataSource,
        productsLocalDataSource: ProductsLocalDataSource
    ): ProductsRepository = ProductsRepositoryImpl(productsRemoteDataSource, productsLocalDataSource)

    @Provides
    fun provideShoppingBagRepository(
        shoppingBagLocalDataSource: ShoppingBagLocalDataSource
    ): ShoppingBagRepository = ShoppingBagRepositoryImpl(shoppingBagLocalDataSource)

    @Provides
    fun provideAddressRepository(
        addressRemoteDataSource: AddressRemoteDataSource,
        addressLocalDataSource: AddressLocalDataSource
    ): AddressRepository = AddressRepositoryImpl(addressRemoteDataSource, addressLocalDataSource)

    @Provides
    fun provideMercadoPagoRepository(
        mercadoPagoRemoteDataSource: MercadoPagoRemoteDataSource
    ): MercadoPagoRepository = MercadoPagoRepositoryImpl(mercadoPagoRemoteDataSource)

    @Provides
    fun provideOrdersRepository(
        ordersRemoteDataSource: OrdersRemoteDataSource
    ): OrdersRepository = OrdersRepositoryImpl(ordersRemoteDataSource)

}