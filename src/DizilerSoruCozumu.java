import java.util.Arrays;

public class DizilerSoruCozumu {


    public static void main(String[] args) {


        int sayilar[] = new int[100];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] = (int) (Math.random() * 1000);
        }

        diziYazdir(sayilar);
        ortalamaAl(sayilar);
    }


    public static void diziYazdir(int [] dizi) {
        for (int i : dizi) {
            System.out.print(i + ",");
        }
    }
    public static void ortalamaAl(int [] dizi) {
        int sonuc = 0;
        for(int i = 0; i< dizi.length ; i++){

            sonuc += dizi[i];

        }
        sonuc = sonuc / dizi.length;
        System.out.println("Ekranda yazılan sayıların ortalaması= " + sonuc);

    }

}
