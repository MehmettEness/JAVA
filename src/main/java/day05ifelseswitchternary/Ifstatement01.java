package day05ifelseswitchternary;

import java.util.Scanner;

public class Ifstatement01 {
    public static void main(String[] args) {
        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int num= input.nextInt();

        if(num>0) { // 0>0 false

            System.out.println("pozitif");

        }else if (num<0) { //0<0 false

            System.out.println("negatif");

        }else{ //0=0 true kod çalışır notr olur

            System.out.println("notr");
            //if(num>0) {
            //            System.out.println("pozitif");
            //        }else{
            //            System.out.println("negatif");
        }
    }
}
