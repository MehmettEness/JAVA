package interview;

import java.util.Scanner;

public class a_01baslangıc {
    public static void main(String[] args) {

        int age = 25;
        System.out.println("yaş: " + age);

        byte age1 = 15;
        System.out.println(age1);

        /*
        primitive ve non primitive arasındaki farklar nelerdir.
        primintivelerin kapladıkları alan belli iken non primitiveler farklı alanlar kaplar
        --priminitveler kücük harfle baslarken non primitiveelr büyük harfle baslar
        --primitiveleri java olusturmusken, non primitiveleri java develooperlar olusturmuslardıre.
        --priminitiveler bizim atadagimiz degerleri icerirken non primitiveler atadıgımzı degeri ve fazladan methodlari icerebilir.
         */

        /*
        java matemeatik bilri ve böylece matematik işlem sırasına göre gider.
        java her zaman yukarıdan asagıya ve soldan saga hareket eder.
        Aşagıdaki işleme concatination (birleştirme) denir. Bu işlemde string bir ifade ile int ifade birletirildi.
         */
        String s = "elma";
        int a = 15;
        int b = 10;
        System.out.println(s+a+b);//elma1510

        /*
        primitive = byte , int , boolean , double , float , char , short , long

        Wrapper class =Byte , Integer , Boolean , Double , Float , Character , Short , Long
         */
        int num = 13;
        Integer intnum = num;

        Byte k = 10;
        byte kbyyte = k;

        /*
        Data type =char -  boolean - byte - short  -   int -  long -  float- double
        Bunların kapladıkları alanlar var .
        Kücükten büyüğe doğru koymaya "AutoWedding" denir.
        Büyükten kücüge koymaya "Explicit Narrowing" denir
        */
        char harf = 'a';
        int yeniHarf = harf;

        int yas= 25;
        short newYas = (short) yas;

        Scanner scan = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        byte kilo = scan.nextByte();
        System.err.println(kilo);

        // ---- if(){}else{}

        Scanner deger = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");



    }
}
