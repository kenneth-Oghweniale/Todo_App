package com.kenneth.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {

    private lateinit var homePage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        homePage = findViewById(R.id.button2)

        homePage.setOnClickListener {
            openHomePage()
        }
    }

    private fun openHomePage() {
        val myIntent = Intent(this, HomeActivity::class.java)
        startActivity(myIntent)
    }
}