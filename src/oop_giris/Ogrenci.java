package oop_giris;

public class Ogrenci {

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;


    public Ogrenci() {

        aktif = true;

    }

    public void dersAl() {
        System.out.println("Öğrenci ders alıyor.");
    }

    public void ogrenciBilgileriniYazdir() {

        if (aktif) {
            System.out.println("Adım: " + isim + " Numaram:" + ogrenciNo + " Sınıfım:" + sinif);
        } else {
            System.out.println(isim + " Bu öğrenci aktif değil.");
        }


    }


}
