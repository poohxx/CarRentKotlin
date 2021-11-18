package com.poohxx.carrentkotlin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContentActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)

        val tvTitleIn = findViewById<TextView>(R.id.tvTitleIn)
        val tvContentIn = findViewById<TextView>(R.id.tvContentIn)
        val imIn = findViewById<ImageView>(R.id.ImIn)

        tvTitleIn.text = intent.getStringExtra("title")
        tvContentIn.text = intent.getStringExtra("content")
        imIn.setImageResource(intent.getIntExtra ("image", R.drawable.vehicle))
    }
}