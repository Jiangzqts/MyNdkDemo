package com.example.mylibrary;

/**
 * Created by Window7Home on 2017/3/29.
 */

public class NdkString {

    public static native String getFromC();
    static {
        System.loadLibrary("forkApp");
    }
}
