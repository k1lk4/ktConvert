package ru.kilka.ktConvert

import kotlin.math.roundToInt

class CurrencyService {

    fun startApplication() {
        println("Введите ваше имя: ")
        val name: String = readLine()!!
        println("Введите вашу фамилию: ")
        val surname: String = readLine()!!
        println("Введите ваш баланс (Вводите дроби через точку) : ")
        val userBalance: Double = readLine()!!.toDouble()
        println("Введите валюту, в которую вы хотите конвертировать: ")
        val userCurrency: String = readLine()!!

        val user = User(name, surname)

        if (name.isEmpty()) {
            println("Вы не ввели имя!")
        }
        if (surname.isEmpty()) {
            println("Вы не ввели фамилию!")
        } else {
            user.setName(name)
            user.setSurname(surname)
        }

        // проверка на Виктора Аретинского
        val aretinsky = Aretinsky()
        aretinsky.checkOnVictorAretinsky(surname)

        convert(userCurrency, userBalance.roundToInt())
    }

    private fun convert(
        currencyToConvert: String,
        userBalance: Int,
    ): Int {
        when (currencyToConvert.toLowerCase()) {
            Currency.RUB.currencyName.toLowerCase() -> {
                println("Ваш результат: $userBalance")
                return userBalance
            }
            Currency.EUR.currencyName.toLowerCase() -> {
                val result: Int = (userBalance / Currency.EUR.currencyValue).roundToInt()
                println("Ваш результат: $result €")
                return result
            }
            Currency.USD.currencyName.toLowerCase() -> {
                val result: Int = (userBalance / Currency.USD.currencyValue).roundToInt()
                println("Ваш результат: $result $")
                return result
            }
        }
        return userBalance
    }

}
