package com.dmdev.lesson25

import com.dmdev.lesson17.Student

class Closure2Runner2 {
    static void main(String[] args) {

        Closure closure = {
            firstName = "Sveta2"
            println firstName
            println "sv"

        }
        println closure.thisObject
        println closure.owner
        println closure.delegate
        println "----"
        println closure
        println "-----"
        def student = new Student("Ivan", "Ivanenko", 19)
        println student
        println "====="
        def name2 = closure.delegate = student.firstName
        println name2

        println closure.delegate ="Svetlana"
        closure.delegate= "Mike"
        println closure.delegate="Likes"
        println "?/////?"
        closure.delegate=student
        closure()
        println student
        println "oooooo"
        student.with {
            firstName="Grif"
            println firstName
        }
        println "oooooo"
        println student
        println "----"
        student.with closure
        println "-----"
        println "-----"
        println student
        student.getInfo().call()
    }
}