package com.dmdev.lesson9

import java.util.function.Function
import java.util.stream.Stream

class ClosureRunner {
    static void main(String[] args) {

        Closure closure  ={value =78->
            println value
            value+value
        }
        def result = closure()
        println  result

        Stream.of(1,2,3,4)
        .map(closure)
        .map(String.&valueOf)
        .forEach(System.out::println)
        int x=2
        check(x>0){ println x}
       // println x
        println x**32
    }
    static  def check (boolean condition,Closure closure){
        if (condition){
            closure()

        }
    }
}
