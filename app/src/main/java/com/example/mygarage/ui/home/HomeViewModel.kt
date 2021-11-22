package com.example.mygarage.ui.home

import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mygarage.network.articles.ArticlesData
import com.example.mygarage.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(val repository: Repository) : ViewModel() {
    init {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getArticles()
        }
    }
    val articleList: LiveData<ArticlesData>
    get() = repository.articles
}