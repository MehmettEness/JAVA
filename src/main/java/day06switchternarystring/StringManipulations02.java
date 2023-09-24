package day06switchternarystring;

public class StringManipulations02 {
    public static void main(String[] args) {


        String s = "Learn Java earn 4400$ money";
        //Ornek1: "s" Stringdeki "money" kelimesini "dolar" kelimesimne ceviriniz

        String s1=s.replace("money" , "dolar");        //s.replace değiştri demek
        System.out.println(s1); //Learn Java earn dolar

        //Ornek2: "s" Stringdeki tüm e harflerini siliniz

        String s2=s.replace("e" , ""); // e yi hiclik ile degisitircek
        System.out.println(s2); // Larn Java arn mony

         /*
                            Meshur Regex'ler Regex: Düzenli ifade (Regular expression)

        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]
           x, q, w harfleri ==> [xqw]

        8) Kucuk harflerden farkli tum character'ler ==> [^a-z]
        9) Tum harflerden farkli tum character'ler ==> [^a-zA-Z]

    Bu kisim da [] kullanilmaz. Buyuk harfler olumsuz anlama gelir
        Sadece space karakteri : \\s
        Space karakteri haric  : \\S
        Sadece rakamlar        : \\d  (digit ten geliyor)
        Rakamlar haric         : \\D
    */



        //Ornek3: "s" Stringdeki tum rakalmları (0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz

        ///regex regular experition :

        String s3 =   s.replaceAll("[0-9]", "*"); //s.replaceAll s sepetindeki hepsini ele alalım
        System.out.println(s3);

        //Ornek 4: s Stringindeki rakam sayısını bulunuz

        int num =s.replaceAll("[^0-9]", "").length(); //.length();bu deger4400 çıkar bu kod bize kac adet varsa onu verir
        System.out.println(num);







    }
}
