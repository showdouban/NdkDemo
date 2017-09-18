#include "com_anoah_ndkdemoproject_NdkU.h"
/*
 * Class:     com_anoah_ndkdemoproject_NdkU.h
 * Method:    getStringHello
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_anoah_ndkdemoproject_NdkU_getStringHello
(JNIEnv *env, jobject  obj){
    return (*env)->NewStringUTF(env,"this is my first ndkDemo");
}