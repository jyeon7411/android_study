package com.foo.android_study

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_open_internet.*

class OpenInternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_internet)

        openinternet.setOnClickListener{
            var address = inputaddress.text.toString()
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse(address))
            startActivity(intent)
        }

        inputaddress.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("test","beforeTextchange : " + s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("test","onTextchange : " + s)
            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("test","afterTextchange : " + s)
            }
        })
    }
}