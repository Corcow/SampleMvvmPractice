package com.corcow.samplemvvmproject.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.corcow.samplemvvmproject.R
import com.corcow.samplemvvmproject.databinding.ActivityMainBinding
import com.corcow.samplemvvmproject.practice.Practice1Activity
import com.corcow.samplemvvmproject.practice.Practice2Activity
import com.corcow.samplemvvmproject.practice.Practice3Activity
import com.corcow.samplemvvmproject.vmshare.VmShareActivity

class MainActivity : AppCompatActivity() {

    /**
     * Android architecture component 스터디
     * 
     */

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

        mBinding.btnVmShare.setOnClickListener {
            startActivity(Intent(this@MainActivity, VmShareActivity::class.java))
        }

    }
}
