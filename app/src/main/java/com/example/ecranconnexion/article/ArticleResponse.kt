package com.example.ecranconnexion.article

data class ArticleResponse<T> (var code:String, var message: String, var data: T?) {
}