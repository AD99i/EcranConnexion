package com.example.ecranconnexion.article

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ecranconnexion.common.AppProgressHelper
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class ArticleViewModel : ViewModel() {

    var articles = MutableStateFlow<List<Article>>(mutableListOf())
    var isLoading = MutableStateFlow<Boolean>(false)

    var articleDetail = MutableStateFlow<Article?>(null)

    //fonction pour ajouter un article
    fun addArticle(article: Article) {
        articles.value = articles.value + article
    }

    fun callArticlesApi(){

        //affiche un ecran de chargement avant un appel async
        AppProgressHelper.get().show("Loading articles...")

        //lancement de la tache asynchrone
        viewModelScope.launch {


            //fake wait 2 secondes
            delay(duration = 2.seconds)

            //appel API
            //on ecrase la liste des articles par celles recuperees via l'API
            val response = ArticleService.ArticleServiceApi.articleService.getArticles()
            articles.value = response.data!!


            //fermer un ecran de chargement apres un appel async
            AppProgressHelper.get().closeDialog()
        }
    }

    fun callArticleDetailApi(id: String){
        viewModelScope.launch {
            val response = ArticleService.ArticleServiceApi.articleService.getArticleDetail(id)
            articleDetail.value = response.data
        }
    }

}