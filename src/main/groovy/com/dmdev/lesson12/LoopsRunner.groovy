package com.dmdev.lesson12

class LoopsRunner {
    static void main(String[] args) {
      def  list=[1,2,3,4]
        for (int i=0;i<list.size();i++){
            println list[2]
        }
        def  list2 =[1,3,5,7]
        println "------"
        for (i in 0..list2.size()) {
            println list2[i]
        }

        def  list3 =[1,3,5,7]
        println "------"
        for (i in list3.size()-1..0) {
            println list3[i]
        }
        def  list4 =[1,3,5,7]
        println "------"

        for(Integer value:list4){
            println value
        }
        def  list5 =[1,3,5,7,9]
        println "------"
        for (value in list5){
            println value
        }
        def  list6 =[1,3,5,7,9,11]
        println "------"

       1.step(6,1){
           println  list6[it]
       }
    }

}
