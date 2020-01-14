package com.corcow.samplemvvmproject.view.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.corcow.samplemvvmproject.R
import com.corcow.samplemvvmproject.databinding.ActivityPractice2Binding
import com.corcow.samplemvvmproject.databinding.ActivityPractice3Binding
import com.corcow.samplemvvmproject.vm.Practice2ViewModel
import com.corcow.samplemvvmproject.vm.Practice3ViewModel

class Practice3Activity : AppCompatActivity() {
    // Practice 1. Just use DataBinding.
    // Practice 2. Use ViewModel.
    /** Practice 3. Use LiveData. **/

    // DataBinding
    val mBinding: ActivityPractice3Binding by lazy {
        DataBindingUtil.setContentView(this, R.layout.activity_practice3) as ActivityPractice3Binding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰모델 가져오기
        val vm = ViewModelProviders.of(this)[Practice3ViewModel::class.java]

        // DataBinding with ViewModel
        mBinding.apply {
            lifecycleOwner = this@Practice3Activity     // 바인딩 객체에 LifeCycleOwner 설정.
            viewModel = vm                              // xml에서 쓸 뷰모델
        }
    }

    /**
     * findViewById() 사용이 사라졌다.
     * 뷰모델을 사용하므로써 데이터가 컴포넌트 라이프사이클의 영향을 받지 않게 되었다.
     * LiveData를 사용함으로써 뷰에 직접 데이터를 세팅해줄 필요가 없어졌다.
     * viewModel의 값만 변경해주면 된다.
     */

    // 3-2 적용하면서 제거된 코드. 데이터바인딩에 viewmodel 적용하면서 완벽히 분리. 아래 로직은 필요없어짐.
    // 뷰모델의 LiveData 관찰하기. (데이터 변경 시 ui를 redraw하도록)
//        viewModel.counter.observe(this, Observer<Int> {
//            // update ui
//            mBinding.textOutput.text = "$it"
//        })
//
//        mBinding.fabDecrease.setOnClickListener { viewModel.decrease() }
//        mBinding.fabIncrease.setOnClickListener { viewModel.increase() }

}
