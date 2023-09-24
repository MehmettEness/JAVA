package day10loopsarrays;

import java.util.Arrays;

public class work10_01 {
    public static void main(String[] args) {

        //Bir array olusrturun ve arraydeki tüm elemanlari yazdırın

        int [] arr = {1,5,7,8,9,3,2};

        System.out.println(Arrays.toString(arr));

        //Bir array olusturun ve bu arraydeki sayilari kücükten büyüge yazdır.

        int [] brr ={7,5,36,10,2,56,20,3};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));

        //Verilen arrayin tüm elelmanlarını bire soldaki konuma taşıyacak bir program yazin.
        //array 123 output 231 olacak

        int [] sayi = {4,8,9,10,3,78};
        int deger =sayi[0];
        for (int i = 0; i < sayi.length-1; i++) {
            sayi[i]=sayi[i+1];
            System.out.println(Arrays.toString(sayi));
        }
        sayi[sayi.length-1]=deger;
        System.out.println(Arrays.toString(sayi));

        //Verilen arraydeki en büyük sayiyi yazdırınız.

        int [] sayii = {4,8,9,10,3,78};
        Arrays.sort(sayii);
    }

    public static void maxsayiyazdir(int sayi[]) {
        int maxsayi=sayi[0];
        for (int i = 0; i < sayi.length; i++) {
            if (maxsayi<sayi[i]){
                maxsayi=sayi[i];

            }

        }
        System.out.println(maxsayi);
    }
}
