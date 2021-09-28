package com.dmdev.lesson10

class ConditionRunner {
    /*
    *boolean
    *
    */
    static void main(String[] args) {
        int x=10
        if (x) {
            println x
        }
        def person = new Person(11)
        if (person) {
            println person.getId()
        }
        println(person?.getId())

        if (x){
            println x
        }else {
            println 2
        }


        def result = x ?: 2
        println result
    }
}
