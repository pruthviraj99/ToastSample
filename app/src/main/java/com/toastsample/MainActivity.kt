package com.toastsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.theta.toast_message.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessage.showToast(this, "Sample Toast Message")
    }
}