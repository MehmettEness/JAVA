package day07StringManipulations;

import java.util.Scanner;

public class work06_07_01 {
    public static void main(String[] args) {

        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun

        */

            Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen gecerli bir password giriniz");
        String pswd =scan.nextLine();
        boolean chara = pswd.length()>7;
        boolean space = !pswd.contains(" ");
        boolean upperCase = pswd.replaceAll("[^a-z]" , "").length()>0;
        boolean lowerCase = pswd.replaceAll("[^A-Z]" , "").length()>0;
        boolean number = pswd.replaceAll("[^0-9]" ,"").length()>0;
        boolean pswdd = chara&&space&&upperCase&&lowerCase&&number;
        if (pswdd){
            System.out.println("Gecerli password girdiniz");
        }else{
            System.out.println("Gecersiz password girdiniz");
        }
        /*Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.

                     String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
           */
        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$" , "");

        String newLaptop= laptop.replace("$" , "");

          // valueOf ile buradan rakam olarak çıkmasını saglariz.Normalde "456.99" + "875.99" oalrak çıkar

        Float total= Float.valueOf(newLaptop) + Float.valueOf(newTv);
        System.out.println(total);

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "    ali cAN   " ==> AC

        String name ="  meHMET ENes";
        char namee= name.trim().toUpperCase().charAt(0);
        char namee1=name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("" + namee + namee1);

        /*Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum karakterleri dynamic olarak aliniz

        abc@gmail.com ===> gmail*/

        String charac = "abc@gmail.com" ;
        int one = charac.indexOf('@')+1;
        int two = charac.indexOf('.');
        String deger = charac.substring(one , two);
        System.out.println(deger);

        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht

        String namE =" mehmet";
        if(namE.indexOf("m") == namE.lastIndexOf("m")){
            System.out.print("m");
        }if (namE.indexOf("e") == namE.lastIndexOf("e")){
            System.out.print("e");
        }if (namE.indexOf("h")==namE.lastIndexOf("h")){
            System.out.print("h");
        }if (namE.indexOf("t")== namE.lastIndexOf("t")){
            System.out.print("t");
        }
        System.out.println();

        //Example 1: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

       String num = "1234 6789 1234 6789" ;
       String star = num.substring(0,15).replaceAll("[0-9]", "*");
       String four = num.substring(15);
        System.out.println(star.concat(four));

         /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
       */
        String pwd =" 1";
        boolean onee = pwd.isEmpty();
        boolean twoo = pwd.isBlank();
        boolean threee= pwd.trim().equals(pwd);
        if (onee){
            System.out.println("Parola Boş olmamalıdır, en az bir karakter icermelidir.");
        }
        if (twoo){
            System.out.println("space harici karakterlerde bulunmalidir");
        }
        if (threee){
            System.out.println("Başında ve sonunda boşluk olmamalıdır.");
        }


    }
}
