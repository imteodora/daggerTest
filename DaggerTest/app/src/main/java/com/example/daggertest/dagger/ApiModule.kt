package com.example.daggertest.dagger

import com.example.daggertest.DaggerTestService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


@Module
object ApiModule {

    @Provides @JvmStatic
    fun provideOkHttpClient() =
        OkHttpClient().newBuilder()
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(300, TimeUnit.SECONDS)
            .connectTimeout(300, TimeUnit.SECONDS)
            .build()

    @Provides @JvmStatic
    fun provideGson() = GsonBuilder()
        .excludeFieldsWithoutExposeAnnotation()
        .create()

    @Provides @JvmStatic
    fun provideDaggerTestService(okHttpClient: OkHttpClient, gson: Gson) = Retrofit.Builder()
        .baseUrl("https://auxologie.ro/auxologie/api/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .build()
        .create(DaggerTestService::class.java)



}