package com.b6star.mp0403

import android.app.Activity
import android.os.Bundle
import android.widget.*
import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : Activity() {
    private var dressIndex = -1
    private var crownIndex = -1
    private var necklaceIndex = -1

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
        dressIndex = savedInstanceState?.getInt("dress", -1) ?: -1
        crownIndex = savedInstanceState?.getInt("crown", -1) ?: -1
        necklaceIndex = savedInstanceState?.getInt("necklace", -1) ?: -1
        listOf(R.id.pink, R.id.green, R.id.purple).forEachIndexed { index, id ->
            findViewById<ImageButton>(id).setOnClickListener { dressIndex = index; renderCharacter() }
        }
        listOf(R.id.crown1Button, R.id.crown2Button).forEachIndexed { index, id ->
            findViewById<ImageButton>(id).setOnClickListener {
                crownIndex = if (crownIndex == index) -1 else index
                renderCharacter()
            }
        }
        listOf(R.id.necklace1Button, R.id.necklace2Button).forEachIndexed { index, id ->
            findViewById<ImageButton>(id).setOnClickListener {
                necklaceIndex = if (necklaceIndex == index) -1 else index
                renderCharacter()
            }
        }
        findViewById<Button>(R.id.reset).setOnClickListener {
            dressIndex = -1
            crownIndex = -1
            necklaceIndex = -1
            renderCharacter()
        }
        renderCharacter()
    }

    private fun renderCharacter() {
        showLayer(R.id.dress, dressIndex, intArrayOf(R.drawable.dress1, R.drawable.dress2, R.drawable.dress3))
        showLayer(R.id.crown, crownIndex, intArrayOf(R.drawable.crown1, R.drawable.crown2))
        showLayer(R.id.necklace, necklaceIndex, intArrayOf(R.drawable.necklace1, R.drawable.necklace2))
    }

    private fun showLayer(id: Int, index: Int, images: IntArray) {
        findViewById<ImageView>(id).apply {
            visibility = if (index >= 0) View.VISIBLE else View.INVISIBLE
            if (index >= 0) setImageResource(images[index])
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("dress", dressIndex)
        outState.putInt("crown", crownIndex)
        outState.putInt("necklace", necklaceIndex)
        super.onSaveInstanceState(outState)
    }
}
