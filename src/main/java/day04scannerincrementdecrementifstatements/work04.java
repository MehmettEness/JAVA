package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class work04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi giriniz");
        int num = scan.nextInt();

        if(num%2==0){
            System.out.println("cift sayi..");
        }else{
            if(num%2 !=0){
                System.out.println("tek sayi..");
        }


        }
    }
}












