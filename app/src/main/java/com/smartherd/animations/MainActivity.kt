package com.smartherd.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next.setOnClickListener {
            startActivity(Intent(this@MainActivity, ImagesAnimaton::class.java))
        }
    }
}
