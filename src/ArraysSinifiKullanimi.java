import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysSinifiKullanimi {

    public static void main(String[] args) {


        int[] dizi1 = {2, 8, -16, 45, 14, -5};
        int[] dizi2 = {2, 8, -16, 45, 14, -5};
        System.out.println("Sıralama öncesi dizi");
        diziYazdir(dizi1);

        // Arrays.sort(dizi1);
        // Arrays.sort(dizi1, 1,6);
        Arrays.parallelSort(dizi1);
        Arrays.parallelSort(dizi2);
        System.out.println("\nSıralama sonrası dizi");
        diziYazdir(dizi1);
        boolean esitMi = Arrays.equals(dizi1, dizi2);
        if (esitMi) {
            System.out.println("\nSayılar birbirine eşit");
        } else {
            System.out.println("\nSayılar birbirine eşit değil");
        }
        // int sonuc = Arrays.binarySearch(dizi1, 14);
        // System.out.println("\nSonuç= " + sonuc);



        int [] yeniDizi = new int[20];
        Arrays.fill(yeniDizi,4,9,23);
        diziYazdir(yeniDizi);

    }


    public static void diziYazdir(int dizi[]) {

        for (int i : dizi) {
            System.out.print(i + ",");
        }

    }


}
