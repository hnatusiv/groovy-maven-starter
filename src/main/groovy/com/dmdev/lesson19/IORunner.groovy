package com.dmdev.lesson19

import groovy.io.FileType

class IORunner {
    static void main(String[] args) {

        //read
        def file = new File("groovy-maven-starter.iml")
        println file.text  //read
        println "----"

        file.each { line -> println line }
        println "-----"

        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }
        def writer = new StringWriter()
        try (def reader = file.newReader()) {
            writer << reader
        }


        println "----"
        //write
        def file2 = new File("text.text.text")
        file2.text = "Some text"
        file2 << "   New line " << System.lineSeparator()
        println file2


        def srcDir = new File("src")
        srcDir.eachDir { println it }
        println "-----"
        srcDir.eachDirRecurse { println it }
        println "======="
        srcDir.eachFile(FileType.DIRECTORIES) { println it}
        println "========"
        def targetDir = new File("target")
        targetDir.eachDir { println it }
        println "-----"
        targetDir.eachDirRecurse { println it }

    }
}
