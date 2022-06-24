package com.example.oopbaslangic

fun main(){

    val bmw = Araba("Beyaz",140,true)


    bmw.renk="kırmızı"
    bmw.hiz=150
    bmw.calisiyorMu= false

    bmw.bilgiVer()


    //bmw.durdur()
    //bmw.bilgiVer()
    bmw.calistir()
    bmw.bilgiVer()

    bmw.hizlan(100)
    bmw.bilgiVer()

    bmw.yavasla(40)
    bmw.bilgiVer()

    println("--------------")

    val tofas = Araba("Sarı",100,true)
    tofas.yavasla(60)
    tofas.bilgiVer()
    tofas.durdur()
    tofas.bilgiVer()

    tofas.calistir()
    tofas.hizlan(43)
    tofas.bilgiVer()

}