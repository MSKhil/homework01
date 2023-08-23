package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val a = mutableListOf<String>()
    for (i in 0 until n) {
        if (i == 0) {
            a.add("FizzBuzz")
        } else if (((i % 3 == 0) && (i % 5 == 0))) {
            a.add("FizzBuzz")
        } else if (i % 5 == 0) {
            a.add("Buzz")
        } else if (i % 3 == 0) {
            a.add("Fizz")
        } else {
            a.add("$i")
        }
    }
    return a.toTypedArray()
}