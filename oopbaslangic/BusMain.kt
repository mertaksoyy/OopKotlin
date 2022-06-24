package com.example.oopbaslangic



fun main(){

    val kamilKoc = Bus(50,"Ankara","Sivas",38)

   // kamilKoc.bilgiAl()



    kamilKoc.yolcuAl(12)
    kamilKoc.bilgiAl()


    println("----------------")

    kamilKoc.yolcuIndır(32)
    kamilKoc.bilgiAl()
    println("------------")

    kamilKoc.bilgiAl()

    println("------------")

    val firma2 = Bus(40,"Bursa","İstanbul",24)

    firma2.bilgiAl()
    println("----------")
    firma2.mevcutYolcu=30
    firma2.nereden = "İzmir"
    firma2.nereye = "Antep"
    firma2.kapasite = 60

    firma2.bilgiAl()
    println("----------")

    firma2.yolcuAl(10)
    firma2.bilgiAl()

    println("----------")
    firma2.yolcuIndır(15)
    firma2.bilgiAl()


}