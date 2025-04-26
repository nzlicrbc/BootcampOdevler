package com.example.bootcampodevler.fonksiyon

fun main() {
    val odev2 = Odev2()

    // Test 1
    val celsius = 35.0
    val fahrenheit = odev2.celsiusToFahrenheit(celsius)
    println("1. Test: $celsius°C = $fahrenheit°F")

    // Test 2
    val length = 5.0
    val width = 3.0
    val perimeter = odev2.calculateRectanglePerimeter(length, width)
    println("2. Test: rectangle perimeter: $perimeter")

    // Test 3
    val number = 8
    val factorial = odev2.calculateFactorial(number)
    println("3. Test: $number! = $factorial")

    // Test 4
    val word = "ankara"
    val countA = odev2.countLetterA(word)
    println("4. Test: '$word' contains $countA letter 'a'")

    // Test 5
    val numberOfSides = 10
    val interiorAngles = odev2.sumOfInteriorAngles(numberOfSides)
    println("5. Test: sum of interior angles for a shape with $numberOfSides sides: $interiorAngles degrees")

    // Test 6
    val numberOfDays = 22
    val salary = odev2.calculateSalary(numberOfDays)
    println("6. Test: salary for $numberOfDays days: $salary $")

    // Test 7
    val quotaAmount = 80
    val quotaFee = odev2.calculateQuotaFee(quotaAmount)
    println("7. Test: fee for $quotaAmount GB quota: $quotaFee $")
}