package com.foo.android_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlin.math.exp

class Calculator : AppCompatActivity() {

    var express = ""
    var bracketcount = 0
    var checkboolean = false
    var checkpoint = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        one.setOnClickListener {
            express += "1"
            text.setText(express)
            checkboolean = true
        }
        two.setOnClickListener {
            express += "2"
            text.setText(express)
            checkboolean = true
        }
        three.setOnClickListener {
            express += "3"
            text.setText(express)
            checkboolean = true
        }
        four.setOnClickListener {
            express += "4"
            text.setText(express)
            checkboolean = true
        }
        five.setOnClickListener {
            express += "5"
            text.setText(express)
            checkboolean = true
        }
        six.setOnClickListener {
            express += "6"
            text.setText(express)
            checkboolean = true
        }
        seven.setOnClickListener {
            express += "7"
            text.setText(express)
            checkboolean = true
        }
        eight.setOnClickListener {
            express += "8"
            text.setText(express)
            checkboolean = true
        }
        nine.setOnClickListener {
            express += "9"
            text.setText(express)
            checkboolean = true
        }
        zero.setOnClickListener {
            express += "0"
            text.setText(express)
            checkboolean = true
        }
        delete.setOnClickListener {
            if (express != "") {
                if(express.get(express.length-1) == '.'){
                    checkpoint = 0
                }
                if(express.get(express.length-1) == '('){
                    bracketcount = 0
                }
                if(express.get(express.length-1) == ')'){
                    bracketcount = 1
                }
                if(checkboolean == false) checkboolean = true
                express = express.substring(0, express.length - 1)
                text.setText(express)
            }
            checkboolean = true
        }
        reset.setOnClickListener {
            express = ""
            bracketcount = 0
            text.setText(express)
            checkboolean = false
            checkpoint = 0
        }
        point.setOnClickListener {
            if(express.isNotEmpty()) {
                if (checkboolean and (express.get(express.length - 1) != ')') and (express.get(express.length - 1) != '(') and (checkpoint == 0)) {
                    express += "."
                    text.setText(express)
                    checkboolean = false
                    checkpoint = 1
                }
            }
        }
        plus.setOnClickListener {
            if (checkboolean) {
                express += "+"
                text.setText(express)
                checkboolean = false
                checkpoint = 0
            }
        }
        subtract.setOnClickListener {
            if (checkboolean) {
                express += "-"
                text.setText(express)
                checkboolean = false
                checkpoint = 0
            }
        }
        multiply.setOnClickListener {
            if (checkboolean) {
                express += "x"
                text.setText(express)
                checkboolean = false
                checkpoint = 0
            }
        }
        divide.setOnClickListener {
            if (checkboolean) {
                express += "÷"
                text.setText(express)
                checkboolean = false
                checkpoint = 0
            }
        }
        bracket.setOnClickListener {
            if (express.isEmpty()) {
                express += "("
                bracketcount++
                Log.d("bracket", "isempty?")
            } else {
                if (bracketcount == 0) {
                    if (((express.get(express.length - 1) == '+') or (express.get(express.length - 1) == '-') or (express.get(
                            express.length - 1
                        ) == 'x') or (express.get(express.length - 1) == '÷') and (express.get(
                            express.length - 1
                        ) != ')'))
                    ) {
                        express += "("
                        bracketcount++
                        Log.d("bracket", " ( ")
                    }
                } else if (!(express.get(express.length - 1) == '(')) {
                    if (!((express.get(express.length - 1) == '+') or (express.get(express.length - 1) == '-') or (express.get(
                            express.length - 1
                        ) == 'x') or (express.get(express.length - 1) == '÷') and (express.get(
                            express.length - 1
                        ) != ')'))
                    ) {
                        var count = 0
                        var i = express.length - 1
                        while(express.get(i) != '('){
                            Log.d("인덱스i",express.get(i).toString())
                            if((express.get(i) == '+') or (express.get(i) == '-') or (express.get(i) == 'x') or (express.get(i) == '÷')){
                                count ++
                                Log.d("count","괄호안에 연산자 있음")
                            }
                            i--
                        }
                        if(count==0){
                            for (j in express.length-1 downTo 0){
                                if (express.get(j) == '('){
                                    Log.d("인덱스 j",express.get(j).toString())
                                    Log.d("find!","(이놈 찾았다")
                                    express = express.substring(0, j) + express.substring(j+1, express.length)
                                    bracketcount = 0
                                    break
                                }
                            }
                        }
                        else {
                            express += ")"
                            bracketcount = 0
                            Log.d("bracket", " ) ")
                        }
                    }
                }
            }
            text.setText(express)
            checkboolean = true
        }
        result.setOnClickListener {

        }
    }
}