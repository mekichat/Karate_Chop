fun chopInToHalf(input:Int, list: Array<Int>):Int{
    /*assert_equal(-1, chop(3, []))
    assert_equal(-1, chop(3, [1]))
    assert_equal(0,  chop(1, [1]))
    #
    assert_equal(0,  chop(1, [1, 3, 5]))
    assert_equal(1,  chop(3, [1, 3, 5]))
    assert_equal(2,  chop(5, [1, 3, 5]))*/
    if(list.size in 1..3){
        for(num in list) if(num == input) return list.indexOf(num)
    }
    if(list.size == 4){
        for(num in list.sliceArray(0..1)) if(num == input) return list.indexOf(num)
        for(num in list.sliceArray(2..3)) if(num == input) return list.indexOf(num)
    }
    if(list.size > 4){
        val firstLength = list.size / 2
        val secondLength = list.size - firstLength
        val intermediateLength = list.size - firstLength
        val lastLength = intermediateLength +1
        for(num in list.sliceArray(0..firstLength)) if(num == input) return list.indexOf(num)
        for(num in list.sliceArray(secondLength until intermediateLength)) if(num == input) return list.indexOf(num)
        for(num in list.sliceArray(lastLength  until list.size)) if(num == input) return list.indexOf(num)
    }

    return -1
}

fun chopRecursive(input:Int, list: Array<Int>?):Int{
    /*assert_equal(-1, chop(3, []))
    assert_equal(-1, chop(3, [1]))
    assert_equal(0,  chop(1, [1]))
    #
    assert_equal(0,  chop(1, [1, 3, 5]))
    assert_equal(1,  chop(3, [1, 3, 5]))
    assert_equal(2,  chop(5, [1, 3, 5]))*/
    if (list != null) {
        for(num in list) if(num == input) return list.indexOf(num)
    }
    return -1
}

fun main() {
    println("The index of $5 is:  ${chopRecursive(5, arrayOf(1,2,5))}")
    println("The index of $5 is:  ${chopInToHalf(5, arrayOf(1,2,5))}")
    println("The index of $3 is:  ${chopRecursive(3, arrayOf())}")
    println("The index of $3 is:  ${chopInToHalf(3, arrayOf())}")
    println("The index of $6 is:  ${chopRecursive(6, arrayOf(1,2,3,4,5,6,7))}")
    println("The index of $6 is:  ${chopInToHalf(6, arrayOf(1,2,3,4,5,6,7))}")
    println("The index of $4 is:  ${chopRecursive(4, arrayOf(1,2,3,4,5,6,7))}")
    println("The index of $4 is:  ${chopInToHalf(4, arrayOf(1,2,3,4,5,6,7))}")
    println("The index of $3 is:  ${chopRecursive(3, arrayOf(1,2,3,4,5,6,7))}")
    println("The index of $3 is:  ${chopInToHalf(3, arrayOf(1,2,3,4,5,6,7))}")
    println("The index of $3 is:  ${chopRecursive(3, arrayOf(1,2,3,4))}")
    println("The index of $3 is:  ${chopInToHalf(3, arrayOf(1,2,3,4))}")
    println("The index of $2 is:  ${chopRecursive(2, arrayOf(1,2,3,4))}")
    println("The index of $2 is:  ${chopInToHalf(2, arrayOf(1,2,3,4))}")
    println("The index of $7 is:  ${chopRecursive(7, arrayOf(5,7,4))}")
    println("The index of $7 is:  ${chopInToHalf(7, arrayOf(5,7,4))}")
}