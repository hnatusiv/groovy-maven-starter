package com.dmdev.lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner2 {

    static void main(String[] args) {
        //  Function<Integer, Integer> function = value -> value + value
        // def result = function.apply(5)
        //  println result
        println "-----"
        Closure closure = {
           println it
            2 * it
        }
        println "-----"
        def result1 = closure(5)
        println result1
        Stream.of(1, 2, 3, 4, 6)
                .map(closure)
                .map(String::valueOf)
                .forEach(System.out::println)

        Closure closure1={
            println it
            (( it+it)/0.5)+ 45
        }
        println "||||||||||"
        println closure1(10)
        println "||||||||||"
    }
}
