<h1 style="color: #ff90fa;text-align: center;font-size:3em">Android学习笔记</h1>









---





# Android的发展历程

安卓（Android）是一种基于Linux内核（不包含GNU组件）的自由及开放源代码的操作系统。主要使用 于移动设备，如智能手机和平板电脑，由美国Google公司和开放手机联盟领导及开发。Android操作系 统最初由Andy Rubin开发，主要支持手机。

* 2005年8月由Google收购注资。 
* 2007年11月，Google与84家硬件制造商、软件开发商及电信营运商组建开放手机联盟共同研发改 良Android系统，并发布了Android的源代码。 
* 第一部Android智能手机发布于2008年10月，由 HTC 公司制造。Android逐渐扩展到平板电脑及 其他领域上，如电视、数码相机、游戏机、智能手表、车载大屏、智能家居等，并逐渐成为了人们 日常生活中不可或缺的系统软件。 
* 2011年第一季度，Android在全球的市场份额首次超过塞班系统，跃居全球第一。 
* 2013年的第四季度，Android平台手机的全球市场份额已经达到78.1%。2013年09月24日谷歌开 发的操作系统Android在迎来了5岁生日，全世界采用这款系统的设备数量已经达到10亿台。 
* 2019年，谷歌官方宣布全世界有25亿活跃的Android设备，还不包含大多数中国设备。



Android几乎每年都要发布一个大版本，技术的更新迭代非常之快



| Android 版本号 | 对应 API | 发布时间 |
| :------------: | :------: | :------: |
|Android 13 |33 |2022年2月|
|Android 12 |31 |2021年10月|
|Android 11| 30| 2020年9月|
|Android 10| 29 |2019年8月|
|Android 9| 28 |2018年8月|
|Android 8 |26/27| 2017年8月|
|Android 7| 24/25| 2016年8月|
|Android 6| 23| 2015年9月|
|Android 5 |21/22| 2014年6月|
|Android 4.4| 19/20 |2013年9月|



虽然Android基于Linux内核，但是Android手机的应用App主要采用Java语言开发。为了吸引众多的Java 程序员，早期的App开发工具使用Eclipse，通过给Eclipse安装ADT插件，使之支持开发和调试App。然 而Eclipse毕竟不是专门的App开发环境，运行速度也偏慢，因此谷歌公司在2013年5月推出了全新的 Android开发环境—Android Studio。Android Studio基于IntelliJ IDEA演变而来，既保持了IDEA方便快 捷的特点，又增加了Android开发的环境支持。自2015年之后，谷歌公司便停止了ADT的版本更新，转 而重点打造自家的Android Studio，数年升级换代下来，Android Studio的功能愈加丰富，性能也愈高 效，使得它逐步成为主流的App开发环境







# Android Studio

## 开发机配置要求

* 内存要求至少8GB，越大越好。 
* CPU要求1.5GHz以上，越快越好。 
* 硬盘要求系统盘剩余空间10GB以上，越大越好。 
* 要求带无线网卡与USB插槽。
* 必须是64位系统，不能是32位系统
* Windows系统至少为Windows 7，推荐Windows 10，不支持Windows XP





## 下载

https://developer.android.google.cn/studio/index.html



## 安装

双击下载完成的Android Studio安装程序



![image-20220917122348508](img/Android学习笔记/image-20220917122348508.png)



![image-20220917122359824](img/Android学习笔记/image-20220917122359824.png)



一直点击下一步



![image-20220917122450608](img/Android学习笔记/image-20220917122450608.png)



![image-20220917122507003](img/Android学习笔记/image-20220917122507003.png)



单击对话框右下角的Finish按钮，完成安装配置工作，同时打开Android Studio欢迎界面



![image-20220917122626877](img/Android学习笔记/image-20220917122626877.png)





## 下载Android的SDK

在Android Studio主界面，依次选择菜单Tools→SDK Manager，或者在Android Studio右上角中单击图标



![image-20220917123334724](img/Android学习笔记/image-20220917123334724.png)



![image-20220917123535758](img/Android学习笔记/image-20220917123535758.png)





SDK下载完成，可以到“我的电脑”中打开Android SDK Location指定的SDK保存路径，发现下面还有十几个目录



```sh
PS C:\Users\mao\AppData\Local\Android> ls


    目录: C:\Users\mao\AppData\Local\Android


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/9/15     22:08                Sdk


PS C:\Users\mao\AppData\Local\Android> cd .\Sdk\
PS C:\Users\mao\AppData\Local\Android\Sdk> ls


    目录: C:\Users\mao\AppData\Local\Android\Sdk


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/9/15     22:02                .downloadIntermediates
d-----         2022/9/15     22:03                .temp
d-----         2022/9/15     21:54                build-tools
d-----         2022/9/15     21:04                emulator
d-----         2022/9/15     21:02                extras
d-----         2022/9/15     22:08                fonts
d-----         2022/9/15     21:02                licenses
d-----         2022/3/12     12:57                patcher
d-----         2022/9/15     21:02                platform-tools
d-----         2022/3/12     12:59                platforms
d-----         2022/9/15     22:26                skins
d-----         2022/9/15     21:57                system-images
d-----         2022/3/12     12:58                tools
-a----         2022/9/17     12:35             16 .knownPackages


PS C:\Users\mao\AppData\Local\Android\Sdk>
```



* build-tools目录，存放各版本Android的编译工具。 
* emulator目录，存放模拟器的管理工具。 
* platforms目录，存放各版本Android的资源文件与内核JAR包android.jar。 
* platform-tools目录，存放常用的开发辅助工具，包括客户端驱动程序adb.exe、数据库管理工具 sqlite3.exe，等等。 









## 创建项目

![image-20220917124034741](img/Android学习笔记/image-20220917124034741.png)



![image-20220917124124652](img/Android学习笔记/image-20220917124124652.png)



![image-20220917124141062](img/Android学习笔记/image-20220917124141062.png)



![image-20220917124305335](img/Android学习笔记/image-20220917124305335.png)







## 创建内置模拟器

所谓模拟器，指的是在电脑上构造一个演示窗口，模拟手机屏幕的App运行效果。App通过编译之后， 只说明代码没有语法错误，若想验证App能否正确运行，还得让它在Android设备上跑起来。这个设备可 以是真实手机，也可以是电脑里的模拟器。依次选择菜单Run→Run （也可按快捷键Shift+F10），或者 选择菜单Run→Run…，在弹出的小窗中选择待运行的模块名称，Android Studio会判断当前是否存在已 经连接的设备，如果已有连接上的设备就在该设备上安装测试App。

因为一开始没有任何已连上的设备，所以运行App会报错“Error running ：No target device found.”， 意思是未找到任何目标设备。此时要先创建一个模拟器，依次选择菜单Tools→AVD Manager，或者在 Android Studio右上角的按钮中单击图标



![image-20220917124708476](img/Android学习笔记/image-20220917124708476.png)



点击创建



![image-20220917124737339](img/Android学习笔记/image-20220917124737339.png)



![image-20220917124835476](img/Android学习笔记/image-20220917124835476.png)



单击许可授权对话框的Accept选项，表示接受上述条款，再单击Next按钮跳到下一页的镜像下载对话框



等待镜像下载完成，单击右下角的Finish按钮



![image-20220917125033752](img/Android学习笔记/image-20220917125033752.png)





## 运行App

模拟器创建完成后，回到Android Studio的主界面



点击运行按钮



![image-20220917125209578](img/Android学习笔记/image-20220917125209578.png)



![image-20220917125224436](img/Android学习笔记/image-20220917125224436.png)



![image-20220917125331122](img/Android学习笔记/image-20220917125331122.png)











# 运行日志

打开logcat

查看日志：

```sh
2022-09-17 12:52:22.443 6578-6578/? I/android_projec: Late-enabling -Xcheck:jni
2022-09-17 12:52:22.529 6578-6578/? E/android_projec: Unknown bits set in runtime_flags: 0x8000
2022-09-17 12:52:22.533 6578-6578/? W/android_projec: Unexpected CPU variant for X86 using defaults: x86
2022-09-17 12:52:22.939 6578-6646/com.example.my_first_android_project D/libEGL: Emulator has host GPU support, qemu.gles is set to 1.
2022-09-17 12:52:22.939 6578-6646/com.example.my_first_android_project W/libc: Unable to set property "qemu.gles" to "1": connection failed; errno=13 (Permission denied)
2022-09-17 12:52:22.955 6578-6646/com.example.my_first_android_project D/libEGL: loaded /vendor/lib/egl/libEGL_emulation.so
2022-09-17 12:52:22.957 6578-6646/com.example.my_first_android_project D/libEGL: loaded /vendor/lib/egl/libGLESv1_CM_emulation.so
2022-09-17 12:52:22.961 6578-6646/com.example.my_first_android_project D/libEGL: loaded /vendor/lib/egl/libGLESv2_emulation.so
2022-09-17 12:52:23.163 6578-6578/com.example.my_first_android_project W/android_projec: Accessing hidden method Landroid/view/View;->computeFitSystemWindows(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z (greylist, reflection, allowed)
2022-09-17 12:52:23.163 6578-6578/com.example.my_first_android_project W/android_projec: Accessing hidden method Landroid/view/ViewGroup;->makeOptionalFitsSystemWindows()V (greylist, reflection, allowed)
2022-09-17 12:52:23.285 6578-6644/com.example.my_first_android_project D/HostConnection: HostConnection::get() New Host Connection established 0xdbd0eb40, tid 6644
2022-09-17 12:52:23.363 6578-6644/com.example.my_first_android_project D/HostConnection: HostComposition ext ANDROID_EMU_CHECKSUM_HELPER_v1 ANDROID_EMU_dma_v1 ANDROID_EMU_direct_mem ANDROID_EMU_host_composition_v1 ANDROID_EMU_host_composition_v2 ANDROID_EMU_vulkan ANDROID_EMU_deferred_vulkan_commands ANDROID_EMU_vulkan_null_optional_strings ANDROID_EMU_vulkan_create_resources_with_requirements ANDROID_EMU_YUV_Cache ANDROID_EMU_vulkan_ignored_handles ANDROID_EMU_vulkan_free_memory_sync ANDROID_EMU_vulkan_shader_float16_int8 ANDROID_EMU_vulkan_async_queue_submit ANDROID_EMU_sync_buffer_data GL_OES_vertex_array_object GL_KHR_texture_compression_astc_ldr ANDROID_EMU_host_side_tracing ANDROID_EMU_gles_max_version_2 
2022-09-17 12:52:23.375 6578-6644/com.example.my_first_android_project W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...
2022-09-17 12:52:23.409 6578-6644/com.example.my_first_android_project D/EGL_emulation: eglCreateContext: 0xe7f01680: maj 2 min 0 rcv 2
2022-09-17 12:52:23.433 6578-6644/com.example.my_first_android_project D/EGL_emulation: eglMakeCurrent: 0xe7f01680: ver 2 0 (tinfo 0xdbd508b0)
2022-09-17 12:52:23.450 6578-6644/com.example.my_first_android_project W/Gralloc3: mapper 3.x is not supported
2022-09-17 12:52:23.451 6578-6644/com.example.my_first_android_project D/HostConnection: createUnique: call
2022-09-17 12:52:23.451 6578-6644/com.example.my_first_android_project D/HostConnection: HostConnection::get() New Host Connection established 0xdbd105d0, tid 6644
2022-09-17 12:52:23.503 6578-6644/com.example.my_first_android_project D/HostConnection: HostComposition ext ANDROID_EMU_CHECKSUM_HELPER_v1 ANDROID_EMU_dma_v1 ANDROID_EMU_direct_mem ANDROID_EMU_host_composition_v1 ANDROID_EMU_host_composition_v2 ANDROID_EMU_vulkan ANDROID_EMU_deferred_vulkan_commands ANDROID_EMU_vulkan_null_optional_strings ANDROID_EMU_vulkan_create_resources_with_requirements ANDROID_EMU_YUV_Cache ANDROID_EMU_vulkan_ignored_handles ANDROID_EMU_vulkan_free_memory_sync ANDROID_EMU_vulkan_shader_float16_int8 ANDROID_EMU_vulkan_async_queue_submit ANDROID_EMU_sync_buffer_data GL_OES_vertex_array_object GL_KHR_texture_compression_astc_ldr ANDROID_EMU_host_side_tracing ANDROID_EMU_gles_max_version_2 
2022-09-17 12:52:23.503 6578-6644/com.example.my_first_android_project D/eglCodecCommon: allocate: Ask for block of size 0x1000
2022-09-17 12:52:23.503 6578-6644/com.example.my_first_android_project D/eglCodecCommon: allocate: ioctl allocate returned offset 0x3ffff6000 size 0x2000
2022-09-17 12:52:23.515 6578-6644/com.example.my_first_android_project D/EGL_emulation: eglMakeCurrent: 0xe7f01680: ver 2 0 (tinfo 0xdbd508b0)
2022-09-17 12:52:31.588 6578-6644/com.example.my_first_android_project D/EGL_emulation: eglMakeCurrent: 0xe7f01680: ver 2 0 (tinfo 0xdbd508b0)
2022-09-17 12:52:35.990 6578-6578/com.example.my_first_android_project W/ActivityThread: handleWindowVisibility: no activity for token android.os.BinderProxy@d5feb6c
2022-09-17 12:52:36.051 6578-6644/com.example.my_first_android_project D/EGL_emulation: eglMakeCurrent: 0xe7f01680: ver 2 0 (tinfo 0xdbd508b0)
```



* Log.e：表示错误信息，比如可能导致程序崩溃的异常。 
* Log.w：表示警告信息。
* Log.i：表示一般消息。 
* Log.d：表示调试信息，可把程序运行时的变量值打印出来，方便跟踪调试。
* Log.v：表示冗余信息



一般而言，日常开发使用Log.d即可





虽然在模拟器上能够看到App的运行，却无法看到App的调试信息。以前写Java代码的时候，通过 System.out.println可以很方便地向IDEA的控制台输出日志，当然Android Studio也允许查看App的运 行日志，只是Android不使用System.out.println，而是采用Log工具打印日志



```java
package com.example.my_first_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: 调试日志");
        Log.i("MainActivity", "onCreate: 日志");
        Log.w("MainActivity", "onCreate: 警告日志", new RuntimeException());
        Log.e("MainActivity", "onCreate: 错误日志", new RuntimeException());
    }

}
```



查看日志（debug级别）

![image-20220917132203194](img/Android学习笔记/image-20220917132203194.png)



