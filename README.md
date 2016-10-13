# Android NDK Library Boilerplate

Android平台上，用于独立进行native代码库开发的工程模版。使用新式的 Android Experimental Plugin，总多优秀新特性，效率翻倍。

## Why

一般情况下，我们开发的native库都是为了解决某一特定的问题，比如处理图像的算法、实现安全加密等等，而且相对业务逻辑较为稳定的代码。因此推荐大家以独立的**ndk-library代码库**进行开发和包发布，以便作为代码隔离和复用，并且大幅减少对需要接入的工程的原脚本侵入性。为了方便大家更高效地开展NDK开发之旅，创建了这个 **ndk-library-boilerplate**。

使用了新式的 Android Experimental Plugin，除了不需要编写mk脚本外，还有JNI声明自动生成、IDE代码提示、C与Java代码混合调试等总多新特性。详情可以查看 [Experimental Plugin User Guide](http://tools.android.com/tech-docs/new-build-system/gradle-experimental)。

## How-to-use

克隆或下载该项目，然后根据自己的需要修改里面项目名称即可。其中 native-library 将输出成aar文件，外部应用可通过该文件或者发布至Maven来进行依赖。要添加更多的JNI方式，在`NativeFacade.java`中定义即可。不过建议你为这个文件更改为更能表达功能的名称。

记得希望享受IDE带来的便利特性，请使用 Android Studio 2.2+。

## Description

boilerplate使用了一个作为Facade的java library来做隔离，外部应用依赖使用时只会接触java代码，API会更加友好。其结构和简单描述如下：

```
├── app-sample                     ... sample module：当作DEMO或平时小实验用
│   ├── build.gradle
│   └── src
├── build.gradle
├── native-library                 ... library module：包含JNI和Java实现的Facade
│   ├── build.gradle
│   └── src
│       ├── androidTest/java
│       ├── main
│       │   ├── java               ... Java实现的Facade代码放在这里
│       │   └── jni                ... JNI代码放在这里
│       └── test/java              ... 未研究如何测试JNI代码，不过可测试Facade来实现
└── settings.gradle                ... include ':app-sample', ':native-library'
```

## Licence

The MIT License (MIT)
Copyright (c) 2016 iMasson.com
