package com.example.oopbaslangic

fun main(){

    fun Int.carp(sayi : Int) : Int {
        return this * sayi
    }

    val sonuc = 5.carp(2)
    println(sonuc)


}