package com.example.daggertest

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import com.example.daggertest.base.BaseActivity
import com.example.daggertest.viewmodels.TestViewModel

class MainActivity : BaseActivity() {

    lateinit var testViewModel: TestViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testViewModel = ViewModelProviders.of(this, factory).get(TestViewModel::class.java)

        Log.d("Dagger Test Boolean", testViewModel.getBoolean().toString())

    }
}