```sh
2022-09-17 13:21:23.203 8137-8137/? I/android_projec: Late-enabling -Xcheck:jni
2022-09-17 13:21:23.222 8137-8137/? E/android_projec: Unknown bits set in runtime_flags: 0x8000
2022-09-17 13:21:23.224 8137-8137/? W/android_projec: Unexpected CPU variant for X86 using defaults: x86
2022-09-17 13:21:23.462 8137-8170/com.example.my_first_android_project D/libEGL: Emulator has host GPU support, qemu.gles is set to 1.
2022-09-17 13:21:23.468 8137-8170/com.example.my_first_android_project W/libc: Unable to set property "qemu.gles" to "1": connection failed; errno=13 (Permission denied)
2022-09-17 13:21:23.461 8137-8137/com.example.my_first_android_project W/RenderThread: type=1400 audit(0.0:49248): avc: denied { write } for name="property_service" dev="tmpfs" ino=8453 scontext=u:r:untrusted_app:s0:c146,c256,c512,c768 tcontext=u:object_r:property_socket:s0 tclass=sock_file permissive=0 app=com.example.my_first_android_project
2022-09-17 13:21:23.498 8137-8170/com.example.my_first_android_project D/libEGL: loaded /vendor/lib/egl/libEGL_emulation.so
2022-09-17 13:21:23.501 8137-8170/com.example.my_first_android_project D/libEGL: loaded /vendor/lib/egl/libGLESv1_CM_emulation.so
2022-09-17 13:21:23.507 8137-8170/com.example.my_first_android_project D/libEGL: loaded /vendor/lib/egl/libGLESv2_emulation.so
2022-09-17 13:21:23.671 8137-8137/com.example.my_first_android_project W/android_projec: Accessing hidden method Landroid/view/View;->computeFitSystemWindows(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z (greylist, reflection, allowed)
2022-09-17 13:21:23.671 8137-8137/com.example.my_first_android_project W/android_projec: Accessing hidden method Landroid/view/ViewGroup;->makeOptionalFitsSystemWindows()V (greylist, reflection, allowed)
2022-09-17 13:21:23.747 8137-8137/com.example.my_first_android_project D/MainActivity: onCreate: 调试日志
2022-09-17 13:21:23.747 8137-8137/com.example.my_first_android_project I/MainActivity: onCreate: 日志
2022-09-17 13:21:23.749 8137-8137/com.example.my_first_android_project W/MainActivity: onCreate: 警告日志
    java.lang.RuntimeException
        at com.example.my_first_android_project.MainActivity.onCreate(MainActivity.java:19)
        at android.app.Activity.performCreate(Activity.java:7802)
        at android.app.Activity.performCreate(Activity.java:7791)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
        at android.os.Handler.dispatchMessage(Handler.java:107)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
2022-09-17 13:21:23.750 8137-8137/com.example.my_first_android_project E/MainActivity: onCreate: 错误日志
    java.lang.RuntimeException
        at com.example.my_first_android_project.MainActivity.onCreate(MainActivity.java:20)
        at android.app.Activity.performCreate(Activity.java:7802)
        at android.app.Activity.performCreate(Activity.java:7791)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
        at android.os.Handler.dispatchMessage(Handler.java:107)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
2022-09-17 13:21:23.817 8137-8168/com.example.my_first_android_project D/HostConnection: HostConnection::get() New Host Connection established 0xdbd0ec80, tid 8168
2022-09-17 13:21:23.833 8137-8168/com.example.my_first_android_project D/HostConnection: HostComposition ext ANDROID_EMU_CHECKSUM_HELPER_v1 ANDROID_EMU_dma_v1 ANDROID_EMU_direct_mem ANDROID_EMU_host_composition_v1 ANDROID_EMU_host_composition_v2 ANDROID_EMU_vulkan ANDROID_EMU_deferred_vulkan_commands ANDROID_EMU_vulkan_null_optional_strings ANDROID_EMU_vulkan_create_resources_with_requirements ANDROID_EMU_YUV_Cache ANDROID_EMU_vulkan_ignored_handles ANDROID_EMU_vulkan_free_memory_sync ANDROID_EMU_vulkan_shader_float16_int8 ANDROID_EMU_vulkan_async_queue_submit ANDROID_EMU_sync_buffer_data GL_OES_vertex_array_object GL_KHR_texture_compression_astc_ldr ANDROID_EMU_host_side_tracing ANDROID_EMU_gles_max_version_2 
2022-09-17 13:21:23.840 8137-8168/com.example.my_first_android_project W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...
2022-09-17 13:21:23.875 8137-8168/com.example.my_first_android_project D/EGL_emulation: eglCreateContext: 0xe7f02280: maj 2 min 0 rcv 2
2022-09-17 13:21:23.914 8137-8168/com.example.my_first_android_project D/EGL_emulation: eglMakeCurrent: 0xe7f02280: ver 2 0 (tinfo 0xdbd1dee0)
2022-09-17 13:21:23.923 8137-8168/com.example.my_first_android_project W/Gralloc3: mapper 3.x is not supported
2022-09-17 13:21:23.929 8137-8168/com.example.my_first_android_project D/HostConnection: createUnique: call
2022-09-17 13:21:23.929 8137-8168/com.example.my_first_android_project D/HostConnection: HostConnection::get() New Host Connection established 0xdbd10710, tid 8168
2022-09-17 13:21:23.937 8137-8168/com.example.my_first_android_project D/HostConnection: HostComposition ext ANDROID_EMU_CHECKSUM_HELPER_v1 ANDROID_EMU_dma_v1 ANDROID_EMU_direct_mem ANDROID_EMU_host_composition_v1 ANDROID_EMU_host_composition_v2 ANDROID_EMU_vulkan ANDROID_EMU_deferred_vulkan_commands ANDROID_EMU_vulkan_null_optional_strings ANDROID_EMU_vulkan_create_resources_with_requirements ANDROID_EMU_YUV_Cache ANDROID_EMU_vulkan_ignored_handles ANDROID_EMU_vulkan_free_memory_sync ANDROID_EMU_vulkan_shader_float16_int8 ANDROID_EMU_vulkan_async_queue_submit ANDROID_EMU_sync_buffer_data GL_OES_vertex_array_object GL_KHR_texture_compression_astc_ldr ANDROID_EMU_host_side_tracing ANDROID_EMU_gles_max_version_2 
2022-09-17 13:21:23.937 8137-8168/com.example.my_first_android_project D/eglCodecCommon: allocate: Ask for block of size 0x1000
2022-09-17 13:21:23.937 8137-8168/com.example.my_first_android_project D/eglCodecCommon: allocate: ioctl allocate returned offset 0x3ffff6000 size 0x2000
2022-09-17 13:21:23.946 8137-8168/com.example.my_first_android_project D/EGL_emulation: eglMakeCurrent: 0xe7f02280: ver 2 0 (tinfo 0xdbd1dee0)
```



查看日志（warn级别）

![image-20220917132258246](img/Android学习笔记/image-20220917132258246.png)



```sh
2022-09-17 13:21:23.222 8137-8137/? E/android_projec: Unknown bits set in runtime_flags: 0x8000
2022-09-17 13:21:23.224 8137-8137/? W/android_projec: Unexpected CPU variant for X86 using defaults: x86
2022-09-17 13:21:23.468 8137-8170/com.example.my_first_android_project W/libc: Unable to set property "qemu.gles" to "1": connection failed; errno=13 (Permission denied)
2022-09-17 13:21:23.461 8137-8137/com.example.my_first_android_project W/RenderThread: type=1400 audit(0.0:49248): avc: denied { write } for name="property_service" dev="tmpfs" ino=8453 scontext=u:r:untrusted_app:s0:c146,c256,c512,c768 tcontext=u:object_r:property_socket:s0 tclass=sock_file permissive=0 app=com.example.my_first_android_project
2022-09-17 13:21:23.671 8137-8137/com.example.my_first_android_project W/android_projec: Accessing hidden method Landroid/view/View;->computeFitSystemWindows(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z (greylist, reflection, allowed)
2022-09-17 13:21:23.671 8137-8137/com.example.my_first_android_project W/android_projec: Accessing hidden method Landroid/view/ViewGroup;->makeOptionalFitsSystemWindows()V (greylist, reflection, allowed)
2022-09-17 13:21:23.749 8137-8137/com.example.my_first_android_project W/MainActivity: onCreate: 警告日志
    java.lang.RuntimeException
        at com.example.my_first_android_project.MainActivity.onCreate(MainActivity.java:19)
        at android.app.Activity.performCreate(Activity.java:7802)
        at android.app.Activity.performCreate(Activity.java:7791)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
        at android.os.Handler.dispatchMessage(Handler.java:107)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
2022-09-17 13:21:23.750 8137-8137/com.example.my_first_android_project E/MainActivity: onCreate: 错误日志
    java.lang.RuntimeException
        at com.example.my_first_android_project.MainActivity.onCreate(MainActivity.java:20)
        at android.app.Activity.performCreate(Activity.java:7802)
        at android.app.Activity.performCreate(Activity.java:7791)
        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1299)
        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:3245)
        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3409)
        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:83)
        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:135)
        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:95)
        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:2016)
        at android.os.Handler.dispatchMessage(Handler.java:107)
        at android.os.Looper.loop(Looper.java:214)
        at android.app.ActivityThread.main(ActivityThread.java:7356)
        at java.lang.reflect.Method.invoke(Native Method)
        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:492)
        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:930)
2022-09-17 13:21:23.840 8137-8168/com.example.my_first_android_project W/OpenGLRenderer: Failed to choose config with EGL_SWAP_BEHAVIOR_PRESERVED, retrying without...
2022-09-17 13:21:23.923 8137-8168/com.example.my_first_android_project W/Gralloc3: mapper 3.x is not supported
```









# App开发基础

## App的运行环境

App是在手机上运行的一类应用软件，而应用软件依附于操作系统，无论电脑还是手机，刚开机都会显 示桌面，这个桌面便是操作系统的工作台。个人电脑的操作系统主要有微软的Windows和苹果的Mac OS，智能手机流行的操作系统也有两种，分别是安卓手机的Android和苹果手机的iOS。本书讲述的App 开发为Android上的应用开发，Android系统基于Linux内核，但不等于Linux系统，故App应用无法在 Linux系统上运行。



Android Studio是谷歌官方推出的App开发环境，它提供了三种操作系统的安装包，分别是Windows、 Mac和Linux。这就产生一个问题：开发者可以在电脑上安装Android Studio，并使用Android Studio开 发App项目，但是编译出来的App在电脑上跑不起来。这种情况真是令人匪夷所思的，通常学习C语言、 Java或者Python，都能在电脑的开发环境直接观看程序运行过程，就算是J2EE开发，也能在浏览器通过 网页观察程序的运行结果。可是安卓的App应用竟然没法在电脑上直接运行，那该怎样验证App的界面 展示及其业务逻辑是否正确呢？

* 为了提供App开发的功能测试环境，一种办法是利用Android Studio创建内置的模拟器，然后启动内置 模拟器，再在模拟器上运行App应用
* 另一种办法是使用真实手机测试App，该办法在实际开发中更为常见。由于模拟器本身跑在电脑上面， 占用电脑的CPU和内存，会拖累电脑的运行速度



利用真机调试要求具备以下**5个条件**：

1．**使用数据线把手机连到电脑上**

手机的电源线拔掉插头就是数据线。数据线长方形的一端接到电脑的USB接口，即可完成手机与电脑的 连接



2．**在电脑上安装手机的驱动程序**

一般电脑会把手机当作USB存储设备一样安装驱动，大多数情况会自动安装成功。如果遇到少数情况安 装失败，需要先安装手机助手，由助手软件下载并安装对应的手机驱动



3．**打开手机的开发者选项并启用USB调试**

手机出厂后默认关闭开发者选项，需要开启开发者选项才能调试App。打开手机的设置菜单，进入“系统” →“关于手机”→“版本信息”页面，这里有好几个版本项，每个版本项都使劲点击七、八下，总会有某个版 本点击后出现“你将开启开发者模式”的提示。继续点击该版本开启开发者模式，然后退出并重新进入设 置页面，此时就能在“系统”菜单下找到“开发者选项”或“开发人员选项”了。进入“开发者选项”页面，启用 “开发者选项”和“USB调试”两处开关，允许手机通过USB接口安装调试应用



4．**将连接的手机设为文件传输模式，并允许计算机进行USB调试**

手机通过USB数据线连接电脑后，请求选择某种USB连接方式。这里记得选中“传输文件”，因为充电模式不支持调试App。 选完之后手机桌面弹出确认窗口，提示开发者是否允许当前计算机进行USB调试。这里勾选“始终允许使用这台计算机进行调试”选项，再点击右下角的确定按钮，允许计算机在手机上调试App



5．手机要能正常使用

锁屏状态下，Android Studio向手机安装App的行为可能会被拦截，所以要保证手机处于解锁状态，才 能顺利通过电脑安装App到手机上。 有的手机还要求插入SIM卡才能调试App，还有的手机要求登录会员才能调试App，总之如果遇到无法安 装的问题，各种情况都尝试一遍才好。





## App的开发语言

基于安卓系统的App开发主要有两大技术路线，分别是**原生开发和混合开发**。原生开发指的是在移动平 台上利用官方提供的编程语言（例如Java、Kotlin等）、开发工具包（SDK）、开发环境（Android Studio）进行App开发；混合开发指的是结合原生与H5技术开发混合应用，也就是将部分App页面改成 内嵌的网页，这样无须升级App、只要覆盖服务器上的网页，即可动态更新App页面。



不管是原生开发还是混合开发，都要求掌握Android Studio的开发技能，因为混合开发本质上依赖于原生开发。单就原生开发而言，又涉及多种编程语 言，包括Java、Kotlin、C/C++、XML等



### Java

Java是Android开发的主要编程语言，在创建新项目时，弹出项目配置对话框，看见 Language栏默认选择了Java，表示该项目采用Java编码

虽然Android开发需要Java环境，但没要求电脑上必须事先安装JDK，因为Android Studio已经自带了 JRE

单击项目结构对话框左侧的SDK Location，对话框右边从上到下依次排列着“Android SDK location”、 “Android NDK location”、“JDK location”，其中下方的JDK location提示位于Android Studio安装路径的 JRE目录下，它正是Android Studio自带的Java运行环境



Android Studio自带的JRE使用的版本是11



```sh
PS C:\Program Files\Android Studio\jre\bin> ls


    目录: C:\Program Files\Android Studio\jre\bin


Mode                 LastWriteTime         Length Name
----                 -------------         ------ ----
d-----         2022/9/15     20:56                server
-a----         2022/7/11     15:34          30024 attach.dll
-a----         2022/7/11     15:33        1566536 awt.dll
-a----         2022/7/11     15:34          37192 dt_shmem.dll
-a----         2022/7/11     15:33          34632 dt_socket.dll
-a----         2022/7/11     15:34         670024 fontmanager.dll
-a----         2022/7/11     15:34         549192 freetype.dll
-a----         2022/7/11     15:33          51528 instrument.dll
-a----         2022/7/11     15:33          51528 j2gss.dll
-a----         2022/7/11     15:33          26952 j2pcsc.dll
-a----         2022/7/11     15:34          77640 j2pkcs11.dll
-a----         2022/7/11     15:33          29000 jaas.dll
-a----         2022/7/11     15:34          45896 jabswitch.exe
-a----         2022/7/11     15:34         111944 jaccessinspector.exe
-a----         2022/7/11     15:33          72008 jaccesswalker.exe
-a----         2022/7/11     15:34          25416 jaotc.exe
-a----         2022/7/11     15:33          23880 jar.exe
-a----         2022/7/11     15:33          23880 jarsigner.exe
-a----         2022/7/11     15:34         156488 java.dll
-a----         2022/7/11     15:33          33608 java.exe
-a----         2022/7/11     15:34         158024 javaaccessbridge.dll
-a----         2022/7/11     15:34          23880 javac.exe
-a----         2022/7/11     15:33          23880 javadoc.exe
-a----         2022/7/11     15:34         170824 javajpeg.dll
-a----         2022/7/11     15:34          23880 javap.exe
-a----         2022/7/11     15:34          33608 javaw.exe
-a----         2022/7/11     15:34          21832 jawt.dll
-a----         2022/7/11     15:33          23880 jdb.exe
-a----         2022/7/11     15:33          23880 jdeprscan.exe
-a----         2022/7/11     15:34          23880 jdeps.exe
-a----         2022/7/11     15:33         218440 jdwp.dll
-a----         2022/7/11     15:33          23880 jfr.exe
-a----         2022/7/11     15:33          23880 jhsdb.exe
-a----         2022/7/11     15:34          33608 jimage.dll
-a----         2022/7/11     15:33          23880 jimage.exe
-a----         2022/7/11     15:34          23880 jjs.exe
-a----         2022/7/11     15:34          87880 jli.dll
-a----         2022/7/11     15:33          23880 jlink.exe
-a----         2022/7/11     15:34          23880 jmod.exe
-a----         2022/7/11     15:33          23880 jrunscript.exe
-a----         2022/7/11     15:33          61768 jsound.dll
-a----         2022/7/11     15:34          23872 keytool.exe
-a----         2022/7/11     15:33          23880 kinit.exe
-a----         2022/7/11     15:33          23880 klist.exe
-a----         2022/7/11     15:34          23880 ktab.exe
-a----         2022/7/11     15:33         257864 lcms.dll
-a----         2022/7/11     15:34          36168 le.dll
-a----         2022/7/11     15:34          30024 management.dll
-a----         2022/7/11     15:33          24904 management_agent.dll
-a----         2022/7/11     15:33          36680 management_ext.dll
-a----         2022/7/11     15:34         515400 mlib_image.dll
-a----         2022/7/11     15:34         627528 msvcp140.dll
-a----         2022/7/11     15:33          96072 net.dll
-a----         2022/7/11     15:34          68424 nio.dll
-a----         2022/7/11     15:33          23880 pack200.exe
-a----         2022/7/11     15:34          25928 prefs.dll
-a----         2022/7/11     15:33          21320 rmi.dll
-a----         2022/7/11     15:34          23880 rmid.exe
-a----         2022/7/11     15:34          23880 rmiregistry.exe
-a----         2022/7/11     15:33          40776 saproc.dll
-a----         2022/7/11     15:34          23880 serialver.exe
-a----         2022/7/11     15:34         218440 splashscreen.dll
-a----         2022/7/11     15:33          44872 sspi_bridge.dll
-a----         2022/7/11     15:33         151880 sunec.dll
-a----         2022/7/11     15:33          89416 unpack.dll
-a----         2022/7/11     15:33         140616 unpack200.exe
-a----         2022/7/11     15:33          82248 vcruntime140.dll
-a----         2022/7/11     15:34          56648 verify.dll
-a----         2022/7/11     15:34          32072 w2k_lsa_auth.dll
-a----         2022/7/11     15:33         196936 windowsaccessbridge-64.dll
-a----         2022/7/11     15:33          86344 zip.dll


PS C:\Program Files\Android Studio\jre\bin> pwd

Path
----
C:\Program Files\Android Studio\jre\bin


PS C:\Program Files\Android Studio\jre\bin> ./java -version
openjdk version "11.0.12" 2021-07-20
OpenJDK Runtime Environment (build 11.0.12+7-b1504.28-7817840)
OpenJDK 64-Bit Server VM (build 11.0.12+7-b1504.28-7817840, mixed mode)
PS C:\Program Files\Android Studio\jre\bin>
```





### Kotlin

Kotlin是谷歌官方力推的又一种编程语言，它与Java同样基于JVM（Java Virtual Machine，即Java虚拟 机），且完全兼容Java语言。创建新项目时，在Language栏下拉可选择Kotlin

一旦在创建新项目时选定Kotlin，该项目就会自动加载Kotlin插件，并将Kotlin作为默认的编程语言





### C/C++

不管是Java还是Kotlin，它们都属于解释型语言，这类语言在运行之时才将程序翻译成机器语言，故而执 行效率偏低。虽然现在手机配置越来越高，大多数场景的App运行都很流畅，但是涉及图像与音视频处 理等复杂运算的场合，解释型语言的性能瓶颈便暴露出来



