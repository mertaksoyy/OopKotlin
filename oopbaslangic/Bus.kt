package com.example.oopbaslangic

class Bus (var kapasite : Int , var nereden : String , var nereye : String , var mevcutYolcu : Int){


    fun bilgiAl(){
        println("Otobüs Kapasitesi : $kapasite")
        println("Nereden : $nereden")
        println("Nereye : $nereye")
        println("Otobüsdeki Yolcu Sayısı : $mevcutYolcu")

    }

    fun yolcuAl(yolcu : Int){
        mevcutYolcu +=yolcu
    }


    fun yolcuIndır(yolcu: Int){
        mevcutYolcu-=yolcu
    }

}