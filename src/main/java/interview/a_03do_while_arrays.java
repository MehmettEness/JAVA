package interview;

import java.util.Scanner;

public class a_03do_while_arrays {
    public static void main(String[] args) {
        //while da kapıda nöbetci var

        int k = 10;

        while (k < 20) {
            System.out.print(k + ",");//10,11,12,13,14,15,16,17,18,19,
            k++;
        }
        System.out.println("\n-------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen deger giriniz");
        int deger = scan.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(deger + "x" + i + "=" + deger * i);
        }
        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner scan2 = new Scanner(System.in);
        do {
            System.out.println("Lutfen bir sayi giriniz");

            int sayi = scan2.nextInt();

            if (sayi >= 100) {
                System.out.println("Kazandınız");
            } else {
                System.out.println("kaybettiniz");
                break;
            }

        } while (true);

           /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */

        Scanner scan3 = new Scanner(System.in);
        int sayac = 0;
        do {
            System.out.println("Lutfen kullanıcı adıvızı ve passwordunuzu giriniz");
            if (sayac == 4) {
                System.out.println("Hesabınız bloke olmustur");
                break;
            }
            System.out.println("kullanıcı adınızı giriniz");
            String name = scan3.next();
            System.out.println("password giriniz");
            String parola = scan3.next();

            if (name.equals("admin") && parola.equals("pwd123")) {
                System.out.println("Hesabınıza hos geldiniz");
                break;
            } else {
                System.out.println("Yanlıs giriş yaptınız ");
                sayac++;

            }
        }while (true) ;


        //foreach = aslında ne kadar fazla karakterler işlem yapacaksak ona gçre kullanıyoruz allttaki örnekte oldugu gibi




    }
}

