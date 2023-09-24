package day09loops;

import java.util.Scanner;

public class ForLoops01 {
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

            System.out.println("Week : " + i);

            for (int k = 1; k < 8; k++) {
                System.out.println("Day :" + k);
            }
        }

           /* System.out.println("Day : 1");
            System.out.println("Day : 2");
            System.out.println("Day : 3");
            System.out.println("Day : 4");
            System.out.println("Day : 5");
            System.out.println("Day : 6");
            System.out.println("Day : 7"); */

        // bu kod çok fazla veri içerişr gerek yok kodu dinamik yazmak lazım. bu yüzden yukarıdaki yazmak sadeleştirir


            /* ornekkk
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
             */

            /*System.out.println("X X X X X");
            System.out.println("X X X X X");
            System.out.println("X X X X X");*/ //kodu bu sekilde yazabiliriz ama dinamik kod yazmamız lazım

        for (int i = 1; i < 4; i++) { // dıstaki loop satirlar icin satir sayisi kadare calıstırıyorum
            //  System.out.println("x x x x x"); bu sekildede yapabiliriz

            for (int j = 1; j < 6; j++) { // icteki loop yanyana yazdiginda sutunlar icin sutun sayisi kadar calıstı
                System.out.print("x "); // yan yanan 5 tane yazdı

            }

            System.out.println(); // println kısmıda alt alta yazması icin kullandık

        }

        //kullanıcıdan aynısını çekelim

        Scanner input = new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz...");
        int row= input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");
        int column= input.nextInt();


        for (int i = 1;  i <=row ;     i++) {//dıstaki loop satirlar icin satir sayisi kadar calistiriyorum

            for (int k = 1;   k <=column ;     k++) {//icteki loop yanyana yazdigindan sutunlar icin sutun sayisi kadar calisit
                System.out.print("X  ");
            }

            System.out.println();//satir yan yana print ile yazdirildigindan pointeri bir sonraki satira almak icin kullandik


        }

    }
}


