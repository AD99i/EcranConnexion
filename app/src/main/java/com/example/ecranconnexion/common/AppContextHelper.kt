package com.example.ecranconnexion.common

import android.content.Context
import android.content.Intent
import kotlin.reflect.KClass

class AppContextHelper {

    //tout ce qui est à l'interieur est statique
    companion object{
        fun openActivity(context: Context, activityClass: KClass<*>) {
            val intent = Intent(context,activityClass.java)
            context.startActivity(intent)
        }
    }
}