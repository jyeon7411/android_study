package com.foo.fastcampus_1.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형(참 True/ 거짓 False) -> Boolean

// 변수 선언하는 방법(1)
// Variable/Value 변수명 = 값
// var/val 변수명 = 값
var number = 10

// 변수 선언하는 방법(2)
// var/val 변수 : 자료형 = 값
// 코틀린은 자료형을 적어주지 않으면 값을 보고 알아서 자료형을 추정해서 정함
// 자료형을 명시적으로 적어주는 것이 더 좋음 (직관적)
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

// Variable or Value?
// -1. 변하지 않는 값이라면 Value
// -2. 어떻게 될지 모르겠다! -> Value


fun main(array: Array<String>){
    number = 20
  // number = 20.5 -> 같은 자료형으로만 값을 바꿀 수 있음

}