package day11mutidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        //bir array oluşturup bunları 0 a eşit mi degil mi diye kontrol edebiliriz.
        //Tabi büyükten kücüge dogru olusturabiliriz ancak boolding oluşturacagız. Yani yeni bir farklı bakış ile yazacagız
        //önce var olan int a olusturacagız

        int a [] = { 0, 2, 3, 0, 12, 0 };

        int b [] = new int [a.length]; //[0,0,0,0,0,0]
        // yeni bir int olusturarak bunu a kavanozuna eklediğimiz sayi kadar dinamik kod olusturduk


        int idx=0;//idx içinde 0 var
        for ( int w : a ) { //0, 2, 3, 0, 12, 0 bu sayilari java yazıp w!=0 kontrollerini saglıyor
            if (w!=0){
                b[idx]=w; // ilk önce 0 degerini aldı 0!=0 F sonra 2!=0 en basa koydu yani b[0] = 2 ve işlem böyle devam eder b[1]=3 b[2]=12 geri kalanı 0 ekliyor
                idx++;// bu method arttırarak yana kaymasını saglıyor
            }
        }
        System.out.println(Arrays.toString(b));//[2, 3, 12, 0, 0, 0]

        //Arraylerin esit olup olmadıgı nasil anlaşilir.
        int arr []= new int[3];
        arr [0] =2;
        arr [1] =1;
        arr [2] =3;

        int brr [] = new int[3];
        brr[0] = 2;
        brr[1] = 3;
        brr[2] = 1;

        //iki arrrayin ayni indexte ayni elemanlarin bulunmasi gerekir.
       boolean result= Arrays.equals(arr , brr); // eşit mi değil mi diye kontrol icin equals yaparız
        System.out.println("result = " + result); // false arr = 2 1 3 brr = 2 3 1 olduug için false verir.
    }
}
