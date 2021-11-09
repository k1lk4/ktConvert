package ru.kilka.ktConvert

class Aretinsky: Person {
    private var name: String = "Victor"
    private var surname: String = "Aretinsky"
    private var language: Languages = Languages.JAVA

    override fun getName(): String {
        return this.name
    }

    override fun setName(name: String): String {
        this.name = name
        return this.name
    }

    override fun getSurname(): String {
        return this.surname
    }

    override fun setSurname(surname: String): String {
        this.surname = surname
        return this.surname
    }

    fun getLanguage(): Languages {
        return this.language
    }

    fun setLanguage(language: Languages): Languages {
        if (language in Languages.values()) {
            this.language = language
        }
        else {
            this.language = Languages.JAVA
        }
        return this.language
    }

    private fun translate(word: String): String {
        if(word == name) {
            return "Виктор"
        }
        if(word == surname) {
            return "Аретинский"
        }
        return word
    }

    fun checkOnVictorAretinsky(surname: String): Boolean {
        when (surname.toLowerCase()) {
            "aretinsky" -> {
                println("Bonjour, ${this.getSurname()}!")
                return true
            }
            "аретинский" -> {
                println("Здравствуйте, ${this.translate(this.getName())} ${this.translate(this.getSurname())}")
                return true
            }
        }
        return false
    }
}
