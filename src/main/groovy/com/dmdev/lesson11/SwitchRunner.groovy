package com.dmdev.lesson11

import com.dmdev.lesson10.Person

class SwitchRunner {
    static void main(String[] args) {
      int x=3
        switch (x){
            case String:
                println 0
                break
            case 5:
                println 1
                break
           case new Person(x):
               println 5
                break

          case ~/\d+/:
              println 2
                break

            case {it%3==0}:
                println "/3 ==0"
                break
            case [1,4,7,8,10]:
                println "Array"
                break
            case new Person(29):
                println 29
                break
            default:
                println "None"
                break
        }
        if (x in [1,3,6,8]){
            println x
        }

    }
}
