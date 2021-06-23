package com.kenneth.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)

        usernameDisplay.text = "Welcome, ${intent.getStringExtra("username")}"

        usernameDisplay.text = intent.getStringExtra("username")
        profileButton = findViewById(R.id.button)

        profileButton.setOnClickListener {
            openProfilePage()
        }
    }

    private fun openProfilePage(){
        val myIntent = Intent(this, ProfileActivity::class.java)
        startActivity(myIntent)

    }

}