package com.example.golden00

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.golden00.databinding.ActivityCuestionario01Binding
import com.example.golden00.databinding.ActivityCuestionario1Binding
import com.example.golden00.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button011.setOnClickListener(
            {startActivity(Intent(this, Cuestionario01::class.java))
            })

    /*    val boton011 = findViewById<Button>(R.id.button011)
        boton011.setOnClickListener(
            {startActivity(Intent(this, Cuestionario01::class.java))
            })*/

    }
}