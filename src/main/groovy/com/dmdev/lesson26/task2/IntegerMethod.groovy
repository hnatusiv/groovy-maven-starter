package com.dmdev.lesson26.task2

@Category(Integer)
class IntegerMethod {

    def getCm(){
        this*10
    }

    def getMm(){
        this
    }
    def getM(){
        getCm()*100
    }

}
