package day06switchternarystring;

public class StringManipulations01 {
    public static void main(String[] args) {

        String s = "Java is easy"; //"Java is easy" yazdık s sepetine koyduk. demek

        //Example 1: "s" String'inde kullanilan character sayisini bulunuz.
        //hazır methodlardan inceleyeceğiz s. yaptığımızda kullanılan cogu method orada yer alıyor

        //s.length()//karakter sayısı toplayıp getirir

        int sLength = s.length();
        System.out.println(sLength);

        //Example 2: "s" String'indeki ilk indexte bulunan character'i ve son indexte bulunan karakteri aliniz.

        //s.charAt() kullanıcaz  At indexdeki chari ver diyoruz

        // Java is easy ?
        // 012345678910111213

       char firstChar = s.charAt(0);
        System.out.println(firstChar);
        char secondChar = s.charAt(11);
        System.out.println(secondChar);


        //note: index her zaman 0 dan başlar bu nedenle charAt her zaman ilk indexi verir
        //note2: index no olarak s.length()-1 girersek bu bize her zaman son indexi verir

        char lastChar2=s.charAt(s.length()-1);
        System.out.println(lastChar2);

        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)

        // s.substring() methodu kullanıcaz bu alt string demek subzero=sıfırınaltında demek gibi

       String sub1= s.substring(0,4) ;
        System.out.println(sub1); // java

        //Example 4: "s" String'indeki "is" kelimesini aliniz.

        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        String sub3 =s.substring(8,12);
        System.out.println(sub3); //easy

        //2.yol
        //Bir characterden baslayarak sonuna kadar almak isterseniz o zaman tek parametreli olanı kullanırız

        String sub4=s.substring(8);//8.harften sonrakine hepsini yazdır demek tek parametreli yani
        System.out.println(sub4);

        // soru: "s" String'inde easy kelimesinin var olup olmadıgını kontrol ediniz?

        boolean sub5= s.contains("easy"); // s.contains içerir demek
        System.out.println(sub5);//true

        //Example 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.

        boolean isStart = s.startsWith("Java");// .startsWith ile başlar demekk // ayrıca kücük harf büyük harf önemli java yazarsak false veri Java yazarsak true
        System.out.println(isStart);

        ////Example 8: "s" String'inin "easy" ile bitip bitmediğini kontrol ediniz.

        boolean isEnd = s.endsWith("easy");
        System.out.println(isEnd);//true





    }
}
