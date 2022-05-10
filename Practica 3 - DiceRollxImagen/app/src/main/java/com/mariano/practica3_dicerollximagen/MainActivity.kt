package com.mariano.practica3_dicerollximagen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var dado : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn)
        dado = findViewById(R.id.dice_image)
        rollButton.setOnClickListener{rollDice(dado)}
    }

    private fun rollDice(dado:ImageView)
    {
        val numero = (1..6).random()

        val Recurso = when (numero)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        dado.setImageResource(Recurso)
        //resultado.text=numero.toString()
        //Toast.makeText(this, "Se presiono el boton", Toast.LENGTH_SHORT).show()
    }
}