package day04scannerincrementdecrementifstatements;

public class IFStatements01 {
    public static void main(String[] args) {
        // bazı kodların bazı şartlara göre çalısıp çalışmaması gerekir
        //if statement bazı kodların bazı şartlara göre aktive edebilmek için if statement kullanılır.

        //if statement = eger ifade

        // if you study hard, you will learn java.   ==> English
        /*

        if (you study hard){
            you will learn java      ====> java
        }
         */

        //Ornek 1 : sayi -1 ile 10 arasinda ise ekrana "rakam" yazsın

        int number = 3;
        //number>-1 && number<10
        if (number > -1 && number < 10) {
            System.out.println("Rakam");


        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir!" yazdirin.

            int n =123;// buradaki değeri aşagıdaki kucuktur buyukture bakıcazz

            if (n>99 && n<1000) { // buradki değerlerde 123 küçüktür büyüktüre bak


                System.out.println("Sayi üç basamaklidir!");

            }
        }
    }
}