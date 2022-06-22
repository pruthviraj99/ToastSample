package com.theta.toast_message

import android.content.Context
import android.widget.Toast

object ToastMessage {

    fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}