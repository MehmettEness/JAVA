package genelTekrar;

import java.util.Scanner;

public class C04_SoruCevap {




    // /* Iki kisinin oynayacagi bir kelime oyunu uretelim
//         * Kurallar
//         * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
//         *
//         * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
//         *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
//         *        ve 3.adima gecin
//         *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
//         *        kazandigini yazip oyunu bitirin
//         *
//         * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
//         *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
//         *          basa mi sona mi ekleyecegini sorun
//         *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
//         *
//         *      *   Devam etmek istemezse
//         *          "Oyun bitti" yazin
//         *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
//         */


    static int player1;
    static int player2;
    static String yazi;

    public static void main(String[] args) {
        start();
    }
    private static void start(){
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Bir kelime giriniz : ");
        String kelime = scan1.nextLine();
        System.out.println( "Girilen kelime : " + kelime);


        Scanner scan2 = new Scanner(System.in);
        System.out.println("Girilen kelimeyi kabul ediyor musun : (E/H)");
        String kelimeKabul = scan2.nextLine();
        if (kelimeKabul.equals("E") || kelimeKabul.equals("e")) {
            player1 = player1 +kelime.length();

        } else {
            player2= player2+kelime.length();
            System.out.println("Geçersiz kelime");
            System.out.println( "Kazanan 2. Oyuncu !\n "+player2+ "puan");
        }
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Devam etmek istiyor musunuz ? (E/H)");
        String kelimee = scan3.nextLine();
        if (kelimee.equals("E") || (kelimee.equals("e")) ){
            System.out.println("yeni kelime :");
            String yeniKelime = scan3.nextLine();
            System.out.println("Kelimeyi başa eklemek için (1) || Kelimeyi sona eklemek icin (2) tuşlayınız");
            int secim = scan3.nextInt();
            kelime=secim==1 ? (yeniKelime + "," + kelime)  : (kelime+","+yeniKelime ) ;
            System.out.println(kelime);

        }else {
            System.out.println("Oyun Bitti");;
            System.out.println("1.Oyuncu : " + player1);
            System.out.println("2.Oyuncu : " +player2);
            String kazanan = player1>player2 ? "1.oyuncu"  : "2.Oyuncu";
            System.out.println("Kazanannn :" + kazanan);
        }
    }
 }





