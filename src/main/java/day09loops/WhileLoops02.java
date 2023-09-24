package day09loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/

        Scanner input = new Scanner(System.in);

        System.out.println("carpım tablosu icin bir sayi giriniz");

        int num = input.nextInt();

        int i=1;

        while(i<11){

            System.out.println(num + " x " + i  +  " = " + (num * i)); /* 3 + x + 1 = 3*1 3x1=3
                                                                          3 + x + 2 = 3*2 3x2=6
                                                                          3 + x + 3 = 3*3 3x3=9
                                                                           ...............
                                                                             */
            i++;
        }


        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321
        // bu soru kelime olarak da gelebilir ama yöntem hepsinde kullanılabilir "enne"
        //java avaj kurali

        int k =131;

        //k yi rahatlıkla ters cevirmek icin Stringe cevirdik

        String m = String.valueOf(k); //"131"

        String reserved = "";

        int n = m.length()-1;// cevirmeye sondan baslayacagız m.length()-1 = 2 var n=2

        while (n>=0){

            reserved = reserved + m.charAt(n); //m.charAt(n); 2 degeri bize 3 verir ve ilem 1 0 ile rakamlarıyla edevam eder

            n--;
        }

        System.out.println(reserved);

        //suan ters cevirme islemi yaptık ama islem bitmedi

        if(m.equals(reserved)){ // biziim m datamız reserved ile eşit mi dedik
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
