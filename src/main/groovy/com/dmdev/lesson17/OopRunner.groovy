package com.dmdev.lesson17

class OopRunner {
    static void main(String[] args) {
        def student = new Student()

        student.firstName = "Ivan"//setFirstName

        println student.firstName  //get
        println student["firstName"]
        println student."firstName"
        //  println  student.@firstName  //not recommend

        def student64 = new Student(firstName: "Bohdan", lastName: "Hnatusiv", age: 64, id: 222)
        println student64

        student64.properties.each { println it }

        Student student1 = ['Svetlana', 'Hnatusiv', 53]
        println student1

        def student2 = ['Sveta', 'Hnatusiv', 53]
        println student2
        println "++++++++-------"
        String.mixin(OopRunner.class)
        "Ivan".printStr()

        def (fn, ln, ag) = student2

        println fn
        println ln
        println ag
        println "-----"

        def (fn1, ln1) = student1

        println fn1
       println ln1

      //  assert [student64, student1].collect { it.firstName } == ["Bohdan", 'Svetlana']
     //   assert [student64, student1]*.firstName == ["Bohdan", 'Svetlana']
     //   assert [student64, student1].firstName == ["Bohdan", 'Svetlana']

    }
       static def printStr(String self){
           println "It's mixin $self"

       }

}
