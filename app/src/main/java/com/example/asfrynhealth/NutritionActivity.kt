package com.example.asfrynhealth

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NutritionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nutrion)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageStart7 = findViewById<ImageView>(R.id.imageView58)
        imageStart7.setOnClickListener {
            val intent = Intent(this@NutritionActivity, menu::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart9 = findViewById<ImageView>(R.id.imageView60)
        imageStart9.setOnClickListener {
            val intent = Intent(this@NutritionActivity, profile::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart = findViewById<ImageView>(R.id.imageView59)
        imageStart.setOnClickListener {
            val intent = Intent(this@NutritionActivity, support::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart10 = findViewById<ImageView>(R.id.imageView51)
        imageStart10.setOnClickListener {
            val intent = Intent(this@NutritionActivity, menu::class.java)
            startActivity(intent)
            finish()
        }
    }
}