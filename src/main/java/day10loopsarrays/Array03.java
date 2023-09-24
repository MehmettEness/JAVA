package day10loopsarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        /*Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
                    [12, 3, -3, 5, 23] ==> 3, -3 */

        //Array leri kisa yoldan nasil olusturbiliriz?

        int numbers [] = {12, 3, -3, 5, 23};

        for ( int w : numbers ) {

            if(w<5){
                System.out.print( w + " ");
            }
        }

        System.out.println();

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz

        String names [] = {"K" ,"C" ,"R" ,"A" ,"S" ,};

        //binarySearch() methodunu kullanacagiz
        // sort() kullanmadan kullanmaycagiz cunku birt sıraya sokmak zorundayız.
        // bu methodta 0 degeri varsa eleman var yoksa - li bi deger verir eleman yok demektir.

        Arrays.sort(names);
       int result = Arrays.binarySearch(names , "R");
        System.out.println(result); // R degeri 3 de yer alır

        int result1 = Arrays.binarySearch(names , "U");
        System.out.println(result1); // U degeri olsaydı 6.sirada yer alırdı


        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);

        //kac kelime oldugunu görebilmek icin spaceden kesmemiz lazim

      String words [] =  s.split(" "); // split istedigimiz yerden kesmeye yariyor
        System.out.println(Arrays.toString(words));

        System.out.println(words.length);

    }
}
