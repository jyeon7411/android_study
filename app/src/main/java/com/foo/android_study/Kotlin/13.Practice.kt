package com.foo.android_study.Kotlin

fun main(array: Array<String>) {

    val array = arrayOf<Int>(1, 2, 3) // array의 bound는 3


    // get, set
    val number = array.get(0)
    println(number)
    // val number1 = array.get(100) // 인덱스 초과 -> Exception in thread 발생

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)
    // array.set(100, 100) // 인덱스 초과 -> Exception in thread 발생

    // Array 의 Bounds
    // - 처음 만들때 결정 된다


    // Array를 만드는 방법(3) -> Type 에 맞는 값만 배열에 저장 가능
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'c') // char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)


    // Array를 만드는 방법(4) -> lambda 를 활용한 방법
    var a5 = Array(10, { 0 }) // 0부터 9까지 0으로 채워짐
    var a6 = Array(5, { 1;2;3;4;5 })


}