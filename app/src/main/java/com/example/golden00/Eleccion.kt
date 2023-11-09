package com.example.golden00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golden00.databinding.ActivityCuestionario1Binding
import com.example.golden00.databinding.ActivityEleccionBinding
import com.example.golden00.databinding.ActivityMainBinding

class Eleccion : AppCompatActivity() {
    private lateinit var binding: ActivityEleccionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEleccionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}