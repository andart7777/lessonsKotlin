
fun main(){


//    for (index in 0..9) print("\n $index")

    val listFruit = arrayListOf("Apple", "Orange", "Banana", "Watermelon", "Strawberry")
//    for (index in 0..3) println("Fruits - ${listFruit[index]}")
//    for (fruit in listFruit) println(fruit)
//    println(listFruit.indices) // Диапазон списка или массива (0..3)
//    for ((index, item) in listFruit.withIndex()) println("index: $index | fruit: $item")
//    for (index in 100 downTo 10 step 3) {
//        if (index == 49) break
//        println(index)
//    }
//    for (index in 1..listFruit.size - 1) println(listFruit[index]) // Вариант рабочий, но есть проще ниже
//    for (index in 1..<listFruit.size) println(listFruit[index])
//    for (index in 1 until listFruit.size) println(listFruit[index])
//    for ((index, item) in listFruit.withIndex()) {
//        if (listFruit[index] == "Orange") continue
//        if (listFruit[index] == "Watermelon") break
//        println(listFruit[index])
//    }
    listFruit.forEach{
        println(it)
    }

//    var fruit = ""
//    var index = 0
//    while (fruit != "Banana") {
//
//        fruit = listFruit[index]
//        index++
//        println(fruit)
//    }
//
//    var index2 = 0
//
//    do {
//        println("Done")
//        index2++
//    } while (index2 < 10)
//        println(index2)
}