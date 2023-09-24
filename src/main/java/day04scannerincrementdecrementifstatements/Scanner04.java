package day04scannerincrementdecrementifstatements;

import java.awt.*;
import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        //45678 / 10 degerinde 4567,8 olur ancak yazılımda 4567 olur
        //45678 / 100 degerinde 456,78 olur ancak yazılımda 456 olur
        //45678 / 1000 degerinde 45,678 olur ancak yazılımda 45 olur

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bes basamakli bir sayi giriniz");

        //int degeri bes basamakli sayi icin kullanırız

        int number = input.nextInt();

        int firstTwo = number/1000;

        //% = modulus operatoru solunda bulunan sayının sagında bulunan sayyıya bolümünden kalanını verir.
        //dolayısıyla %10 her zaman bize birler basamagında  bulunan sayıyı verir
        //45678/100 yaparsak kalan 78 olur buluruz

        int lastTwo = number%100;

        System.out.println(firstTwo + lastTwo );



    }
}
