package com.anoah.ndkdemoproject;

/**
 * Created by liuwenxing on 2017/9/6.
 */

public class NdkU {
    static {
        System.loadLibrary("demondk");
    }
    public native String getStringHello();
}
