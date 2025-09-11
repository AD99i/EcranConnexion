package com.example.ecranconnexion.article

import android.annotation.SuppressLint
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
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.R
import com.example.ecranconnexion.ui.theme.ArticleCard
import com.example.ecranconnexion.ui.theme.CustomButton
import com.example.ecranconnexion.ui.theme.TemplatePage
import com.example.ecranconnexion.ui.theme.TitlePage
import com.example.ecranconnexion.ui.theme.WrapPadding

class ListArticleActivity : ComponentActivity() {

    lateinit var viewModel: ArticleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewModel = ArticleViewModel()
        setContent {
            ListArticlePage(viewModel)
        }
    }
}

@Composable
fun ListArticlePage(viewModel: ArticleViewModel) {

    // ecouter les changments de la liste des articles


    TemplatePage(backgroundId = R.drawable.mobile_bg_02) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp)
                .padding(top = 50.dp)
        ) {
            Spacer(modifier = Modifier.height(90.dp))
            TitlePage("Articles")
            Spacer(modifier = Modifier.height(30.dp))
            CustomButton(label = "Load Articles", onClick = {
                viewModel.callArticlesApi()
            })
            Spacer(modifier = Modifier.height(30.dp))
            ArticleListView(viewModel)
        }
    }
}

@Composable
fun ArticleListView(viewModel: ArticleViewModel) {

    val articleState by viewModel.articles.collectAsState()
    LazyColumn {
        items(articleState) { article ->
            WrapPadding { ArticleCard(article) }
        }
    }
}

@SuppressLint("ViewModelConstructorInComposable")
@Preview(showBackground = true)
@Composable
fun ListArticlePreview() {
    ListArticlePage(ArticleViewModel())
}