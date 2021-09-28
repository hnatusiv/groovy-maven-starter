package com.dmdev.lesson14

class MapRunner {
    static void main(String[] args) {

        def map1=[:]
        assert map1.getClass()==LinkedHashMap
        def map = [one:1,two:2,three:3]
        assert map.getClass()==LinkedHashMap

        assert map.get("one")==1
        assert  map["one"]==1
        assert map."one"==1
        assert map.get("qwo",10)==10
        assert map.get("one",1)==1

       map.one=111
        assert  map["one"]==111

        assert map.subMap("one","two")==[one:111,two:2]

        def newMap =[q:22,rt:33,*:map]
        assert newMap==[q:22,rt:33,one:111,two:2,three:3,qwo:10]

    }

}
