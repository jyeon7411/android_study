package com.foo.android_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass", ""+data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("Life_cycle", "onCreate")

        val fragmentOne: FragmentOne = FragmentOne()
        // 프라그먼트에 data를 넣어주는 방법
        val bundle : Bundle = Bundle()
        bundle.putString("hello", "hello")
        fragmentOne.arguments = bundle

        button.setOnClickListener {
            // 프라그먼트를 동적으로 작동시키는 법
            // 프라그먼트 붙이는 방법 replace/add
            val fragmentManager: FragmentManager = supportFragmentManager

            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction() // 시작
            fragmentTransaction.replace(R.id.container, fragmentOne) // 할 일
            fragmentTransaction.commit() // 끝

            // 끝을 내는 방법
            // commit -> 시간 될 때 해! ( 좀 더 안정정 )
            // commitnow -> 지금 당장해!
        }

        button2.setOnClickListener{
            // 프라그먼트 remove/detach 하는 법
            // remove -> 사라졌다 다시 붙일 수 있음
            // detach -> 아예 떼는거
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Life_cycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life_cycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life_cycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life_cycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life_cycle", "onDestroy")
    }
}