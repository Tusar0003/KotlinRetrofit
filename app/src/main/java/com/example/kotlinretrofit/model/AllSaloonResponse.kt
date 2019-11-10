package com.example.kotlinretrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class AllSaloonResponse {

    @SerializedName("status")
    @Expose
    private var status: String? = null
    @SerializedName("status_code")
    @Expose
    private var statusCode: Int? = null
    @SerializedName("message")
    @Expose
    private var message: String? = null
    @SerializedName("data")
    @Expose
    private var data: List<AllSaloonData>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getStatusCode(): Int? {
        return statusCode
    }

    fun setStatusCode(statusCode: Int?) {
        this.statusCode = statusCode
    }

    fun getMessage(): String? {
        return message
    }

    fun setMessage(message: String) {
        this.message = message
    }

    fun getData(): List<AllSaloonData>? {
        return data
    }

    fun setData(data: List<AllSaloonData>) {
        this.data = data
    }
}