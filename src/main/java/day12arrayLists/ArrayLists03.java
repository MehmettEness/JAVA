package day12arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        //Öncelikle list elemanları kücükten büyüge dizmeliyiz [10 , 12 , 19 , 23]
        //minDif = en kücük fark demek
        //12-10=2 / 19-12=7 / 23-19=4 kalan en kücük minDif e eklenecek
        //kalan en kücük degeri bulmaya calısacagız yani 10 , 12 sayilarini bulacagız

        Collections.sort(nums);//Arrayslerde sort yapacagımız zaman collections kullanacagız
        System.out.println(nums); //[10, 12, 19, 23]

        int minDiff = nums.get(1) - nums.get(0);
        ////[10, 12, 19, 23]
        ////  0   1   2   3
        //int minDiff = nums.get(1) - nums.get(0); 12-10 = 2 var

        //en kücük farkın kac oldugunu bulan kodu yazalım

        for (int i = 1; i < nums.size(); i++) {

            //i =1 ve 1<4 true


            Math.min(minDiff , nums.get(i) - nums.get(i-1) );
            // Math.min(2 , 12 - 10 );

        System.out.println(minDiff); // 2

        //en kücük farkı hangi iki sayidan elde ettigimizi bulalim


        for (int i1 = 1; i < nums.size(); i++) {

            if (nums.get(i) - nums.get(i-1)==minDiff);

            System.out.println(nums.get(i) + "ve" + nums.get(i-1));
        }
    }
}
}
