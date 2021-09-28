package com.dmdev.lesson25

import com.dmdev.lesson17.Student

class Closure2Runner {
    static void main(String[] args) {

        Closure closure = {
            firstName = "Ann"
        }

        println closure.thisObject
        println closure.owner
        println closure.delegate


        def student = new Student("Ivan", "Ivanochko", 29)
        println student

        closure.delegate = student
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()

        student.with closure

        println student
        student.getInfo()()
    }
}
