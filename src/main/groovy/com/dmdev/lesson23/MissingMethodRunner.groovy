package com.dmdev.lesson23

import com.dmdev.lesson17.Student

class MissingMethodRunner {
    static void main(String[] args) {
      def  student  =new Student()
      //  student.test()
        println student.abc

        def map = ["1": 11,"2":22,"abc":343]
        println map."1"
        println map."abc"



        student.findByAge(64)
    }
}
