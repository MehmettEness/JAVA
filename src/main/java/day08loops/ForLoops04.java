package day08loops;

public class ForLoops04 {
    public static void main(String[] args) {


        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        /*
        578 % 10 => 8
        578/10 =>57.8 den 57
        57 % 10 => 7
        57/10 => 5.7 den 5
        5 % 10 => 5
        5/10 => 0.5 den 0 çıkarr

        genel olarak bakarsak tekrara döngüye düşmüş oluruz o yüzden for döngüsünden yararlanırız
         */

        int sum = 0; // sum :toplam

        for (int i = 578; i > 0; i = i / 10) {

            sum = sum + i % 10;//suan elimizde 8 var sum + yaparak sum kavanozuna ekleriz
        }
        System.out.println(sum);

        /*sonuc olarak işlem akısı su sekildedir.
        1---
        for (int i = 578 ; i > 0 ;  i=i/10) sepetimde i =578 ve 578>0 true verir
        sonrasında 578 % 10 yaptıgımızda  kalan 8 olur
        sonrasında tekrar yukarı cıkıp int sum =0 yerine int sum =8 edle ederiz
        sonra i=i/10 578 /10 = 57 çıkar
        2---
        57>0 dogru mu true
        57 % 10 = 7 çıkar
        8+7 =15 yapar
        57/10 yaparsak 5 yapar
        3---
        5>0 dogru mu true
        5%10 yaparsak 5 elde ederiz
        8+7+5 = 20 yapar
        5/10 yaparsak 0 elde ederiz
        4---0>0 dogru mu false bitti!
         */

        // Bir string teki tekrarsiz karakterleri veren kodu yaziniz
        //          mehmet ==> ht

        //bu soruyu cözmüstük

        String t = "mehmet";

        //unique : tekrarsız eşsiz benzersiz

        String unique = "";

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (t.indexOf(ch) == t.lastIndexOf(ch)) { // t.indexOf(ch) eşit mi t.lastIndexOf(ch) ye bu bize tekrarsizlari verecek

                unique = unique + ch;



            /* i=0 0<6 doru mu true
            sonra ch 0 bize m harfini verir
            t.indexOf(ch)==t.lastIndexOf(ch) m harfi 0 diger m 3 0=3 false vana kapalı
            digerleri icnde aynisini verir
            sonra h degeri icin 3=3 true verir ve hiçlik degeri + h =h verir
            sonrasında t icinde aynısı olur
            ve sonuc ht cıkar
             */
            }
        }

             System.out.println(unique);
        //Example : 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.
        //           5 + 6 + 7 + 8 ==> 26

        int total = 0;//sonuca 0 eklemek icin etkisiz eleman

        for (int i = 5; i < 9; i++) {

            total = total + i;

        }
        System.out.println(total);


        //Example  7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.
        //     7*8*9 ==> 504

        int total1 = 1;

        for (int i = 7; i <10 ; i++) {

            total1= total1 * i;

        }
        System.out.println(total1);

    }
}

