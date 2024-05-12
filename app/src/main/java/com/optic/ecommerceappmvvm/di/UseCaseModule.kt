package com.optic.ecommerceappmvvm.di

import com.optic.ecommerceappmvvm.domain.repository.*
import com.optic.ecommerceappmvvm.domain.useCase.address.AddressUseCase
import com.optic.ecommerceappmvvm.domain.useCase.address.CreateAddressUseCase
import com.optic.ecommerceappmvvm.domain.useCase.address.FindByUserAddressUseCase
import com.optic.ecommerceappmvvm.domain.useCase.auth.*
import com.optic.ecommerceappmvvm.domain.useCase.categories.*
import com.optic.ecommerceappmvvm.domain.useCase.mercado_pago.*
import com.optic.ecommerceappmvvm.domain.useCase.orders.FindAllOrdersUseCase
import com.optic.ecommerceappmvvm.domain.useCase.orders.FindByClientOrdersUseCase
import com.optic.ecommerceappmvvm.domain.useCase.orders.OrdersUseCase
import com.optic.ecommerceappmvvm.domain.useCase.orders.UpdateStatusOrdersUseCase
import com.optic.ecommerceappmvvm.domain.useCase.products.*
import com.optic.ecommerceappmvvm.domain.useCase.shopping_bag.*
import com.optic.ecommerceappmvvm.domain.useCase.users.UpdateUserUseCase
import com.optic.ecommerceappmvvm.domain.useCase.users.UpdateUserWithImageUseCase
import com.optic.ecommerceappmvvm.domain.useCase.users.UsersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideAuthUseCase(authRepository: AuthRepository) = AuthUseCase(
        login = LoginUseCase(authRepository),
        register = RegisterUseCase(authRepository),
        saveSession = SaveSessionUseCase(authRepository),
        getSessionData = GetSessionDataUseCase(authRepository),
        logout = LogoutUseCase(authRepository),
        updateSession = UpdateSessionUseCase(authRepository)
    )

    @Provides
    fun provideUsersUseCase(usersRepository: UsersRepository) = UsersUseCase(
        updateUser = UpdateUserUseCase(usersRepository),
        updateUserWithImage = UpdateUserWithImageUseCase(usersRepository)
    )

    @Provides
    fun provideCategoriesUseCase(categoriesRepository: CategoriesRepository) = CategoriesUseCase(
        createCategory = CreateCategoryUseCase(categoriesRepository),
        getCategories = GetCategoriesUseCase(categoriesRepository),
        updateCategory = UpdateCategoryUseCase(categoriesRepository),
        updateCategoryWithImage = UpdateCategoryWithImageUseCase(categoriesRepository),
        deleteCategory = DeleteCategoryUseCase(categoriesRepository)
    )

    @Provides
    fun provideProductsUseCase(productsRepository: ProductsRepository) = ProductsUseCase(
        createProduct = CreateProductUseCase(productsRepository),
        findByCategory = FindByCategoryUseCase(productsRepository),
        findAll = FindAllUseCase(productsRepository),
        updateProduct = UpdateProductUseCase(productsRepository),
        updateProductWithImage = UpdateProductWithImageUseCase(productsRepository),
        deleteProduct = DeleteProductUseCase(productsRepository),
        findByName = FindByNameUseCase(productsRepository)
    )

    @Provides
    fun provideShoppingBagUseCase(shoppingBagRepository: ShoppingBagRepository) = ShoppingBagUseCase(
        add = AddUseCase(shoppingBagRepository),
        delete = DeleteUseCase(shoppingBagRepository),
        findAll = FindAllShoppingBagUseCase(shoppingBagRepository),
        findById = FindByIdShoppingBagUseCase(shoppingBagRepository),
        getTotal = GetTotalUseCase(shoppingBagRepository)
    )

    @Provides
    fun provideAddressUseCase(addressRepository: AddressRepository) = AddressUseCase(
        createAddress = CreateAddressUseCase(addressRepository),
        findByUserAddress = FindByUserAddressUseCase(addressRepository)
    )

    @Provides
    fun provideMercadoPagoUseCase(mercadoPagoRepository: MercadoPagoRepository) = MercadoPagoUseCase(
        getIdentificationType = GetIdentificationTypeUseCase(mercadoPagoRepository),
        getInstallments = GetInstallmentsUseCase(mercadoPagoRepository),
        createCardToken = CreateCardTokenUseCase(mercadoPagoRepository),
        createPayment = CreatePaymentUseCase(mercadoPagoRepository),
    )

    @Provides
    fun provideOrdersUseCase(ordersRepository: OrdersRepository) = OrdersUseCase(
        findAllOrders = FindAllOrdersUseCase(ordersRepository),
        findByClientOrders = FindByClientOrdersUseCase(ordersRepository),
        updateStatusOrders = UpdateStatusOrdersUseCase(ordersRepository)
    )
}