package com.example.apiexample.ui.viewmodel

import com.example.apiexample.ui.data.Post
import com.example.apiexample.ui.data.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PostViewModel {
    private val repository: PostRepository
    ): viewmodel(){
        private val _postslist = MutableStateFlow<List<Post>>(value = emptyList())

        val postsList = _postslist.asStateFlow()
    }
}