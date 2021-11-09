package ru.kilka.ktConvert

class User(private var name: String, private var surname: String): Person {

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
}