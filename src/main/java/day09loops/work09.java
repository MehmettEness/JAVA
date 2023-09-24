package day09loops;

import java.util.Scanner;

public class work09 {
    public static void main(String[] args) {
          /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */
        for (int i = 1; i < 5; i++) {
            System.out.println("week=" + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("day =" + j);
            }
        }

            /* ornekkk
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
             */

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        //Aynısını kullanıcıdan cekelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scan.nextInt();

        System.out.println("Lutfen sütun sayisini giriniz");
        int sutun = scan.nextInt();

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20

        double number = 28.587;
       String s1 = String.valueOf(number);
       String s2 = s1.split("[.]") [1];

        int s3 = Integer.valueOf(s2);

        int sum =0;
        for (int i = s3; i > 0; i=i/10) {
            sum = sum + i%10;
        }
        System.out.println(sum);

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

        int k = 23;
        while (k>11){
            if (k%2==0)
                System.out.print(k + " " );
            k--;
        }
        System.out.println();
//Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz");
        int numm = scan1.nextInt();

        int deger = 1;
        while (deger<11){
            System.out.println(numm + "x" + deger + "=" + (numm*deger) );
            deger++;
        }

       }
    }

