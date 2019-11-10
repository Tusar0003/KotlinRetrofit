package com.example.kotlinretrofit.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        const val BASE_URL = "https://api.salonregister.com/api/"
        lateinit var retrofit : Retrofit

        fun getApiClient() : Retrofit {
            retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit
        }
    }
}