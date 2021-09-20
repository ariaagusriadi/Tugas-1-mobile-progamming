package com.aria.myinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val follow_count = findViewById<TextView>(R.id.lbl_followers)
        val button_follow = findViewById<TextView>(R.id.button_biru)

        button_follow.setOnClickListener{
            button_follow.text = "Following"
            follow_count.text = "873"
        }

    }


}