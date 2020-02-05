package com.smartherd.animations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_images_animaton.*

class ImagesAnimaton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images_animaton)

        val backgroundImage = animation_image.background as AnimationDrawable
        backgroundImage.setEnterFadeDuration(200)
        backgroundImage.setExitFadeDuration(1000)
        backgroundImage.start()
    }
}
