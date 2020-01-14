package com.corcow.samplemvvmproject.vmshare


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.corcow.samplemvvmproject.R

import com.corcow.samplemvvmproject.databinding.FragmentSeekbarBinding
import com.corcow.samplemvvmproject.vm.SeekbarFragViewModel

/**
 * A simple [Fragment] subclass.
 */
class SeekbarFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seekbar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vm = ViewModelProviders.of(activity!!)[SeekbarFragViewModel::class.java]

        val binding: FragmentSeekbarBinding? = DataBindingUtil.bind(view)
        binding?.seekBar?.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                vm.progress.value = progress
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        // 바인딩 객체에 뷰모델 전달하기.
        binding?.vm = vm
        binding?.lifecycleOwner = requireActivity()     // 라이프사이클은 이 프래그먼트를 소유한 액티비티로.

        // 위 2 라인에 의해, 뷰모델을 뷰에서 처리하므로 필요없음
//        vm.progress.observe(requireActivity(), Observer { progress ->
//            binding?.seekBar.progress = progress
//        })
    }

}
