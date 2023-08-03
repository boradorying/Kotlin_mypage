package com.example.kotlin_login

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class SignUpActivity : AppCompatActivity() {

//    private val signInActivityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
//        if (result.resultCode == Activity.RESULT_OK) {
//            val data: Intent? = result.data
//            val userId = data?.getStringExtra("USERID")
//            val userPassword = data?.getStringExtra("USERPASS")
//            if (!userId.isNullOrBlank() && !userPassword.isNullOrBlank()) {
//                val intent = Intent(this, SignlnActivity::class.java)
//                intent.putExtra("USERID", userId)
//                intent.putExtra("USERPASS", userPassword)
//                startActivity(intent)
//            }
//        }
//    }

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
            val userPassword = password.text.toString()

            if (userId.isNotEmpty() && userName.isNotEmpty() && userPassword.isNotEmpty()) {
                val intent = Intent(this, SignlnActivity::class.java)
                intent.putExtra("USERID", userId)
                intent.putExtra("USERPASS", userPassword)
//                signInActivityResultLauncher.launch(intent)
                startActivity(intent)
            } else {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다", Toast.LENGTH_LONG).show()
            }
        }
    }
}
