package com.example.daggertest.viewmodels

import androidx.lifecycle.ViewModel
import com.example.daggertest.repo.UserRepo
import javax.inject.Inject

class TestViewModel @Inject constructor(private val userRepo: UserRepo): ViewModel() {

    fun getBoolean() = userRepo.bla()
}