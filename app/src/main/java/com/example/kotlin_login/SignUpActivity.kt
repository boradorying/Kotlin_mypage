package com.example.kotlin_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val name = findViewById<EditText>(R.id.editNameArea)
        val id = findViewById<EditText>(R.id.editIdArea)
        val password = findViewById<EditText>(R.id.editPasswordArea)
        val signUpBtn = findViewById<Button>(R.id.signUpBtn2)


        signUpBtn.setOnClickListener {
            val userName = name.text.toString()
            val userId = id.text.toString()
            val userPassword =password.text.toString()

            if (userId.isNotEmpty() && userName.isNotEmpty() && userPassword.isNotEmpty()){
                val intent = Intent(this,SignlnActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this,"입력되지 않은 정보가 있습니다",Toast.LENGTH_LONG).show()
            }

        }
    }
}