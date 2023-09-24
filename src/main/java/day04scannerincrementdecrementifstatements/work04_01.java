package day04scannerincrementdecrementifstatements;


import java.sql.SQLOutput;
import java.util.Scanner;

public class work04_01 {
    public static void main(String[] args) {
        //**************************************************************************************************************
        // Soru 1) Kullanicidan iki tamsayi alip bu sayilarin
        // toplam,fark ve carpimlarini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk tamsayiyi giriniz");
        int ilk = scan.nextInt();
        System.out.println("Lütfen ikinci tamsayiyi giriniz");
        int iki = scan.nextInt();
        System.out.println("toplama =" + (ilk+iki ));
        System.out.println("çıkarma =" + (ilk - iki));
        System.out.println("çarpma =" + (ilk*iki));

        //**************************************************************************************************************

        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)
        Scanner scan1 = new Scanner(System.in);
        System.out.println("lütfen cevre ve alan degerlerini hesaplamak icin yaricap degerini giriniz");
        double r = scan1.nextDouble();
        System.out.println("cevre =" + (2*3*r));
        System.out.println("alan =" + (Math.PI*Math.pow(r,2)));

        //**************************************************************************************************************

        //Soru 4) Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen prizmanın uzun kenari için deger giriniz");
        int uzunKenar = scan2.nextInt();
        System.out.println("Lütfen prizmanın kisa kenari icin deger giriniz");
        int kisaKenar = scan2.nextInt();
        System.out.println("Lütfen prizmanin yüksekligi icin deger giriniz");
        int yukseklik = scan2.nextInt();
        System.out.println("Prizmanin hacmi =" + (uzunKenar*kisaKenar*yukseklik));

        //**************************************************************************************************************
        //kullanicidan tek bir karakter alip yazdiriniz
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char first = scan3.next().charAt(0);
        System.out.println(first);

        //**************************************************************************************************************

        //Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //Isminiz: Ali
        //Soyisminiz: Can
        //Kursumuza katiliminiz alinmistir,tesekkur ederiz.

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String name = scan4.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String surName = scan4.nextLine();
        int boslukIndex=name.indexOf(" ");
        System.out.println("Isminiz: "+name.toUpperCase().charAt(0)+name.substring(1,boslukIndex+1).toLowerCase()+name.split(" ")[1].toUpperCase().charAt(0)+name.substring(boslukIndex+2).toLowerCase());
        System.out.println("SoyIsminiz: "+surName.toUpperCase().charAt(0)+surName.substring(1).toLowerCase());



    }
}


