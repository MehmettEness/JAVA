package javapractice;

import java.util.Scanner;

public class C05Scanner {
    public static void main(String[] args) {
        /*
    kullanıcıdan aldıgınız sayının karesini bulunuz bulunuz
    not:bir sayının karesi,sayının kendisi ile carpımına esittir
     */
        //1.adim Scanner objesi olusturma

        Scanner scan = new Scanner(System.in) ;
        //kullanıcaya mesaj verelim

        System.out.println("Lutfen karesini bulmak istediğiniz sayiyi girin");

        int sayi= scan.nextInt();

        System.out.println(sayi*sayi);
    }

}
