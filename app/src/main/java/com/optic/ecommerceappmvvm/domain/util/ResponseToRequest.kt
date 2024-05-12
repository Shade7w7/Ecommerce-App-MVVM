package com.optic.ecommerceappmvvm.domain.util

import android.util.Log
import com.optic.ecommerceappmvvm.domain.model.ErrorResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

object ResponseToRequest {

    fun <T> send(result: Response<T>): Resource<T> {
        return try {
            if (result.isSuccessful) { // 201
                Resource.Success(result.body()!!)
            }
            else {
                val errorResponse: ErrorResponse? = ConvertErrorBody.convert(result.errorBody())
                Resource.Failure(errorResponse?.message ?: "Error desconido")
            }
        }
        catch (e: HttpException) {
            Log.d("ResponseToRequest", "Message: ${e.message()}")
            Log.d("ResponseToRequest", "Message: ${e.cause}")
            e.printStackTrace()
            Resource.Failure(e.message ?: "Error desconido en la peticion Http")
        }
        catch (e: IOException) {
            Log.d("ResponseToRequest", "Message: ${e}")
            Log.d("ResponseToRequest", "Message: ${e.cause}")
            e.printStackTrace()
            Resource.Failure("Verifica tu conexion a internet")
        }
        catch (e: Exception) {
            Log.d("ResponseToRequest", "Message: ${e}")
            Log.d("ResponseToRequest", "Message: ${e.cause}")
            e.printStackTrace()
            Resource.Failure(e.message ?: "Error desconido")
        }
    }

}