编译型语言在首次编译时就将代码编译为机器语言，后续运行无须重新编译，直接使用之前的编译文件 即可，因此执行效率比解释型语言高。C/C++正是编译型语言的代表，它能够有效弥补解释型语言的性 能缺憾，借助于JNI技术（Java Native Interface，即Java原生接口），Java代码允许调用C/C++编写的程 序。事实上，Android的SDK开发包内部定义了许多JNI接口，包括图像读写在内的底层代码均由 C/C++编写，再由外部通过封装好的Java方法调用





### XML

XML全称为Extensible Markup Language，即可扩展标记语言，严格地说，XML并非编程语言，只是一 种标记语言。它类似于HTML，利用各种标签表达页面元素，以及各元素之间的层级关系及其排列组 合。每个XML标签都是独立的控件对象，标签内部的属性以“android:”打头，表示这是标准的安卓属 性，各属性分别代表控件的某种规格。



```xml
<TextView
android:id="@+id/tv_hello"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!" />
```



上面的标签名称为TextView，翻译过来叫文本视图，该标签携带4个属性，说明如下：

* id：控件的编号
* layout_width：控件的布局宽度，wrap_content表示刚好包住该控件的内容
* layout_height：控件的布局高度，wrap_content表示刚好包住该控件的内容
* text：控件的文本，也就是文本视图要显示什么文字



综合起来，以上XML代码所表达的意思为：这是一个名为tv_hello的文本视图，显示的文字内容是“Hello World!”，它的宽度和高度都要刚好包住这些文字







## App连接的数据库

在学习Java编程的时候，基本会学到数据库操作，通过JDBC连接数据库进行记录的增删改查，这个数据 库可能是MySQL，也可能是Oracle，还可能是SQL Server。然而手机应用不能直接操作上述几种数据 库，因为数据库软件也得像应用软件那样安装到操作系统上，比如MySQL提供了Windows系统的安装 包，也提供了Linux系统的安装包，可是它没有提供Android系统的安装包呢，所以MySQL没法在 Android系统上安装，手机里面的App也就不能直连MySQL。



既然MySQL、Oracle这些企业数据库无法在手机安装，那么App怎样管理业务方面的数据记录呢？其实 Android早已内置了专门的数据库名为SQLite，它遵循关系数据库的设计理念，SQL语法类似于 MySQL。不同之处在于，SQLite无须单独安装，因为它内嵌到应用进程当中，所以App无须配置连接信 息，即可直接对其增删改查。由于SQLite嵌入到应用程序，省去了配置数据库服务器的开销，因此它又 被归类为嵌入式数据库。



可是SQLite的数据库文件保存在手机上，开发者拿不到用户的手机，又该如何获取App存储的业务数 据？比如用户的注册信息、用户的购物记录，等等。如果像Java Web那样，业务数据统一保存在后端的 数据库服务器，开发者只要登录数据库服务器，就能方便地查询导出需要的记录信息



手机端的App，连同程序代码及其内置的嵌入式数据库，其实是个又独立又完整的程序实体，它只负责 手机上的用户交互与信息处理，该实体被称作客户端。而后端的Java Web服务，包括Web代码和数据库 服务器，同样构成另一个单独运行的程序实体，它只负责后台的业务逻辑与数据库操作，该实体被称作 服务端。客户端与服务端之前通过HTTP接口通信，每当客户端觉得需要把信息发给服务端，或者需要从 服务端获取信息时，客户端便向服务端发起HTTP请求，服务端收到客户端的请求之后，根据规则完成数 据处理，并将处理结果返回给客户端。这样客户端经由HTTP接口并借服务端之手，方能间接读写后端的 数据库服务器（如MySQL）



![image-20220917141729775](img/Android学习笔记/image-20220917141729775.png)



由此看来，一个具备用户管理功能的App系统，实际上并不单单只是手机上的一个应用，还包括与其对 应的Java Web服务。手机里的客户端App，面向的是手机用户，App与用户之间通过手机屏幕交互；而 后端的服务程序，面向的是手机App，客户端与服务端之间通过HTTP接口交互。客



![image-20220917141816844](img/Android学习笔记/image-20220917141816844.png)







## App工程目录结构



![image-20220917142003638](img/Android学习笔记/image-20220917142003638.png)



![image-20220917142223433](img/Android学习笔记/image-20220917142223433.png)



App工程分为两个层次，第一个层次是项目，依次选择菜单File→New→New Project即可创建新项目。 另一个层次是模块，模块依附于项目，每个项目至少有一个模块，也能拥有多个模块，依次选择菜单 File→New→New Module即可在当前项目创建新模块。一般所言的“编译运行App”，指的是运行某个模 块，而非运行某个项目，因为模块才对应实际的App。



该项目下面有两个分类：一个是app（代表app模块）；另一个是Gradle Scripts。



![image-20220917142401137](img/Android学习笔记/image-20220917142401137.png)



其中，app下面又有3个子目录：

* manifests子目录，下面只有一个XML文件，即AndroidManifest.xml，它是App的运行配置文 件
* java子目录，下面有3个包，其中第一个包存放当前模块的Java源代码，后 面两个包存放测试用的Java代码
* res子目录，存放当前模块的资源文件。res下面又有4个子目录
  * drawable目录存放图形描述文件与图片文件
  * layout目录存放App页面的布局文件
  * mipmap目录存放App的启动图标
  * values目录存放一些常量定义文件，例如字符串常量strings.xml、像素常量dimens.xml、颜色常 量colors.xml、样式风格定义styles.xml等





Gradle Scripts下面主要是工程的编译配置文件，主要有：

* build.gradle，该文件分为项目级与模块级两种，用于描述App工程的编译规则
* proguard-rules.pro，该文件用于描述Java代码的混淆规则
* gradle.properties，该文件用于配置编译工程的命令行参数，一般无须改动
* settings.gradle，该文件配置了需要编译哪些模块。初始内容为include ':app'，表示只编译app模块
* local.properties，项目的本地配置文件，它在工程编译时自动生成，用于描述开发者电脑的环境 配置，包括SDK的本地路径、NDK的本地路径等





### 编译配置文件build.gradle

新创建的App项目默认有两个build.gradle，一个是Project项目级别的build.gradle；另一个是Module 模块级别的build.gradle



项目级别的build.gradle指定了当前项目的总体编译规则，打开该文件在buildscript下面找到 repositories和dependencies两个节点，其中repositories节点用于设置Android Studio插件的网络仓 库地址，而dependencies节点用于设置gradle插件的版本号。由于官方的谷歌仓库位于国外，下载速度 相对较慢，因此可在repositories节点添加阿里云的仓库地址，方便国内开发者下载相关插件。



```
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    //插件
    id 'com.android.application' version '7.2.2' apply false
    id 'com.android.library' version '7.2.2' apply false
}

//任务
task clean(type: Delete) {
    delete rootProject.buildDir
}
```





模块级别的build.gradle对应于具体模块，每个模块都有自己的build.gradle，它指定了当前模块的详细编译规则

```
//插件
plugins {
    id 'com.android.application'
}

android {
    // 指定编译用的SDK版本号
    compileSdk 32

    defaultConfig {
        // 指定该模块的应用编号，也就是App的包名
        applicationId "com.example.my_first_android_project"
        // 指定App适合运行的最小SDK版本号
        minSdk 25
        // 指定目标设备的SDK版本号。表示App最希望在哪个版本的Android上运行
        targetSdk 32
        // 指定App的应用版本号
        versionCode 1
        // 指定App的应用版本名称
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }
}

// 指定App编译的依赖信息
dependencies {

    // 指定引用jar包的路径
    //implementation fileTree(dir: 'libs', include: ['*.jar'])
    // 指定编译Android的高版本支持库
    implementation 'androidx.appcompat:appcompat:1.3.0'
    implementation 'com.google.android.material:material:1.4.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    // 指定单元测试编译用的junit版本号
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}
```





### AndroidManifest.xml

AndroidManifest.xml指定了App的运行配置信息，它是一个XML描述文件



```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="com.example.my_first_android_project">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.My_first_android_project"
        tools:targetApi="31">

        <!-- activity节点指定了该App拥有的活动页面信息，其中拥有android.intent.action.MAIN的activity说明它是入口页面 -->
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```



AndroidManifest.xml的根节点为manifest，它的package属性指定了该App的包名。manifest下面有个application节点，它的各属性说明如下：

* android:allowBackup，是否允许应用备份。允许用户备份系统应用和第三方应用的apk安装包和应用数据，以便在刷机或者数据丢失后恢复应用，用户即可通过adb backup和adb restore来进行对应用数据的备份和恢复。为true表示允许，为false则表示不允许。
* android:icon，指定App在手机屏幕上显示的图标
* android:label，指定App在手机屏幕上显示的名称。
* android:roundIcon，指定App的圆角图标。
* android:supportsRtl，是否支持阿拉伯语／波斯语这种从右往左的文字排列顺序。为true表示支持，为false则表示不支持。
* android:theme，指定App的显示风格。



application下面还有个activity节点，它是活动页面的注册声明，只有在AndroidManifest.xml中 正确配置了activity节点，才能在运行时访问对应的活动页面。初始配置的MainActivity正是App的默认 主页，之所以说该页面是App主页，是因为它的activity节点内部还配置了以下的过滤信息：

```xml
 <intent-filter>
         <action android:name="android.intent.action.MAIN" />
         <category android:name="android.intent.category.LAUNCHER" />
</intent-filter>
```

其中action节点设置的android.intent.action.MAIN表示该页面是App的入口页面，启动App时会最先打 开该页面。

而category节点设置的android.intent.category.LAUNCHER决定了是否在手机屏幕上显示 App图标，如果同时有两个activity节点内部都设置了android.intent.category.LAUNCHER，那么桌面就 会显示两个App图标







## App的设计规范

App将看得见的界面设计与看不见的代码逻辑区分开，然后 利用XML标记描绘应用界面，同时使用Java代码书写程序逻辑，从而形成App前后端分离的设计规约， 有利于提高App集成的灵活性



### 界面设计与代码逻辑

手机的功能越来越强大，某种意义上相当于微型电脑，比如打开一个电商App，仿佛是在电脑上浏览网 站。网站分为用户看得到的网页，以及用户看不到的Web后台；App也分为用户看得到的界面，以及用 户看不到的App后台。虽然Android允许使用Java代码描绘界面，但不提倡这么做，推荐的做法是将界面 设计从Java代码剥离出来，通过单独的XML文件定义界面布局



把界面设计与代码逻辑分开，不仅参考了网站的Web前后端分离，还有下列几点好处：

* 使用XML文件描述App界面，可以很方便地在Android Studio上预览界面效果。比如新创建的App 项目，默认首页布局为activity_main.xml，单击界面右上角的Design按钮，即可看到预览界面。如果XML文件修改了Hello World的文字内容，立刻就能在预览区域观看最新界面。倘若使用Java代码描 绘界面，那么必须运行App才能看到App界面
* 一个界面布局可以被多处代码复用，比如看图界面，既能通过商城购物代码浏览商品图片，也能通过商品评价代码浏览买家晒单
* 反过来，一段Java代码也可能适配多个界面布局，比如手机有竖屏与横屏两种模式，默认情况App采用同一套布局，然而在竖屏时很紧凑的界面布局，切换到横屏往往变得松垮乃至变形。鉴于竖屏与横屏遵照一样的业务逻辑，仅仅是屏幕方向不同，若要调整的话，只需分别给出竖屏时候的 界面布局，以及横屏时候的界面布局。因为用户多数习惯竖屏浏览，所以res/layout目录下放置的XML 文件默认为竖屏规格，另外在res下面新建名为layout-land的目录，用来存放横屏规格的XML文件。 land是landscape的缩写，意思是横向，Android把layout-land作为横屏XML的专用布局目录。然后在 layout-land目录创建与原XML同名的XML文件，并重新编排界面控件的展示方位，调整后的横屏界面，从而有效适配了屏幕的水平方向



![image-20220917191736913](img/Android学习笔记/image-20220917191736913.png)







### 利用XML标记描绘应用界面

```xml
<TextView
android:id="@+id/tv_hello"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!" />
```



TextView标签以“<”开头，以“/>”结尾，为何尾巴多了个斜杆呢？要是没有斜杆，以左右尖括号包 裹标签名称，岂不更好？其实这是XML的标记规范，凡是XML标签都由标签头与标签尾组成，标签头以 左右尖括号包裹标签名称，形如“”；标签尾在左尖括号后面插入斜杆，以此同标签头区分开，形如“”。标 签头允许在标签名称后面添加各种属性取值，而标签尾不允许添加任何属性，因此上述TextView标签的 完整XML定义是下面这样的：

```xml
<TextView
android:id="@+id/tv_hello"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Hello World!">
</TextView>
```

考虑到TextView仅仅是个文本视图，其标签头和标签尾之间不会插入其他标记，所以合并它的标签头和 标签尾，也就是让TextView标签以“/>”结尾，表示该标签到此为止

然而不是所有情况都能采取简化写法，简写只适用于TextView控件这种末梢节点。好比一棵大树，大树 先有树干，树干分岔出树枝，一些大树枝又分出小树枝，树枝再长出末端的树叶。一个界面也是先有根 节点（相当于树干），根节点下面挂着若干布局节点（相当于树枝），布局节点下面再挂着控件节点 （相当于树叶）。因为树叶已经是末梢了，不会再包含其他节点，所以末梢节点允许采用“/>”这种简写方式。



* 每个界面只有一个根节点，却可能有多个布局节点，也可能没有中间的布局节点，此时所有控件节点都挂在根节点下面
* 根节点必须配备“xmlns:android="http://schemas.android.com/apk/res/android"”，表示指定 XML内部的命名空间，有了这个命名空间，Android Studio会自动检查各节点的属性名称是否合法，如 果不合法就提示报错。至于布局节点就不能再指定命名空间





### 使用Java代码书写程序逻辑

在XML文件中定义界面布局，已经明确是可行的了，然而这只是静态界面，倘若要求在App运行时修改 文字内容，该当如何是好？倘若是动态变更网页内容，还能在HTML文件中嵌入JavaScript代码，由js片 段操作Web控件。但Android的XML文件仅仅是布局标记，不能再嵌入其他语言的代码了，也就是说， 只靠XML文件自身无法动态刷新某个控件



XML固然表达不了复杂的业务逻辑，这副重担就得交给App后台的Java代码了。Android Studio每次创 建新项目，除了生成默认的首页布局activity_main.xml之外，还会生成与其对应的代码文件 MainActivity.java

```java
package com.example.my_first_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: 调试日志");
        Log.i("MainActivity", "onCreate: 日志");
        Log.w("MainActivity", "onCreate: 警告日志", new RuntimeException());
        Log.e("MainActivity", "onCreate: 错误日志", new RuntimeException());
    }
}
```



可见MainActivity.java的代码内容很简单，只有一个MainActivity类，该类下面只有一个onCreate方 法。注意onCreate内部的setContentView方法直接引用了布局文件的名字activity_main，该方法的意 思是往当前活动界面填充activity_main.xml的布局内容。现在准备在这里改动，把文字内容改成中文。 首先打开activity_main.xml，在TextView节点下方补充一行android:id="@+id/tv_hello"，表示给它起 个名字编号；然后回到MainActivity.java，在setContentView方法下面补充几行代码

```xml
    <TextView
            android:id="@+id/tv_hello"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.55" />
```



```java
package com.example.my_first_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: 调试日志");
        Log.i("MainActivity", "onCreate: 日志");
        Log.w("MainActivity", "onCreate: 警告日志", new RuntimeException());
        Log.e("MainActivity", "onCreate: 错误日志", new RuntimeException());

        TextView TextView = this.findViewById(R.id.tv_hello);
        TextView.setText("你好，世界！");
    }
}
```



新增的两行代码主要做了这些事情：先调用findViewById方法，从布局文件中取出名为tv_hello的 TextView控件；再调用控件对象的setText方法，为其设置新的文字内容



![image-20220917193119074](img/Android学习笔记/image-20220917193119074.png)





## App的活动页面

### 创建新的App页面

#### **1．创建XML文件**

在Android Studio左上方找到项目结构图，右击res目录下面的layout，弹出右键菜单



![image-20220917193548334](img/Android学习笔记/image-20220917193548334.png)



![image-20220917193618147](img/Android学习笔记/image-20220917193618147.png)



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

</LinearLayout>
```





#### **2．创建Java代码**

同样在Android Studio左上方找到项目结构图，右击java目录下面的包名，弹出右键菜单



![image-20220917193901980](img/Android学习笔记/image-20220917193901980.png)



![image-20220917193918049](img/Android学习笔记/image-20220917193918049.png)





```java
package com.example.my_first_android_project;


import android.os.Bundle;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Project name(项目名称)：my_first_android_project
 * Package(包名): com.example.my_first_android_project
 * Class(类名): Main2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/17
 * Time(创建时间)： 19:39
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Main2 extends AppCompatActivity
{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
    }
}
```





#### **3．注册页面配置**

创建好了页面的XML文件及其Java代码，还得在项目中注册该页面，打开AndroidManifest.xml，在 application节点内部补充如下一行配置：

```xml
<activity android:name=".Main2">

