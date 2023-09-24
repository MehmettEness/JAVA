package day06switchternarystring;

import java.util.Scanner;

public class work06_01 {
    public static void main(String[] args) {

        //   verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        //   bir ternary olusturalim

        int num = 100;
            Object deger = (num>100) ? Math.pow(num,2) : "sayi 100 den büyük olmali";
            System.out.println(deger);
        //Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi = scan.nextInt();
            String sayi1 = (sayi%2==0) ? "çift sayi" : "tek sayi" ;
            System.out.println(sayi1);

        // bir kisinin kan bagisinda bulunup bulunamayacigini control ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas = scan1.nextInt();
        System.out.println("Lütfen kilonuzu giriniz");
        float kilo = scan1.nextFloat();
        String kan= (yas>18 && yas<150) && (kilo>50 && kilo<200) ? "kan bagısında bulunabilirsiniz " : "degerler dısındasınız ";
        System.out.println(kan);
    }
   }


