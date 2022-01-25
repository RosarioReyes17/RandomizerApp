package com.ar.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*


class DadeActivity : AppCompatActivity() {

    lateinit var imageDade: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dade)

        val rollButton:Button = findViewById(R.id.btnRoll)
        rollButton.text = getString(R.string.btnRoll)

        rollButton.setOnClickListener {

            rollDice()

        }

        imageDade = findViewById(R.id.imageDade)
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.alea_1
            2 -> R.drawable.alea_2
            3 -> R.drawable.alea_3
            4 -> R.drawable.alea_4
            5 -> R.drawable.alea_5
            else -> R.drawable.alea_6
        }

        imageDade.setImageResource(drawableResource)
    }
}