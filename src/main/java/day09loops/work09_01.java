package day09loops;

import java.util.Scanner;

public class work09_01 {
    public static void main(String[] args) {


        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321
        // bu soru kelime olarak da gelebilir ama yöntem hepsinde kullanılabilir "enne"
        //java avaj kurali

        int a = 121121;
        String b = String.valueOf(a);
        String c = "";

        int d = (b.length() - 1);
        while (d >= 0) {
            c = c+b.charAt(d);
            d--;
        }
        if (b.equals(c)) {
            System.out.println("yes");
        } else {
            System.out.println("noo");
        }
        /*Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz*/

       Scanner scan = new Scanner(System.in);
       do {
           System.out.println("Lutfen sayi giriniz");
           int deger =scan.nextInt();

           if(deger>=100){
               System.out.println("Kazandiniz");
           }else{
               System.out.println("Kaybettiniz");
               break;
           }
       }while(true);

        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */

        Scanner scan1 = new Scanner(System.in);
        int login = 0;

        do {
            if (login==4){
                System.out.println("Hesabınız bloke olmustur");
                break;
            }
            System.out.println("Lutfen username giriniz");
            String name = scan1.next();
            System.out.println("Lutfen password giriniz");
            String pwd = scan1.next();
            if (name.equals("admin") && pwd.equals("pwd123")) {
                System.out.println("Hesabınıza hos geldiniz");
                break;
            }
            login++;


        }while (true);



    }
}
