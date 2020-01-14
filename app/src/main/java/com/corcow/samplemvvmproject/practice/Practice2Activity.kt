package com.corcow.samplemvvmproject.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.corcow.samplemvvmproject.R
import com.corcow.samplemvvmproject.databinding.ActivityPractice2Binding
import com.corcow.samplemvvmproject.vm.Practice2ViewModel

class Practice2Activity : AppCompatActivity() {
    // Practice 1. Just use DataBinding.
    /** Practice 2. Use ViewModel. **/
    // Practice 3. Use LiveData.
    /**
     * findViewById() 사용이 사라졌다.
     * 뷰모델을 사용하므로써 데이터가 컴포넌트 라이프사이클의 영향을 받지 않게 되었다.
     *
     * 한계?
     * 뷰와 로직의 완전 분리가 되진 않았음.
     */

    // DataBinding
    val mBinding: ActivityPractice2Binding by lazy {
        DataBindingUtil.setContentView(this,
            R.layout.activity_practice2
        ) as ActivityPractice2Binding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰모델 가져오기
        val vm = ViewModelProviders.of(this)[Practice2ViewModel::class.java]

        mBinding.textOutput.text = "${vm.counter}"
        mBinding.fabDecrease.setOnClickListener {
            vm.counter--
            mBinding.textOutput.text = "${vm.counter}"
        }
        mBinding.fabIncrease.setOnClickListener {
            vm.counter++
            mBinding.textOutput.text = "${vm.counter}"
        }
    }

}
