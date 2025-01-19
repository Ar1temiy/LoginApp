package com.example.loginapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailField = findViewById<EditText>(R.id.emailField)
        val passwordField = findViewById<EditText>(R.id.passwordField)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val email = emailField.text.toString()
            val password = passwordField.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            if (email == "admin@admin.ru" && password == "123") {
                intent.putExtra("message", "Добро пожаловать, $email!")
            } else {
                intent.putExtra("message", "Ошибка авторизации!")
            }
            startActivity(intent)
        }
    }
}
