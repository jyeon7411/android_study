package com.foo.android_study.Kotlin

// 16. Iterable

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)


    // 반복하는 방법 (1)
    for (item in a) {
        if (item == 5) {
            println("item is Five")
        } else {
            println("item is not Five")
        }
    }
    println()

    // 반복하는 방법 (2)
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value : " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무거나  = 문자열
    }
    println()

    // 반복하는 방법 (3)
    // lambda
    a.forEach { // 반복되는 변수가 자동으로 it으로 지정됨
        println(it)
    }
    println()

    // 반복하는 방법 (4)
    a.forEach { item ->
        println(item)
    }
    println()

    // 반복하는 방법 (5)
    a.forEachIndexed { index, item ->
        println("index : " + index + " value : " + item)
    }

    // 반복하는 방법 (6)
    println(a.size)

    println()
    for (i in 0 until a.size) {
        // until은 마지막을 포함 하지 않는다
        // 0 부터 8까지 이다
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (7)
    for (i in 0 until a.size step (2)) { // -> 2만큼 증가
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (8)
    for (i in a.size - 1 downTo (0)) { // a.size - 1 = 8
        // 8 부터 0 까지 반복
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (9)
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a.get(i))
    }
    println()

    // 반복하는 방법 (10)
    for (i in 0..a.size) {
        // .. -> 마지막을 포함한다 , until 은 마지막 포함x
        println(i)
    }
    println()

    // 반복하는 방법 (11)
    var b: Int = 0 // -> 1 -> 2 -> 3 -> 4
    var c: Int = 4

    while (b < c) {
        b++ // while문을 정지 시키시키기 위한 코드
        println("b")
    }


    var d: Int = 0
    var e: Int = 4
    println()

    // 반복하는 방법 (12)
    // while문안의 조건문이 거짓이라도 반드시 한번은 실행됨
    do {
        println("hello")
        d++
    } while (d < e)


}