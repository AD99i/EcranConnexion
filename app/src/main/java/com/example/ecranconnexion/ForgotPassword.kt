package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.example.ecranconnexion.ui.theme.EcranConnexionTheme

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
    EcranConnexionTheme {
        Scaffold (modifier = Modifier.fillMaxSize()){innerPadding ->
            Box(modifier = Modifier.padding(innerPadding)){
                BackgroundImage()
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 150.dp)){
                    Text("Reset Password", fontSize = 30.sp,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    TextField(onValueChange = {}, value = "", label = { Text("Email") }, modifier = Modifier.padding(top = 20.dp),
                        colors = TextFieldDefaults.colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            cursorColor = Color.White,
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            focusedLabelColor = Color.White,
                            unfocusedLabelColor = Color.White
                        ))

                    ElevatedButton(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 20.dp)) {
                        Text("Reset Password", modifier = Modifier.padding(5.dp))
                    }

                    Text("Next time, please don't forget your password dude !", modifier = Modifier.padding(top = 100.dp), color = Color.White)
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    EcranConnexionTheme {
        PasswordPage()
    }
}