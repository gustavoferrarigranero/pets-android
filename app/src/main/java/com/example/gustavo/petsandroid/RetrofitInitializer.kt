package com.example.gustavo.petsandroid

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    private val retrofit = Retrofit.Builder()
            .baseUrl("http://gustavoferrari.tech:9731/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    fun userService () = retrofit.create(UserService::class.java)
}