package javapractice.practice03;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {


         /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int sayac=0;

        do {
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
            int sayi= scan.nextInt();

            if (sayi==0){
                System.out.println("oyun bitti");
                break;

            } else if (sayi<0) {
                System.out.println("Negatif sayi kullanamazsin");

            }else {
                toplam=toplam + sayi; //toplam+=sayi
                sayac++;
            }
        }while (true);
        System.out.println("Girdiginiz "+sayac+" adet pozitif tamsayi toplami : "+toplam+" "); //"Girdiginiz ... adet pozitif tamsayi toplami : ..."
    }
}
