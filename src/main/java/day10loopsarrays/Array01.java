package day10loopsarrays;

import java.util.Arrays;

public class Array01 {

    public static void main(String[] args) {

        /*int a = 13;
        a=7;
        a=3; biz bu zamana kadar int a =13 demektir dedik sonra a degerini degistirdik yerine 7 yazdık java 13 ü sildi 7 yazdı */

        //Array nasil olusturulur
         String ogrIsmi [] = new String[5];

         //String ogrIsmi [] burada koseli parantez actıgımızda java ögrenci İsmi kısmına birden fazla deger girecek diyor.
        // new String[]; kısmında [] icine ne kadar alan rezerve edeceksek on uyazarız 5, 20, 15 yani çoklu data oluşturmaya yarıyor
        //memory de 5 kişilik alan oluşturduk


        //Arrayler nasıl yazdırılır
        /*System.out.println(ogrIsmi); // kodu calıstırdıgımız da @kısmında yazan kısım referans oluyor*/
        System.out.println(Arrays.toString(ogrIsmi)); //[null, null, null, null, null]

        //Arrayler Arrays.toString methodu ile yazdırılır

        //to.String methodunu kullanmadan sadece Array ismi ile yaxdırırsanız java sadece o Arrayin adresini yazdirir

        //Array e eleman ekleme nasil yapilir?

        ogrIsmi [2] ="Arslan";
        ogrIsmi [3] ="Yagmur";
        ogrIsmi [4] ="Gürgen";
        ogrIsmi [0] ="Mehmet";
        ogrIsmi [1] ="Enes";
        System.out.println(Arrays.toString(ogrIsmi)); //[Mehmet, Enes, Arslan, Yagmur, Gürgen]

        //Arrayden spesifik bir elemanı almak ?
        System.out.println(ogrIsmi[2]); // 2 numarada Arslan verisini cektik

        /*Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
          icerdigi karakter sayilari toplamini ekrana yazdirin.*/

        String cities [] = new String[5];

        cities [0] = "ANKARA";
        cities [1] = "BURSA";
        cities [2] = "BALIKESİR";
        cities [3] = "İSTANBUL";
        cities [4] = "VAN";

        //karakter sayılarını ekrana yazdırıcaz
        int totalChar =0;


            // cities.length böyle yaparak String içindeki degeri alıyoruz () yok cunku bunda method yok sayısı belli zaten 5
            //Stringlerde kullandıgımız length() methodtur
            // arraylerdeki length variabledir
        for (int i = 0; i <cities.length ; i++) {

            totalChar=   totalChar + cities[i].length();

        }

        System.out.println(totalChar); //31

        //2.yol for-each loop (enhanced loop)
        int sum =0;


        for( String w : cities ){ // w:wariable name==> buradaki tüm citiesleri al diyoruz ve lengeth ile topluyoruz
            sum= sum + w.length();
        }
        System.out.println(sum); // 31
    }
}
