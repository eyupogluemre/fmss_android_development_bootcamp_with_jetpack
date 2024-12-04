package com.example.kotlindersleri.degiskenler

fun main() {
    var ogrenciAdi = "Emre"
    var ogrenciYas = 23
    var ogrenciBoy = 1.78
    var ogrenciBasHarf = 'E'
    var ogrenciDevamDurum = true

    println("***** Öğrenci *****")
    println("Ad       : $ogrenciAdi")
    println("Yaş      : ${ogrenciYas+5}") //toplama bu şekilde yapılır.
    println("Boy      : $ogrenciBoy cm")
    println("Baş harf : $ogrenciBasHarf")
    println("Devam    : $ogrenciDevamDurum")

    //Constants - Sabitler

    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 30
    println(numara)
    //numara = 300

    //Type Casting - Tür Dönüşümü:
    val d = 56.83
    //Sayısaldan sayısala (en riskli durum budur)
    val sonuc1 = d.toInt()
    println(sonuc1)
    //Sayısaldan metine (sıfır sorun vardır)
    val sonuc2 = d.toString() //"56.83" yapar.
    println(sonuc2)
    //Metinden sayısala (ufak tefek sorunlar vardır)
    val yazi = "67+"

    val sonuc3 = yazi.toIntOrNull()

    if (sonuc3 != null) {
        println(sonuc3)
    }
    else {
        println("Dönüşüm Hatası!")
    }

    // Yukarıdaki yapının if kısmının aynısıdır:
    sonuc3?.let {
        println(it)
    }

    println(sonuc3)


}