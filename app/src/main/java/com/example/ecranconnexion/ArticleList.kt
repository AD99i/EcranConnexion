package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.compose.AsyncImage
import com.example.ecranconnexion.ui.theme.EcranConnexionTheme

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
    val articles = mutableListOf(
        Article("Article 1", "Description 1", "Auteur 1", "image1.jpg"),
        Article("Article 2", "Description 2", "Auteur 2", "image2.jpg"),
        Article("Article 3", "Description 3", "Auteur 3", "image3.jpg"),

    )

    EcranConnexionTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)){
                BackgroundImage()
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 100.dp)){
                    Text("List of Articles", fontSize = 30.sp,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    LazyColumn(modifier = Modifier.padding(top = 20.dp)) {
                        items(articles) { article ->
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp)
                            ) {
                                Text(
                                    text = article.title ?: "Sans titre",
                                    color = Color.White,
                                    fontSize = 20.sp,
                                    modifier = Modifier.fillMaxWidth()
                                )
                                AsyncImage(
                                    model = article.imgPath,
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(50.dp)
                                )


                                Text(
                                    text = article.description ?: "Pas de description",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    modifier = Modifier.fillMaxWidth()
                                )
                                Text(
                                    text = "Par ${article.author ?: "Inconnu"}",
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    modifier = Modifier.fillMaxWidth()
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                            }
                        }
                    }

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