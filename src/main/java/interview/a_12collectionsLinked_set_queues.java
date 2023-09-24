package interview;

import java.util.*;

public class a_12collectionsLinked_set_queues {
    public static void main(String[] args) {
        /*
        1)Arraylistler eleman silme ve eleman eklemede basarisizdirlar
          O yüzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
        2)Linkedlistler index kullanmadiklarindan eleman ekleme ve silmede re-index yapilmasina gerek yoktur
        Buda linkdelistleri eleman ekleme ve silmede cok basarili hale getirir
        3) Arraylistlerde search islemi kolay yapilir, cunku indexler adres gibidir
        4) Linkedlistlerde search islemi zor yapilir cunku linkedlistler index kullanmazlar
        index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir buda cok fazla is demektir
         */
         /*
        Note: peek () ile elemnt() methodu ilk elema  degerini silmeden verir.
        peek() list bos oldugunda bize "null" verir.
        element() ise hata verir.
         */
        /*
        poll() ile pop() ikiside elemani siler
        poll() list bos oldugunda bize "null" verir.
        pop() ise hata verir.
         */

        LinkedList<String> list = new LinkedList<>();
        list.add("mehmet");
        list.add("enes");
        list.add("arslan");
        list.add("yagmur");
        System.out.println(list);


        list.add(1, "grall");
        list.addLast("gürgen");
        list.remove("arslan");
        System.out.println(list);

        //////////////////////////////////////set//////////////////////////////////////////////////////////

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
        hs.add("Tuğba");
        hs.add("Onur");
        System.out.println(hs); // rastgele dizdi.

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(15);
        lhs.add(29);
        lhs.add(236);
        lhs.add(27);
        System.out.println(lhs); //Bizim verdigimiz sıraya göre ekledi.

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(17);
        ls.add(23);
        ls.add(29);
        ls.add(235);
        ls.add(27);

        lhs.retainAll(ls);

        System.out.println(lhs);//29 ve 27 lhs ve ls de ortak


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('B');
        ts.add('D');
        ts.add('X');
        ts.add('M');
        System.out.println(ts); //[B, D, G, M, X] alfabetik dizdi.

        ///////////////////////////////////QUEVES/////////////////////////////////////////////////////////////

        Queue<String> raf = new PriorityQueue<>();
        raf.add("et");
        raf.add("süt");
        raf.add("yumurta");
        raf.add("peynir");
        raf.add("zeytin");
        System.out.println(raf);//[et, peynir, yumurta, süt, zeytin]
        //[et, peynir, yumurta, süt, zeytin] rastgele dizdi bunu sebebi PriorityQueue<>(); methodu
        //Linkedlist<>(); kullansaydık  natural order a göre dizerdi Yani alfabetik veya numerreetik sıraya göre dizerdi.

        raf.remove();
        System.out.println(raf);//[peynir, süt, yumurta, zeytin] ilk giren ilk çıkar :)

    }
}
