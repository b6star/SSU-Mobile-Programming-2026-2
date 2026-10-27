package com.example.mp0602

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class GameActivity : AppCompatActivity() {
    // 고양이 이미지 ID 배열
    var imageviewCatId = intArrayOf(
        R.id.iv_check_11, R.id.iv_check_12, R.id.iv_check_13,
        R.id.iv_check_14, R.id.iv_check_15
    )
    // 강아지 이미지 ID 배열
    var imageviewDogId = intArrayOf(
        R.id.iv_check_21, R.id.iv_check_22, R.id.iv_check_23,
        R.id.iv_check_24, R.id.iv_check_25
    )
    // 선택된 이미지를 저장할 ImageView 객체 배열
    var checkObj : Array<ImageView?> = arrayOfNulls(5)
    var mImage = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_game)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.game)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mImage = intent.getIntExtra("image", 1)

        // 고양이와 개 레이아웃을 설정
        val imageObj01 : ImageView = findViewById(R.id.image_view_01)
        val imageObj02 : ImageView = findViewById(R.id.image_view_02)
        val catLayout : ConstraintLayout = findViewById(R.id.cat_layout)
        val dogLayout : ConstraintLayout = findViewById(R.id.dog_layout)

        // 고양이 이미지가 선택된 경우
        if (mImage == 1) {
            imageObj01.setImageResource(R.drawable.cat01)
            imageObj02.setImageResource(R.drawable.cat02)
            for (i in 0..4) {
                checkObj[i] = findViewById(imageviewCatId[i])
            }
            catLayout.isVisible = true
            dogLayout.isVisible = false
        }

        // 강아지 이미지가 선택된 경우
        else if (mImage == 2) {
            imageObj01.setImageResource(R.drawable.dog01)
            imageObj02.setImageResource(R.drawable.dog02)
            for (i in 0..4) {
                checkObj[i] = findViewById(imageviewDogId[i])
            }
            catLayout.isVisible = false
            dogLayout.isVisible = true
        }

        val selected = BooleanArray(5)
        var num = 0
        for (i in 0..4) {
            checkObj[i]?.setOnClickListener{
                if (selected[i]) return@setOnClickListener
                selected[i] = true
                if (num <5) {
                    num++
                    checkObj[i]?.setImageResource(R.drawable.ok_select)
                    Toast.makeText(applicationContext, "맞았습니다",
                        Toast.LENGTH_SHORT).show()
                }
                // 5개 모두 맞힌 경우
                if(num == 5) Toast.makeText(applicationContext, "5개 모두 선택했습니다.",
                    Toast.LENGTH_SHORT).show()
            }
        }

        // 첫 번째 이미지 뷰 클릭 시
        imageObj01.setOnClickListener{
            Toast.makeText(applicationContext, "틀렸습니다.", Toast.LENGTH_SHORT).show()
        }

        // 종료 버튼 클릭 시
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener {
            finish()
        }
    }
}