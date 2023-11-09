package com.example.golden00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.golden00.databinding.ActivityCuestionario1Binding

class Cuestionario1 : AppCompatActivity() {

    private lateinit var binding:ActivityCuestionario1Binding
    private var questions = listOf(
        Question("Pregunta 1", listOf("Opción 1", "Opción 2", "Opción 3"), mutableListOf()),
        Question("Pregunta 2", listOf("Opción 1", "Opción 2", "Opción 3"), mutableListOf()),
        Question("Pregunta 3", listOf("Opción 1", "Opción 2", "Opción 3"), mutableListOf()),
        Question("Pregunta 4", listOf("Opción 1", "Opción 2", "Opción 3"), mutableListOf()),
        Question("Pregunta 5", listOf("Opción 1", "Opción 2", "Opción 3"), mutableListOf()),
        Question("Pregunta 6", listOf("Opción 1", "Opción 2", "Opción 3"), mutableListOf())
    )

    private var currentQuestionIndex = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuestionario1)
    }
}
data class Question(val question: String, val options: List<String>, var selectedOptions: MutableList<String>)
