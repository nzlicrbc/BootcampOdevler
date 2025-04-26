package com.example.bootcampodevler.fonksiyon

class Odev2 {

    // 1. Parametre olarak girilen dereceyi Fahrenheit'a dönüştürdükten sonra geri döndüren bir öethod yazın
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    // 2. Kenarları bir parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir method yazın
    fun calculateRectanglePerimeter(length: Double, width: Double): Double {
        return 2 * (length + width)
    }

    // 3. Parametre olarak girilen bir sayının faktöriyel değerini hesaplayıp geri döndüren bir method yazın
    fun calculateFactorial(number: Int): Long {
        if (number < 0) {
            throw IllegalArgumentException("Cannot calculate factorial of negative numbers")
        }

        var result: Long = 1
        for (i in 1..number) {
            result *= i
        }
        return result
    }

    // 4. Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren bir method yazın
    fun countLetterA(word: String): Int {
        var counter = 0
        for (letter in word) {
            if (letter == 'a' || letter == 'A') {
                counter++
            }
        }
        return counter
    }

    // 5. Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen bir method yazın
    fun sumOfInteriorAngles(numberOfSides: Int): Int {
        if (numberOfSides < 3) {
            throw IllegalArgumentException("Number of sides must be at least 3")
        }
        return (numberOfSides - 2) * 180
    }

    // 6. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren bir methıd yazın
    fun calculateSalary(numberOfDays: Int): Double {
        val hoursPerDay = 8
        val totalHours = numberOfDays * hoursPerDay

        val regularHourlyRate = 10.0
        val overtimeHourlyRate = 20.0
        val overtimeThreshold = 160

        val salary: Double

        if (totalHours <= overtimeThreshold) {
            salary = totalHours * regularHourlyRate
        } else {
            val regularPay = overtimeThreshold * regularHourlyRate
            val overtimeHours = totalHours - overtimeThreshold
            val overtimePay = overtimeHours * overtimeHourlyRate
            salary = regularPay + overtimePay
        }

        return salary
    }

    // 7. Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren bir method yazın
    fun calculateQuotaFee(quotaAmount: Int): Double {
        val baseQuota = 50
        val baseFee = 100.0
        val additionalGBFee = 4.0

        val fee: Double

        if (quotaAmount <= baseQuota) {
            fee = baseFee
        } else {
            val additionalUsage = quotaAmount - baseQuota
            val additionalFee = additionalUsage * additionalGBFee
            fee = baseFee + additionalFee
        }

        return fee
    }
}