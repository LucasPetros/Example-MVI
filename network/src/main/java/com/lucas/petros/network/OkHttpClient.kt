package com.lucas.petros.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

internal fun getOkHttpClient(): OkHttpClient {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
    return OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()
}