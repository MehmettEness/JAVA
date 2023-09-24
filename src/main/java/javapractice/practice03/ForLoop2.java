package javapractice.practice03;

import java.util.Scanner;

public class ForLoop2 {

    public static void main(String[] args) {
        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Lutfen bir sayi giriniz");

            int sayi=scan.nextInt();

            if (sayi%10==7  || sayi%10==9){
                continue; // if kisminin true verdigi elemanlari pas gecer (7 veya 9 olanlar hariç )
                //else yazmamaıza gerek yok çünkü continue ibaresi koyduk yani başak bir durum yok ya toplanacak ya toplanmayacak

            }
            toplam=toplam+sayi; //bunu yazmanın kısa yolu topla+=sayi
        }

        System.out.println("toplam = " +  toplam);

    }
}
