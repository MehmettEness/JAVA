package javapractice.practice03;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");

        String kelime = scan.next();

        //Stringdeki karakterleri tek tekk charAt ile alabiliriz

        int sayac =0;

        for (int i = 0; i < kelime.length() ; i++) {

            if (kelime.charAt(i)=='a'){
                sayac++;
            }else if (kelime.charAt(i)=='c'){

                break;
            }


        }
        System.out.println("İlk c harfine kadar olan harflerinin sayisi : " + sayac);

    }
}
