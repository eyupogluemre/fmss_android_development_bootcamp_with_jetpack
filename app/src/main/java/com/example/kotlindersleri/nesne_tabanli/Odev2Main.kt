package com.example.kotlindersleri.nesne_tabanli

fun main() {

    val s = Odev2()

    // Soru 1:
    val icAciSonuc = s.icAciHesapla(4)
    println("Düzgün çokgenin her bir iç açısı: $icAciSonuc derecedir!")

    // Soru 2:
    val maasSonuc = s.maasHesapla(19)
    println("Maaş: $maasSonuc ₺")

    // Soru 3:
    val otoparkUcretSonuc = s.otoparkUcretHesapla(5)
    println("Otopark Ücreti: $otoparkUcretSonuc ₺")

    // Soru 4:
    val kmToMileSonuc = s.kmToMile(4.0)
    println("Girilen KM, $kmToMileSonuc mildir!")

    // Soru 5:
    s.dikdortgenAlanHesapla(7.9,5.0)

    // Soru 6:
    val faktoriyelSonuc = s.faktoriyelHesapla(10)
    println("Girilen sayının faktöriyel değeri: $faktoriyelSonuc")

    // Soru 7:
    s.eHarfiBulma("Emre")

}