</activity>
```

添加了上面这行配置，表示给该页面注册身份，否则App运行时打开页面会提示错误“activity not found”。如果activity的标记头与标记尾中间没有其他内容





### 快速生成页面源码

经过创建XML文件、创建Java代码、注册页面配置3个步骤，就算创建好了一个新页面，没想到 区区一个页面也这么费事，怎样才能提高开发效率呢？其实Android Studio早已集成了快速创建页面的 功能，只要一个对话框就能完成所有操作



右键菜单中依次选择New→Activity→Empty Activity

![image-20220917195154902](img/Android学习笔记/image-20220917195154902.png)





![image-20220917195302587](img/Android学习笔记/image-20220917195302587.png)



回到Android Studio左上方的项目结构图，发现res的layout目录下多了个activity_main3.xml，同时 java目录下多了个MainActivity3，并且MainActivity3代码已经设定了加载activity_main3布局。接着打开AndroidManifest.xml，找到application节点发现多了下面这行配置：

```xml
<activity
android:name=".MainActivity3"
android:exported="false" />
```







### 跳到另一个页面

一旦创建好新页面，就得在合适的时候跳到该页面，假设出发页面为A，到达页面为B，那么跳转动作是 从A跳到B。由于启动App会自动打开默认主页MainActivity，因此跳跃的起点理所当然在MainActivity， 跳跃的终点则为目标页面的Activity。这种跳转动作翻译为Android代码，格式形如“startActivity(new Intent(源页面.this, 目标页面.class));”。如果目标页面名为MainActivity3，跳转代码便是下面这样的：

```java
// 活动页面跳转，从MainActivity跳到MainActivity3
startActivity(new Intent(MainActivity.this, MainActivity3.class));
```



因为跳转动作通常发生在当前页面，也就是从当前页面跳到其他页面，所以不产生歧义的话，可以使用 this指代当前页面



activity_main.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:id="@+id/tv_hello"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.55" />

    <Button
            android:id="@+id/button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="点击跳转到第二个页面"
            tools:ignore="MissingConstraints" />

    <Button
            android:id="@+id/button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="点击跳转到第三个页面"
            tools:ignore="MissingConstraints"
            tools:layout_editor_absoluteY="62dp"
            tools:layout_editor_absoluteX="0dp" />


</LinearLayout>
```



layout2.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:background="#cccccc">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#ff00ff00"
            android:textSize="36sp"
            android:text="第二个页面"/>

</LinearLayout>
```



activity_main3.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity3"
        android:gravity="center"
        android:background="#222222">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#ff00ff"
            android:textSize="36sp"
            android:text="第三个页面" />

</LinearLayout>
```



MainActivity

```java
package com.example.my_first_android_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate: 调试日志");
        Log.i("MainActivity", "onCreate: 日志");
        Log.w("MainActivity", "onCreate: 警告日志", new RuntimeException());
        Log.e("MainActivity", "onCreate: 错误日志", new RuntimeException());

        TextView TextView = this.findViewById(R.id.tv_hello);
        TextView.setText("你好，世界！");

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, Main2.class));
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });

    }


}
```





运行：

![image-20220917203805364](img/Android学习笔记/image-20220917203805364.png)



![image-20220917203815653](img/Android学习笔记/image-20220917203815653.png)



![image-20220917203825162](img/Android学习笔记/image-20220917203825162.png)













# 简单控件

## 文本显示

### 设置文本的内容

方式一：通过属性android:text设置文本



```xml
    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="通过属性android:text设置文本"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />
```



方式二：在Java代码中调用文本视图对象的setText方法设置文本



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="通过属性android:text设置文本"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

    <TextView
            android:id="@+id/test"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#ff0000"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

</LinearLayout>
```



```java
package mao.android_set_text_content;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.test);
        textView.setText("在Java代码中调用文本视图对象的setText方法设置文本");
    }
}
```





![image-20220917210611958](img/Android学习笔记/image-20220917210611958.png)



意思说这几个字是硬 编码的字符串，建议使用来自@string的资源。Android Studio不推荐在XML布局文件里直接写字符串，因为可能有好几个页面都显示“a”，若想把这句话换成“b”，就得一个一个XML 文件改过去，无疑费时费力。故而Android Studio推荐把字符串放到专门的地方管理，这个名为@string 的地方位于res/values目录下的strings.xml



```xml
<resources>
    <string name="app_name">android_set_text_content</string>
    <string name="text">来自strings.xml的文本</string>
</resources>
```



添加完新的字符串定义，回到XML布局文件，将android:text属性值改为“@string/字符串名”



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="通过属性android:text设置文本"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

    <TextView
            android:id="@+id/test"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#ff0000"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/text"
            android:textColor="#5fffff"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />
</LinearLayout>
```





若要在Java代码中引用字符串资源，则调用setText方法时填写形如“R.string.字符串名”的参数



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="通过属性android:text设置文本"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

    <TextView
            android:id="@+id/test"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#ff0000"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/text"
            android:textColor="#5fffff"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />

    <TextView
            android:id="@+id/text2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#5fccfc"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textSize="20sp" />
</LinearLayout>
```



```java
package mao.android_set_text_content;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.test);
        textView.setText("在Java代码中调用文本视图对象的setText方法设置文本");

        TextView textView2 = findViewById(R.id.text2);
        textView2.setText(R.string.text);
    }
}
```



运行：

![image-20220917211413888](img/Android学习笔记/image-20220917211413888.png)







### 设置文本的大小

TextView允许设置文本内容，也允许设置文本大小，在Java代码中调用setTextSize方法，即可指定文本大小

这里的大小数值越大，则看到的文本也越大；大小数值越小，则看到的文本也越小。在XML文件中则通 过属性android:textSize指定文本大小

文本大小存在不同的字号单位，XML文件要求在字号数字后面写明单位类型，常见的字号单位主要 有px、dp、sp 3种



#### px

px是手机屏幕的最小显示单位，它与设备的显示屏有关。一般来说，同样尺寸的屏幕（比如6英寸手 机），如果看起来越清晰，则表示像素密度越高，以px计量的分辨率也越大



#### dp

dp有时也写作dip，指的是与设备无关的显示单位，它只与屏幕的尺寸有关。一般来说，同样尺寸的屏 幕以dp计量的分辨率是相同的，比如同样是6英寸手机，无论它由哪个厂家生产，其分辨率换算成dp单位都是一个大小



#### sp

sp的原理跟dp差不多，但它专门用来设置字体大小。手机在系统设置里可以调整字体的大小（小、标 准、大、超大）。设置普通字体时，同数值dp和sp的文字看起来一样大；如果设置为大字体，用dp设置 的文字没有变化，用sp设置的文字就变大了。 字体大小采用不同单位的话，显示的文字大小各不相同。例如，30px、30dp、30sp这3个字号，在不同 手机上的显示大小有所差异。有的手机像素密度较低，一个dp相当于两个px，此时30px等同于15dp； 有的手机像素密度较高，一个dp相当于3个px，此时30px等同于10dp。假设某个App的内部文本使用字 号30px，则该App安装到前一部手机的字体大小为15dp，安装到后一部手机的字体大小为10dp，显然 后一部手机显示的文本会更小。





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:gravity="center"
        android:padding="5dp"
        android:orientation="vertical">

    <TextView
            android:id="@+id/tv_px"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="你好，世界（px大小）"
            android:textSize="30px" />

    <TextView
            android:id="@+id/tv_dp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="你好，世界（dp大小）"
            android:textSize="30dp" />

    <TextView
            android:id="@+id/tv_sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="你好，世界（sp大小）"
            android:textSize="30sp" />


</LinearLayout>
```





![image-20220917213210015](img/Android学习笔记/image-20220917213210015.png)



接着打开手机的设置菜单，依次选择“显示”→“字体与显示大小” 调整字体大小



![image-20220917213330373](img/Android学习笔记/image-20220917213330373.png)



![image-20220917213356649](img/Android学习笔记/image-20220917213356649.png)



发现字号单位30px和30dp的文字大小不变，而30sp的文字随着系统字体一起变大了



纯数字的setTextSize方法，内部默认字号单位为sp（COMPLEX_UNIT_SP）





| 名称 | 解释 |
| ---- | ---- |
|px（Pixel像素）|也称为图像元素，是作为图像构成的基本单元，单个像素的大小并不固定，跟随屏幕大小和素数量的关系变化，一个像素点为1px。|
|Resolution（分辨率）|是指屏幕的垂直和水平方向的像素数量，如果分辨率是 1920*1080 ，那是垂直方向有 1920 个像素，水平方向有 1080 个像素。|
|Dpi（像素密度） |是指屏幕上每英寸（1英寸 = 2.54 厘米）距离中有多少个像素点。|
|Density（密度） |是指屏幕上每平方英寸（2.54 ^ 2 平方厘米）中含有的像素点数量。|
|Dip / dp (设备独立像素)|也可以叫做dp，长度单位，同一个单位在不同的设备上有不同的显示效果，具体效果根据设备的密度有关，|





#### 计算规则

以一个 4.95 英寸 1920 * 1080 的 nexus5 手机设备为例

**Dpi :**

1. 计算直角边像素数量： 1920^2+1080^2=2202^2（勾股定理）。 

2. 计算 DPI：2202 / 4.95 = 445。 
3. 得到这个设备的 DPI 为 445 （每英寸的距离中有 445 个像素）。



**Density：**

上面得到每英寸中有 445 像素，那么 density 为每平方英寸中的像素数量，应该为： 445^2=198025



**Dip：**

所有显示到屏幕上的图像都是以 px 为单位，Dip 是我们开发中使用的长度单位，最后他也需要转换成 px，计算这个设备上 1dip 等于多少 px：

**px = dip x dpi /160**

320 x 480分辨率，3.6寸的手机：dpi为160，1dp=1px





* **对于相同分辨率的手机，屏幕越大，同DP的组件占用屏幕比例越小**
* **对于相同尺寸的手机，即使分辨率不同，同DP的组件占用屏幕比例也相同**



dp的UI效果只在相同尺寸的屏幕上相同，如果屏幕尺寸差异过大，则需要重做dp适配





```xml
<TextView
        android:id="@+id/tv_sp2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="你好，世界（sp大小）"
        android:textSize="30sp" />
```

```java
package mao.android_set_text_size;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tv_sp2);
        textView.setTextSize(28);
    }
}
```



源码

```java
/**
 * Set the default text size to the given value, interpreted as "scaled
 * pixel" units.  This size is adjusted based on the current density and
 * user font size preference.
 *
 * <p>Note: if this TextView has the auto-size feature enabled than this function is no-op.
 *
 * @param size The scaled pixel size.
 *
 * @attr ref android.R.styleable#TextView_textSize
 */
@android.view.RemotableViewMethod
public void setTextSize(float size) {
    setTextSize(TypedValue.COMPLEX_UNIT_SP, size);
}
```



![image-20220917220128390](img/Android学习笔记/image-20220917220128390.png)









### 设置文本的颜色

除了设置文字大小，文字颜色也经常需要修改，毕竟Android默认的灰色文字不够醒目。在Java代码中调 用setTextColor方法即可设置文本颜色，具体在Color类中定义了12种颜色



![image-20220918103922626](img/Android学习笔记/image-20220918103922626.png)



```java
package mao.android_set_text_color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.t1);
        textView1.setTextColor(Color.RED);
        textView1.setTextSize(30);
    }
}
```



可是XML文件无法引用Color类的颜色常量，为此Android制定了一套规范的编码标准，将色值交由透明 度alpha和RGB三原色（红色red、绿色green、蓝色blue）联合定义。该标准又有八位十六进制数与六 位十六进制数两种表达方式，例如八位编码FFEEDDCC中，FF表示透明度，EE表示红色的浓度，DD表示 绿色的浓度，CC表示蓝色的浓度。透明度为FF表示完全不透明，为00表示完全透明。RGB三色的数值越 大，表示颜色越浓，也就越暗；数值越小，表示颜色越淡，也就越亮。RGB亮到极致就是白色，暗到极 致就是黑色。



至于六位十六进制编码，则有两种情况，它在XML文件中默认不透明（等价于透明度为FF），而在代码 中默认透明（等价于透明度为00）。以下代码给两个文本视图分别设置六位色值与八位色值，注意添加 0x前缀表示十六进制数



```java
package mao.android_set_text_color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.t1);
        textView1.setTextColor(Color.RED);
        textView1.setTextSize(30);
        TextView textView3 = findViewById(R.id.t3);
        textView3.setTextColor(0xffffff);
    }
}
```



运行测试App，发现控件的文本不见了，其实是变透明了



在XML文件中可通过属性android:textColor设置文字颜色，但要给色值添加井号前缀“#”，设定好文本颜色



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#cc00aa">

    <TextView
            android:id="@+id/t1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World2!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textColor="#ffffff"/>

    <TextView
            android:id="@+id/t3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World3!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />


</LinearLayout>
```



就像字符串资源那样，Android把颜色也当作一种资源，打开res/values目录下的colors.xml



```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```



然后回到XML布局文件，把android:textColor的属性值改为“@color/颜色名称”



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#cc00aa">

    <TextView
            android:id="@+id/t1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World2!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textColor="#ffffff"/>

    <TextView
            android:id="@+id/t3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World3!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World4!"
            android:textColor="@color/purple_200"
            android:textSize="24sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

</LinearLayout>
```





不仅文字颜色，还有背景颜色也会用到上述的色值定义，在XML文件中通过属性android:background设 置控件的背景颜色。Java代码则有两种方式设置背景颜色，倘若色值来源于Color类或十六进制数，则调 用setBackgroundColor方法设置背景；倘若色值来源于colors.xml中的颜色资源，则调用 setBackgroundResource方法，以“R.color.颜色名称”的格式设置背景。



```java
package mao.android_set_text_color;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.t1);
        textView1.setTextColor(Color.RED);
        textView1.setTextSize(30);
        TextView textView3 = findViewById(R.id.t3);
        textView3.setTextColor(0xffffff);
        TextView textView5 = findViewById(R.id.t5);
        textView5.setTextColor(R.color.teal_200);
    }
}
```



注意属性android:background和setBackgroundResource方法，它俩用来设置控件的背景，不单单是 背景颜色，还包括背景图片。在设置背景图片之前，先将图片文件放到res/drawable***目录（以 drawable开头的目录，不仅仅是drawable目录），然后把android:background的属性值改为 “@drawable/不含扩展名的图片名称”，或者调用setBackgroundResource方法填入“R.drawable.不含扩 展名的图片名称”。





Color类还有很多方法



![image-20220918105753912](img/Android学习笔记/image-20220918105753912.png)



![image-20220918105814990](img/Android学习笔记/image-20220918105814990.png)



![image-20220918105830889](img/Android学习笔记/image-20220918105830889.png)



![image-20220918105903213](img/Android学习笔记/image-20220918105903213.png)



![image-20220918105922815](img/Android学习笔记/image-20220918105922815.png)





```java
package mao.android_set_text_color;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.t1);
        textView1.setTextColor(Color.RED);
        textView1.setTextSize(30);
        TextView textView3 = findViewById(R.id.t3);
        textView3.setTextColor(0xffffff);
        TextView textView5 = findViewById(R.id.t5);
        textView5.setTextColor(R.color.teal_200);
        TextView textView6 = findViewById(R.id.t6);
        //从红色、绿色、蓝色分量返回一个 color-int。
        // alpha 分量隐式为 255（完全不透明）。
        // 这些组件值应该是\([0..255]\)，但是没有执行范围检查，
        // 所以如果它们超出范围，则返回的颜色是未定义的
        textView6.setTextColor(Color.rgb(0,255,0));
    }
}
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#cc00aa">

    <TextView
            android:id="@+id/t1"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t2"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World2!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            android:textColor="#ffffff"/>

    <TextView
            android:id="@+id/t3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World3!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t4"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World4!"
            android:textColor="@color/purple_200"
            android:textSize="24sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t5"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World5!"
            android:textSize="24sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

    <TextView
            android:id="@+id/t6"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World6!"
            android:textSize="24sp"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />
</LinearLayout>
```





![image-20220918110208896](img/Android学习笔记/image-20220918110208896.png)









## 视图基础

### 设置视图的宽高

手机屏幕是块长方形区域，较短的那条边叫作宽，较长的那条边叫作高。App控件通常也是长方形状， 控件宽度通过属性android:layout_width表达，控件高度通过属性android:layout_height表达，宽高的 取值主要有下列3种：

* match_parent：表示与上级视图保持一致。上级视图的尺寸有多大，当前视图的尺寸就有多大。
* wrap_content：表示与内容自适应。对于文本视图来说，内部文字需要多大的显示空间，当前视 图就要占据多大的尺寸。但最宽不能超过上级视图的宽度，一旦超过就要换行；最高不能超过上级视图 的高度，一旦超过就会隐藏。

* 以dp为单位的具体尺寸，比如300dp，表示宽度或者高度就是这么大。



在XML文件中采用以上任一方式均可设置视图的宽高，但在Java代码中设置宽高就有点复杂了，首先确 保XML中的宽高属性值为wrap_content，这样才允许在代码中修改宽高。接着打开该页面对应的Java代 码，依序执行以下3个步骤：

* 步骤一，调用控件对象的getLayoutParams方法，获取该控件的布局参数，参数类型为 ViewGroup.LayoutParams
* 步骤二，布局参数的width属性表示宽度，height属性表示高度，修改这两个属性值，即可调整控件的宽高
* 步骤三，调用控件对象的setLayoutParams方法，填入修改后的布局参数使之生效

不过布局参数的width和height两个数值默认是px单位，需要将dp单位的数值转换为px单位的数值，然后才能赋值给width属性和height属性。



