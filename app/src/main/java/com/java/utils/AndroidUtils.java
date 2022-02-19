package com.java.utils;

import android.os.Build;

/**
 * @Author Dharmesh
 * @Date 19-02-2022
 * <p>
 * Information
 **/
public class AndroidUtils {

    /**
     * SDK_INT
     * The SDK version of the android OS currently running on this hardware device.
     */
    public static int getOSVersionSDKINT() {
        return Build.VERSION.SDK_INT;
    }
}
