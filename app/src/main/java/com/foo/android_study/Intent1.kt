package com.foo.android_study

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent1.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        change_activity.setOnClickListener{

              // 명시적 인텐트 -> 정확히 대상을 설정
//            var intent = Intent(this@Intent1, Intent2::class.java)

//            // Key, Value 방식 -> Key와 value를 쌍으로 만들어 저장한다. -> Dictionary
//            intent.putExtra("number1", 1)
//            intent.putExtra("number2",2)
//            startActivity(intent)
//
//            var intent2 = Intent(this@Intent1, Intent2::class.java)
//            // Apply -> putExtra를 모아서 볼 수 있음
//            intent2.apply {
//                this.putExtra("number1",10)
//                this.putExtra("number2",20)
//            }
//            startActivityForResult(intent2,200)

            // 암시적 인텐트 -> 대상x, 행동을 지정
           val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode==200) {
            Log.d("number", "" + requestCode)
            Log.d("number", "" + resultCode)
            val result = data?.getIntExtra("result",0)
            Log.d("number","" + result)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}