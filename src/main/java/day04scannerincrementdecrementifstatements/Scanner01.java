package day04scannerincrementdecrementifstatements;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

 /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */
        //Scanner input   =   new Scanner() ; //Scanner () bunun adina constanter denir
        Scanner input   =   new Scanner(System.in) ;

        System.out.println("Adinizi ve Soyadinizi giriniz");

        //nextLine methodu kullanıcıdan birden fazla kelime almak istersek kullanırız

        String fullName= input.nextLine();

        System.out.println("Yasinizi giriniz");

        //yaş gireceğimiz için byte seçeriz çünkğ kapladığı byte belli ve yas araligi bellidir

        byte age = input.nextByte();

        //double veya float girilir ancak double daha çok bilimsel verilerde girilir. o Yüzden float gireriz

        System.out.println("Boyunuzu giriniz");

        float heigt = input.nextFloat();

        System.out.println("Kilonuzu giriniz");

        short weight = input.nextShort();

        System.out.println("Medeni durumuzu giriniz");

        //next methodu kullanıca tek kelimeli string almak için kullanılır. O yüzden next seceriz evli, bekar, dul gibi

        String maritalStatus = input.next();

        //sorularimizi koyalayip soutv enter yap direk getirir.

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("heigt = " + heigt);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);



    }
}
