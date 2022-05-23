package com.andre.takepicture

import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.andre.takepicture.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    // content URI of the saved image file on public storage
     lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val root = binding.root
        setContentView(root)
        loadImageFromPublic()

        var imageSecondActivity = intent.getStringExtra("EXTRA_IMAGE")





//        binding.imageView.setImageBitmap()

    }

    fun loadImageFromPublic() {
        if (MainActivity().publicUri == null) {
            return
        }

        binding.imageView.setImageURI(MainActivity().publicUri)
    }
}