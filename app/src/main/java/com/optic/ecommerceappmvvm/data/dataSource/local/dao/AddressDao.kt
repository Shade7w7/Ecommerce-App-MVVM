package com.optic.ecommerceappmvvm.data.dataSource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.optic.ecommerceappmvvm.data.dataSource.local.entity.AddressEntity
import com.optic.ecommerceappmvvm.domain.model.Address
import kotlinx.coroutines.flow.Flow

@Dao
interface AddressDao {

    // INSERT INTO categories VALUES
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(address: AddressEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(address: List<AddressEntity>)

    @Query("SELECT * FROM address WHERE id_user = :id_user")
    fun findByUser(id_user: String): Flow<List<AddressEntity>>

    @Query("UPDATE address SET address = :address, neighborhood = :neighborhood WHERE id = :id")
    suspend fun update(id: String, address: String, neighborhood: String)

    @Query("DELETE FROM address WHERE id = :id")
    suspend fun delete(id: String)

}