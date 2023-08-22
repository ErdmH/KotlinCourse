package com.example.myapplication.Maps

fun main(){
    val mymap = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(mymap)
    val mymap2 = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(mymap2)
    val theMap = HashMap<String, Int>()

    theMap["one"] = 1
    theMap["two"] = 2
    theMap["three"] = 3
    theMap["four"] = 4
    theMap["five"] = 5

    println("Entries: " + theMap.entries)
    println("Keys:" + theMap.keys)
    println("Values:" + theMap.values)

    val itr = theMap.keys.iterator()
    while (itr.hasNext()) {
        val key = itr.next()
        val value = theMap[key]
        println("${key}=$value")
    }

    for ((k, v) in theMap) {
        println("$k = $v")
    }
    theMap.forEach {
            k, v -> println("Key = $k, Value = $v")
    }

    println("Size of the Map " + theMap.size)
    println("Size of the Map " + theMap.count())

    if(theMap.containsKey("two")){
        println(true)
    }else{
        println(false)
    }

    if(theMap.containsValue(2)){
        println(true)
    }else{
        println(false)
    }

    if(theMap.isEmpty()){
        println(true)
    }else{
        println(false)
    }

    println("The value for key two " + theMap.get("two"))
    println("The value for key two " + theMap["two"])

    val firstMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val secondMap = mapOf("one" to 10, "four" to 4)
    val resultMap = firstMap + secondMap

    println(resultMap)

    val theKeyList = listOf("one", "four")
    val resultMap2 = theMap - theKeyList
    println(resultMap2)

    theMap.remove( "two")    // remove() method and -= operator to remove the element from a mutable map
    println(theMap)

    theMap -= listOf("three")
    println(theMap)

    var resultMap3 = theMap.toSortedMap()    //toSortedMap() method to sort the elements in ascending order = artan sıralama,
    println(resultMap3)                      //or sortedDescending() method to sort the set elements in descending order = azalan sıralama.

    var resultMap4 = theMap.filterValues{ it > 2}
    println(resultMap4)

    resultMap4 = theMap.filterKeys{ it == "two"}
    println(resultMap4)

    resultMap4 = theMap.filter{ it.key == "two" || it.value == 4}
    println(resultMap4)

    val resultMap5 = theMap.map{ (k, v) -> "Key is $k, Value is $v" }   //map() method to map all elements using the
    println(resultMap5)                                                 //provided function

    println(theMap)
    theMap["seven"] = 7
    println(theMap)
    theMap.put("nine",9)
    println(theMap)
}