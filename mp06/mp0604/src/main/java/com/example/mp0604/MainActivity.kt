package com.example.mp0604

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.net.toUri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editText: EditText = findViewById(R.id.edit_text)
        val button: Button = findViewById(R.id.button);
        button.setOnClickListener {
            val url = editText.text.toString().trim() // EditText에 입력된 텍스트 가져오기
            // web browsing by implicit intent
            if (url.isEmpty()) {
                editText.error = "웹 주소를 입력하세요"
                return@setOnClickListener
            }
            val address = if (url.contains("://")) url else "https://$url"
            val uri = address.toUri().normalizeScheme()
            if (uri.scheme !in listOf("http", "https") || uri.host.isNullOrBlank() ||
                address.any { it.isWhitespace() }) {
                editText.error = "올바른 웹 주소를 입력하세요"
                return@setOnClickListener
            }
            val intent = Intent(Intent.ACTION_VIEW, uri)
            try {
                startActivity(intent) // 웹 브라우저를 열고 지정된 URL을 표시하도록 인텐트를 실행
            } catch (_: ActivityNotFoundException) {
                Toast.makeText(this, "웹 브라우저 앱을 찾을 수 없습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
}