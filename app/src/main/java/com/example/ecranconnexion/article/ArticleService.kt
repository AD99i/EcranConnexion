package com.example.ecranconnexion.article

import com.example.ecranconnexion.api.RetrofitTools.Companion.retrofit
import retrofit2.http.GET

interface ArticleService {

    @GET("articles")
    suspend fun getArticles() : List<Article>

    object ArticleServiceApi{
        //instancier une seul fois ArticleService a l'aide de l'utilitaire retrofit
        //il faut utiliser l'utilitaire RetrofitTools pour avoir le contexte de retrofit automatique
        val articleService : ArticleService by lazy {
            retrofit.create(ArticleService::class.java)
        }
    }
}