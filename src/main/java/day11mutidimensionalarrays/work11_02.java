package day11mutidimensionalarrays;

import java.util.Arrays;

public class work11_02 {
    public static void main(String[] args) {
        // Bir muti araay olusturun bu elemanşarı yazdırın.

        String[][]arr={{"Selma" ,"Asli", "Berfin", "Rumeysa"},{"Ahmet","Fatih","Furkan","Halil"}};
        System.out.println(Arrays.deepToString(arr));//[[Selma, Asli, Berfin, Rumeysa], [Ahmet, Fatih, Furkan, Halil]]


        //  // Bir muti araay olusturun bu elemanşarı yazdıran bir method olusturun
        String[][]brr={{"Selma" ,"Asli", "Berfin", "Rumeysa"},{"Ahmet","Fatih","Furkan","Halil"},{"Antalya", "Ankara"}};
        elementYazdir(brr);


    }

    public static void elementYazdir(String[][] brr) {

        for ( String [] w  : brr  )   {
            for ( String a : w ) {
                System.out.println(a+" ");

            }
            System.out.println("\n------------------------------");

        }

        //Verilen 2 katli bir muti arrayde outer ındexi ve inner ındexi ayni olan sayilari bulun

        int sayilar [][]={{1,3,5,7,9},{2,4,6,8},{12,13,14,15,16}};
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (i==j){
                    toplam=toplam+sayilar[i][j];
                }

            }
            System.out.println(toplam);
        }
        //Verilen String bir arraydeki en uzun ve en kisa Stringleri yazdıran bir method olusturun

        String isimler []={"Selma","Ahmet","Cigdem","Ayten","Zafer","Rümeysa","Enes"};
        enUzunveEnKisa(isimler);
    }
    private static void  enUzunveEnKisa(String[] isimler){
        String max=isimler[0];
        String min=isimler[0];
        for (  String w: isimler ) {
            if(max.length()<w.length()){
                max=w;
            }
            if (min.length()>w.length()){
                min=w;
            }
        }
        System.out.println("en kisa String :" +min);
        System.out.println("en uzun String :" +max);

        //Verilen bir arraye yeni bir element ekleyin

        int grr []={1,2,3,4,5,6,7,8,9};
        int sayi=12;

        int yeniArr[]=new int [grr.length+1];//[0,0,0,0,0,0,0,0,0,0]

        for (int i = 0; i < grr.length; i++) {

            yeniArr[i]=grr[i];

        }
        yeniArr[yeniArr.length-1]=sayi;
        System.out.println(Arrays.toString(yeniArr));

    }
}