```java
package mao.android_set_width_and_height_of_the_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.t1);
        ViewGroup.LayoutParams layoutParams = textView1.getLayoutParams();
        layoutParams.height = dip2px(this, 50);
        layoutParams.width = dip2px(this, 200);
        textView1.setLayoutParams(layoutParams);
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context 上下文
     * @param dpValue dp值
     * @return int
     */
    public static int dip2px(Context context, float dpValue)
    {
        // 获取当前手机的像素密度（1个dp对应几个px）
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f); // 四舍五入取整
    }

}
```







```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#333333">

    <TextView
            android:id="@+id/t1"
            android:background="@color/purple_200"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Hello World!"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toTopOf="parent" />


    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:background="#00ffff"
            android:text="视图宽度采用wrap_content定义"
            android:textColor="#000000"
            android:textSize="17sp" />

    <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:background="#00ffff"
            android:text="视图宽度采用match_parent定义"
            android:textColor="#000000"
            android:textSize="17sp" />

    <TextView
            android:layout_width="300dp"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:background="#00ffff"
            android:text="视图宽度采用固定大小"
            android:textColor="#000000"
            android:textSize="17sp" />

</LinearLayout>
```



![image-20220918112230262](img/Android学习笔记/image-20220918112230262.png)







### 设置视图的间距

* android:layout_marginTop="5dp"，该属性的作用是让当前视图与上方间隔一段距离
* android:layout_marginLeft让当前视图与左边间隔一段距离
* android:layout_marginRight让当前视图与右边间隔一段距离
* android:layout_marginBottom让当前视图与下方间隔一段距离
* 如果上下左右 都间隔同样的距离，还能使用android:layout_margin一次性设置四周的间距



layout_margin不单单用于文本视图，还可用于所有视图，包括各类布局和各类控件。因为不管布局还 是控件，它们统统由视图基类View派生而来，而layout_margin正是View的一个通用属性，所以View的 子子孙孙都能使用layout_margin。在View的大家族中，视图组ViewGroup尤为特殊，它既是View的子 类，又是各类布局的基类。布局下面能容纳其他视图，而控件却不行，这正源自ViewGroup的组装特性。



除了layout_margin之外，padding也是View的一个通用属性，它用来设置视图的内部间距，并且 padding也提供了paddingTop、paddingBottom、paddingLeft、paddingRight四个方向的距离属性。 同样是设置间距，layout_margin指的是当前视图与外部视图（包括上级视图和平级视图）之间的距 离，而padding指的是当前视图与内部视图（包括下级视图和内部文本）之间的距离



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:background="@color/purple_200"
        tools:context=".MainActivity"
        android:orientation="vertical">

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_margin="20dp"
            android:background="@color/design_default_color_secondary"
            android:padding="30dp">

        <View
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@color/design_default_color_error" />

    </LinearLayout>

</LinearLayout>
```



![image-20220918115335207](img/Android学习笔记/image-20220918115335207.png)









### 设置视图的对齐方式

App界面上的视图排列，默认靠左朝上对齐，这也符合日常的书写格式。然而页面的排版不是一成不变 的，有时出于美观或者其他原因，要将视图排列改为朝下或靠右对齐，为此需要另外指定视图的对齐方 式。在XML文件中通过属性android:layout_gravity可以指定当前视图的对齐方向，当属性值为top时表 示视图朝上对齐，为bottom时表示视图朝下对齐，为left时表示视图靠左对齐，为right时表示视图靠右 对齐。如果希望视图既朝上又靠左，则用竖线连接top与left，此时属性标记为 android:layout_gravity="top|left"；如果希望视图既朝下又靠右，则用竖线连接bottom与right，此时属性标记为android:layout_gravity="bottom|right"。



注意layout_gravity规定的对齐方式，指的是当前视图往上级视图的哪个方向对齐，并非当前视图的内部 对齐。若想设置内部视图的对齐方向，则需由当前视图的android:gravity指定，该属性一样拥有top、 bottom、left、right 4种取值及其组合。它与layout_gravity的不同之处在于：layout_gravity设定了当 前视图相对于上级视图的对齐方式，而gravity设定了下级视图相对于当前视图的对齐方式；前者决定了 当前视图的位置，而后者决定了下级视图的位置。





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:background="@color/cardview_dark_background"
        android:orientation="horizontal">


    <LinearLayout
            android:layout_width="0dp"
            android:layout_height="400dp"
            android:layout_weight="1"
            android:background="@color/purple_200"
            android:layout_margin="30dp"
            android:padding="10dp"
            android:layout_gravity="bottom"
            android:gravity="right">


        <View
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:background="@color/design_default_color_error" />

    </LinearLayout>

    <LinearLayout
            android:layout_width="0dp"
            android:layout_height="400dp"
            android:layout_weight="1"
            android:background="@color/purple_200"
            android:layout_margin="30dp"
            android:padding="10dp"
            android:gravity="bottom|left">

        <View
                android:layout_width="80dp"
                android:layout_height="100dp"
                android:background="@color/design_default_color_error" />

    </LinearLayout>

</LinearLayout>
```



![image-20220918131311587](img/Android学习笔记/image-20220918131311587.png)







## 常用布局

### 线性布局LinearLayout

线性布局 像是用一根线把它的内部视图串起来，故而内部视图之间的排列顺序是固定的，要么从左到右排列，要 么从上到下排列。在XML文件中，LinearLayout通过属性android:orientation区分两种方向，其中从左 到右排列叫作水平方向，属性值为horizontal；从上到下排列叫作垂直方向，属性值为vertical。如果 LinearLayout标签不指定具体方向，则系统默认该布局为水平方向排列，也就是默认 android:orientation="horizontal"



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical">

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginBottom="10dp"
            android:padding="10dp"
            android:background="@color/cardview_dark_background">

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="1" />

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="2" />

    </LinearLayout>

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_marginTop="10dp"
            android:padding="10dp"
            android:background="#223333">

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="3" />

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="4" />

    </LinearLayout>


</LinearLayout>
```



![image-20220918134709858](img/Android学习笔记/image-20220918134709858.png)





除了方向之外，线性布局还有一个权重概念，所谓权重，指的是线性布局的下级视图各自拥有多大比例 的宽高。比如一块蛋糕分给两个人吃，可能两人平均分，也可能甲分三分之一，乙分三分之二。两人平 均分的话，先把蛋糕切两半，然后甲分到一半，乙分到另一半，此时甲乙的权重比为1:1。甲分三分之 一、乙分三分之二的话，先把蛋糕平均切成三块，然后甲分到一块，乙分到两块，此时甲乙的权重比为 1:2。就线性布局而言，它自身的尺寸相当于一整块蛋糕，它的下级视图们一起来分这个尺寸蛋糕，有的 视图分得多，有的视图分得少。分多分少全凭每个视图分到了多大的权重，这个权重在XML文件中通过 属性android:layout_weight来表达

把线性布局看作蛋糕的话，分蛋糕的甲乙两人就相当于线性布局的下级视图。假设线性布局平均分为左 右两块，则甲视图和乙视图的权重比为1:1，意味着两个下级视图的layout_weight属性都是1。不过视图 有宽高两个方向，系统怎知layout_weight表示哪个方向的权重呢？所以这里有个规定，一旦设置了 layout_weight属性值，便要求layout_width填0dp或者layout_height填0dp。如果layout_width填 0dp，则layout_weight表示水平方向的权重，下级视图会从左往右分割线性布局；如果layout_height填 0dp，则layout_weight表示垂直方向的权重，下级视图会从上往下分割线性布局





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical">

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginBottom="10dp"
            android:padding="10dp"
            android:background="@color/cardview_dark_background">

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="1" />

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="2" />

    </LinearLayout>

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_marginTop="10dp"
            android:padding="10dp"
            android:background="#223333">

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="3" />

        <TextView
                android:layout_width="100dp"
                android:layout_height="30dp"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="4" />

    </LinearLayout>

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginTop="10dp"
            android:layout_marginBottom="10dp"
            android:padding="10dp"
            android:background="@color/cardview_dark_background">

        <TextView
                android:layout_width="0dp"
                android:layout_weight="1"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="5" />

        <TextView
                android:layout_width="0dp"
                android:layout_height="30dp"
                android:layout_weight="1"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="6" />

    </LinearLayout>

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginBottom="10dp"
            android:padding="10dp"
            android:background="@color/cardview_dark_background">

        <TextView
                android:layout_width="0dp"
                android:layout_weight="2"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="7" />

        <TextView
                android:layout_width="0dp"
                android:layout_height="30dp"
                android:layout_weight="1"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="8" />

    </LinearLayout>

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_marginBottom="10dp"
            android:padding="10dp"
            android:background="@color/cardview_dark_background">

        <TextView
                android:layout_width="0dp"
                android:layout_weight="2"
                android:layout_height="30dp"
                android:background="@color/design_default_color_primary"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="9" />

        <TextView
                android:layout_width="0dp"
                android:layout_height="30dp"
                android:layout_weight="3"
                android:background="@color/purple_200"
                android:gravity="center"
                android:textSize="24sp"
                android:textColor="@color/design_default_color_error"
                android:text="10" />

    </LinearLayout>


    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal"
            android:padding="10dp"
            android:background="#dddddd">

        <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:orientation="vertical"
                android:layout_marginRight="10dp"
                android:padding="10dp"
                android:background="#223333">

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="1"
                    android:layout_height="0dp"
                    android:background="@color/design_default_color_primary"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="11" />

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="1"
                    android:layout_height="0dp"
                    android:background="@color/purple_200"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="12" />

        </LinearLayout>

        <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:orientation="vertical"
                android:layout_marginRight="10dp"
                android:padding="10dp"
                android:background="#223333">

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="1"
                    android:layout_height="0dp"
                    android:background="@color/design_default_color_primary"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="13" />

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="2"
                    android:layout_height="0dp"
                    android:background="@color/purple_200"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="14" />

        </LinearLayout>

        <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:orientation="vertical"
                android:layout_marginRight="10dp"
                android:padding="10dp"
                android:background="#223333">

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="2"
                    android:layout_height="0dp"
                    android:background="@color/design_default_color_primary"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="15" />

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="1"
                    android:layout_height="0dp"
                    android:background="@color/purple_200"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="16" />

        </LinearLayout>

        <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:orientation="vertical"
                android:layout_marginRight="10dp"
                android:padding="10dp"
                android:background="#223333">

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="2"
                    android:layout_height="0dp"
                    android:background="@color/design_default_color_primary"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="17" />

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="3"
                    android:layout_height="0dp"
                    android:background="@color/purple_200"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="18" />

        </LinearLayout>

        <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:orientation="vertical"
                android:layout_marginRight="10dp"
                android:padding="10dp"
                android:background="#223333">

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="5"
                    android:layout_height="0dp"
                    android:background="@color/design_default_color_primary"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="17" />

            <TextView
                    android:layout_width="40dp"
                    android:layout_weight="1"
                    android:layout_height="0dp"
                    android:background="@color/purple_200"
                    android:gravity="center"
                    android:textSize="24sp"
                    android:textColor="@color/design_default_color_error"
                    android:text="18" />

        </LinearLayout>

    </LinearLayout>

</LinearLayout>
```



![image-20220918140019806](img/Android学习笔记/image-20220918140019806.png)







### 相对布局RelativeLayout

线性布局的下级视图是顺序排列着的，另一种相对布局的下级视图位置则由其他视图决定。相对布局名 为RelativeLayout，因为下级视图的位置是相对位置，所以得有具体的参照物才能确定最终位置。如果 不设定下级视图的参照物，那么下级视图默认显示在RelativeLayout内部的左上角

用于确定下级视图位置的参照物分两种，一种是与该视图自身平级的视图；另一种是该视图的上级视图 （也就是它归属的RelativeLayout）



![image-20220918201727061](img/Android学习笔记/image-20220918201727061.png)





```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        android:background="#dddddd"
        tools:context=".MainActivity">

    <TextView
            android:id="@+id/center"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在中间"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_centerInParent="true" />

    <TextView
            android:id="@+id/center_horizontal"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在水平中间"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_centerHorizontal="true" />

    <TextView
            android:id="@+id/center_vertical"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在垂直中间"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_centerVertical="true" />

    <TextView
            android:id="@+id/parent_left"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我跟上级左边对齐"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_alignParentLeft="true" />

    <TextView
            android:id="@+id/parent_right"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我跟上级右边对齐"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_alignParentRight="true" />

    <TextView
            android:id="@+id/parent_top"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我跟上级顶部对齐"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_alignParentTop="true" />

    <TextView
            android:id="@+id/parent_bottom"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我跟上级底部对齐"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_alignParentBottom="true" />

    <TextView
            android:id="@+id/left_center"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在中间左边"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_toLeftOf="@id/center"
            android:layout_alignTop="@id/center" />

    <TextView
            android:id="@+id/right_center"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在中间右边"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_toRightOf="@id/center"
            android:layout_alignTop="@id/center" />

    <TextView
            android:id="@+id/top_center"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在中间上面"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_above="@id/center"
            android:layout_alignLeft="@id/center" />

    <TextView
            android:id="@+id/bottom_center"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="#cccccc"
            android:text="我在中间下面"
            android:textSize="16sp"
            android:textColor="@color/purple_200"
            android:layout_below="@id/center"
            android:layout_alignRight="@id/center" />


</RelativeLayout>
```





![image-20220918203912867](img/Android学习笔记/image-20220918203912867.png)





![image-20220918203932767](img/Android学习笔记/image-20220918203932767.png)









### 网格布局GridLayout

虽然线性布局既能在水平方向排列，也能在垂直方向排列，但它不支持多行多列的布局方式，只支持单 行（水平排列）或单列（垂直排列）的布局方式。若要实现类似表格那样的多行多列形式，可采用网格布局GridLayout

网格布局默认从左往右、从上到下排列，它先从第一行从左往右放置下级视图，塞满之后另起一行放置 其余的下级视图，如此循环往复直至所有下级视图都放置完毕。为了判断能够容纳几行几列，网格布局 新增了android:columnCount与android:rowCount两个属性，其中columnCount指定了网格的列数， 即每行能放多少个视图；rowCount指定了网格的行数，即每列能放多少个视图





```xml
<?xml version="1.0" encoding="utf-8"?>
<GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:background="@color/purple_200"
        android:rowCount="4"
        android:columnCount="3">

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="1"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="2"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="3"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="4"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="5"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="6"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="7"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="8"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="9"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="10"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="11"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="12"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

</GridLayout>
```





![image-20220918213927855](img/Android学习笔记/image-20220918213927855.png)



该成3行四列



```xml
<?xml version="1.0" encoding="utf-8"?>
<GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:background="@color/purple_200"
        android:rowCount="3"
        android:columnCount="4">

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="1"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="2"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="3"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="4"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="5"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="6"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="7"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="8"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="9"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="10"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="11"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="12"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

</GridLayout>
```





![image-20220918214011731](img/Android学习笔记/image-20220918214011731.png)





更改成6行两列



```xml
<?xml version="1.0" encoding="utf-8"?>
<GridLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:background="@color/purple_200"
        android:rowCount="6"
        android:columnCount="2">

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="1"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="2"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="3"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="4"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="5"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="6"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="7"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="8"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="9"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="10"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="11"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

    <TextView
            android:layout_width="60dp"
            android:layout_height="80dp"
            android:gravity="center"
            android:text="12"
            android:textColor="#00ff00"
            android:textSize="30sp"
            android:layout_margin="10dp"
            android:background="@color/purple_500"/>

</GridLayout>
```



![image-20220918214420378](img/Android学习笔记/image-20220918214420378.png)









### 滚动视图ScrollView

手机屏幕的显示空间有限，常常需要上下滑动或左右滑动才能拉出其余页面内容，可惜一般的布局节点 都不支持自行滚动，这时就要借助滚动视图了。与线性布局类似，滚动视图也分为垂直方向和水平方向 两类，其中垂直滚动视图名为ScrollView，水平滚动视图名为HorizontalScrollView。

* 垂直方向滚动时，layout_width属性值设置为match_parent，layout_height属性值设置为 wrap_content
* 水平方向滚动时，layout_width属性值设置为wrap_content，layout_height属性值设置为 match_parent
* 滚动视图节点下面必须且只能挂着一个子布局节点，否则会在运行时报错Caused by： java.lang.IllegalStateException：ScrollView can host only one direct child





垂直滚动



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity2"
        android:orientation="vertical"
        android:gravity="center">

        <ScrollView
                android:layout_width="match_parent"
                android:layout_height="wrap_content">

            <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">


                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="1"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="2"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="3"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="4"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="5"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="6"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

                <TextView
                        android:layout_width="match_parent"
                        android:layout_height="200dp"
                        android:background="@color/purple_200"
                        android:layout_marginTop="5dp"
                        android:layout_marginBottom="5dp"
                        android:text="7"
                        android:gravity="center"
                        android:textSize="40sp"
                        android:textColor="@color/design_default_color_secondary" />

            </LinearLayout>

        </ScrollView>

</LinearLayout>
```



水平滚动



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity3"
        android:orientation="horizontal"
        android:gravity="center">

    <HorizontalScrollView
            android:layout_width="wrap_content"
            android:layout_height="match_parent">


        <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="match_parent"
                android:orientation="horizontal">

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="1"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="2"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="3"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="4"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="5"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="6"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="400dp"
                    android:layout_height="match_parent"
                    android:background="@color/purple_200"
                    android:layout_marginLeft="5dp"
                    android:layout_marginRight="5dp"
                    android:text="7"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

        </LinearLayout>

    </HorizontalScrollView>

</LinearLayout>
```





