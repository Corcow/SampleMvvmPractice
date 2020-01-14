package com.corcow.samplemvvmproject.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Practice3ViewModel: ViewModel() {
    val counter: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>().apply {
            value = 0
        }
    }

    fun increase() {
        counter.value = counter.value?.plus(1)
    }

    fun decrease() {
        counter.value = counter.value?.minus(1)
    }
}

// MutableLiveData : 데이터를 set해줄 필요가 있는 데이터.
// LiveData : 데이터 변경이 없을 경우.