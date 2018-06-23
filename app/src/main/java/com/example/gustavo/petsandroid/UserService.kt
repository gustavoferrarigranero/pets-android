package com.example.gustavo.petsandroid

import retrofit2.Call
import retrofit2.http.*

interface UserService {

    @GET("user")
    fun list () : Call<List<User>>

    @POST("user")
    fun alter(@Body user: User): Call<User>

    @PUT("user/{id}")
    fun alter(@Body user: User, @Path("id") id: Int): Call<User>
}