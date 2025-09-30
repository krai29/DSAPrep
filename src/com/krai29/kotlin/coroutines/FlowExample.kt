package com.krai29.kotlin.coroutines

import kotlinx.coroutines.flow.flow

suspend fun main(){                    // or main() = runBlocking{}
    val helloFlow = flow{
        emit("Hello")
        emit("I")
        emit("am")
        emit("happy")
        emit("to")
        emit("see you")
    }

    helloFlow.collect{value ->
        println(value)
    }
}