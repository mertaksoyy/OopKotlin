package com.example.oopbaslangic

import java.util.function.BinaryOperator

class Araba (var renk : String , var hiz :Int , var calisiyorMu:Boolean) {


    fun calistir(){
        calisiyorMu=true
    }

    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun hizlan(kacKm:Int){
        hiz = hiz + kacKm
    }

    fun yavasla(kacKm: Int){
        hiz = hiz - kacKm
    }

    fun bilgiVer(){

        println("Hızınız : $hiz")
        println("Rengi : $renk")
        println("Durum : $calisiyorMu")
    }


}