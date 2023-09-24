package day05ifelseswitchternary;

import java.util.Scanner;

public class work05_01 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("çift sayidir");
        }else{
            System.out.println("tek sayidir");
        }

        // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen 100lük sistemde notunuzu giriniz");
        double note = scan2.nextDouble();
        String s = "a-zA-Z";
        if(note<0 || note>100){
            System.out.println("Gecerli not giriniz");
        }else if(note<50){
            System.out.println("D");
        } else if (note<60) {
            System.out.println("C");
        } else if (note<80) {
            System.out.println("B");
        } else if (note<101) {
            System.out.println("A");
        } else{
            System.out.println("Gecerli not giriniz");
        }
        /*
        kullanicidan 2 sayi isteyip sonrasinda yapmak istedigi islemi sectirip kucuk bir hesap makinesi yapin*/

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz ve " +
                "toplama islemi icin '+' çıkarma islemi icin '-' carpma islemi icin '*' bölme islemi icin'/' ifadelerini kullanınız ");
        double s1 = scan3.nextDouble();
        double s2 = scan3.nextDouble();
        String operator= scan.next();
        if (operator.equals("+")){
            System.out.println("toplama islemi =" + (s1 + s2));
        } else if (operator.equals("-")) {
            System.out.println("çıkarma islemi =" + (s1 - s2));
        } else if (operator.equals("*")) {
            System.out.println("carpma islemi =" + (s1*s2));
        } else if (operator.equals("/")) {
            System.out.println("bölme islemi =" + (s1 / s2));
        }else{
            System.out.println("lütfen gecerli deger giriniz");
        }


    }
}
