package com.example.feature2_need_logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logger.LoggerInterface

class MainActivity2 : AppCompatActivity() {

    lateinit var logger: LoggerInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        logger.logd("")
    }
}