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
import com.example.ecranconnexion.ui.theme.EcranConnexionTheme
import com.example.ecranconnexion.ui.theme.CustomButton
import com.example.ecranconnexion.ui.theme.CustomTextField
import com.example.ecranconnexion.ui.theme.TemplatePage
import com.example.ecranconnexion.ui.theme.WrapPadding

class ForgotPassword : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PasswordPage()
        }
    }
}

@Composable
fun PasswordPage() {

    //recuperer le contexte actuel de l'appli (important pour changer de page)
    val context = LocalContext.current

    TemplatePage(backgroundId = R.drawable.mobile_bg) {
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 150.dp)){
                    Text("Reset Password", fontSize = 30.sp,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    WrapPadding { CustomTextField("Email") }
                    WrapPadding { CustomButton (label = "Send Reset Link", onClick = {
                        //Le code pour changer de page
                        val intent = Intent(context, Connexion::class.java)
                        context.startActivity(intent)
                    })
                    }
                    Text("Next time, please don't forget your password dude !", modifier = Modifier.padding(top = 100.dp), color = Color.White)
                }
            }

        }


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
        PasswordPage()
}