package com.dmdev

import java.sql.DriverManager


class HelloWorld {



   static void main(String[] args) {
           String value = "Hello  World !"
           Class<String> clazz = value.getClass();
          println(value);
           println(clazz);
          // assert clazz = String.class;
           println clazz.getClassLoader()
           println DriverManager.class.getClassLoader()
           println HelloWorld.class.getClassLoader()
       println()
        println "Hello  Human !"
    }
}
