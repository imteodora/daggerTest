package com.example.daggertest.dagger

import android.content.Context
import com.example.daggertest.base.BaseActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Component(modules = [SharedPrefModule::class, ApiModule::class, ViewModelModule::class])
@Singleton
interface AppComponent {

    fun inject(baseActivity: BaseActivity)

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance applicationContext: Context): AppComponent
    }
}