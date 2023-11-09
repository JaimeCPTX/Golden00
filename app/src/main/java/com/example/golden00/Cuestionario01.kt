package com.example.golden00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golden00.databinding.ActivityCuestionario01Binding
import com.example.golden00.databinding.ActivityCuestionario1Binding

class Cuestionario01 : AppCompatActivity() {
    private lateinit var binding: ActivityCuestionario01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuestionario01Binding.inflate(layoutInflater)
        val view = binding.root
    }
}