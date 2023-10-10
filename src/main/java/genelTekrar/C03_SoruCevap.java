package genelTekrar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class C03_SoruCevap {
    public static void main(String[] args) {
        //Aşağıdaki ifadenin tersini yazınız
        String s3 = "Java is fun";

        for (int i = s3.length(); i > 0; i--) {
            System.out.print(s3.charAt(i - 1));
        }
        System.out.println();
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String s = "Hello Henry!";

        s = s.replaceAll("\\p{Punct}", "").replaceAll(" ", "");


        String arr[] = s.split("");
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> kv = new HashMap<>();

        for (String w : arr) {
            Integer yeniIfadem = kv.get(w);

            if (yeniIfadem == null) {
                kv.put(w, 1);
            } else {
                kv.replace(w, yeniIfadem + 1);

            }


        }
        System.out.println(kv);
        System.out.println();
     /*
     TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
     bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
      */
     System.out.println();
     Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen İsim Soyisim giriniz");
     String aS = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
     byte yas = scan.nextByte();

        System.out.println("Lütfen Kilonuzu giriniz");
     double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
     double boy = scan.nextDouble();
        System.out.println("Salonumuza ne kadar süreliğine kayıt yaptımak istiyorsunuz");
     int ay = scan.nextInt();

     System.out.println("İsim Soyisim : "  +  aS + "\n" + "Yaşınız : "  + yas +  "\n" + "Kilonuz :"  + kilo +  "\n" + "Boyunuz : "   + boy + "\n" + "Kayıt süreniz :" + ay+ "ay" ) ;
     System.out.println("Toplam ödemeniz gereken ücret : " + ay*20 + "$");

     System.out.println(scan);


       /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen hesaplama yapmak için sırasıyla deger giriniz :" );
        System.out.println("a değerini giriniz :" );
        double a = scan1.nextInt();
        System.out.println("b değerini giriniz :");
        double b = scan1.nextInt();
        System.out.println("c değerini giriniz :");
        double c = scan1.nextInt();

        System.out.println("a =" + a + "\n" + "b =" + b + "\n" + "c = " + c + "\n");

        System.out.println( "Sonuc = " + ((a*a - b*b))/(c*3));

        /*
        //scanner 04
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
                Ipucu : Vucut
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
                ORNEK:
        INPUT      : Kilo: 71
        Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
                */

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kiloo = scan2.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boyy = scan2.nextDouble();
        System.out.println("Kilonuz :" + kiloo + "\n" + "Boyunuz :" + boyy);
        System.out.println("Vücut ktle indeksiniz : " + (kiloo) / (boyy*boyy));

        System.out.println();





    }

}



