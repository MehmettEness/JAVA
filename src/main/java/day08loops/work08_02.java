package day08loops;

import java.util.Scanner;

public class work08_02 {
    public static void main(String[] args) {
         /*
        Soru 1) Ekrana 10 kez "Java guzeldir" yazdirin
        */
        for (int i = 0; i < 10; i++) {
            System.out.println("java Güzeldir");
        }
        /*
    Soru 2) 10 ile 30 arasindaki(10 ve30 dahil) sayilari aralarinda
    virgul olarak ayni satirda yazdirin
        */
        for (int i = 10; i <= 30; i++) {

            if (i < 30) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);
            }
        }
     /*
        soru 3) 0'dan 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.
        */

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "|");
            }

        }
        System.out.println("////////////////////////////////////////////////");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "|");
            }
        }
        System.out.println("-------------------------------------");

        /*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + "x" + i + "=" + sayi * i);

        }
         /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("100 den kucuk bir tamsayı giriniz");
        int sayi1 = scan1.nextInt();
        if (sayi1 > 0 && sayi <= 100) {
            for (int i = 1; i <= sayi1; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(".");
                }
            }


                    /*Soru 7) Interview Question
                    Kullanicidan 100'den kucuk bir tamsayi isteyin.
                 1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
                 - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
                 - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
                 - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
             */
            Scanner scan2 = new Scanner(System.in);
            System.out.println("Lutfen 100 den kücük bir tamsayi giriniz");
            int sayi3 = scan2.nextInt();
            if (sayi3 > 0 && sayi3 <= 100) {
                for (int j = 1; j <=sayi3; j++) {
                    if (j % 3 == 0 && j % 5 == 0) {
                        System.out.print("Java Güzeldir");
                    } else if (j % 5 == 0) {
                        System.out.print("Güzeldir");
                    } else if (j % 3 == 0) {
                        System.out.print("Java");
                    }else System.out.print(j + " , ");
                    }
                }
            }else System.out.println("gecerli gir");

        // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.

        int sayi4=7;
        int carpim=1;
        for (int i = sayi4; i >0 ; i--) {
            carpim*=i;

        }

        System.out.println(sayi4+"! = "+carpim);
    }

    }
