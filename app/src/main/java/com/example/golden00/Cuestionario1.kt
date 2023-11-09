package com.example.golden00

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import com.example.golden00.databinding.ActivityCuestionario1Binding

class Cuestionario1 : AppCompatActivity() {

    private lateinit var binding:ActivityCuestionario1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuestionario1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        }

    }

