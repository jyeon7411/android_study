package com.foo.android_study.Kotlin

fun main(array: Array<String>) {


    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4) // 인덱스 생략시 맨 뒤에 추가됨
    println(a)
    a.add(0, 100) // 추가, 기존 값들이 밀려남
    println(a)
    a.set(0, 200) // 기존 값을 변경함
    println(a)
    a.removeAt(1) // 1번 인덱스를 제거
    println(a)


    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println()
    b.add(2) // 집합은 중복을 허용x
    println(b)
    b.remove(2)
    println(b)
    b.remove(100) // 없는 값이라면 그냥 내버려둠, error 발생x
    println(b)


    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c.put("two", 2)
    println(c) // { } 로 표시됨됨
   c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)


}