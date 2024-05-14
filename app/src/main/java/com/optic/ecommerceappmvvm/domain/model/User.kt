package com.optic.ecommerceappmvvm.domain.model

import androidx.annotation.Nullable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

data class User(
    @SerializedName("id_user") val id: String? = null,
    @SerializedName("firstname_user") var name: String,
    @SerializedName("lastname_user") var lastname: String,
    @SerializedName("email_user") val email: String? = null,
    @SerializedName("phone_user") var phone: String,
    @SerializedName("password_user") val password: String? = null,
    @SerializedName("image_user") var image: String? = null,
    @SerializedName("token") val notificationToken: String? = null,
    @SerializedName("roles") val roles: List<Rol>? = null,
    @SerializedName("address") var address: Address? = null

): Serializable {

    fun toJson(): String = Gson().toJson(User(
        id,
        name,
        lastname,
        email,
        phone,
        password,
        if (!image.isNullOrBlank()) URLEncoder.encode(image, StandardCharsets.UTF_8.toString()) else "",
        notificationToken,
        roles?.map { rol -> Rol.fromJson(rol.toJson())},
        address
    ))

    companion object {
        fun fromJson(data: String): User = Gson().fromJson(data, User::class.java)
    }

}
