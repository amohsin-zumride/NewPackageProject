package com.example.feature_need_logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logger.LoggerInterface
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    lateinit var logger: LoggerInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger.logd("")
    }
}