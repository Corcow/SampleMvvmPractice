package com.corcow.samplemvvmproject.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SeekbarFragViewModel: ViewModel() {
    var progress: MutableLiveData<Int> = MutableLiveData()
}