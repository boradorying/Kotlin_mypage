package com.example.kotlin_login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
//
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imgList = mutableListOf(
            R.drawable.sejun,
            R.drawable.sejun2,
            R.drawable.sejun3,
            R.drawable.sejun4
        )
        val imgid = findViewById<ImageView>(R.id.imgArea)
        val randomImage = imgList.random()

        imgid.setImageResource(randomImage)

        val textID = findViewById<TextView>(R.id.textUserID)

        val userName = intent.getStringExtra("USERID")

        textID.text ="아이디 : ${userName}"


        val finish = findViewById<Button>(R.id.finishBtn)
        finish.setOnClickListener {
            finish()
        }
    }
}