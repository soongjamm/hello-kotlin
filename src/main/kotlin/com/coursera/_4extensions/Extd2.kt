package com.coursera._4extensions

open class Parent
class Child : Parent()

fun Parent.foo() = print("parent")
fun Child.foo() = print("child")

fun main() {
    val p: Parent = Child()
    p.foo() // Parent.foo() 와 같다. 상속하려면 클래스 내부에 함수를 정의하고 이를 오버라이드 해야.
}