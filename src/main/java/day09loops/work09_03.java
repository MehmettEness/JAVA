package day09loops;

import java.util.Random;
import java.util.Scanner;

public class work09_03 {
    public static void main(String[] args) {
        int sayi = 5;
        while (sayi<=10){
            System.out.print(sayi+"  ");
            sayi++;
        }
        //  kullanicidan pozitif bir tamsayi alip
        //  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bşr tamsayti giriniz");
        int sayi1 = scan.nextInt();
        int deger=1;
        while (deger<=sayi1){
            System.out.println(deger);
            deger++;
        }
        // kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin

       Scanner scan2 =new Scanner(System.in);
        int sayi2;
        int toplam=0;
        while(toplam<500){
            System.out.println("lutfenn toplamak icin pozitif deger giriniz");
            sayi2=scan2.nextInt();
        if (sayi2>0){
            toplam+=sayi2;
        }else System.out.println("Lutfen pozitif deger giriniz");
        }
        System.out.println("Yeter cok sayi girdin toplam: "+toplam+ "");

        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scan4 = new Scanner(System.in);
        System.out.println("0 harici sayi giriniz. Girdiginiz sayilarin toplanmasını istiyorsanız 0'a basınız");
        int sayi4=scan4.nextInt();
        int toplam1 =0;
        while(sayi4!=0){
            toplam1+=sayi4;
            System.out.println("toplamak istediginiz sayilarini giriniz");
            sayi4=scan4.nextInt();
        }
        System.out.println("sayiların toplamı: " + +toplam1);

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Random rnd=new Random();
        int sayi5=rnd.nextInt(100);
        Scanner scan5 = new Scanner(System.in);
        int tahmin = 0;
        int kullanıSayi=-1; // -1 diyerek while döngüsüne girmiş oluyoruz
        while(kullanıSayi!=sayi5){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasında bir sayi giriniz");
            kullanıSayi=scan5.nextInt();
            if (kullanıSayi>1&&kullanıSayi<100){
                if (kullanıSayi<sayi5){
                    System.out.println("sayiyi büyült");
                }else if (kullanıSayi>sayi5){
                    System.out.println("sayiyi kücült");

                }

            }else System.out.println("dogru deger girrrrr");
            tahmin++;
        }
        System.out.println("bilgisayarin tuttugu sayi :"+sayi5+" tahminde bulundugun sayi:" +tahmin);
    }
}
