package com.example.asfrynhealth

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageStart = findViewById<ImageView>(R.id.imageView15)
        imageStart.setOnClickListener {
            val intent = Intent(this@menu, support::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart2 = findViewById<ImageView>(R.id.imageView13)
        imageStart2.setOnClickListener {
            val intent = Intent(this@menu, menu::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart3 = findViewById<ImageView>(R.id.imageView14)
        imageStart3.setOnClickListener {
            val intent = Intent(this@menu, profile::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart4 = findViewById<ImageView>(R.id.imageView11)
        imageStart4.setOnClickListener {
            val intent = Intent(this@menu, drug::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart5 = findViewById<ImageView>(R.id.imageView9)
        imageStart5.setOnClickListener {
            val intent = Intent(this@menu, coretraining::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart6 = findViewById<ImageView>(R.id.imageView8)
        imageStart6.setOnClickListener {
            val intent = Intent(this@menu, NutritionActivity::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart7 = findViewById<ImageView>(R.id.imageView10)
        imageStart7.setOnClickListener {
            val intent = Intent(this@menu, NutritionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}