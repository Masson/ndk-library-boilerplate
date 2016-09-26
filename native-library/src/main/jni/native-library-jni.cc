#include <jni.h>
#include <string>
#include <android/log.h>

#define  LOG_TAG    "native-library"
#define  LOGI(...)  __android_log_print(ANDROID_LOG_INFO,LOG_TAG,__VA_ARGS__)
#define  LOGW(...)  __android_log_print(ANDROID_LOG_WARN,LOG_TAG,__VA_ARGS__)
#define  LOGE(...)  __android_log_print(ANDROID_LOG_ERROR,LOG_TAG,__VA_ARGS__)

extern "C" {
    JNIEXPORT jstring JNICALL Java_com_imasson_boilerplate_nativelib_NativeFacade_getStringFromJNI(JNIEnv *env, jobject instance);
}

JNIEXPORT jstring JNICALL
Java_com_imasson_boilerplate_nativelib_NativeFacade_getStringFromJNI(JNIEnv *env, jobject instance) {
    std::string text = "Hello from C++";
    LOGI("JNI method 'getStringFromJNI' called: text=%s", text.c_str());
    return env->NewStringUTF(text.c_str());
}