package com.ar.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    lateinit var goCoinActivityButton: Button
    lateinit var goDadeActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goCoinActivityButton = findViewById(R.id.btnCoin)
        goCoinActivityButton.setOnClickListener {
            val showC = Intent(Intent(this, CoinActivity::class.java))
            startActivity(showC)
        }

        goDadeActivityButton = findViewById(R.id.btnDade)
        goDadeActivityButton.setOnClickListener {
            val showD = Intent(Intent(this, DadeActivity::class.java))
            startActivity(showD)
        }
    }
}