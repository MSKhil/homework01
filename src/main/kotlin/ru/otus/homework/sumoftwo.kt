package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {
    val two = mutableListOf<Int>()
    if (numbers[0] + numbers[1] == target) two.add(
        numbers[0],
        numbers[1]
    ) else if (numbers[1] + numbers[2] == target) two.add(
        numbers[1],
        numbers[2]
    ) else if (numbers[2] + numbers[3] == target) two.add(numbers[2], numbers[3])
    else throw IllegalArgumentException()
    return two.toIntArray()
}