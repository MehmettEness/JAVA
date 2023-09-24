package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Ifstatements02 {
    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        //Scanner kullanıcıyı görür görmez scanner yaz

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int num = input.nextInt();

        //1.yol=  sayının 2 ye bölüömünden kalan çift ise çifttir. Basit matematik

        if (num % 2 == 0) {
            System.out.println("Cift sayi...");

        }


        if (num % 2 != 0) {
            System.out.println("Tek sayı...");

            //2.yol=if else statements (else:aksi taktirde demek) iki farklı seneryo olma durumlarında if else kullanılır.


            if(num%2 ==0) {

                System.out.println("Cift sayi");
            }else{
            if(num%2!=0);
                System.out.println("Tek sayi");
            }
        }
    }
}
