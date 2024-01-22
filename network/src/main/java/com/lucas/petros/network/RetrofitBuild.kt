package com.lucas.petros.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val SPOTIFY_API_BASE_URL = "https://api.spotify.com/"
const val SPOTIFY_AUTH_URL = "https://accounts.spotify.com/api/token"


fun getRetrofit(): Retrofit = Retrofit.Builder()
    .baseUrl(SPOTIFY_API_BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .client(getOkHttpClient())
    .build()