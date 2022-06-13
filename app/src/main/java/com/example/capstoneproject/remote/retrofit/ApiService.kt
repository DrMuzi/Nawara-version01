package com.example.capstoneproject.remote.retrofit

import com.example.capstoneproject.remote.response.CommentResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @POST("comment")
    suspend fun comment(
        @Field("comment") comment: String
    ): CommentResponse

    @GET("comment")
    suspend fun getString(): Call<String>
}