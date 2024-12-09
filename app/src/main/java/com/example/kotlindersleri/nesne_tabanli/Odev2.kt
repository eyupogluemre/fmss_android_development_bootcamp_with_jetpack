package com.example.kotlindersleri.nesne_tabanli

class Odev2 {

    // Soru 1:
    fun icAciHesapla(kenar:Int) : Int {
        val sonuc = ((kenar-2)*180)/kenar
        return sonuc
    }

    // Soru 2:
    fun maasHesapla(gun:Int) : Int {
        if (gun < 19) {
            val saat = gun*8
            val ucret = saat*40
            return ucret
        }
        else if (gun == 19) {
            val ucret= 6160
            return ucret
        }
        else {
            val fazlaGun = gun-19
            val fazlaSaat = fazlaGun*8
            val fazlaUcret= fazlaSaat*80
            val ucret = 6160+fazlaUcret
            return ucret
        }
    }

    // Soru 3:
    fun otoparkUcretHesapla(saat:Int) : Int {

        val ucret = 50

        if (saat == 1) {
            return ucret
        }
        else {
            val asimUcret = (saat-1)*10
            val nihaiUcret = ucret+asimUcret
            return nihaiUcret
        }
    }

    // Soru 4:
    fun kmToMile(km:Double) : Double {
        val mile = km*0.621
        return mile
    }

    // Soru 5:
    fun dikdortgenAlanHesapla(uzunKenar:Double, kisaKenar:Double) {
        val alan = uzunKenar*kisaKenar
        println("Dikdörtgenin Alanı: $alan cm² veya m²'dir!")
    }

    // Soru 6:
    fun faktoriyelHesapla(sayi:Int) : Int {
        if (sayi == 1) {
            return 1
        } else {
            return sayi * faktoriyelHesapla(sayi-1)
        }
    }

    // Soru 7:
    fun eHarfiBulma(kelime:String) {
        val eSayisi= kelime.count { it=='e' || it=='E' }
        if (eSayisi == 0) {
            println("Girilen kelimede 'e' veya 'E' harfi bulunmamaktadır!")
        }
        else {
            println("Girilen kelimede $eSayisi tane 'e' veya 'E' harfi vardır!")
        }
    }
}