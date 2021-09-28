package com.dmdev.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 1 two 22 three 333"
        // String regex ="\\w+ \\d+"
        String regex = /(\w+) (\d+)/

        // Pattern pattern = Pattern.compile(regex)
        //   Pattern pattern = ~regex
        // Matcher matcher = pattern.matcher(value)
        Matcher matcher = value =~ regex


        // boolean result=  matcher.matches()
        boolean result = value ==~ regex

        println(result)
        println("========")
        while (matcher.find()) {
            println matcher.group()
            println matcher.group(1)
            println matcher.group(2)
            println "============"
        }
        println(matcher[0][2])
        println(matcher[1][0])
        println(matcher[2])
        println matcher[0..2]
        println  matcher[0][1]
        println("//////")

       matcher.each (group->println group)
     println("|||||||||||||||||")
        matcher.each ((group,group1,group2)->{
          println(group)
            println(group1)
            println(group2)
        })

    }
}