运行测试App，可知ScrollView在纵向滚动，而HorizontalScrollView在横向滚动。 有时ScrollView的实际内容不够，又想让它充满屏幕，怎么办呢？如果把layout_height属性赋值为 match_parent，结果还是不会充满，正确的做法是再增加一行属性android:fillViewport（该属性为true 表示允许填满视图窗口）



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity4"
        android:orientation="vertical">

    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@color/cardview_dark_background">

        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">


            <TextView
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:background="@color/purple_200"
                    android:layout_marginTop="5dp"
                    android:layout_marginBottom="5dp"
                    android:text="1"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:background="@color/purple_200"
                    android:layout_marginTop="5dp"
                    android:layout_marginBottom="5dp"
                    android:text="2"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

        </LinearLayout>

    </ScrollView>

</LinearLayout>
```





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity5"
        android:orientation="vertical">

    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@color/cardview_dark_background"
            android:fillViewport="true">

        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">


            <TextView
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:background="@color/purple_200"
                    android:layout_marginTop="5dp"
                    android:layout_marginBottom="5dp"
                    android:text="1"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

            <TextView
                    android:layout_width="match_parent"
                    android:layout_height="200dp"
                    android:background="@color/purple_200"
                    android:layout_marginTop="5dp"
                    android:layout_marginBottom="5dp"
                    android:text="2"
                    android:gravity="center"
                    android:textSize="40sp"
                    android:textColor="@color/design_default_color_secondary" />

        </LinearLayout>

    </ScrollView>

</LinearLayout>
```





主页布局



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">


    <Button
            android:id="@+id/button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="ScrollView"
            android:textSize="30sp" />


    <Button
            android:id="@+id/button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="HorizontalScrollView"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="3"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="4"
            android:textSize="30sp" />

</LinearLayout>
```





```java
package mao.android_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity4.class));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity5.class));
            }
        });
    }
}
```



运行



![image-20220919204207183](img/Android学习笔记/image-20220919204207183.png)



![image-20220919204218695](img/Android学习笔记/image-20220919204218695.png)



![image-20220919204229154](img/Android学习笔记/image-20220919204229154.png)



![image-20220919204242430](img/Android学习笔记/image-20220919204242430.png)



![image-20220919204258885](img/Android学习笔记/image-20220919204258885.png)



![image-20220919204311534](img/Android学习笔记/image-20220919204311534.png)



![image-20220919204321545](img/Android学习笔记/image-20220919204321545.png)









## 按钮触控

### 按钮控件Button

除了文本视图之外，按钮Button也是一种基础控件。因为Button是由TextView派生而来，所以文本视图 拥有的属性和方法，包括文本内容、文本大小、文本颜色等，按钮控件均能使用。不同的是，Button拥 有默认的按钮背景，而TextView默认无背景；Button的内部文本默认居中对齐，而TextView的内部文本 默认靠左对齐。



![image-20220919210316281](img/Android学习笔记/image-20220919210316281.png)



此外，按钮还要额外注意textAllCaps与onClick两个属性



**textAllCaps属性**

对于TextView来说，text属性设置了什么文本，文本视图就显示什么文本。但对于Button来说，不管 text属性设置的是大写字母还是小写字母，按钮控件都默认转成大写字母显示。

该属性默认为true表 示全部转为大写，如果设置为false则表示不转为大写。于是在布局文件添加新的Button标签，该标签补 充了android:textAllCaps="false"





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity2"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="自动转大写"
            android:textSize="20sp"
            android:gravity="center"/>

    <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="abcdefABC123你好"
            android:textSize="16sp" />

    <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="保持原样"
            android:textSize="20sp"
            android:gravity="center"
            android:layout_marginTop="30sp"/>

    <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="abcdefABC123你好"
            android:textSize="16sp"
            android:textAllCaps="false" />


</LinearLayout>
```





![image-20220919210137922](img/Android学习笔记/image-20220919210137922.png)







**onClick属性**

按钮之所以成为按钮，是因为它会响应按下动作，就手机而言，按下动作等同于点击操作，即手指轻触 屏幕然后马上松开。每当点击按钮之时，就表示用户确认了某个事项，接下来轮到App接着处理了。 onClick属性便用来接管用户的点击动作，该属性的值是个方法名，也就是当前页面的Java代码存在这么 一个方法：当用户点击按钮时，就自动调用该方法。



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity3"
        android:orientation="vertical"
        android:gravity="center">


    <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="请点击按钮"
            android:textSize="16sp"
            android:onClick="onClick"/>



</LinearLayout>
```



```java
package mao.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity3 extends AppCompatActivity
{
    public static final String TAG = "MainActivity3";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onClick(View view)
    {
        Log.d(TAG, "onClick: 按钮被点击了");
    }
}
```





![image-20220919211235572](img/Android学习笔记/image-20220919211235572.png)



![image-20220919211249903](img/Android学习笔记/image-20220919211249903.png)







### 点击事件和长按事件

虽然按钮控件能够在XML文件中通过onClick属性指定点击方法，但是方法的名称可以随便叫，既能叫 doClick也能叫doTouch，甚至叫它doA或doB都没问题，这样很不利于规范化代码，倘若以后换了别人 接手，就不晓得doA或doB是干什么用的。因此在实际开发中，不推荐使用Button标签的onClick属性， 而是在代码中给按钮对象注册点击监听器



![image-20220919211416990](img/Android学习笔记/image-20220919211416990.png)





所谓监听器，意思是专门监听控件的动作行为，它平时无所事事，只有控件发生了指定的动作，监听器 才会触发开关去执行对应的代码逻辑。点击监听器需要实现接口View.OnClickListener，并重写onClick 方法补充点击事件的处理代码，再由按钮调用setOnClickListener方法设置监听器对象。



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:gravity="center"
        android:orientation="vertical">

    <Button
            android:id="@+id/button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面1"
            android:textSize="16sp"
            android:textAllCaps="false" />

    <Button
            android:id="@+id/button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面2"
            android:textSize="16sp"
            android:textAllCaps="false" />

</LinearLayout>
```





```java
package mao.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //也可以不使用匿名内部类的方法设置监听器，也可以使用lambda表达式创建，
        //也可以复用一个View.OnClickListener实例
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
    }
}
```



如果一个页面只有一个按钮，单独定义新的监听器倒也无妨，可是如果存在许多按钮，每个按钮都定义自己的监听器，不是很好。对于同时监听多个按钮的情况，更好的办法是注册统一的监听器，也就是让当前页面实现接口View.OnClickListener，如此一来，onClick方法便写在了页面代码之内。因为 是统一的监听器，所以onClick内部需要判断是哪个按钮被点击了，也就是利用视图对象的getId方法检查控件编号



```java
package mao.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //也可以不使用匿名内部类的方法设置监听器，也可以使用lambda表达式创建，
        //也可以复用一个View.OnClickListener实例
/*        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });*/

        View.OnClickListener onClickListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (v.getId() == R.id.button1)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }
                else if (v.getId() == R.id.button2)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity3.class));
                }
                else
                {
                    //...
                }
            }
        };

        findViewById(R.id.button1).setOnClickListener(onClickListener);
        findViewById(R.id.button2).setOnClickListener(onClickListener);


    }
}
```







**长按事件**

除了点击事件，Android还设计了另外一种长按事件，每当控件被按住超过500毫秒之后，就会触发该控件的长按事件。若要捕捉按钮的长按事件，可调用按钮对象的setOnLongClickListener方法设置长按监听器。



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity4"
        android:orientation="vertical"
        android:gravity="center">


    <Button
            android:id="@+id/button4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="请长按按钮"
            android:textSize="16sp" />


</LinearLayout>
```





```java
package mao.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity4 extends AppCompatActivity
{
    public static final String TAG = "MainActivity4";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.button4).setLongClickable(true);
        findViewById(R.id.button4).setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                Log.d(TAG, "onClick: 长按按钮事件被触发了");
                return true;
            }
        });
    }
}
```





点击监听器和长按监听器不局限于按钮控件，其实它们都来源于视图基类View，凡是从 View派生而来的各类控件，均可注册点击监听器和长按监听器。譬如文本视图TextView，其对象也能调 用setOnClickListener方法与setOnLongClickListener方法，此时TextView控件就会响应点击动作和长 按动作。因为按钮存在按下和松开两种背景，便于提示用户该控件允许点击，但文本视图默认没有按压 背景，不方便判断是否被点击，所以一般不会让文本视图处理点击事件和长按事件







### 禁用与恢复按钮

尽管按钮控件生来就是给人点击的，可是某些情况希望暂时禁止点击操作，譬如用户在注册的时候，有 的网站要求用户必须同意指定条款，而且至少浏览10秒之后才能点击注册按钮。那么在10秒之前，注册 按钮应当置灰且不能点击，等过了10秒之后，注册按钮才恢复正常。在这样的业务场景中，按钮先后拥 有两种状态，即不可用状态与可用状态

* 不可用按钮：按钮不允许点击，即使点击也没反应，同时按钮文字为灰色
* 可用按钮：按钮允许点击，点击按钮会触发点击事件，同时按钮文字为正常的黑色



从上述的区别说明可知，不可用与可用状态主要有两点差异：其一，是否允许点击；其二，按钮文字的 颜色。就文字颜色而言，可在布局文件中使用textColor属性设置颜色，也可在Java代码中调用 setTextColor方法设置颜色。至于是否允许点击，则需引入新属性android:enabled，该属性值为true时 表示启用按钮，即允许点击按钮；该属性值为false时表示禁用按钮，即不允许点击按钮。在Java代码 中，则可通过setEnabled方法设置按钮的可用状态（true表示启用，false表示禁用）





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity5">

    <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="按钮为启用状态"
            android:textSize="20sp"
            android:textColor="#ff00ff" />

    <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="按钮为禁用状态"
            android:textSize="20sp"
            android:textColor="@color/purple_500"
            android:enabled="false" />


</LinearLayout>
```





![image-20220919214632043](img/Android学习笔记/image-20220919214632043.png)





**模拟验证码发送按钮**



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity6"
        android:orientation="vertical"
        android:gravity="center">


    <Button
            android:id="@+id/button6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_margin="50dp"
            android:text="@string/send_code"
            android:textColor="@color/design_default_color_secondary"
            android:textSize="20sp" />


</LinearLayout>
```





```java
package mao.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.LockSupport;

public class MainActivity6 extends AppCompatActivity
{

    private Button button;

    public static final String TAG = "MainActivity6";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        button = findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                handler();
            }
        });
    }

    private void handler()
    {
        Log.d(TAG, "onClick: 调用");
        if (!button.isEnabled())
        {
            //其实跑不到这里
            Log.d(TAG, "onClick: 不可用");
        }
        //当前可用
        button.setEnabled(false);
        final int[] i = {10};


        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                button.setText(String.valueOf(i[0]));
                if (i[0] < 0)
                {
                    MainActivity6.this.runOnUiThread(new Runnable()
                    {
                        @Override
                        public void run()
                        {
                            //Thread.sleep();方法调用会无响应
                            //LockSupport.park也是一样，原子操作(cas)也是一样
                            //Android系统中的视图组件并不是线程安全的，
                            // 如果要更新视图，必须在主线程中更新，不可以在子线程中执行更新的操作。
                            //Only the original thread that created a view hierarchy can touch its views.
                            //解决方案：MainActivity6.this.runOnUiThread
                            //或者使用Handler对象
                            button.setEnabled(true);
                            button.setText("重新发送验证码");
                            timer.cancel();
                        }
                    });
                }
                i[0]--;
            }
        }, 0, 1000);

    }
}
```



**注意：**

**Thread.sleep();方法调用会无响应，LockSupport.park也是一样，原子操作(cas)也是一样**
**Android系统中的视图组件并不是线程安全的，**
**如果要更新视图，必须在主线程中更新，不可以在子线程中执行更新的操作。**
**Only the original thread that created a view hierarchy can touch its views.**
**解决方案：MainActivity6.this.runOnUiThread，或者使用Handler对象**





运行



![image-20220919223412123](img/Android学习笔记/image-20220919223412123.png)





![image-20220919223422919](img/Android学习笔记/image-20220919223422919.png)



![image-20220919223433310](img/Android学习笔记/image-20220919223433310.png)



![image-20220919223441285](img/Android学习笔记/image-20220919223441285.png)







主页面



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:gravity="center"
        android:orientation="vertical">

    <Button
            android:id="@+id/button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面1"
            android:textSize="16sp"
            android:textAllCaps="false" />

    <Button
            android:id="@+id/button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面2"
            android:textSize="16sp"
            android:textAllCaps="false" />

    <Button
            android:id="@+id/button3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面3"
            android:textSize="16sp"
            android:textAllCaps="false" />

    <Button
            android:id="@+id/button5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面4"
            android:textSize="16sp"
            android:textAllCaps="false" />

    <Button
            android:id="@+id/button7"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="页面5"
            android:textSize="16sp"
            android:textAllCaps="false" />

</LinearLayout>
```



```java
package mao.android_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //也可以不使用匿名内部类的方法设置监听器，也可以使用lambda表达式创建，
        //也可以复用一个View.OnClickListener实例
/*        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });*/

        View.OnClickListener onClickListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (v.getId() == R.id.button1)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }
                else if (v.getId() == R.id.button2)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity3.class));
                }
                else if (v.getId()==R.id.button3)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity4.class));
                }
                else if (v.getId()==R.id.button5)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity5.class));
                }
                else if (v.getId()==R.id.button7)
                {
                    startActivity(new Intent(MainActivity.this, MainActivity6.class));
                }
                else
                {
                    //...
                }
            }
        };

        findViewById(R.id.button1).setOnClickListener(onClickListener);
        findViewById(R.id.button2).setOnClickListener(onClickListener);
        findViewById(R.id.button3).setOnClickListener(onClickListener);
        findViewById(R.id.button5).setOnClickListener(onClickListener);
        findViewById(R.id.button7).setOnClickListener(onClickListener);
    }
}
```





## 消息提示

### Toast

App同用户交互的过程中，时常要向用户反馈一些信息，例如：点错了按钮、输入了非法字符等等，诸如此类。对于这些一句话的提示，Android设计了Toast控件，用于展示短暂的提示文字。

```java
Toast.makeText(MainActivity.this, "提示文字", Toast.LENGTH_SHORT).show();
```

其中show方法用来展示提示窗，而makeText方 法用来构建提示文字的模板。makeText的第一个参数为当前页面的实例；第二个参数为准备显示的提示文本；第三个参数规定了提示窗的驻留时长，为Toast.LENGTH_SHORT表示停留 2秒后消失，为Toast.LENGTH_LONG表示停留3.5秒后消失



![image-20220921172441952](img/Android学习笔记/image-20220921172441952.png)





## 图像显示

### 图像视图ImageView

显示文本用到了文本视图TextView，显示图像则用到图像视图ImageView。由于图像通常保存为单独的 图片文件，因此需要先把图片放到res/drawable目录，然后再去引用该图片的资源名称。比如现在有张 苹果图片名为apple.png，那么XML文件通过属性android:src设置图片资源，属性值格式形如 “@drawable/不含扩展名的图片名称”。

```xml
<ImageView
android:layout_width="match_parent"
android:layout_height="200dp"
android:src="@drawable/apple" />
```





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity2"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:src="@drawable/img"
            android:contentDescription="图片" />

</LinearLayout>
```



![image-20220920103451606](img/Android学习笔记/image-20220920103451606.png)





ImageView本身默认图片居中显示，不管图片有多大抑或有多小，图像视图都会自动缩放图片，使之刚 好够着ImageView的边界，并且缩放后的图片保持原始的宽高比例，看起来图片很完美地占据视图中 央。这种缩放类型在XML文件中通过属性android:scaleType定义，即使图像视图未明确指定该属性，系 统也会默认其值为fitCenter，表示让图像缩放后居中显示。



![image-20220920103608154](img/Android学习笔记/image-20220920103608154.png)



在Java代码中可调用setScaleType方法设置图像视图的缩放类型



```java
package mao.android_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity10 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        ImageView imageView1 = findViewById(R.id.ImageView1);
        imageView1.setScaleType(ImageView.ScaleType.CENTER);
    }
}
```



枚举

```java
/**
 * Options for scaling the bounds of an image to the bounds of this view.
 */
public enum ScaleType {
    /**
     * Scale using the image matrix when drawing. The image matrix can be set using
     * {@link ImageView#setImageMatrix(Matrix)}. From XML, use this syntax:
     * <code>android:scaleType="matrix"</code>.
     */
    MATRIX      (0),
    /**
     * Scale the image using {@link Matrix.ScaleToFit#FILL}.
     * From XML, use this syntax: <code>android:scaleType="fitXY"</code>.
     */
    FIT_XY      (1),
    /**
     * Scale the image using {@link Matrix.ScaleToFit#START}.
     * From XML, use this syntax: <code>android:scaleType="fitStart"</code>.
     */
    FIT_START   (2),
    /**
     * Scale the image using {@link Matrix.ScaleToFit#CENTER}.
     * From XML, use this syntax:
     * <code>android:scaleType="fitCenter"</code>.
     */
    FIT_CENTER  (3),
    /**
     * Scale the image using {@link Matrix.ScaleToFit#END}.
     * From XML, use this syntax: <code>android:scaleType="fitEnd"</code>.
     */
    FIT_END     (4),
    /**
     * Center the image in the view, but perform no scaling.
     * From XML, use this syntax: <code>android:scaleType="center"</code>.
     */
    CENTER      (5),
    /**
     * Scale the image uniformly (maintain the image's aspect ratio) so
     * that both dimensions (width and height) of the image will be equal
     * to or larger than the corresponding dimension of the view
     * (minus padding). The image is then centered in the view.
     * From XML, use this syntax: <code>android:scaleType="centerCrop"</code>.
     */
    CENTER_CROP (6),
    /**
     * Scale the image uniformly (maintain the image's aspect ratio) so
     * that both dimensions (width and height) of the image will be equal
     * to or less than the corresponding dimension of the view
     * (minus padding). The image is then centered in the view.
     * From XML, use this syntax: <code>android:scaleType="centerInside"</code>.
     */
    CENTER_INSIDE (7);

