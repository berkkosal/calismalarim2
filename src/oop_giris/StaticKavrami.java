package oop_giris;

public class StaticKavrami {


    public static void main(String[] args) {

        Memur m1 = new Memur();
        m1.setIsim("Emre");
        m1.setMaas(4000);

        Memur m2 = new Memur();
        m2.setIsim("Hasan");
        m2.setMaas(4500);

        Memur m3 = new Memur();
        m3.setIsim("Ayşe");
        m3.setMaas(2500);

        m3.bilgileriGoster();
        Memur.kanunuSoyle();
        m1.kanunuSoyle();
        m2.kanunuSoyle();
        m3.kanunuSoyle();

        System.out.println("Oluşturulan memur nesnesi: " + Memur.olusturulanMemurNesnesi);
    }

}

class Memur {

    private String isim;
    private int maas;
    public static int olusturulanMemurNesnesi;

    public Memur() {

        olusturulanMemurNesnesi++;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas < 0) {
            maas = 0;
        } else {
            this.maas = maas;
        }
    }

    public static void kanunuSoyle(){
        System.out.println("657 nolu kanun geçerli");
    }

    public void bilgileriGoster() {

        System.out.println("Oluşturulan memur nesnesi: " + olusturulanMemurNesnesi);
    }
}