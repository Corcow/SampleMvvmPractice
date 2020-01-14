package com.corcow.samplemvvmproject.view.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.corcow.samplemvvmproject.R
import com.corcow.samplemvvmproject.databinding.ActivityPractice1Binding

class Practice1Activity : AppCompatActivity() {
    /** Practice 1. Just use DataBinding. **/
    // Practice 2. Use ViewModel.
    // Practice 3. Use LiveData.

    // DataBinding
    val mBinding: ActivityPractice1Binding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_practice1) as ActivityPractice1Binding
    }

    // BusinessLogic property...
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding.textOutput.text = "$counter"

        mBinding.fabDecrease.setOnClickListener {
            counter--
            mBinding.textOutput.text = "$counter"
        }

        mBinding.fabIncrease.setOnClickListener {
            counter++
            mBinding.textOutput.text = "$counter"
        }
    }

    /**
     * findViewById() 사용이 사라졌다.
     *
     * 한계?
     * Orientation 변경 시 onCreate() 호출되면
     * Activity 라이프사이클이 변경됨과 동시에 데이터가 초기화된다.
     * 뷰에 표현될 데이터가 컴포넌트 라이프사이클에 의존적이다.
     */
}
