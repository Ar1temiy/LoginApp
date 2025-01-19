package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        val messageLabel = findViewById<TextView>(R.id.messageLabel)
        val backButton = findViewById<Button>(R.id.backButton)

        // Получить сообщение из Intent
        val message = intent.getStringExtra("message")
        messageLabel.text = message

        // Возврат на первый экран
        backButton.setOnClickListener {
            finish()
        }
    }
}
