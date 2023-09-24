package day05ifelseswitchternary;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {

        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        float num = scan.nextFloat();
        if (num > 0) {
            System.out.println("pozitif");
        } else if (num < 0) {
            System.out.println("negatif");
        } else
            System.out.println("sıfır notr");

        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen gün verebilmesi icin rakam degeri giriniz");
        byte gun = scan1.nextByte();
        if (gun == 1) {
            System.out.println("pazar");
        } else if (gun == 2) {
            System.out.println("pazartesi");
        } else if (gun == 3) {
            System.out.println("sali");
        } else if (gun == 4) {
            System.out.println("carsamba");
        } else if (gun == 5) {
            System.out.println("persembe");
        } else if (gun == 6) {
            System.out.println("cuma");
        } else if (gun == 7) {
            System.out.println("cumartesi");
        } else {
            System.out.println("Gecersiz rakam girdsiniz. Lütfen 1 ila 7 arasında giriniz!");
        }

            /*
             Example 3:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
                       asagidaki tabloya gore yazdiran kodu olusturunuz
                       0-4 ==> bebek
                       5-12 ==> cocuk
                       13-20 ==> genc
                       21-30 ==> yetiskin
                       30 ustu ==> Tanimlanmamis
                       Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz!");
        byte yas = scan2.nextByte();
        if (yas < 0) {
            System.out.println("lutfen gecerli bir yas giriniz");
        } else if (yas < 5) {
            System.out.println("bebek");
        } else if (yas < 13) {
            System.out.println("cocuk");
        } else if (yas < 21) {
            System.out.println("genc");
        } else if (yas < 31) {
            System.out.println("yetiskin");
        } else {
            System.out.println("Tanımlanmamis");
        }

            /*
        Kullanicinin vermis oldugu gün isimlerine bakarak HaftaSonu veya Hafta ici olduguna karar veren kodu yaziniz
                   Monday ==> Week Day       Saturday ==> Weekend Day
         */

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String gunIsmi = scan4.next();

        boolean Haftaici = gunIsmi.equalsIgnoreCase("pazartesi") || gunIsmi.equalsIgnoreCase("salı") || gunIsmi.equalsIgnoreCase("çarşamba") ||
                gunIsmi.equalsIgnoreCase("perşembe") || gunIsmi.equalsIgnoreCase("cuma");

        boolean Haftasonu = gunIsmi.equalsIgnoreCase("cumartesi") || gunIsmi.equalsIgnoreCase("pazar");

        if (Haftaici) {
            System.out.println("Haftaici");
        } else if (Haftasonu) {
            System.out.println("Haftasonu");
        } else {
            System.out.println("Eksik yada hatali gün ismi verdiniz");
        }

            /*
               Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
               //iç içe girmiş ifler var aşagıdaki gibi buna nested if denir. İçerdeki if inner if, dışardaki if buter if denir

               Eger calisan kadin ise;

                60 yasindan buyukse "Emekli Olabilir "yazdirin

               Eger calisan erkek ise;

                65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
            */

        Scanner scan5 = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi girin");
        String cinsiyet = scan5.next();

        System.out.println("Yasinizi giriniz");
        int yass = scan5.nextInt();

        if (yass < 0 || yas > 120) {
            System.out.println("Yanlis deger girdiniz");
        } else if (cinsiyet.equalsIgnoreCase("Kadın")) {

            if (yass > 60) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Calisabilir");
            }
        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {

            if (yass > 65) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Calisabilir");
            }
        }else {
            System.out.println("Tanimli degil");
        }
    }
}








