package com.example.asfrynhealth

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val imageStart = findViewById<ImageView>(R.id.imageView25)
        imageStart.setOnClickListener {
            val intent = Intent(this@profile, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart2 = findViewById<ImageView>(R.id.imageView27)
        imageStart2.setOnClickListener {
            val intent = Intent(this@profile, menu::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart3 = findViewById<ImageView>(R.id.imageView29)
        imageStart3.setOnClickListener {
            val intent = Intent(this@profile, profile::class.java)
            startActivity(intent)
            finish()
        }
        val imageStart4 = findViewById<ImageView>(R.id.imageView28)
        imageStart4.setOnClickListener {
            val intent = Intent(this@profile, support::class.java)
            startActivity(intent)
            finish()
        }
    }
}