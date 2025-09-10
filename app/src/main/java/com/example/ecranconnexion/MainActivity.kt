package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ecranconnexion.article.ArticlesPage
import com.example.ecranconnexion.ui.theme.EcranConnexionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcranConnexionTheme {

                }
            }
        }
    }

