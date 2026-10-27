package com.example.mp0601

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val idInput = findViewById<EditText>(R.id.edit_text_01)
        val pwInput = findViewById<EditText>(R.id.edit_text_02)
        val loginButton = findViewById<Button>(R.id.button)

        loginButton.setOnClickListener {
            Toast.makeText(this,
                "아이디 : ${idInput.text}\n비밀번호 : ${pwInput.text}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
