package com.example.daggertest

import android.app.Activity
import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertest.dagger.AppComponent
import com.example.daggertest.dagger.DaggerAppComponent


class DaggerTestApp : Application(), ComponentProvider {



     override val component by lazy {

         DaggerAppComponent
             .factory()
             .create(applicationContext)

     }

    override fun onCreate() {
        super.onCreate()
    }


}

interface ComponentProvider {
    val component: AppComponent
}

val AppCompatActivity.comp get() = (this.application as ComponentProvider).component

