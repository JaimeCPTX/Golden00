package com.example.golden00

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val boton011 = findViewById<Button>(R.id.button011)
        boton011.setOnClickListener(
            {startActivity(Intent(this, Cuestionario01::class.java))
            })

    }
}