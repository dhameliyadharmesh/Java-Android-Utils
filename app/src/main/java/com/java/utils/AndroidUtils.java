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
     * @return OS API version in the int data type
     */
    public static int getDeviceOSAPIVersion() {
        return Build.VERSION.SDK_INT;
    }

    /**
     * This device model name
     * @return Device model name in the string object
     */
    public static String getDeviceModel() { return Build.MODEL;}

    /**
     * This device brand name
     * @return Device brand name in the string object
     */
    public static String getDeviceBrand() {
        return Build.BRAND;
    }
}
