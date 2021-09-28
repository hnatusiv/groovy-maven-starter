package com.dmdev.lesson22

import com.dmdev.lesson17.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class MetaClassRunner {
    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass()
        println "Hello!!!!"

        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)


        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")
        printlnMethod.invoke(student,student,"Test 2")

       // MetaClassImpl
        println  student
        println  student.metaClass
        println student.metaClass.methods

       // ExpandoMetaClass
        println student.metaClass.abc="Test property "
        println "-----"
      println student.metaClass.properties
        println "-----"
       student.metaClass.test={
           println " It's a new methods "
       }
       student.test()
        println "-----"
        println '-----'
        student.class.metaClass.newMethod={int value ->
            println "New Method in class Student,$value"
        }
      //  student.newMethod(28)
        new Student().newMethod(28)
        println student.metaClass
    }
}
