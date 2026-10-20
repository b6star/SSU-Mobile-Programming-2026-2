package com.b6star.mp0402

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
        // 원본 bg.png는 왼쪽보다 오른쪽의 고양이 수가 많습니다.
        findViewById<ImageButton>(R.id.greater).setOnClickListener { check(false) }
        findViewById<ImageButton>(R.id.less).setOnClickListener { check(true) }
        findViewById<ImageButton>(R.id.equal).setOnClickListener { check(false) }
    }

    private fun check(correct: Boolean) {
        Toast.makeText(this, if (correct) "맞았습니다" else "틀렸습니다", Toast.LENGTH_SHORT).show()
    }
}
