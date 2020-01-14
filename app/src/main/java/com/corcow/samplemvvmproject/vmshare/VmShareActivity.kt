package com.corcow.samplemvvmproject.vmshare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.corcow.samplemvvmproject.R
import com.corcow.samplemvvmproject.databinding.ActivityVmShareBinding

class VmShareActivity : AppCompatActivity() {

    /**
     * 프래그먼트간에 주고받을 데이터를 뷰모델로 공유하여 사용해보자.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vm_share)
    }

}
