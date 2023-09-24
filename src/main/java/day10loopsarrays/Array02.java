package day10loopsarrays;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        /*Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
          bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz*/

        int ages [] = new int[6];
        ages [0] = 20;
        ages [1] = 23;
        ages [2] = 19;
        ages [3] = 44;
        ages [4] = 15;
        ages [5] = 32;

        // öncelikle bunları kücükten büyüge göre siralayıp sonra min max degerlerini almamiz lazım

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        Arrays.sort(ages);
        // sort () methodu sayısalları kücükten büyüge siralar (ascendign order)
        // sort () methodu string data typelerini alfabetik sıralar
        // (ascendign order) + (alphabetical order) ==> natural order
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        System.out.println(ages[0] + ages[ages.length-1]); // 15 + 44 = 59

        //2.yol  verilen sayılardaki en kücük olanı bulacagız

        int minimum = ages[0]; //[] içine herhangi bir deger yazarız
        int maximum = ages[3]; //[] içine herhangi bir deger yazarız

        for( int w : ages ){

            minimum= Math.min( minimum , w); // math iki sayi arasindaki degeri verir
            maximum = Math.max( maximum , w);
        }
        System.out.println(minimum); //15
        System.out.println(maximum);//44
        System.out.println(minimum + maximum );//59
    }
}
