package com.example.kotlinretrofit.activity

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.kotlinretrofit.R
import com.example.kotlinretrofit.model.AllSaloonResponse
import com.example.kotlinretrofit.service.ApiClient
import com.example.kotlinretrofit.service.ApiService
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    lateinit var progressBar: ConstraintLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progress_bar)

        findViewById<Button>(R.id.button_get_saloons).setOnClickListener {
            getSaloons()
        }
    }

    private fun getSaloons() {
        progressBar.visibility = View.VISIBLE

        val jsonObject = JsonObject()
        try {
            jsonObject.addProperty("token", "SHTUARSVEUNAHLIAOLYAJOL")
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e(TAG, e.message)
        }

        Log.e(TAG, jsonObject.toString())

        val apiService: ApiService = ApiClient.getApiClient().create(ApiService::class.java)

        val call: Call<AllSaloonResponse> = apiService.getAllSaloons(jsonObject)
        call.enqueue(object : Callback<AllSaloonResponse> {
            override fun onFailure(call: Call<AllSaloonResponse>, t: Throwable) {
                progressBar.visibility = View.GONE
                Log.e(TAG, t.message)
            }

            override fun onResponse(call: Call<AllSaloonResponse>, response: Response<AllSaloonResponse>) {
                try {
                    Log.e(TAG, response.toString())

                    if (response.isSuccessful &&
                            response.body()!!.getStatus().equals("success", true)) {
                        Toast.makeText(this@MainActivity,
                                response.body()!!.getData()!!.size.toString(),
                                Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@MainActivity,
                                "Could not get any response!",
                                Toast.LENGTH_LONG)
                                .show()
                    }

                    progressBar.visibility = View.GONE
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.e(TAG, e.message)
                    progressBar.visibility = View.GONE
                }
            }
        })
    }
}
