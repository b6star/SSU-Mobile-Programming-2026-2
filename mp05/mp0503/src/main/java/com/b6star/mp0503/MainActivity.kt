package com.b6star.mp0503

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showSum(view: View) {
        val num1 = findViewById<TextView>(R.id.num1).text.toString().toInt()
        val num2 = findViewById<TextView>(R.id.num2).text.toString().toInt()
        Toast.makeText(this, "합계: ${num1 + num2}", Toast.LENGTH_SHORT).show()
    }
}
