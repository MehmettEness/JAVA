package day09loops;

import java.util.Scanner;

public class work09_02 {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */

        for (int i = 0; i < 4; i++) {
            System.out.println(" * * * * * *");
        }
        //asagidaki sekli yazdirin
        /*
         * * * * * *
         * * * ! * *
         * * ! * * *
         * * * * * *
         */

        for (int satir = 1; satir < 5; satir++) {
            for (int sutun = 1; sutun < 7; sutun++) {
                if (satir == 2 && sutun == 4) {
                    System.out.print("! ");
                } else if (satir == 3 && sutun == 3) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        /*
        1 den girilen sayiya kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.
        Beklenen çıltı:
     1
     12
     123
     1234
     12345
     123456
     1234567
     12345678
     123456789
     12345678910
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i < sayi; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        int sayti1 = 8;
        for (int i = 1; i <= sayti1; i++) {
            for (int j = sayti1; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
/*
            a
            a b
            a b c
            a b c d
            a b c d e
            şeklini yazdırınız.
            */

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen ilerlemek istediginiz harfi giriniz");
        char harf = scan2.next().toLowerCase().charAt(0);
        for (int i = 'a'; i <= harf; i++) {
            for (int j = 'a'; j <= i; j++) {
                System.out.print((char) j + " ");

            }
            System.out.println();
        }
 /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */
        int satir = 5;
        for (int i = 1; i <= satir; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print('*' + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('.' + " ");
            }
            System.out.println();
        }


        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*' + " ");
            }
            System.out.println();

        }
        for (int i = 1; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print('*' + " ");

            }
            System.out.println();
        }
    }
}



