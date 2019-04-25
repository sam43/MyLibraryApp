package com.sam43.customtextview

import android.util.Log

class LoggingClass {
    companion object {
        const val TAG = "+++LoggingClass"

        fun debug(msg: String?) {
            Log.d(TAG, "Debug: $msg")
        }

        fun error(e: String?) {
            Log.e(TAG, "ERROR: $e")
        }

        fun warning(w: String?) {
            Log.w(TAG, "Warning: $w")
        }

        fun info(info: String?) {
            Log.i(TAG, "Information: $info")
        }

    }
}