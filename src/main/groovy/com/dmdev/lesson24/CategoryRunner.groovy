package com.dmdev.lesson24

import com.dmdev.lesson17.Student

class CategoryRunner {
    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Nick",lastName:"Bondar")
        println student.firstName
        use(DefaultStudentMethods.class){
            student.testStr()
            student.anotherMethod("Test arg")
        }
      //  student.testStr()
    }
}
