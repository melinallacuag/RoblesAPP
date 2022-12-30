package com.example.roblesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        val mobilesven = AnimationUtils.loadAnimation(this,R.anim.mobilsven)
        val logomobilsven  = findViewById(R.id.logomobilesven) as ImageView
        logomobilsven .startAnimation(mobilesven)
        carga()
    }

    fun carga(){
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }, 10000
        )
    }
}