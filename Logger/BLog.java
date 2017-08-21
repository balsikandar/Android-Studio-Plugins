package com.balsikandar.logger;

import android.util.Log;

public final class BLog {

    private static boolean IS_LOGGING_ENABLED = false;
    private static String TAG = BobbleConstants.TAG;

    private BLog() {
        // This class is not publicly instantiable
    }

    public static void enableLogging() {
        IS_LOGGING_ENABLED = true;
    }

    public static void disableLogging() {
        IS_LOGGING_ENABLED = false;
    }

    public static void setTag(String tag) {
        if (tag == null) {
            return;
        }
        TAG = tag;
    }

    public static void d(String tag, String message) {
        if (IS_LOGGING_ENABLED) {
            Log.d(tag, message);
        }
    }

    public static void d(String message) {
        if (IS_LOGGING_ENABLED) {
            Log.d(TAG, message);
        }
    }

    public static void e(String message) {
        if (IS_LOGGING_ENABLED) {
            Log.e(TAG, message);
        }
    }

    public static void e(String tag, String message) {
        if (IS_LOGGING_ENABLED) {
            Log.e(tag, message);
        }
    }

    public static void i(String message) {
        if (IS_LOGGING_ENABLED) {
            Log.i(TAG, message);
        }
    }

    public static void i(String tag, String message) {
        if (IS_LOGGING_ENABLED) {
            Log.i(tag, message);
        }
    }

    public static void w(String message) {
        if (IS_LOGGING_ENABLED) {
            Log.w(TAG, message);
        }
    }

    public static void w(String tag, String message) {
        if (IS_LOGGING_ENABLED) {
            Log.w(tag, message);
        }
    }

    public static void wtf(String message) {
        if (IS_LOGGING_ENABLED) {
            Log.wtf(TAG, message);
        }
    }

    public static void wtf(String tag, String message) {
        if (IS_LOGGING_ENABLED) {
            Log.wtf(tag, message);
        }
    }

}
