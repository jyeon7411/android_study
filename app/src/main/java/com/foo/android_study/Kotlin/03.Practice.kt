package com.foo.android_study.Kotlin



var a = 1 + 2 + 3 + 4 + 5 // 연산의 결과값을 변수에 넣어줄 수 있음
var b = "1"
var c = b.toInt() // b(String)를 int형으로 바꿔서 저장
var d = b.toFloat() // b를 float형으로 바꿔서 저장

var e = "John"
var f = "My name is $e Nice to meet you"

// Null -> 존재하지 않는다

// var abc : Int = null -> int형은 null을 받을 수 없음
var abc1 : Int? = null // 자료형 뒤에 '?' 를 붙혀주면 null을 가질 수 있음
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)
    println(abc1)
    println(abc2)

    println(g)

}