package com.imasson.boilerplate.nativelib;

/**
 * The facade class for all native methods.
 */
public final class NativeFacade {

    private NativeFacade() {
    }

    static {
        // make sure library name is the same as moduleName inside build.gradle
        System.loadLibrary("native-library-jni");
    }

    // Add jni functions here...
    //
    // Check the CodeLab to learn how to generate the C/C++ prototype function:
    // https://codelabs.developers.google.com/codelabs/android-studio-jni/index.html?index=..%2F..%2Findex#3

    public static native String getStringFromJNI();
}
