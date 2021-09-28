package com.dmdev.lesson24

import com.dmdev.lesson17.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr(){
        println  "$age,$firstName,$lastName"
    }
   static def anotherMethod(Student self,String value){
       println"$self,args:$value"

   }
}
