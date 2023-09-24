package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        //kullanıcıdan data almak lazım hazır method olarak Scanner class kullanacağız

        Scanner input = new Scanner(System.in) ;

        System.out.println("Lutfen iki sayi giriniz");

        //nextDouble koyma ndenimiz doble değişkene satırdan gelen double girdiyi oku ve ata manasında Birde sayıyı giren ondalıklıda girebilir.

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("toplama = " + (firstNumber + secondNumber));
        System.out.println("cıkarma = " + (firstNumber - secondNumber));
        System.out.println("carpim = " + (firstNumber * secondNumber));
        System.out.println("bolme = " + (firstNumber / secondNumber));


    }
}
