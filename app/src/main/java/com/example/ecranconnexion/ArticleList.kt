package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.ui.theme.ArticleCard
import com.example.ecranconnexion.ui.theme.EcranConnexionTheme
import com.example.ecranconnexion.ui.theme.TemplatePage
import com.example.ecranconnexion.ui.theme.TitlePage
import com.example.ecranconnexion.ui.theme.WrapPadding

class ArticleList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticlesPage()
        }
    }
}

@Composable
fun ArticlesPage() {
    var articles = mutableListOf(
        Article("Article 1", "Description 1", "Auteur 1", "image1.jpg"),
        Article("Article 2", "Description 2", "Auteur 2", "image2.jpg"),
        Article("Article 3", "Description 3", "Auteur 3", "image3.jpg"),

    )

    TemplatePage(backgroundId = R.drawable.mobile_bg_01) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(50.dp)
                        .padding(top = 50.dp)
                ){
                    Spacer(modifier = Modifier.height(140.dp))
                    TitlePage("Articles")
                    Spacer(modifier = Modifier.height(40.dp))
                    LazyColumn {
                        items(articles) { article ->
                            WrapPadding {  ArticleCard(article)  }
                        }
                    }
                }
            }
        }


@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    EcranConnexionTheme {
        ArticlesPage()
    }
}