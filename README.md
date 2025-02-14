# NokiaGarage

#### NokiaGarage is an application specially developed by the students of the Metropolia University of Applied Sciences for the Nokia Karaportti Campus. With NokiaGarage you can read articles published by Nokia, book time to work with various equipment and rooms in Nokia Garage at Nokia Karaportti Campus.

## Tech & libraries

- Minimum SDK Level 23
- JetPack
- - LiveData - notify domain layer data to views.
- - Lifecycle - dispose of observing data when lifecycle state changes.
- - ViewModel - UI related data holder, lifecycle aware.
- - Navigation
- Mockito
- Koin
- Glide
- Coroutines
- Retrofit
- OkHttp3
- ViewPager2
- DataBinding
- ViewBinding
- Facebook Shimmer

## Features

##### - An app to utilize the EspooGarage to its full potential

##### - Reserve different rooms such as media lab for uninterrupted work

##### - Reserve different tools and let others know about the availability of the tools

##### - Check your calendar to check the availability of the rooms and tools

## Overview of the app

![ezgif com-gif-maker](https://user-images.githubusercontent.com/40695548/146215740-6662ed9c-d6f4-4c02-8161-9424cc81815d.gif)
![ezgif com-gif-maker (1)](https://user-images.githubusercontent.com/40695548/146216862-2c2e6c9e-bfc3-46b5-9215-1642f7c9fe90.gif)
![ezgif com-gif-maker (2)](https://user-images.githubusercontent.com/40695548/146218012-ae5956c5-ff64-444a-aad0-7714303ce1f3.gif)
![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/40695548/146218944-08c0f991-8f11-4c26-9220-2358f87c0129.gif)
![ezgif com-gif-maker (4)](https://user-images.githubusercontent.com/40695548/146219421-a22fbf56-d564-40d0-8b7a-1c396329e6c5.gif)
![ezgif com-gif-maker (5)](https://user-images.githubusercontent.com/40695548/146219783-15a0b8d9-4aff-44d9-b3ab-5676ea5937f8.gif)
![ezgif com-gif-maker (6)](https://user-images.githubusercontent.com/40695548/146220210-dac55e6b-b791-46ca-bdc6-af66b08201c9.gif)

## Architectural pattern

#### - MVVM and Repository pattern

![mvvm-pattern](https://user-images.githubusercontent.com/40695548/145488390-c6801231-2034-47a3-b0ea-f3a0c3a33b90.png)

## Dependencies

### build.gradle(Project)

    ext.kotlin_version = '1.6.0'
    ext.lifecycle_version = "2.4.0"
    ext.material_version = "1.4.0"
    ext.jetpackNav_version = "2.3.5"
    ext.constrainlayout_version = "2.1.1"
    ext.mockito_version = "3.7.7"
    ext.koin_version = '3.1.2'
    ext.scalable_version = "1.0.6"
    ext.dot_version = "4.1.2"
    ext.retrofit_version = "2.9.0"
    ext.glide_version = "4.12.0"
    ext.coroutine_version = "1.5.1"
    ext.okhttp3_version = "4.9.0"

### build.gradle(Module)

    plugins {
        id 'com.android.application'
        id 'kotlin-android'
        id 'kotlin-android-extensions'
        id "androidx.navigation.safeargs.kotlin"
        id 'kotlin-kapt'
    }

    buildFeatures {
        viewBinding true
        dataBinding true
    }

    //Dependency Injection
    // Koin core features
    implementation "io.insert-koin:koin-core:$koin_version"

    // Koin test features
    testImplementation "io.insert-koin:koin-test:$koin_version"

    // Koin main features for Android (Scope,ViewModel ...)
    implementation "io.insert-koin:koin-android:$koin_version"

    //KoinNavGraph
    implementation "io.insert-koin:koin-androidx-navigation:$koin_version"

    //Mockito
    testImplementation "org.mockito:mockito-core:$mockito_version"
    testImplementation "org.mockito:mockito-inline:$mockito_version"

    //viewpager2
    implementation "com.tbuonomo.andrui:viewpagerdotsindicator:$dot_version"

    //scalable units
    implementation "com.intuit.sdp:sdp-android:$scalable_version"
    implementation "com.intuit.ssp:ssp-android:$scalable_version"

    //retrofit
    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"

    //glide
    implementation "com.github.bumptech.glide:glide:$glide_version"
    annotationProcessor "com.github.bumptech.glide:compiler:$glide_version"

    //coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutine_version"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutine_version"

    implementation "com.squareup.okhttp3:okhttp:$okhttp3_version"
    implementation "com.squareup.okhttp3:logging-interceptor:$okhttp3_version"
    implementation "androidx.core:core-ktx:+"
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"

    //shimmer effect
    implementation 'com.facebook.shimmer:shimmer:0.5.0'

#### - Assets used in the app contain Illustrations from

- #### Saly - 3d illustration
- #### Blush
- #### icons8

## License

_Free Software, Hell Yeah!_
