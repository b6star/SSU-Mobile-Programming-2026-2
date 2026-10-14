package com.b6star.mp0601

import android.app.Activity
import android.os.Bundle
import android.widget.*
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : Activity() {
    private var leftDiceValue = 1
    private var rightDiceValue = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 시스템 바와 키보드가 실습 화면을 가리지 않도록 여백을 적용합니다.
        WindowCompat.setDecorFitsSystemWindows(window, false)
        val root = findViewById<View>(R.id.main)
        val padding = intArrayOf(root.paddingLeft, root.paddingTop, root.paddingRight, root.paddingBottom)
        ViewCompat.setOnApplyWindowInsetsListener(root) { view, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars() or WindowInsetsCompat.Type.ime())
            view.setPadding(padding[0] + bars.left, padding[1] + bars.top, padding[2] + bars.right, padding[3] + bars.bottom)
            insets
        }
        ViewCompat.requestApplyInsets(root)
        leftDiceValue = savedInstanceState?.getInt("left")?.takeIf { it in 1..6 } ?: (1..6).random()
        rightDiceValue = savedInstanceState?.getInt("right")?.takeIf { it in 1..6 } ?: (1..6).random()
        val images = intArrayOf(R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)
        findViewById<ImageView>(R.id.diceLeft).apply {
            setImageResource(images[leftDiceValue - 1])
            contentDescription = "왼쪽 주사위 $leftDiceValue"
        }
        findViewById<ImageView>(R.id.diceRight).apply {
            setImageResource(images[rightDiceValue - 1])
            contentDescription = "오른쪽 주사위 $rightDiceValue"
        }
        val answer = findViewById<EditText>(R.id.answer)
        findViewById<Button>(R.id.check).setOnClickListener {
            val value = answer.text.toString().toIntOrNull()
            if (value == null) {
                answer.error = "합계를 입력하세요"
            } else {
                Toast.makeText(this, if (value == leftDiceValue + rightDiceValue) "맞았습니다" else "틀렸습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("left", leftDiceValue)
        outState.putInt("right", rightDiceValue)
        super.onSaveInstanceState(outState)
    }
}
