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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ecranconnexion.R
import com.example.ecranconnexion.common.AppContextHelper
import com.example.ecranconnexion.ui.theme.CustomButton
import com.example.ecranconnexion.ui.theme.CustomTextField
import com.example.ecranconnexion.ui.theme.TemplatePage
import com.example.ecranconnexion.ui.theme.TitlePage
import com.example.ecranconnexion.ui.theme.WrapPadding

class Inscription : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           RegistrationPage()
        }
    }
}

@Composable
fun RegistrationPage() {

    //recuperer le contexte actuel de l'appli (important pour changer de page)
    val context = LocalContext.current

    TemplatePage (backgroundId = R.drawable.mobile_bg_02){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(40.dp)
                        .padding(top = 10.dp)
                ){
                    Spacer(modifier = Modifier.height(100.dp))
                    TitlePage("Sign Up")
                    Spacer(modifier = Modifier.height(40.dp))
                    WrapPadding { CustomTextField("Pseudo") }
                    WrapPadding { CustomTextField("Email") }
                    WrapPadding { CustomTextField("Password") }
                    WrapPadding { CustomTextField("Password Confirmation") }
                    WrapPadding { CustomTextField("City") }
                    WrapPadding { CustomTextField("City Code") }
                    WrapPadding { CustomTextField("Phone Number") }
                    WrapPadding { CustomButton(label = "Register in", onClick = {
                        //Le code pour changer de page
                        AppContextHelper.openActivity(context, Connexion::class)
                    }) }

                    Text("By registering, I accept the Terms of Service and Privacy Policy", modifier = Modifier.padding(top = 100.dp), color = Color.White)
                }
            }

        }



@Preview(showBackground = true)
@Composable
fun RegistrationPreview() {
    RegistrationPage()
}