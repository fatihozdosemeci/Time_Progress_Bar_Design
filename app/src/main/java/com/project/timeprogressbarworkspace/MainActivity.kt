package com.project.timeprogressbarworkspace

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCountDownTimer: CountDownTimer
        var progress: Int = 0

        val mProgressBar: ProgressBar = findViewById(R.id.progressbar)
        mProgressBar.progressDrawable.setColorFilter(Color.RED,android.graphics.PorterDuff.Mode.SRC_IN)
        mProgressBar.progress = progress
        mCountDownTimer = object : CountDownTimer(10800, 25) {
            override fun onTick(millisUntilFinished: Long) {
                //Log.v("Log_tag", "Tick of Progress$i$millisUntilFinished")
                progress++
                mProgressBar.progress = progress // as Int * 100 / (5000 / 50)
            }

            override fun onFinish() {
                //Do what you want
                //i++
                //mProgressBar.progress = 200
            }
        }
        mCountDownTimer.start()

    }
}