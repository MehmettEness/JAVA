package day05ifelseswitchternary;

import java.util.Scanner;

public class Ifstatements05 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        //sırayla git önce istenenleri koy sonra if kalıpları koy sonra yazmaya basla
        System.out.println("Cinsiyetinizi giriniz");
        String gender = input.next();

        System.out.println("Yasinizi giriniz");
        int age = input.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Lutfen yasi 0 ile 120 arasinda giriniz");

        } else if (gender.equalsIgnoreCase("Kadin")) {

            if (age > 60) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Calismali...");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

            if (age > 65) {
                System.out.println("Emekli olabilir");
            } else {
                System.out.println("Kesinlikle Calismali...");
            }

        } else {
            System.out.println("Tanimli degil...");


        }
    }
}