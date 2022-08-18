public class DizilerSoruCozumu2 {


    public static void main(String[] args) {


        String[] desteTurleri = {"Karo", "Maça", "Kupa", "Sinek"};
        String[] desteSayilari = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deste = new String[52];


        for (int i = 0; i < deste.length; i++) {

            deste[i] = desteTurleri[i / 13] + " " + desteSayilari[i % 13];


        }


        for (int i = 0; i < deste.length; i++) {
            int rastgeleIndex = (int) (Math.random() * 52);
            String temp = deste[rastgeleIndex];
            deste[rastgeleIndex] = deste[i];
            deste[i] = temp;


        }


        for (int i = 0; i < 4; i++) {
            System.out.println(deste[i]);
        }
    }


}


