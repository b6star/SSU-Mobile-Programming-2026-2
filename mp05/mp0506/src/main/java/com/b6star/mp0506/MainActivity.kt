package com.b6star.mp0506

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private enum class ImageItem(val fileName: String, val resourceId: Int) {
        CAT1("cat1.png", R.drawable.cat1),
        CAT2("cat2.png", R.drawable.cat2),
        CAT3("cat3.png", R.drawable.cat3),
        CAT4("cat4.png", R.drawable.cat4),
        CAT5("cat5.png", R.drawable.cat5)
    }

    private val images = ImageItem.entries
    private var imageIndex = 0
    private lateinit var imageView: ImageView
    private lateinit var imageName: TextView
    private lateinit var nextButton: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.image_view)
        imageName = findViewById(R.id.image_name)
        nextButton = findViewById(R.id.next_button)
        showImage()

        nextButton.setOnClickListener {
            imageIndex = (imageIndex + 1) % images.size
            nextButton.isFocusableInTouchMode = true
            nextButton.requestFocus()
            showImage()
        }
    }

    private fun showImage() {
        val image = images[imageIndex]
        imageView.setImageResource(image.resourceId)
        imageName.text = image.fileName
    }
}
