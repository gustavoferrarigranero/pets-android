package com.example.gustavo.petsandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class OpenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open)

        Handler().postDelayed({
            val intent = LoginActivity.newIntent(applicationContext)
            startActivity(intent)
            finish()
        }, 4000)
    }
}
