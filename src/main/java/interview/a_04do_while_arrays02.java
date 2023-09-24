package interview;

import java.util.Scanner;

public class a_04do_while_arrays02 {
    public static void main(String[] args) {

        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int a = 123321;
        String b = String.valueOf(a);
        String c = "";

        int d = (b.length()-1);
        while (d>=0){
            c = c+b.charAt(d);
            d--;
        }
        if (b.equals(c)){
            System.out.println("palindromesin");
        }else{
            System.out.println("palindrome degilsin");
        }


        //asagidaki sekli yazdirin
        /*
         * * * * * *
         * * * ! * *
         * * ! * * *
         * * * * * *
         */

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 7; j++) {
                if (i==2 && j==4){
                    System.out.print("! " );
                } else if (i==3 && j==3) {
                    System.out.print("! " );
                }else {
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

        for (int i = 1; i < 12; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2. Örnek
        //Girilen tamsayının basamaklarının toplamını yazan program.

       Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();
        int toplam =0;
        do {
            sayi=Math.abs(sayi);
            toplam= toplam+sayi%10;
            sayi= sayi/10;
            System.out.println(toplam);
        }while (sayi>0);

    }
}
