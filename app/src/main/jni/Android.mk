LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES := ndk.c

LOCAL_C_INCLUDES := com_anoah_ndkdemoproject_NdkU.h


LOCAL_MODULE := demondk



include $(BUILD_SHARED_LIBRARY)