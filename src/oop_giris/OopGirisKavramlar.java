package oop_giris;

public class OopGirisKavramlar {

    public static void main(String[] args) {

        Ogrenci o1 = new Ogrenci();

        o1.isim = "Berk Koşal";
        o1.ogrenciNo = 720;
        o1.aktif = true;
        o1.sinif = 12;

        o1.ogrenciBilgileriniYazdir();

        Ogrenci o2 = new Ogrenci();
        o2.isim = "Hasan oğluş";
        o2.ogrenciNo = 344;
        o2.sinif = 8;

        o2.ogrenciBilgileriniYazdir();


    }

}
