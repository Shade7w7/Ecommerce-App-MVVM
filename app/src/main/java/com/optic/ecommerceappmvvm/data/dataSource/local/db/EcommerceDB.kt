package com.optic.ecommerceappmvvm.data.dataSource.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.optic.ecommerceappmvvm.data.dataSource.local.dao.AddressDao
import com.optic.ecommerceappmvvm.data.dataSource.local.dao.CategoriesDao
import com.optic.ecommerceappmvvm.data.dataSource.local.dao.ProductsDao
import com.optic.ecommerceappmvvm.data.dataSource.local.entity.AddressEntity
import com.optic.ecommerceappmvvm.data.dataSource.local.entity.CategoryEntity
import com.optic.ecommerceappmvvm.data.dataSource.local.entity.ProductEntity

@Database(
    entities = [CategoryEntity::class, ProductEntity::class, AddressEntity::class],
    version = 1,
    exportSchema = false
)
abstract class EcommerceDB: RoomDatabase() {
    abstract fun categoriesDao(): CategoriesDao // DATA ACCESS OBJECT
    abstract fun productsDao(): ProductsDao
    abstract fun addressDao(): AddressDao
}