package com.example.android_logger_impl

import android.util.Log
import com.example.logger.LoggerInterface

class AndroidLogger: LoggerInterface {
    override fun logd(str: String) {
        Log.d("aliali", "AndroidLogger/logd: $str")
    }
}