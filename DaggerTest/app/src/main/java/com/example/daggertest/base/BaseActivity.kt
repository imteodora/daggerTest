package com.example.daggertest.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggertest.DaggerTestApp
import com.example.daggertest.comp
import com.example.daggertest.dagger.ViewModelFactory
import javax.inject.Inject


open class BaseActivity: AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comp.inject(this)
    }
}