package com.foo.android_study.Kotlin

fun main(array: Array<String>) {

    val calculator1 = Calculator()
    calculator1.Plus(23,35)
    calculator1.Minus(235,53)
    calculator1.Multiply(53,23)
    calculator1.Divide(53,2)
    println()

    val Bank1 = Bank("박지원", "000520")
    Bank1.Deposit(25000000)
    Bank1.Withdraw(100000)
    Bank1.Check()
    println()

    val TV1 = TV(listOf<String>("SBS","KBS","MBC"))
    TV1.switch()
    TV1.channelDown()
    TV1.checkCurrentChannel()
    TV1.channelUp()
    TV1.checkCurrentChannel()
    TV1.channelUp()
    TV1.checkCurrentChannel()
    TV1.switch()
}

class Calculator {
    var result: Int = 0

    fun Plus(x:Int, y:Int) {
        result = x + y
        println("$x + $y = $result")
    }

    fun Minus(x:Int, y: Int) {
        result = x - y
        println("$x - $y = $result")
    }

    fun Multiply(x:Int, y:Int) {
        result = x * y
        println("$x * $y = $result")
    }

    fun Divide(x:Int, y:Int) {
        result = x / y
        println("$x / $y = $result")
    }
}

class Bank {
    var name: String
    var birth: String
    var money: Int

    constructor(name: String, birth: String) {
        this.name = name
        this.birth = birth
        this.money = 0
    }

    fun Check() {
        println("잔고는 $money 원 입니다")
    }

    fun Deposit(x: Int) {
        money += x
    }

    fun Withdraw(x: Int) {
        money -= x
    }
}

class TV(val channels: List<String>){
    var onOrOff: Boolean = false // True -> On , False -> Off
    var currentChannelNumber = 0
        set(value) { // 변수에 값이 할당될 때 호출됨
            field = value
            if (field > 2) { // 채널이 더이상 올라갈 때가 없을 때
                println("0으로 바꾸기!")
                field = 0
            }
            if (field < 0) { // 채널이 더이상 내려갈 때가 없을 때
                println("2로 바꾸기!!")
                field = 2
            }
        }

    fun switch() {
        onOrOff = !onOrOff
        println(onOrOff)
    }

    fun checkCurrentChannel() {
        println(channels[currentChannelNumber])
    }

    fun channelUp() {
        currentChannelNumber = currentChannelNumber + 1
    }

    fun channelDown() {
        currentChannelNumber = currentChannelNumber - 1
    }
}