    ScaleType(int ni) {
        nativeInt = ni;
    }
    final int nativeInt;
}
```





缩放类型



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity3"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="fitCenter"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity4"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="centerCrop"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity5"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="centerInside"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity6"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="center"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity7"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="fitXY"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity8"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="fitStart"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity9"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片"
            android:scaleType="fitEnd"/>

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity10"
        android:orientation="vertical"
        android:gravity="center"
        android:background="#444444">


    <ImageView
            android:id="@+id/ImageView1"
            android:background="@color/cardview_shadow_start_color"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/img"
            android:contentDescription="图片" />

</LinearLayout>
```



主页面

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <Button
            android:id="@+id/button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="默认scaleType"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="fitCenter"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>


    <Button
            android:id="@+id/button3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="centerCrop"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="centerInside"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="center"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button6"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="fitXY"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button7"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="fitStart"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button8"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="fitEnd"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>

    <Button
            android:id="@+id/button9"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="通过java代码设置"
            android:textColor="@color/purple_200"
            android:textSize="25sp"
            android:textAllCaps="false"/>



</LinearLayout>
```







```java
package mao.android_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity4.class));
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity5.class));
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity6.class));
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity7.class));
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity8.class));
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity9.class));
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity10.class));
            }
        });
    }
}
```





运行



![image-20220920110420114](img/Android学习笔记/image-20220920110420114.png)



按顺序点击



![image-20220920110518381](img/Android学习笔记/image-20220920110518381.png)

![image-20220920110533271](img/Android学习笔记/image-20220920110533271.png)

![image-20220920110543385](img/Android学习笔记/image-20220920110543385.png)

![image-20220920110553701](img/Android学习笔记/image-20220920110553701.png)

![image-20220920110603060](img/Android学习笔记/image-20220920110603060.png)

![image-20220920110618498](img/Android学习笔记/image-20220920110618498.png)

![image-20220920110627589](img/Android学习笔记/image-20220920110627589.png)

![image-20220920110638783](img/Android学习笔记/image-20220920110638783.png)

![image-20220920110652382](img/Android学习笔记/image-20220920110652382.png)





表面上 fitCenter、centerInside、center三个类型都是居中显示，且均不越过图像视图的边界。
它们之间的区 别在于：fitCenter既允许缩小图片、也允许放大图片，centerInside只允许缩小图片、不允许放大图 标，而center自始至终保持原始尺寸（既不允许缩小图片、也不允许放大图片）。
因此，当图片尺寸大于视图宽高，centerInside与fitCenter都会缩小图片，此时它俩的显示效果相同；当图片尺寸小于视图宽高，centerInside与center都保持图片大小不变，此时它俩的显示效果相同。









### 图像按钮ImageButton

常见的按钮控件Button其实是文本按钮，因为按钮上面只能显示文字，不能显示图片，ImageButton才是显示图片的图像按钮。虽然ImageButton号称图像按钮，但它并非继承Button，而是继承了 ImageView



![image-20220920121624815](img/Android学习笔记/image-20220920121624815.png)





* Button既可显示文本也可显示图片（通过setBackgroundResource方法设置背景图片），而 ImageButton只能显示图片不能显示文本
* ImageButton上的图像可按比例缩放，而Button通过背景设置的图像会拉伸变形，因为背景图采取 fitXY方式，无法按比例缩放
* Button只能靠背景显示一张图片，而ImageButton可分别在前景和背景显示图片，从而实现两张图片叠加的效果



不过使用ImageButton得注意，图像按钮默认的缩放类型为center（保持原始尺寸不缩放图片），而非 图像视图默认的fitCenter，倘若图片尺寸较大，那么图像按钮将无法显示整个图片。为避免显示不完整 的情况，XML文件中的ImageButton标签必须指定fitCenter的缩放类型



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center"
        android:padding="50dp">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="点击下面的图片按钮"
            android:layout_marginBottom="20dp"
            android:textSize="20sp" />

    <ImageButton
            android:id="@+id/ImageButton1"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:src="@drawable/ic_launcher_foreground"
            android:background="@drawable/img"
            android:scaleType="fitCenter"/>

</LinearLayout>
```



```java
package mao.android_imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
{

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton1 = findViewById(R.id.ImageButton1);
        imageButton1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d(TAG, "onClick: 点击");
            }
        });
    }
}
```





![image-20220920123129213](img/Android学习笔记/image-20220920123129213.png)



![image-20220920123140277](img/Android学习笔记/image-20220920123140277.png)











### 同时展示文本与图像

现在有了Button可在按钮上显示文字，又有ImageButton可在按钮上显示图像，照理说绝大多数场合都够用了。然而现实项目中的需求往往捉摸不定，例如客户要求在按钮文字的左边加一个图标，这样按钮 内部既有文字又有图片，Button和ImageButton都没法直接使用。若用LinearLayout对 ImageView和TextView组合布局，虽然可行，XML文件却变得冗长许多。

其实有个既简单又灵活的办法，要想在文字周围放置图片，使用按钮控件Button就能实现。

* drawableTop：指定文字上方的图片
* drawableBottom：指定文字下方的图片
* drawableLeft：指定文字左边的图片。
* drawableRight：指定文字右边的图片
* drawablePadding：指定图片与文字的间距





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="图标在文字左侧"
            android:drawablePadding="5dp"
            android:drawableLeft="@drawable/ic_launcher_foreground"
            android:textSize="16sp" />

    <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="图标在文字右侧"
            android:drawablePadding="5dp"
            android:drawableRight="@drawable/ic_launcher_foreground"
            android:textSize="16sp" />

    <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="图标在文字上面"
            android:drawablePadding="5dp"
            android:drawableTop="@drawable/ic_launcher_foreground"
            android:textSize="16sp" />

    <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="图标在文字下面"
            android:drawablePadding="5dp"
            android:drawableBottom="@drawable/ic_launcher_foreground"
            android:textSize="16sp" />

</LinearLayout>
```





![image-20220920131510542](img/Android学习笔记/image-20220920131510542.png)











## 计算器

计算器的界面分为两大部分，第一部分是上方的计算表达式，既包括用户的按键输入，也包括计算结果 数字；第二部分是下方的各个按键，例如：从0到9的数字按钮、加减乘除与等号、正负号按钮、小数点 按钮、求倒数按钮、平方按钮、开方按钮，以及退格、清空、取消等控制按钮。通过这些按键操作，能 够实现整数和小数的四则运算，以及求倒数、求平方、求开方等简单运算



按照计算器App的效果图，大致分布着下列Android控件：

* 线性布局LinearLayout：因为计算器界面整体从上往下布局，所以需要垂直方向的LinearLayout
* 网格布局GridLayout：计算器下半部分的几排按钮，正好成五行四列表格分布，适合采用GridLayout
* 滚动视图ScrollView：虽然计算器界面不宽也不高，但是以防万一，最好还是加个垂直方向的ScrollView
* 文本视图TextView：很明显顶部标题“简单计算器”就是TextView，且文字居中显示；标题下面的计算结果也需要使用TextView，且文字靠右靠下显示
* 按钮Button：几乎所有的数字与运算符按钮都采用了Button控件
* 图像按钮ImageButton：开根号的运算符“√”虽然能够打出来，但是右上角少了一横， 所以该按钮要显示一张标准的开根号图片，这用到了ImageButton





对于简单计算来说，每次运算至少需要两个操作数，比如加减乘除四则运算就要求有两个操作数，求倒数、求平方、求开方只要求一个操作数；并且每次运算过程有且仅有一个运算符（等号不计在内）



布局

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:padding="5dp"
        android:orientation="vertical">


    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

        <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">

            <TextView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="center"
                    android:text="@string/simple_calculator"
                    android:textColor="#00ffff"
                    android:textSize="20sp" />

            <TextView
                    android:id="@+id/tv_result"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:gravity="right|bottom"
                    android:lines="5"
                    android:text="0"
                    android:textColor="#ff0000"
                    android:textSize="26sp"
                    android:layout_marginBottom="@dimen/show_text_marginBottom"/>

            <GridLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:columnCount="4"
                    android:rowCount="5">

                <Button
                        android:id="@+id/btn_cancel"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/cancel"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_divide"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/divide"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_multiply"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/multiply"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_clear"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/clear"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_seven"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/seven"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_eight"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/eight"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_nine"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/nine"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_plus"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/plus"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_four"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/four"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_five"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/five"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_six"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/six"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_minus"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/minus"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_one"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/one"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_two"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/two"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_three"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/three"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <ImageButton
                        android:id="@+id/ib_sqrt"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:src="@drawable/sqrt"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:background="@color/purple_200"
                        android:contentDescription="@string/sprt"
                        android:scaleType="centerInside" />

                <Button
                        android:id="@+id/btn_reciprocal"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/reciprocal"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_1_x" />

                <Button
                        android:id="@+id/btn_zero"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/zero"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_dot"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/dot"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

                <Button
                        android:id="@+id/btn_equal"
                        android:layout_width="0dp"
                        android:layout_height="@dimen/button_height"
                        android:layout_columnWeight="1"
                        android:gravity="center"
                        android:layout_margin="@dimen/Button_mrgin"
                        android:text="@string/equal"
                        android:textColor="@color/black"
                        android:textSize="@dimen/button_font_size" />

            </GridLayout>

        </LinearLayout>

    </ScrollView>

</LinearLayout>
```



逻辑代码

```java
package mao.android_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    /**
     * 标签
     */
    public static final String TAG = "MainActivity";

    private TextView tv_result;
    // 第一个操作数
    private String firstNum = "";
    // 运算符
    private String operator = "";
    // 第二个操作数
    private String secondNum = "";
    // 当前的计算结果
    private String result = "";
    // 显示的文本内容
    private String showText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "mao " +
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),
                Toast.LENGTH_SHORT).show();

        // 从布局文件中获取名叫tv_result的文本视图
        tv_result = findViewById(R.id.tv_result);
        // 下面给每个按钮控件都注册了点击监听器
        findViewById(R.id.btn_cancel).setOnClickListener(this);
        // “除法”按钮
        findViewById(R.id.btn_divide).setOnClickListener(this);
        // “乘法”按钮
        findViewById(R.id.btn_multiply).setOnClickListener(this);
        // “清除”按钮
        findViewById(R.id.btn_clear).setOnClickListener(this);
        // 数字7
        findViewById(R.id.btn_seven).setOnClickListener(this);
        // 数字8
        findViewById(R.id.btn_eight).setOnClickListener(this);
        // 数字9
        findViewById(R.id.btn_nine).setOnClickListener(this);
        // “加法”按钮
        findViewById(R.id.btn_plus).setOnClickListener(this);
        // 数字4
        findViewById(R.id.btn_four).setOnClickListener(this);
        // 数字5
        findViewById(R.id.btn_five).setOnClickListener(this);
        // 数字6
        findViewById(R.id.btn_six).setOnClickListener(this);
        // “减法”按钮
        findViewById(R.id.btn_minus).setOnClickListener(this);
        // 数字1
        findViewById(R.id.btn_one).setOnClickListener(this);
        // 数字2
        findViewById(R.id.btn_two).setOnClickListener(this);
        // 数字3
        findViewById(R.id.btn_three).setOnClickListener(this);
        // 求倒数按钮
        findViewById(R.id.btn_reciprocal).setOnClickListener(this);
        // 数字0
        findViewById(R.id.btn_zero).setOnClickListener(this);
        // “小数点”按钮
        findViewById(R.id.btn_dot).setOnClickListener(this);
        // “等号”按钮
        findViewById(R.id.btn_equal).setOnClickListener(this);
        // “开平方”按钮
        findViewById(R.id.ib_sqrt).setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v)
    {
        String inputText;
        // 如果是开根号按钮
        if (v.getId() == R.id.ib_sqrt)
        {
            inputText = "√";
        }
        else
        {
            // 除了开根号之外的其他按钮
            inputText = ((TextView) v).getText().toString();
        }
        switch (v.getId())
        {
            // 点击了清除按钮
            case R.id.btn_clear:
                clear();
                break;
            // 点击了取消按钮
            case R.id.btn_cancel:
                break;
            // 点击了加、减、乘、除按钮
            case R.id.btn_plus:
            case R.id.btn_minus:
            case R.id.btn_multiply:
            case R.id.btn_divide:
                plus_minus_multiply_divide(inputText);
                break;
            // 点击了等号按钮
            case R.id.btn_equal:
                equal();
                break;
            // 点击了开根号按钮
            case R.id.ib_sqrt:
                sqrt();
                break;
            // 点击了求倒数按钮
            case R.id.btn_reciprocal:
                reciprocal();
                break;
            // 点击了其他按钮，包括数字和小数点
            default:
                caseDefault(inputText);
        }

    }

    /**
     * 加减乘除
     *
     * @param inputText 输入文本
     */
    private void plus_minus_multiply_divide(String inputText)
    {
        if (firstNum.equals("."))
        {
            return;
        }
        operator = inputText; // 运算符
        if (!secondNum.equals(""))
        {
            double result = calculateFour();
            this.result = String.valueOf(result);
            firstNum = this.result;
            secondNum = "";

        }
        refreshText(showText + operator);
        Log.d(TAG, "onClick: showText=" + showText
                + ", operator=" + operator);
        Log.d(TAG, "onClick: firstNum="
                + firstNum + ",secondNum=" + secondNum);
        Log.d(TAG, "onClick: result=" + result);
        return;
    }

    /**
     * caseDefault
     *
     * @param inputText 输入文本
     */
    private void caseDefault(String inputText)
    {
        // 上次的运算结果已经出来了
        if (result.length() > 0 && operator.equals(""))
        {
            clear();
        }

        // 无运算符，则继续拼接第一个操作数
        if (operator.equals(""))
        {
            firstNum = firstNum + inputText;
        }
        else
        {
            // 有运算符，则继续拼接第二个操作数
            secondNum = secondNum + inputText;
        }
        // 整数不需要前面的0
        if (showText.equals("0") && !inputText.equals("."))
        {
            refreshText(inputText);
        }
        else
        {
            refreshText(showText + inputText);
        }
        return;
    }


    /**
     * 等号
     */
    private void equal()
    {
        // 加减乘除四则运算
        double calculate_result = calculateFour();
        refreshOperate(String.valueOf(calculate_result));
        refreshText(showText + "=" + result);
        return;
    }

    /**
     * 求倒数
     */
    private void reciprocal()
    {
        if (firstNum.equals("."))
        {
            return;
        }
        double reciprocal_result;
        if (firstNum.equals(""))
        {
            reciprocal_result = 0;
        }
        else
        {
            reciprocal_result = 1.0 / Double.parseDouble(firstNum);
        }
        refreshOperate(String.valueOf(reciprocal_result));
        refreshText(showText + "/=" + result);
        return;
    }


    /**
     * √
     */
    private void sqrt()
    {
        if (firstNum.equals("."))
        {
            return;
        }
        double sqrt_result;
        if (firstNum.equals(""))
        {
            sqrt_result = 0;
        }
        else
        {
            sqrt_result = Math.sqrt(Double.parseDouble(firstNum));
        }
        refreshOperate(String.valueOf(sqrt_result));
        refreshText(showText + "√=" + result);
        return;
    }


    /**
     * 加减乘除四则运算，返回计算结果
     *
     * @return double
     */
    private double calculateFour()
    {
        if (firstNum.equals("") && secondNum.equals(""))
        {
            clear();
            return 0;
        }
        Log.d(TAG, "calculateFour: firstNum="
                + firstNum + ",secondNum=" + secondNum);
        switch (operator)
        {
            case "＋":
                if (secondNum.equals(""))
                {
                    return Double.parseDouble(firstNum);
                }
                if (firstNum.equals(""))
                {
                    return Double.parseDouble(secondNum);
                }
                return Double.parseDouble(firstNum) + Double.parseDouble(secondNum);
            case "－":
                if (secondNum.equals(""))
                {
                    return Double.parseDouble(firstNum);
                }
                //-7
                if (firstNum.equals(""))
                {
                    return -1 * (Double.parseDouble(secondNum));
                }
                return Double.parseDouble(firstNum) - Double.parseDouble(secondNum);
            case "×":
                if (secondNum.equals(""))
                {
                    return Double.parseDouble(firstNum);
                }
                if (firstNum.equals(""))
                {
                    return Double.parseDouble(secondNum);
                }
                return Double.parseDouble(firstNum) * Double.parseDouble(secondNum);
            default:
                if (secondNum.equals(""))
                {
                    return Double.parseDouble(firstNum);
                }
                if (firstNum.equals(""))
                {
                    return Double.parseDouble(secondNum);
                }
                return Double.parseDouble(firstNum) / Double.parseDouble(secondNum);
        }
    }

    /**
     * 清空并初始化
     */
    private void clear()
    {
        refreshOperate("");
        refreshText("");
    }

    /**
     * 刷新运算结果
     *
     * @param new_result 新结果
     */
    private void refreshOperate(String new_result)
    {
        result = new_result;
        firstNum = result;
        secondNum = "";
        operator = "";
    }

    /**
     * 刷新文本显示
     *
     * @param text 文本
     */
    private void refreshText(String text)
    {
        showText = text;
        tv_result.setText(showText);
    }
}
```





