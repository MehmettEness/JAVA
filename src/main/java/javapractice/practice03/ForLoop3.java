package javapractice.practice03;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {

         /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini sisteme giriniz");
        int satirSayisi = scan.nextInt();

        for (int i = 0; i < satirSayisi; i++) {//satirlar icin olan loop

            for (int j = 0; j <= i; j++) {//sütun için "*" yazdırma islemi icin <= yapmamızın nedeni ilkinde yazdırması icindir

                System.out.print("* ");//BURADA YAN YANA YAZDIRIYOR
            }
            System.out.println(); //BURADA SATIR ALTA GECİYOR
        }

    }
}

