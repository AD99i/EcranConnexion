package com.example.ecranconnexion.article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.ui.theme.TemplatePage
import com.example.ecranconnexion.ui.theme.TitlePage

class ArticleDetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticleDetailPage()
        }
    }
}

@Composable
fun ArticleDetailPage() {
    TemplatePage {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp)
                .padding(top = 50.dp)
        ){
            Spacer(modifier = Modifier.height(90.dp))
            TitlePage("Article Detail")
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ArticleDetailPreview() {

}