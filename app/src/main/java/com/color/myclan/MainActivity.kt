package com.color.myclan

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.color.myclan.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel;

    private lateinit var mycontext: Context;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java);

        val user = viewModel.getUser()
    }

}