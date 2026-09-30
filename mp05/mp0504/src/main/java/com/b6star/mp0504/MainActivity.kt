package com.b6star.mp0504

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.name_input)
        val passwordInput = findViewById<EditText>(R.id.password_input)
        val emailInput = findViewById<EditText>(R.id.email_input)
        val birthdayInput = findViewById<EditText>(R.id.birthday_input)
        val phoneInput = findViewById<EditText>(R.id.phone_input)
        val resultText = findViewById<TextView>(R.id.result_text)

        findViewById<Button>(R.id.show_result_button).setOnClickListener {
            resultText.text = """
                성명 - ${nameInput.text}
                비밀번호 - ${passwordInput.text}
                이메일 - ${emailInput.text}
                생년월일 - ${birthdayInput.text}
                연락처 - ${phoneInput.text}
            """.trimIndent()
        }
    }
}
