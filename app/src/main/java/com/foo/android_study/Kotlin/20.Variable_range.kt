package com.foo.android_study.Kotlin


// 변수의 접근 범위
// 1. 전역 변수 -> 어디에서든 접근 가능
// 2. 지역 변수 -> 해당 지역에서만 접근 가능

var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)

}

// name은 class 안에서 접근 가능
class Test(var name: String) {

    fun testFun() { // birth는 이 함수 안에서만 접근 가능
        var birth: String = "2000/3/1"
        name = "홍길동"
        number100 = 100
        fun testFun2() {
            var gender: String = "male"
        }
    }

    fun testFun2() {
        name // 접근 가능
//        birth -> 접근 불가능
    }
}