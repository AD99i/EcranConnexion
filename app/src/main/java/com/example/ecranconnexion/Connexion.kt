package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.ui.theme.EniButton
import com.example.ecranconnexion.ui.theme.EniTextField
import com.example.ecranconnexion.ui.theme.TemplatePage
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
    TemplatePage(backgroundId = R.drawable.mobile_bg) {
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 150.dp)){
                    Image(
                        painter = painterResource(id = R.drawable.logo_eni_round),
                        contentDescription = "Logo Eni",
                    )
                    Spacer(modifier = Modifier.height(140.dp))
                    Text("Welcome on this application", color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    Text("Log in to continue", color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    WrapPadding { EniTextField("Email") }
                    WrapPadding { EniTextField("Password") }
                    WrapPadding { EniButton(label = "Log In") }
                    Text("Forgot Password ?", modifier = Modifier.padding(top = 20.dp).fillMaxWidth(), color = Color.White, textAlign = TextAlign.Center)
                    Text("No acount ? Register here !", modifier = Modifier.padding(top = 20.dp).fillMaxWidth(), color = Color.White, textAlign = TextAlign.Center)
                }
            }

        }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainPage()
}