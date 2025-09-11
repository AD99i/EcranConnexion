package com.example.ecranconnexion.article

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class ArticleViewModel : ViewModel() {

    var articles = MutableStateFlow<List<Article>>(mutableListOf())

    var articleDetail = MutableStateFlow<Article?>(null)

    //fonction pour ajouter un article
    fun addArticle(article: Article) {
        articles.value = articles.value + article
    }

    fun callArticlesApi(){

        //lancement de la tache asynchrone
        viewModelScope.launch {
            //appel API
            //on ecrase la liste des articles par celles recuperees via l'API
            val response = ArticleService.ArticleServiceApi.articleService.getArticles()
            articles.value = response.data!!

        }
    }

    fun callArticleDetailApi(id: String){
        viewModelScope.launch {
            val response = ArticleService.ArticleServiceApi.articleService.getArticleDetail(id)
            articleDetail.value = response.data
        }
    }

}