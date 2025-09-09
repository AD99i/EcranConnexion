package com.example.ecranconnexion

 class Article {
    var title: String? = null
    var description: String? = null
    var author: String? = null
    var imgPath: String? = null

    constructor(title: String?, description: String?, author: String?, imgPath: String?) {
        this.title = title
        this.description = description
        this.author = author
        this.imgPath = imgPath
    }
}