package day08loops;

import java.util.Arrays;
import java.util.Scanner;

public class work08_01 {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime = scan.next();
        int count = 0;
        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)=='a') {
                count++;
            } else if (kelime.charAt(i)=='c') {
                break;
            }
        }
        System.out.println("ilk c harfine kadar olan a harflerinin sayisi =" + count);

         /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */
        Scanner scan1 = new Scanner(System.in);
        int sayac = 0;
        for (int i = 0; i < 5 ; i++) {
            System.out.println("lutfen bir sayi giriniz");
            int sayi = scan1.nextInt();

            if (sayi%10==7 || sayi%10==9){
                continue;
            }
            sayac = sayac + sayi;

        }

        System.out.println("toplam=" + sayac);

         /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("lutfen dik ucgen ici satır sayisini giriniz");
        int satir = scan2.nextInt();

        for (int i = 1; i < satir ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }

        /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */

        Scanner scan4= new Scanner(System.in);
        int sayacc= 0;
        int toplam= 0;

        do {
            System.out.println("Lütfen pozitif bir tamsayi giriniz\n bitirmek icin 0 tuslayınız");
            int sayi = scan4.nextInt();
            if(sayi==0) {
                break;
            } else if (sayi<0) {
                System.out.println("Negatif sayi kullanamazsınız");
                continue;
            }
            toplam = toplam + sayi;
            sayacc++;
        }while (true);
        System.out.println("girdiginiz "+sayacc+" adet pozitif  degerin toplamı :" + toplam);

        /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */

        int [] arr = new int[5];
        Scanner scan5 = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            System.out.println("lutfen sayi giriniz");
            int sayi = scan5.nextInt();
            arr[i]=sayi;

        }
        System.out.println(Arrays.toString(arr));

        double toplam1 = 0;

        for ( int w1 : arr ) {
            toplam1 = toplam1 + w1;

        }
        System.out.println("toplam1 = " + toplam1);

        double ortalama= toplam1 / arr.length;
        System.out.println("ortalama = " + ortalama);

        for ( int w1 : arr ) {

            if (w1>ortalama){
                System.out.print(w1 + " ");
            }
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] =  arr[i]*-1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
