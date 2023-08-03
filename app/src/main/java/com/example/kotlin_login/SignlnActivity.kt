package com.example.kotlin_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignlnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signln)

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val signUpBtn = findViewById<Button>(R.id.signUpBtn)
        val userNameEditText = findViewById<EditText>(R.id.idArea)
        val userPasswordEditText = findViewById<EditText>(R.id.passwordArea)

        val userIdFromSignUp = intent.getStringExtra("USERID")                //여기
        val userPassFromSignUp = intent.getStringExtra("USERPASS")
        if (!userIdFromSignUp.isNullOrBlank() && !userPassFromSignUp.isNullOrBlank()){
            userNameEditText.setText(userIdFromSignUp)
            userPasswordEditText.setText(userPassFromSignUp)
        }

        loginBtn.setOnClickListener {
            val userId = userNameEditText.text.toString()
            val userPassword = userPasswordEditText.text.toString()

            if (userId.isNotEmpty() && userPassword.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("USERID", userId)
                startActivity(intent)
                Toast.makeText(this, "로그인 성공", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "아이디/비밀번호를 입력해주세요", Toast.LENGTH_LONG).show()
            }
        }

        signUpBtn.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}

