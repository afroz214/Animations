package com.smartherd.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_scale_animation.*

class ScaleAnimation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale_animation)

        btn_start.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this, R.anim.scale_animation)
            scale_image.startAnimation(animation)
        }
        btn_fade.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this,R.anim.fade)
            scale_image.startAnimation(animation)
        }
    }
}
