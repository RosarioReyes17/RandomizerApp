package com.ar.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*


class CoinActivity : AppCompatActivity() {

    lateinit var imageFlip: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        val coinButton:Button =findViewById(R.id.btnFlip)
        coinButton.text = getString(R.string.btnFlip)

        coinButton.setOnClickListener {

            flipCoin()
        }

        imageFlip = findViewById(R.id.imageFace)
    }

    private fun flipCoin() {
        val randomInt = Random().nextInt(2) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.face
            else -> R.drawable.cross
        }
        imageFlip.setImageResource(drawableResource)

    }
}