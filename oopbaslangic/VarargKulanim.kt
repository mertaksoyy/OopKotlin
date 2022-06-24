package com.example.oopbaslangic

fun main(){

    fun toplam(vararg sayilar:Int) : Int{ //3,4,5

        var sonuc = 0

        for(i in sayilar){
            sonuc = sonuc + i

        }

        return sonuc
    }

    var t1 = toplam(3,4,5)
    println("t1 : $t1")

}