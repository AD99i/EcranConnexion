package com.example.ecranconnexion

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecranconnexion.ui.theme.CustomButton
import com.example.ecranconnexion.ui.theme.CustomTextField
import com.example.ecranconnexion.ui.theme.TemplatePage
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

    TemplatePage (backgroundId = R.drawable.mobile_bg){
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 50.dp)){
                    Text("Sign in", fontSize = 40.sp,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    WrapPadding { CustomTextField("Pseudo") }
                    WrapPadding { CustomTextField("Email") }
                    WrapPadding { CustomTextField("Password") }
                    WrapPadding { CustomTextField("Password Confirmation") }
                    WrapPadding { CustomTextField("City") }
                    WrapPadding { CustomTextField("City Code") }
                    WrapPadding { CustomTextField("Phone Number") }
                    WrapPadding { CustomButton(label = "Register in", onClick = {
                        //Le code pour changer de page
                        val intent = Intent(context, ArticleList::class.java)
                        context.startActivity(intent)
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