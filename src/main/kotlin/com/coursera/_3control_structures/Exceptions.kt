package com.coursera._3control_structures

import java.io.IOException
import kotlin.jvm.Throws


// 코틀린은 Checked, Unchecked 구분이 없는데,
// Throws 어노테이션을 안붙여주면 자바에서 Checked 를 try-catch 로 안묶어주었다고 컴파일 에러를 낸다.

fun main() {
    foo()
}

fun foo(): Nothing = bar()

@Throws(IOException::class)
fun bar(): Nothing = throw IOException()
