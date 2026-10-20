package com.example.mp0505

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.graphics.toColorInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    lateinit var sObj1: Switch
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    lateinit var sObj2:	Switch
    lateinit var tvObj: TextView
    lateinit var ivObj1: ImageView
    lateinit var ivObj2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        sObj1 = findViewById(R.id.switch1)
        sObj2 = findViewById(R.id.switch2)

        sObj2.textOn = ""
        sObj2.textOff = ""

        tvObj = findViewById(R.id.textView2)
        ivObj1 = findViewById(R.id.imageView1)

        ivObj2 = findViewById(R.id.imageView2)
        ivObj1.visibility = if (sObj1.isChecked) View.VISIBLE else View.INVISIBLE

        sObj1.setOnCheckedChangeListener{ _, isChecked->
            ivObj1.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }
        
        sObj2.setOnCheckedChangeListener{ _, isChecked->
            if (isChecked) {
                sObj2.setThumbResource(R.drawable.on3)
                ivObj2.setImageResource(R.drawable.light32)
                tvObj.setBackgroundColor(Color.TRANSPARENT)
            } else {
                sObj2.setThumbResource(R.drawable.off3)
                ivObj2.setImageResource(R.drawable.light31)
                tvObj.setBackgroundColor("#E6C8C8C8".toColorInt())
            }
        }
    }
}