package net.mbonnin.jitpackandroidsample

import android.content.Context
import android.widget.Toast

fun hello() {
    println("Hello Jitpack!")
}
fun showToast(context:Context,message:String){
    Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
}