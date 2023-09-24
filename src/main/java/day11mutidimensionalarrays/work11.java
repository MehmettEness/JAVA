package day11mutidimensionalarrays;

import javax.imageio.ImageTranscoder;
import java.util.Arrays;

public class work11 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int one []={0, 2, 3, 0, 12, 0};
        int two []= new int[one.length];

        int three =0;
        for ( int w: one ) {
            if (w!=0){
                two [three]=w;
                three++;
            }
        }
        System.out.println(Arrays.toString(two));


        //Arraylerin esit olup olmadıgı nasil anlaşilir.
        int arr []= new int[3];
        arr [0] =2;
        arr [1] =1;
        arr [2] =3;

        int brr [] = new int[3];
        brr[0] = 2;
        brr[1] = 3;
        brr[2] = 1;

    boolean esitmi = Arrays.equals(arr,brr);
        System.out.println(esitmi);

//Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        int numbers [][]= { {5,4} , {2,3,2} }; // int numbers [][]= { {} , {} };
        // soru bizden { {5,4} , {2,3,2} } => {5,4,2,3,2} cevir diyor

        int toplam = 0;
        for ( int [] w : numbers ) {
            toplam = toplam+w.length;

        }
        System.out.println(toplam);// 5

        int deger = 0;
        int newArr []= new int[toplam];
        for ( int[] w: numbers ) {
            for ( int k  : w ) {
            newArr [deger] =k;

            deger++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int kucuk = ages[0][0];
        int buyuk = ages[0][0];

        for ( int [] w : ages ){
            for (int e : w){
          kucuk =  Math.min( kucuk , e);
          buyuk = Math.max(buyuk, e);
            }
        }


















        }

    }

