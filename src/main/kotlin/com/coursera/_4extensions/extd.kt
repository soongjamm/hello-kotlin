package com.coursera._4extensions

fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

// member always beat static.
// 그래서 동일한 시그니쳐로 확장하면, 무시된다.
// 그러나 오버로드는 가능하다. 만약 인자를 추가한다거나.. 하면 그건 ㅇㅋ
fun List<Int>.sum2(): Int {
    println("this is custom sum")
    var result = 0
    val iterator = this.iterator()
    while (iterator.hasNext()) {
        result += iterator.next()
    }
    return result
}

fun main(args: Array<String>) {
//    val sum = sum(listOf(1, 2, 3))
//    println(sum)    // 6
    println("kim".hello())
    println(listOf(1, 2, 3).sum2())
}

fun String.hello() {
    println("hello~ ${this}~")
}

// 확장함수는 member 를 숨기지 못한다. 자바에서 스태틱을 찾는 방법과 똑같이 동작하기 때문이다.
// 그러나 오버로드는 가능하다.
