package com.corcow.samplemvvmproject.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.corcow.samplemvvmproject.R
import com.corcow.samplemvvmproject.databinding.ActivityMainBinding
import com.corcow.samplemvvmproject.view.practice.Practice1Activity
import com.corcow.samplemvvmproject.view.practice.Practice2Activity
import com.corcow.samplemvvmproject.view.practice.Practice3Activity

class MainActivity : AppCompatActivity() {

    val mBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_main) as ActivityMainBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding.btnPractice1.setOnClickListener {
            startActivity(Intent(this@MainActivity, Practice1Activity::class.java))
        }

        mBinding.btnPractice2.setOnClickListener {
            startActivity(Intent(this@MainActivity, Practice2Activity::class.java))
        }

        mBinding.btnPractice3.setOnClickListener {
            startActivity(Intent(this@MainActivity, Practice3Activity::class.java))
        }

    }
}
