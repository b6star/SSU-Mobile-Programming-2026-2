package com.b6star.mp0502

import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText = findViewById<TextView>(R.id.hello_text)
        helloText.setText("Hello World!")
        helloText.setTextColor(Color.parseColor("#03A9F4"))
        helloText.setTypeface(Typeface.SERIF)
        helloText.setTextSize(50f)
    }
}
