package com.example.ecranconnexion.article

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class ArticleViewModel : ViewModel() {

    var articles = MutableStateFlow<List<Article>>(mutableListOf())

    //fonction pour ajouter un article
    fun addArticle(article: Article) {
        articles.value = articles.value + article
    }

    fun callArticleApi(){

        //lancement de la tache asynchrone
        viewModelScope.launch {
            //appel API
            //on ecrase la liste des articles par celles recuperees via l'API
            articles.value = ArticleService.ArticleServiceApi.articleService.getArticles()
        }
    }

}