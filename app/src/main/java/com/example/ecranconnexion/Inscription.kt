package com.example.ecranconnexion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
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
import com.example.ecranconnexion.ui.theme.TemplatePage

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
    TemplatePage (backgroundId = R.drawable.mobile_bg){
                Column (modifier = Modifier.fillMaxSize().padding(60.dp).padding(top = 50.dp)){
                    Text("Sign in", fontSize = 40.sp,color = Color.White, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                    TextField(
                        value = "",
                        onValueChange = {},
                        label = { Text("Pseudo") },
                        modifier = Modifier.padding(top = 20.dp),
                        colors = TextFieldDefaults.colors(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            cursorColor = Color.White,
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                            focusedLabelColor = Color.White,
                            unfocusedLabelColor = Color.White
                        )
                    )

                    TextField(onValueChange = {},value ="", label = { Text("Email") }, modifier = Modifier.padding(top = 20.dp),
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
                    TextField(onValueChange = {},value ="", label = { Text("Password") }, modifier = Modifier.padding(top = 20.dp),
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
                    TextField(onValueChange = {},value ="", label = { Text("Password Confirmation") }, modifier = Modifier.padding(top = 20.dp),
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
                    TextField(onValueChange = {},value ="", label = { Text("City") }, modifier = Modifier.padding(top = 20.dp),
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
                    TextField(onValueChange = {},value ="", label = { Text("City Code") }, modifier = Modifier.padding(top = 20.dp),
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
                    TextField(onValueChange = {},value ="", label = { Text("Phone Number") }, modifier = Modifier.padding(top = 20.dp),
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
                    ElevatedButton(onClick = {}, modifier = Modifier.fillMaxWidth().padding(top = 20.dp), ) {
                        Text("Sign in", modifier = Modifier.padding(5.dp))
                    }

                    Text("By registering, I accept the Terms of Service and Privacy Policy", modifier = Modifier.padding(top = 100.dp), color = Color.White)
                }
            }

        }



@Preview(showBackground = true)
@Composable
fun RegistrationPreview() {
    RegistrationPage()
}