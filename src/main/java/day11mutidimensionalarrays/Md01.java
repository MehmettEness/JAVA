package day11mutidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static  void main(String[] args) {

        //[ [] , [] , [] ]    çok boyutlu array. Markette aslında çok kullanılmaz. Genelde 2 boyutlu kullanılırsa kullanılır.

        //a[][]=[ [5,12] , [81,45] , [123,0] ]
        //a[][]=[ [ 0,1]  , [0 ,1] , [0 , 1] ]

        //Bir arrayin elemanlari eger array şse bu arrayler multidimension arrays oalarak adlandırlır

        //multidimension Array nasil olusturulur

        int a [] [] = new int[3][2] ; // [ [0,0] , [0,0] , [0,0] ]

        //MultiDimension Arraylere nasıl eleman eklenir ?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[2][1]=0;

        //MultiDimension Arrayler konsola nasıl yazdırılır?

       // System.out.println(Arrays.toString(a)); // [[I@7c30a502, [I@49e4cb85, [I@2133c8f8] referanslar çıktı yazdırma işlemi farklı
          System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]] deepToString kullanmamız gerekecek. Burada üstte yer alan to string bir işe yaramıyor

        //MultiDimension Arraylerden specific bir eleman nasıl konsola yazdırılır.? örn:45
        System.out.println( a [1] [1] ); //45

        //MultiDimension Arrayden içindeki bir array nasıl yazdırılır?
        System.out.println(Arrays.toString(a[1]));

        //Kısayoldan MultiDimension Array nasıl olusturulur?
        String students [][]= { {"Ali" , "Ahmet"} , {"Cemal"} , {"Ayhan" , "Beyhan" , "Seyhan"} , {"Ceyhan" , "Kayahan"} };

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.

        int sum =0;
        for ( String[] w: students ) { //for each || String[] yazdık sadece string olmaz çünkü süslü parantez içinde string olamaz.
            sum=sum + w.length;

        }
        System.out.println(sum);

        System.out.println(Arrays.deepToString(students));

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz

        for ( String[] w: students){ //{"Ali" , "Ahmet"} bu String arraydir

            for ( String k  : w ) { //"Ali" "Ahmet" bunlar stringdir
                if(k.contains("m")) { //m icerir mi
                    System.out.print(k + " ");
                }

            }

        }

    }
}