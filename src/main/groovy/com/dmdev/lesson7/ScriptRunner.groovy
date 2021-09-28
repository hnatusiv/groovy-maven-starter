package com.dmdev.lesson7

/*
*" "
*' '
* """ """
* ''' '''
* / /
* $/   /$
*/

def  name="Ivan"
def value='Hello "Hi!"'

println(name)
println(value)
def stringValue= "Hello $name  , $name"
println(stringValue)

def value2 = """
SELECT
FROM
table where name  = ?
"""
println(value2)

def val4=/Hello world $name/
def val5=$/Hello world $name/$

println(val4)
println(val5)
println(name[2])
println(name[-3])
println(name[1..3])
println(name*3)
println((name-'Iv')*4)
print(name-'n')
