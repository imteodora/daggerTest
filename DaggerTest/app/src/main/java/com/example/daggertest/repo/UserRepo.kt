package com.example.daggertest.repo

import android.content.SharedPreferences
import com.example.daggertest.DaggerTestService
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserRepo @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val daggerTestService: DaggerTestService
) {


    fun bla() = sharedPreferences.getBoolean("Test", false)


}