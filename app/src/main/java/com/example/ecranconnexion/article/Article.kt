package com.example.ecranconnexion.article

class Article {
   var title: String
   var description: String
   var author: String
   var imgPath: String

   constructor(title: String, description: String, author: String, imgPath: String) {
       this.title = title
       this.description = description
       this.author = author
       this.imgPath = imgPath
   }
}