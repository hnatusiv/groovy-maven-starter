package com.dmdev.lesson17

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder


@ToString
@TupleConstructor
//@EqualsAndHashCode
//@Canonical
//@Immutable
@Builder

class Student implements WithId {
    String firstName
    String lastName
    Integer age

    def methodMissing(String name, Object arguments) {
        println "missing method $name is invoked: $arguments"
        def field = name - "findByAge"
        //  def  fieldValue = this."$field"
        println "select * from Student where $field = ${arguments[0]}"
    }


    def propertyMissing(String name) {
        println "missing property $name"
        "default value"

    }

    def getInfo() {
        Closure closure = {
            println thisObject //==this
            println owner
            println delegate
          Closure second = {
                println thisObject //==this
                println owner
                println delegate
            }
            second()
        }
        closure
    }
}
