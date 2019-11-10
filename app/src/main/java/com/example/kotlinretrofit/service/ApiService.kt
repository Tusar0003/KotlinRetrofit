package com.example.kotlinretrofit.service

import com.example.kotlinretrofit.model.AllSaloonResponse
import com.google.gson.JsonObject
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("Content-Type: application/json")
    @POST("get/all_salons")
    fun getAllSaloons(@Body jsonObject: JsonObject): Call<AllSaloonResponse>
}