运行

![image-20220921172824546](img/Android学习笔记/image-20220921172824546.png)



![image-20220921172953401](img/Android学习笔记/image-20220921172953401.png)



![image-20220921173007455](img/Android学习笔记/image-20220921173007455.png)



![image-20220921173022428](img/Android学习笔记/image-20220921173022428.png)



![image-20220921173252657](img/Android学习笔记/image-20220921173252657.png)













# 活动Activity

## 启停活动页面

### Activity的启动和结束



启动一个活动页面：

```java
startActivity(new Intent(this, ActFinishActivity.class));
```

结束当前的活动页面：

```java
finish();
```





### Activity的生命周期

App引入活动的概念而非传统的页面概念，单从字面意思理解，页面更像是静态的，而 活动更像是动态的。犹如花开花落那般，活动也有从含苞待放到盛开再到凋零的生命过程。每次创建新 的活动页面，自动生成的Java代码都给出了onCreate方法，该方法用于执行活动创建的相关操作，包括加载XML布局、设置文本视图的初始文字、注册按钮控件的点击监听，等等。onCreate方法所代表的创 建动作，正是一个活动最开始的行为，除了onCreate，活动还有其他几种生命周期行为，它们对应的方法说明如下：

* onCreate：创建活动。此时会把页面布局加载进内存，进入了初始状态
* onStart：开启活动。此时会把活动页面显示在屏幕上，进入了就绪状态
* onResume：恢复活动。此时活动页面进入活跃状态，能够与用户正常交互，例如允许响应用户的 点击动作、允许用户输入文字等
* onPause：暂停活动。此时活动页面进入暂停状态（也就是退回就绪状态），无法与用户正常交互
* onStop：停止活动。此时活动页面将不在屏幕上显示
* onDestroy：销毁活动。此时回收活动占用的系统资源，把页面从内存中清除掉
* onRestart：重启活动。处于停止状态的活动，若想重新开启的话，无须经历onCreate的重复创建 过程，而是走onRestart的重启过程
* onNewIntent：重用已有的活动实例



![image-20220921174355496](img/Android学习笔记/image-20220921174355496.png)





打开新页面的方法调用顺序为：

**onCreate→onStart→onResume**



关闭旧页面的方法调用顺序为：

**onPause→onStop→onDestroy**





如果一个Activity已经启动过，并且存在当前应用的Activity任务栈中，启动模式为singleTask， singleInstance或singleTop(此时已在任务栈顶端)，那么在此启动或回到这个Activity的时候，不 会创建新的实例，也就是不会执行onCreate方法，而是执行onNewIntent方法





```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:padding="5dp">

    <ScrollView
            android:layout_width="match_parent"
            android:layout_height="wrap_content">

        <TextView
                android:id="@+id/TextView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                android:textSize="20sp"
                android:textColor="@color/purple_200"
                app:layout_constraintTop_toTopOf="parent" />

    </ScrollView>

</LinearLayout>
```





```java
package mao.android_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{

    /**
     * 文本视图
     */
    private TextView textView;

    /**
     * SimpleDateFormat
     */
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 标签
     */
    public static final String TAG = "MainActivity";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.TextView);
        Log.d(TAG, "onCreate: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onCreate");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "onStart: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onStart");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onResume");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "onPause: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onPause");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "onStop: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onStop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
        textView.setText(textView.getText() + "\n" + simpleDateFormat.format(new Date()) + "---> onRestart");
    }


}
```





![image-20220921183816553](img/Android学习笔记/image-20220921183816553.png)







### Activity的启动模式

从第一个活动跳到第二个活动，接着结束第二个活动就能返回第一个活动，可是为什么 不直接返回桌面呢？这要从Android的内核设计说起了，系统给每个正在运行的App都分配了活动栈，栈 里面容纳着已经创建且尚未销毁的活动信息。鉴于栈是一种先进后出、后进先出的数据结构，故而后面 入栈的活动总是先出栈，假设3个活动的入栈顺序为：活动A→活动B→活动C，则它们的出栈顺序将变 为：活动C→活动B→活动A，可见活动C结束之后会返回活动B，而不是返回活动A或者别的地方

假定某个App分配到的活动栈大小为3，该App先后打开两个活动



![image-20220921184952639](img/Android学习笔记/image-20220921184952639.png)



依次结束已打开的两个活动



![image-20220921185014464](img/Android学习笔记/image-20220921185014464.png)



不过前述的出入栈情况仅是默认的标准模式，实际上Android允许在创建活动时指定该活动的启动模 式，通过启动模式控制活动的出入栈行为。App提供了两种办法用于设置活动页面的启动模式，其一是 修改AndroidManifest.xml，在指定的activity节点添加属性android:launchMode，表示本活动以哪个 启动模式运行。其二是在代码中调用Intent对象的setFlags方法，表明后续打开的活动页面采用该启动标志



**launchMode属性的取值说明：**

* standard：标准模式，无论何时启动哪个活动，都是重新创建该页面的实例并放入栈顶。如果不指定launchMode属性，则默认为标准模式
* singleTop：启动新活动时，判断如果栈顶正好就是该活动的实例，则重用该实例；否则创建新的实例并放入栈顶，也就是按照standard模式处理
* singleTask：启动新活动时，判断如果栈中存在该活动的实例，则重用该实例， 并清除位于该实例上面的所有实例；否则按照standard模式处理
* singleInstance：启动新活动时，将该活动的实例放入一个新栈中，原栈的实例列表保持不变



```xml
<activity
        android:name=".MainActivity"
        android:exported="true"
        android:launchMode="standard">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```





**启动标志的取值说明：**

* Intent.FLAG_ACTIVITY_NEW_TASK：开辟一个新的任务栈
* Intent.FLAG_ACTIVITY_SINGLE_TOP：当栈顶为待跳转的活动实例之时，则重用栈顶的实例
* Intent.FLAG_ACTIVITY_CLEAR_TOP：当栈中存在待跳转的活动实例时，则重新创建一个新实例， 并清除原实例上方的所有实例
* Intent.FLAG_ACTIVITY_NO_HISTORY：栈中不保存新启动的活动实例
* Intent.FLAG_ACTIVITY_CLEAR_TASK：跳转到新页面时，栈中的原有实例都被清空



![image-20220921185732813](img/Android学习笔记/image-20220921185732813.png)





```java
Intent intent = new Intent(MainActivity11.this, MainActivity10.class);
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
startActivity(intent);
```





**在两个活动之间交替跳转**

假设活动A有个按钮，点击该按钮会跳到活动B；同时活动B也有个按钮，点击按钮会跳到活动A；从首页 打开活动A之后，就点击按钮在活动A与活动B之间轮流跳转。此时活动页面的跳转流程为：首页→活动 A→活动B→活动A→活动B→活动A→活动B→……多次跳转之后想回到首页，正常的话返回流程是这样 的：……→活动B→活动A→活动B→活动A→活动B→活动A→首页，注意每个箭头都代表按一次返回键

可见要按下许多次返回键才能返回首页。其实在活动A和活动B之间本不应该重复返回，因为回来回去总 是这两个页面有什么意义呢？照理说每个活动返回一次足矣，同一个地方返回两次已经是多余的了，再 返回应当回到首页才是。也就是说，不管过去的时候怎么跳转，回来的时候应该按照这个流程：……→活 动B→活动A→首页，或者按照这个流程：……→活动A→活动B→首页，总之已经返回了的页面，决不再 返回第二次

对于不允许重复返回的情况，可以设置启动标志FLAG_ACTIVITY_CLEAR_TOP，即使活动栈里面存在待 跳转的活动实例，也会重新创建该活动的实例，并清除原实例上方的所有实例，保证栈中最多只有该活 动的唯一实例，从而避免了无谓的重复返回





**登录成功后不再返回登录页面**

很多App第一次打开都要求用户登录，登录成功再进入App首页，如果这时按下返回键，发现并没有回 到上一个登录页面，而是直接退出App了，这又是什么缘故呢？原来用户登录成功后，App便记下用户的登录信息，接下来默认该用户是登录状态，自然不必重新输入用户名和密码了。既然默认用户已经登录，哪里还需要回到登录页面？不光登录页面，登录之前的其他页面包括获取验证码、找回密码等页面都不应回去

对于回不去的登录页面情况，可以设置启动标志FLAG_ACTIVITY_CLEAR_TASK，该标志会清空当前活动 栈里的所有实例。不过全部清空之后，意味着当前栈没法用了，必须另外找个活动栈才行，也就是同时 设置启动标志FLAG_ACTIVITY_NEW_TASK，该标志用于开辟新任务的活动栈

```java
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_NEW_TASK);
```





#### 默认启动模式 standard

该模式可以被设定，不在 manifest 设定时候，Activity 的默认模式就是 standard。在该模式下，启动 的 Activity 会依照启动顺序被依次压入 Task 栈中



![image-20220921204753599](img/Android学习笔记/image-20220921204753599.png)





#### 栈顶复用模式 singleTop

在该模式下，如果栈顶 Activity 为我们要新建的 Activity（目标Activity），那么就不会重复创建新的 Activity



![image-20220921204833809](img/Android学习笔记/image-20220921204833809.png)





**应用场景**

适合开启渠道多、多应用开启调用的 Activity，通过这种设置可以避免已经创建过的 Activity 被重复创建，多数通过动态设置使用





#### 栈内复用模式 singleTask

与 singleTop 模式相似，只不过 singleTop 模式是只是针对栈顶的元素，而 singleTask 模式下，如果 task 栈内存在目标 Activity 实例，则将 task 内的对应 Activity 实例之上的所有 Activity 弹出栈，并将对 应 Activity 置于栈顶，获得焦点



![image-20220921204928314](img/Android学习笔记/image-20220921204928314.png)





**应用场景**

* 程序主界面：我们肯定不希望主界面被创建多次，而且在主界面退出的时候退出整个 App 是最好的效 果
* 耗费系统资源的Activity：对于那些及其耗费系统资源的 Activity，我们可以考虑将其设为 singleTask 模式，减少资源耗费





#### 全局唯一模式 singleInstance

在该模式下，我们会为目标 Activity 创建一个新的 Task 栈，将目标 Activity 放入新的 Task，并让目标 Activity获得焦点。新的 Task 有且只有这一个 Activity 实例。 如果已经创建过目标 Activity 实例，则 不会创建新的 Task，而是将以前创建过的 Activity 唤醒



![image-20220921205024157](img/Android学习笔记/image-20220921205024157.png)







#### 动态设置启动模式

在上述所有情况，都是我们在Manifest中通过 launchMode 属性设置的，这个被称为静态设置，动态设置是通过 Java 代码设置的

如果同时有动态和静态设置，那么动态的优先级更高。



**FLAG_ACTIVITY_NEW_TASK**

此 Flag 跟 singleInstance 很相似，在给目标 Activity 设立此 Flag 后，会根据目标 Activity 的 affinity 进 行匹配，如果已经存在与其affinity 相同的 task，则将目标 Activity 压入此 Task。反之没有的话，则新 建一个 task，新建的 task 的 affinity 值与目标 Activity 相同，然后将目标 Activity 压入此栈

但它与 singleInstance 有不同的点

* 新的 Task 没有说只能存放一个目标 Activity，只是说决定是否新建一个 Task，而 singleInstance 模式下新的 Task 只能放置一个目标 Activity
* 在同一应用下，如果 Activity 都是默认的 affinity，那么此 Flag 无效，而 singleInstance 默认情况 也会创建新的 Task



**FLAG_ACTIVITY_SINGLE_TOP**

此 Flag 与静态设置中的 singleTop 效果相同



**FLAG_ACTIVITY_CLEAR_TOP**

当设置此 Flag 时，目标 Activity 会检查 Task 中是否存在此实例，如果没有则添加压入栈。如果有，就将位于 Task 中的对应 Activity 其上的所有 Activity 弹出栈







#### 代码

![image-20220921205829727](img/Android学习笔记/image-20220921205829727.png)



**顺序从1到11**



布局文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity"
        android:orientation="vertical"
        android:gravity="center">

    <Button
            android:id="@+id/main_button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="默认standard"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/main_button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="singleTop"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/main_button3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="singleTask"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/main_button4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="singleInstance"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/main_button5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="通过代码设置：Intent.FLAG_ACTIVITY_CLEAR_TOP"
            android:textAllCaps="false"
            android:textSize="16sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity2"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="A"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_a_1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转B"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/button_self_1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="自己"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity3"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_b_1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转A"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity4"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="A"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_a_2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转B"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/button_self_2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="自己"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity5"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_b_2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转A"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity6"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="A"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_a_3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转B"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/button_self_3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="自己"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity7"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_b_3"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转A"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity8"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="A"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_a_4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转B"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/button_self_4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="自己"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity9"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_b_4"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转A"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity10"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="A"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_a_5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转B"
            android:textAllCaps="false"
            android:textSize="20sp" />

    <Button
            android:id="@+id/button_self_5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="自己"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```



```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity11"
        android:orientation="vertical"
        android:gravity="center">

    <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="B"
            android:textSize="30sp" />

    <Button
            android:id="@+id/button_b_5"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="跳转A"
            android:textAllCaps="false"
            android:textSize="20sp" />

</LinearLayout>
```







逻辑代码



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main_button1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
        findViewById(R.id.main_button2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity4.class));
            }
        });
        findViewById(R.id.main_button3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity6.class));
            }
        });
        findViewById(R.id.main_button4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity8.class));
            }
        });
        findViewById(R.id.main_button5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, MainActivity10.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button_a_1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
            }
        });

        findViewById(R.id.button_self_1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity2.this, MainActivity2.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        findViewById(R.id.button_b_1).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity3.this, MainActivity2.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        findViewById(R.id.button_a_2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity4.this, MainActivity5.class));
            }
        });

        findViewById(R.id.button_self_2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity4.this, MainActivity4.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity5 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        findViewById(R.id.button_b_2).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity5.this, MainActivity4.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity6 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        findViewById(R.id.button_a_3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity6.this, MainActivity7.class));
            }
        });

        findViewById(R.id.button_self_3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity6.this, MainActivity6.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        findViewById(R.id.button_b_3).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity7.this, MainActivity6.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity8 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        findViewById(R.id.button_a_4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity8.this, MainActivity9.class));
            }
        });

        findViewById(R.id.button_self_4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity8.this, MainActivity8.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity9 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        findViewById(R.id.button_b_4).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity9.this, MainActivity8.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity10 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        findViewById(R.id.button_a_5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity10.this, MainActivity11.class));
            }
        });

        findViewById(R.id.button_self_5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity10.this, MainActivity10.class));
            }
        });
    }
}
```



```java
package mao.android_activity_boot_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity11 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        findViewById(R.id.button_b_5).setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity11.this, MainActivity10.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
```







清单文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        package="mao.android_activity_boot_mode">

    <application
            android:allowBackup="true"
            android:dataExtractionRules="@xml/data_extraction_rules"
            android:fullBackupContent="@xml/backup_rules"
            android:icon="@mipmap/ic_launcher"
            android:label="@string/app_name"
            android:roundIcon="@mipmap/ic_launcher_round"
            android:supportsRtl="true"
            android:theme="@style/Theme.Android_Activity_boot_mode"
            tools:targetApi="31">
        <activity
                android:name=".MainActivity11"
                android:exported="false" />
        <activity
                android:name=".MainActivity10"
                android:exported="false" />
        <activity
                android:name=".MainActivity9"
                android:exported="false" />
        <activity
                android:name=".MainActivity8"
                android:exported="false"
                android:launchMode="singleInstance" />
        <activity
                android:name=".MainActivity7"
                android:exported="false" />
        <activity
                android:name=".MainActivity6"
                android:exported="false"
                android:launchMode="singleTask" />
        <activity
                android:name=".MainActivity5"
                android:exported="false" />
        <activity
                android:name=".MainActivity4"
                android:exported="false"
                android:launchMode="singleTop" />
        <activity
                android:name=".MainActivity3"
                android:exported="false" />
        <activity
                android:name=".MainActivity2"
                android:exported="false" />
        <activity
                android:name=".MainActivity"
                android:exported="true"
                android:launchMode="standard">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```





![image-20220921210513990](img/Android学习笔记/image-20220921210513990.png)



仔细观察切换活动的动画效果













## 在活动之间传递消息

### 显式Intent和隐式Intent

Intent的中文名 是意图，意思是我想让你干什么，简单地说，就是传递消息。Intent是各个组件之间信息沟通的桥梁， 既能在Activity之间沟通，又能在Activity与Service之间沟通，也能在Activity与Broadcast之间沟通。总 而言之，Intent用于Android各组件之间的通信，它主要完成下列3部分工作：

* 标明本次通信请求从哪里来、到哪里去、要怎么走
* 发起方携带本次通信需要的数据内容，接收方从收到的意图中解析数据
* 发起方若想判断接收方的处理结果，意图就要负责让接收方传回应答的数据内容



