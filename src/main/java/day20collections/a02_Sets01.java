package day20collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class a02_Sets01 {
    public static void main(String[] args) {
       /*
        1)Set ler tekrarsiz eleman (unique) depolamak icin kullanılır!!!
        2)3 tane set class vardır

            a)HashSet Class. (Örnegin 150 kisilik ögrenci toplulugunda benzersiz ögrnci numarası vermek.201010104040
            Benzersiz ıd olusturma teknigine Hashing denir. Hashset elemanları rastgele sıralar.
            hashset elemanları sıralamadıgında cok hızlı calısır.
            Hashsetler "null" i eleman olarak kabul eder.

            b) LinkedHashSet Class
                LinkedHashSetler elemanları bizim verdigimiz sıraya göre yani ( bizim verdigimiz sıraya göre = insertion) dizer.
                HashSetlere göre daha yavas calısır.

            c)TreeSet Class
              Treeset elemanları natural order a göre dizerler. Bu nedenle cok yavaastırlar. ( natural order = alfabetik sıraya göre , numeretik sıraya göre gibi )

       3) Treeset cok yavas oldugundan Treeset kullanmayaya calısırız.
        */

        HashSet<String> hs = new HashSet<>();
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur] // Hashset elemanları rastgeele sıralar. Rastgele sıraladı.
        hs.add("Onur");//aynı elemanı eklemek istersek eger hata vermez ama bu sıraya da eklemez.
        System.out.println(hs);//[Kerem, Sinan, Tuba, Onur]

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(1);
        lhs.add(28);

        System.out.println(lhs); // [313, 19, 1, 28] bizim verdigimiz sırayla dizdi.
        lhs.add(null);
        System.out.println(lhs); ///   [313, 19, 1, 28, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(19);
        ls.add(17);
        ls.add(11);

        lhs.retainAll(ls);
        System.out.println(lhs); //[313, 19] // kesisim kumesi gibi yaptı.
        System.out.println(ls); //[313, 19, 17, 11]

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        System.out.println(ts); //[A, G, R, U, Z]




    }
}
