package day09loops;

import java.util.Scanner;

public class work09_04 {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin

        int i=5;
        do {
            System.out.print(i+" ");
        i++;}while (i<=10);

        //2. Örnek
        //Girilen tamsayının basamaklarının toplamını yazan program.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi degeri giriniz");
        int sayi= scan.nextInt();
        int toplam =0;
        do {
            sayi=Math.abs(sayi);
            toplam= toplam + sayi%10;
            sayi=sayi/10;
        }while (sayi>0);
        System.out.println(toplam);
        //Bir tamsayının tam bölenlerini ve tam bölenlerinin toplamını bulun.
        int sayi1=16551;
        int toplamm=0;
        int bolum=1;
        do {
            if (sayi1 % bolum == 0) {
                System.out.println(sayi1 + "sayisi " + bolum + "tam bölünüyor");
                toplamm = toplamm + bolum;

            }
            bolum++;
        }while (bolum <= sayi1) ;
        System.out.println(toplamm);
    }
}
