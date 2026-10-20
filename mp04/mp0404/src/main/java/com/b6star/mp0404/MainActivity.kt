package com.b6star.mp0404

import android.app.Activity
import android.os.Bundle
import android.widget.*
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : Activity() {

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
        val turtleAnswer = findViewById<EditText>(R.id.turtleAnswer)
        val fishAnswer = findViewById<EditText>(R.id.fishAnswer)
        findViewById<Button>(R.id.check).setOnClickListener {
            val turtles = turtleAnswer.text.toString().toIntOrNull()
            val fish = fishAnswer.text.toString().toIntOrNull()
            if (turtles == null || fish == null) {
                if (turtles == null) turtleAnswer.error = "거북이 수를 입력하세요"
                if (fish == null) fishAnswer.error = "물고기 수를 입력하세요"
            } else {
                Toast.makeText(this, if (turtles == 2 && fish == 5) "맞았습니다" else "틀렸습니다", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
