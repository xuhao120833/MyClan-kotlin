package com.color.myclan.viewmodel

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    data class User(var name: String, var age: Int)

    private var user = User("John Doe", 30)

    fun getUser(): User {
        return user
    }

    fun increaseAge() {
        user.age++
    }
}
