package com.example.apiexample.ui.data

import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface PostApiService {
    @GET(value = "/posts")
    suspend fun getPosts(): List<Post>

    @GET(value = "/posts/{id}")
    suspend fun getPostById(@Path(value = "id") id: Int): Post

    @POST(value = "/posts")
    suspend fun createPost(post: Post): PostApiService

    @PUT(value = "/posts/{id}")

    @PATCH(value = "/posts/{id}")
    suspend fun patchPost(@Path(value="id")id: Int, post: Post): Post

    @DELETE(value = "/posts/{id}")
    suspend fun deletePost(@Path(value="id") id: Int)
}