package com.example.daggertest.dagger

import android.content.Context
import dagger.Module
import dagger.Provides


@Module
object SharedPrefModule {

    @Provides
    @JvmStatic
    fun provideSharedPreferences(context: Context) =
        context.getSharedPreferences("MySharedPrefs", Context.MODE_PRIVATE)
}