package oop_giris;

public class Encapsulation {

    public static void main(String[] args) {

        Televizyon tv = new Televizyon();

        tv.ac();
        tv.setSesSeviyesi(15);
        tv.setKanal(5);
        tv.kapat();

        tv.goster();


    }


}
