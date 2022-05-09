package com.mariano.practica2_diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn)
        val resultado: TextView = findViewById(R.id.resultado)
        rollButton.setOnClickListener{rollDice(resultado)}
    }

    private fun rollDice(resultado:TextView)
    {
        val numero = (1..6).random()

        resultado.text=numero.toString()
        //Toast.makeText(this, "Se presiono el boton", Toast.LENGTH_SHORT).show()
    }
}