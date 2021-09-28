package com.dmdev.lesson13

class ListRunner {
    static void main(String[] args) {
        def list = [1, 3, 5, 6]
        assert list.getClass() == ArrayList

        assert list[2] == 5
        assert list.get(2) == 5
        assert list[-1] == 6
        assert list[3] == 6
        assert list[1..3] == [3, 5, 6]
        assert list[8] == null

        list += 9
        assert list[4] == 9

        list << 11 << 13<<7<<7
        assert list == [1, 3, 5, 6, 9, 11,13,7,7]
        list-=7
        list-=3
        list-=1

        assert list == [5, 6, 9, 11,13  ]
        list*=3
        assert list==[5, 6, 9, 11,13,5, 6, 9, 11,13,5,6, 9, 11,13]

        list.push(999)
        assert list==[999,5, 6, 9, 11,13,5, 6, 9, 11,13,5,6, 9, 11,13]
        assert  list.pop()==999
        assert list==[5, 6, 9, 11,13,5, 6, 9, 11,13,5,6, 9, 11,13]
      //  assert list.head()==5
        assert list.tail()== [6, 9, 11,13,5, 6, 9, 11,13,5,6, 9, 11,13]
        assert list.last()==13

        assert [1,2,[3,4,6],9].flatten()== [1,2,3,4,6,9]
        assert [1,2,3,4,6,9].reverse()== [9, 6, 4, 3, 2, 1]
        assert [1,2,3].intersect([2,3,7])==[2,3]
        assert [1,2,3].disjoint([5,7,4])

        def (a,b,c)=[3,5,7,9,10]
        assert a==3
        assert c==7
        assert b==5


        func(*[8, 11])
    }
 static def func(def a,def b){
     println a
     println b
 }
}
