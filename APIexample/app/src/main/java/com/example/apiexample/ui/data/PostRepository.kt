package com.example.apiexample.ui.data

class PostRepository {
    private val remoteDataSource:PostRemoteDataSource,
    private val localDataSource: PostLocalDataSource
    ){
        val allPosts:List<Post> = localDataSource.getPosts()

        suspend fun getPosts(): List<Posts> {
        return allPosts
    }

        suspend fun refreshPost() {
        try{
            val posts = remoteDataSource.getPosts()
            localDataSource.insertAllPosts(posts)
        } catch (e: Exception){
            throw Exception("error al obtener los posts del usuario")
        }
    }
    }
