package com.andre.takepicture

import android.content.Context
import android.content.SharedPreferences

class SharedRepo(context: Context) {

    private val security: SharedPreferences = context.getSharedPreferences("TakePicture", Context.MODE_PRIVATE)


//    fun storeImage(){
//        security.edit().put
//    }
}