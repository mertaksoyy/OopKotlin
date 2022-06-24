package com.example.oopbaslangic

fun main(){



    fun selamla(){
        val sonuc = "Merhaba James"     //geriye değer döndermeyen fonksiyon
        println(sonuc)
    }

    selamla() // merhaba james yazdırdı

    println("----------------")

    fun selamla1():String {
        val sonuc = "Merhaba Mert"    //geriye değer döndüren fonksiyon
        return sonuc
    }
    val gelenSonuc = selamla1()
    println(gelenSonuc)

    println("----------------")

    fun selamla2(isim :String){
        val sonuc = "Merhaba  $isim"  //parametre alan fonkisyon
        println(sonuc)
    }

    selamla2("Cobain")

    println("----------------")

    fun topla(sayi1:Int,sayi2:Int):Int{
        val sonuc = sayi1 + sayi2  //parametreli ve geriye değer döneren fonksiyon
        return sonuc
    }
    val toplamSonuc = topla(100,200)
    println("Toplama sonucunuz : $toplamSonuc")

}