package com.foo.android_study.Kotlin

// 두번까지는 봐준다
// 두번 이상이 넘어가면 리펙토링 해라

// 25. 상속
// 부모로부터 설명서를 물려받는다!

fun main(args: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
//    superCar100.stop()
//
//    val bus100: Bus100 = Bus100()
//    bus100.drive()
}

// 부모 : Car100
// 자식 : SuperCar100, Bus100

// 상속받을 수 있게 하려면 private을 지우고 open을 써줌
open class Car100() {
    open fun drive(): String { // 자식 클래스에서 override 하기 위해서 open으로 바꿔줌
        return "달린다"
    }

    fun stop() {

    }
}

// class 는 앞에 private 이 생략됨
class SuperCar100() : Car100() { // car100을 상속받음
    override fun drive(): String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}