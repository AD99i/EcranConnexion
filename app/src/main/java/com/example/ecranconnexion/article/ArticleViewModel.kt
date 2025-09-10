package com.example.ecranconnexion.article

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ArticleViewModel : ViewModel() {

    var articles = MutableStateFlow<List<Article>>(
        listOf(
            Article("Article 1", "Description 1", "Auteur 1", "image1.jpg"),
            Article("Article 2", "Description 2", "Auteur 2", "image2.jpg"),
            Article("Article 3", "Description 3", "Auteur 3", "image3.jpg")
        )
    )

    //fonction pour ajouter un article
    fun addArticle(article: Article) {
        articles.value = articles.value + article
    }

}