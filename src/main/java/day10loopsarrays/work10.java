package day10loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
       String isim [] = new String[5];
       isim[1]="enes";
       isim[2]="mehmet";
       isim[0]="arslan";
       isim[4]="kaplan";
       isim[3]="neoplan";
        System.out.println(Arrays.toString(isim));

      /*Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        icerdigi karakter sayilari toplamini ekrana yazdirin.*/

        int num = 0;
        for ( String w: isim) {
            num = num + w.length();
        }
        System.out.println(num); //29

        /*Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
          bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz*/

       int number []= new int[6];
       number[0]=45;
       number[1]=27;
       number[2]=48;
       number[3]=54;
       number[4]=21;
       number[5]=18;

       Arrays.sort(number);
        int min = number[0];
        int max = number[5];
        System.out.println(min+max);

         /*Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
                    [12, 3, -3, 5, 23] ==> 3, -3 */

        int ary[] = {12, 3, -3, 5, 23};
        for ( int w: ary ) {
            if (w<5){
                System.out.print(w + " ");

            }
        }
        System.out.println();
        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String letter []= {"K","T","V","S","A","C","M"};

            Arrays.sort(letter);
            int result = Arrays.binarySearch(letter , "M");
        System.out.println(result);
        int res = Arrays.binarySearch(letter  , "F");
        System.out.println(res);


    }
}








