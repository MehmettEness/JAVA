package day07StringManipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen passwordunuzu giriniz");

        String pwd = input.nextLine();      // kullanıcı space ile girebilir o yüzden ondan sonraki karakteri alsın diye next.Line alacagız

        //  i)En az 8 character olsun
        
        boolean lengthControl = pwd.length() > 7 ;  // length karakter sayısını verir. O yüzden kullandık

        System.out.println("lengthControl = " + lengthControl);

        // ii)Space characteri password'de olmasin

        boolean spaceControl= !pwd.contains(" "); // contains () icerisaine yazdıgımız deger var mı yok mu ona bakar true veya falwse verir // ! not operatörü space yoksa calıştır demek

        System.out.println("spaceControl = " + spaceControl);

        // iii)En az bir tane buyuk harf olsun
        
        boolean upperCase = pwd.replaceAll("[^A-Z]" , "").length()>0; //"[^A-Z]" büyük harf haric hersey // >0 dersek en az bir tane olsun  deriz.

        System.out.println("upperCase = " + upperCase);

        // iv)En az bir tane kucuk harf olsun
        
        boolean uppperCase =pwd.replaceAll("[^a-z]" , "").length()>0;

        System.out.println("uppperCase = " + uppperCase);

        //v)En az bir tane rakam olsun
        
        boolean number = pwd.replaceAll("[^0-9]" , "").length()>0;

        System.out.println("number = " + number);

        boolean isValid = lengthControl && spaceControl &&  upperCase && uppperCase &&  number ; // hepsini kontrol edip if else ile sonuc çıkar

        if (isValid) {
            System.out.println("Password gecerlidir");
        }else {
            System.out.println("Password gecersizdir");
        }
        
        
        
        
        

    }
}
