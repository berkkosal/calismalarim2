package oop_giris;

public class ImmutableVeMetotaNesneGondermek {

    public static void main(String[] args) {


        Bilgisayar b1 = new Bilgisayar(8, 16, new String[]{"Hp", "Fujitsu", "Dell"});
        bilgisayariYazdir(b1);

        String[] ureticiler = b1.getUreticiFirmalari();
        ureticiler[0] = "Apple";

        bilgisayariYazdir(b1);

    }

    public static void bilgisayariYazdir(Bilgisayar yazdirilacakPC) {

        System.out.println("Çekirdek sayısı: " + yazdirilacakPC.getCekirdekSayisi() + " Ram miktarı: "
                + yazdirilacakPC.getRamBoyutu() + " Üretici firmalar: " + yazdirilacakPC.getUreticiFirmalari()[0]);
    }

}

class Bilgisayar {

    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalari;


    public Bilgisayar(int cSayisi, int ramB, String[] ureticiler) {

        this.cekirdekSayisi = cSayisi;
        this.ramBoyutu = ramB;
        this.ureticiFirmalari = ureticiler;


    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }


    public int getRamBoyutu() {
        return ramBoyutu;
    }


    public String[] getUreticiFirmalari() {
        return ureticiFirmalari;
    }

}