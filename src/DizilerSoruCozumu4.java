import java.util.Scanner;

public class DizilerSoruCozumu4 {


    public static void main(String[] args) {
        Scanner kullanicidanAlinanBilgi = new Scanner(System.in);


        System.out.println("Sınava kaç öğrenci giriyor?");
        int ogrenciSayisi = kullanicidanAlinanBilgi.nextInt();
        System.out.println("Sınavda kaç soru var?");
        int soruSayisi = kullanicidanAlinanBilgi.nextInt();
        char[][] ogrenciSayisiSoruSayisi = new char[ogrenciSayisi][soruSayisi];
        char[] cevapAnahtari = new char[soruSayisi];
        int [] kullaniciPuanlari = new int[ogrenciSayisi];

        rastgeleCevaplar(ogrenciSayisiSoruSayisi);
        cevapAnahtari(cevapAnahtari);
        karsilastirmaYap(ogrenciSayisiSoruSayisi,cevapAnahtari,kullaniciPuanlari);

        for( int x : kullaniciPuanlari){
            System.out.println("Kullanıcının toplam puanı: " + x);
        }

    }


    public static void rastgeleCevaplar(char[][] matris) {

        char[] siklar = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < matris.length; i++) {

            for (int j = 0; j < matris[i].length; j++) {
                int randomSik = (int) (Math.random() * 5);
                matris[i][j] = siklar[randomSik];
            }

        }


    }

    public static void cevapAnahtari(char[] cevapAnahtariDizisi) {

        char[] siklar = {'A', 'B', 'C', 'D', 'E'};

        for (int i = 0; i < cevapAnahtariDizisi.length; i++) {
            int randomSik = (int) (Math.random() * 5);
            cevapAnahtariDizisi[i] = siklar[randomSik];

        }

    }

    public static void karsilastirmaYap(char[][] ogrenciCevaplari, char [] dogruCevaplar, int[] puanlar){
        for (int i = 0; i < ogrenciCevaplari.length; i++) {
            for (int j = 0; j < ogrenciCevaplari[i].length ; j++) {

                if (ogrenciCevaplari[i][j] == dogruCevaplar[j]){

                    puanlar[i] += 5;

                }

            }
        }


    }

}






