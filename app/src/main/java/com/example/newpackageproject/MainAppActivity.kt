package com.example.newpackageproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.feature2_need_logger.MainActivity2
import com.example.feature_need_logger.MainActivity

class MainAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)
    }

    fun feature1 (view: View) = startActivity(Intent(this,MainActivity::class.java))
    fun feature2 (view: View) = startActivity(Intent(this,MainActivity2::class.java))
}