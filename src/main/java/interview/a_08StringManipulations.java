package interview;

public class a_08StringManipulations {
    public static void main(String[] args) {

        String s = "Java is easy";

        int karakterSayisi= s.length();
        System.out.println(karakterSayisi);
        System.out.println("\n------------------------------");

        //karakter almak icin
        char ilkKarakter = s.charAt(0);
        char sonKarakter = s.charAt(s.length()-1);
        System.out.print(ilkKarakter);
        System.out.print(",");
        System.out.print(sonKarakter);
        System.out.println("\n------------------------------");

        String karakterAl = s.substring(8,12);
        System.out.println(karakterAl); //easy

        System.out.println("\n------------------------------");

        String karakterAll=s.substring(8);
        System.out.println(karakterAll);//easy

        System.out.println("\n------------------------------");

        boolean karakterIcerirMi= s.contains("is");
        System.out.println(karakterIcerirMi); // true

        System.out.println("\n------------------------------");

        boolean buHarfleMiBasladi = s.startsWith("Java");
        System.out.println(buHarfleMiBasladi); //true

        System.out.println("\n------------------------------");

        boolean buHafrleMiBitti = s.endsWith("easY");
        System.out.println(buHafrleMiBitti); //false

        System.out.println("\n---------------------------------------------------------------------------------------");

        String a = "Learn Java earn 4400$ money";

        String kelimeDegistir = a.replace("money" , "dolar");
        System.out.println(kelimeDegistir);

        System.out.println("\n------------------------------");

        String rakamDegistir = a.replaceAll("[0-9]" , "*");
        System.out.println(rakamDegistir);

        System.out.println("\n------------------------------");

         /*Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.

                     String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
           */

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$" ,"");
        String newLaptop = laptop.replace("$" ,"");

        double toplamDeger = Double.valueOf(newTv) + Double.valueOf(newLaptop);
        System.out.println(toplamDeger);

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "    ali cAN   " ==> AC

        String b = "    ali cAN   ";

        char ilkHarf = b.trim().toUpperCase().charAt(0);

        char ikinciHarf = b.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.print(ilkHarf);
        System.out.print(ikinciHarf);

        System.out.println("\n------------------------------");


        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht

        String isim = "mehmet";

        if (isim.indexOf ("m") == isim.lastIndexOf("m")){
            System.out.print('m');
        }
        if (isim.indexOf('e') == isim.lastIndexOf('e')){
            System.out.print('e');
        }
        if (isim.indexOf('h') == isim.lastIndexOf('h')){
            System.out.print('h');
        }
        if (isim.indexOf('t') == isim.lastIndexOf('t')){
            System.out.print('t');
        }
        System.out.println();

        //Example 1: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String number =  "1234 6789 1234 6789" ;

        String birr = number.substring(0,14).replaceAll("[0-9]" , "*");
        String ikii = number.substring(15);

        System.out.println(birr.concat( " " + ikii));

        //isEmpty() bir string tamamen bos ise hic karakter icermiyorsa true verir, aksi halkde false verir

        //isBlank () methodu sadece space iceren stringler ici true verir, space disinda bir karakter var ise false verir.

        // isBlank() methodu ==> sadece space var ise ve hicbirsey yok ise true verir. bos stringler icinde true verir. isEmpty de kapsar.
        //        isEmpty() methodu ==> sadece hicbir sey icin true verir.

































    }

}
