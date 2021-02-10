package com.foo.android_study

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*


class FragmentOne:Fragment(){

    interface OnDataPassListener{
        fun onDataPass(data: String?)
    }

    lateinit var dataPassListener : OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("Life_cycle", "F onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Life_cycle", "F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Life_cycle", "F onCreateView")

        // 프라그먼트가 인터페이스를 처음으로 그릴 때 호출됨
        // inflater -> 뷰를 그려주는 역할
        // container -> 부모뷰
        return inflater.inflate(R.layout.fragment_one, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Life_cycle", "F onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        // Activity의 Oncreate에서 했던 작업을 여기에서 함
        pass.setOnClickListener{
            dataPassListener.onDataPass("Good Bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Life_cycle", "F onActivityCreated")

        val data = arguments?.getString("hello")
        if (data != null) {
            Log.d("data", data)
        }

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("Life_cycle", "F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Life_cycle", "F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Life_cycle", "F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Life_cycle", "F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Life_cycle", "F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Life_cycle", "F onDetach")
        super.onDetach()
    }
}
