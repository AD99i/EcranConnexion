package com.example.ecranconnexion.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import kotlinx.coroutines.flow.MutableStateFlow

class AppProgressHelper {

    // Singleton du AppAlertDialogHelpers
    companion object {
        val instance : AppProgressHelper by lazy { AppProgressHelper() }

        fun get() : AppProgressHelper {
            return instance;
        }
    }

    // Sert à savoir en temps réel si il faut afficher ou pas la dialog
    var alertDialogModelData = MutableStateFlow(AlertDialogModelData());

    /**
     * Afficher la popup
     */
    fun show(message: String, onClose : () -> Unit = {}){
        // Forcer le rafraichissement de l'etat
        alertDialogModelData.value = alertDialogModelData.value.copy(
            isShow = true,
            message = message,
            );
    }

    /**
     * Fermer la popup
     */
    fun closeDialog() {
        // Forcer le rafraichissement de l'etat
        alertDialogModelData.value = alertDialogModelData.value.copy(isShow = false);
    }
}

@Composable
fun AlertDialog(){
    // Je vais ecouter quand la dialog est true ou false
    // Donc quand je dois afficher ou pas
    val alertDialogModelDataState by AppProgressHelper.get().alertDialogModelData.collectAsState();

    if (alertDialogModelDataState.isShow) {
        Dialog(onDismissRequest = {
            // Fermer la popup
            AppProgressHelper.get().closeDialog();

        }){
            Box(modifier = Modifier.background(
                color = Color(0xFFFFFFFF),
                shape = RoundedCornerShape(30.dp)
            )
                .padding(20.dp)) {
                Text(text = alertDialogModelDataState.message)
            }
        }
    }
}