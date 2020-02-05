package com.smartherd.animations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_images_animaton.*

class ImagesAnimaton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images_animaton)


        applyAnimation(animation_image)
        applyAnimation(overlay_gradient)
    }
    fun applyAnimation(view:View){
        val backgroundImage = view.background as AnimationDrawable
        backgroundImage.setEnterFadeDuration(2000)
        backgroundImage.setExitFadeDuration(2000)
        backgroundImage.start()
    }
}
