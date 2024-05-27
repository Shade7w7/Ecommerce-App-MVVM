package com.optic.ecommerceappmvvm.di

import android.app.Application
import androidx.room.Room
import com.optic.ecommerceappmvvm.data.dataSource.local.dao.AddressDao
import com.optic.ecommerceappmvvm.data.dataSource.local.dao.CategoriesDao
import com.optic.ecommerceappmvvm.data.dataSource.local.dao.ProductsDao
import com.optic.ecommerceappmvvm.data.dataSource.local.db.EcommerceDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): EcommerceDB =
        Room.databaseBuilder(app, EcommerceDB::class.java, "ecommerce_db").fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun provideCategoriesDao(db: EcommerceDB): CategoriesDao = db.categoriesDao()

    @Provides
    @Singleton
    fun provideProductsDao(db: EcommerceDB): ProductsDao = db.productsDao()

    @Provides
    @Singleton
    fun provideAddressDao(db: EcommerceDB): AddressDao = db.addressDao()

}