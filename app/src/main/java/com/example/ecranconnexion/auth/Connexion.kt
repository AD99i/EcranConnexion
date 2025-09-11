package com.example.ecranconnexion.auth

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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.R
import com.example.ecranconnexion.article.ListArticleActivity
import com.example.ecranconnexion.common.AppContextHelper
import com.example.ecranconnexion.ui.theme.CustomButton
import com.example.ecranconnexion.ui.theme.CustomTextField
import com.example.ecranconnexion.ui.theme.EniLogo
import com.example.ecranconnexion.ui.theme.TemplatePage
import com.example.ecranconnexion.ui.theme.TitlePage
import com.example.ecranconnexion.ui.theme.WrapPadding

class Connexion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainPage()

        }
    }
}



@Composable
fun MainPage() {

    //recuperer le contexte actuel de l'appli (important pour changer de page)
    val context = LocalContext.current

    TemplatePage(backgroundId = R.drawable.mobile_bg_01) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                    .fillMaxSize()
                    .padding(50.dp)
                    .padding(top = 50.dp)){
                    EniLogo()
                    Spacer(modifier = Modifier.height(50.dp))
                    TitlePage("Login")
                    Spacer(modifier = Modifier.height(50.dp))
                    WrapPadding { CustomTextField("Email") }
                    WrapPadding { CustomTextField("Password") }
                    WrapPadding { CustomButton(label = "Log In", onClick = {
                        //Le code pour changer de page
                        AppContextHelper.openActivity(context, ListArticleActivity::class)
                    }) }
                    Spacer(modifier = Modifier.weight(1f))
                    WrapPadding { CustomButton(label = "Forgot Password ?", onClick = {
                        //Le code pour changer de page
                        AppContextHelper.openActivity(context, ForgotPassword::class)
                    }) }
                    WrapPadding { CustomButton(label = "Sign in", onClick = {
                        //Le code pour changer de page
                        AppContextHelper.openActivity(context, Inscription::class)
                    }) }
                }
            }

        }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainPage()
}