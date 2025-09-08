package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.ui.theme.EcranConnexionTheme

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
fun BackgroundImage() {
    Image(
        painter = painterResource(id = R.drawable.mobile_bg),
        contentDescription = "Background",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun MainPage() {
    EcranConnexionTheme {
        Scaffold (modifier = Modifier.fillMaxSize()){innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)){
                BackgroundImage()
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 100.dp)){
                    Text("Bienvenue sur l'application")
                    Text("Veuillez vous connecter pour continuer")
                    TextField(onValueChange = {}, value = "", label = { Text("Email") }, modifier = Modifier.padding(top = 20.dp))
                    TextField(onValueChange = {},value ="", label = { Text("Mot de passe") }, modifier = Modifier.padding(top = 20.dp))
                    ElevatedButton(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                        Text("Se connecter", modifier = Modifier.padding(5.dp))
                    }
                    Text("Mot de passe oublié ?", modifier = Modifier.padding(top = 20.dp))
                    Text("Pas de compte ? Inscrivez-vous ici !", modifier = Modifier.padding(top = 100.dp))
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MainPage()
}