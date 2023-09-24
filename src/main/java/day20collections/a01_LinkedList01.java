package day20collections;

import java.util.LinkedList;

public class a01_LinkedList01 {
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

        LinkedList<String> list = new LinkedList<>();
        //list. dersen bircok method görebilirsin
        list.add("Mehmet");
        list.add("Ahmet");
        list.add("Onur");
        list.add("Kübra");
        list.add("Tuba");
        list.add("Duygu");
        System.out.println(list);//[Mehmet, Ahmet, Onur, Kübra, Tuba, Duygu]
        list.add(1, "Enes");
        System.out.println(list); //[Mehmet, Enes, Ahmet, Onur, Kübra, Tuba, Duygu]
        list.addFirst("Arslan");
        System.out.println(list); //[Arslan, Mehmet, Enes, Ahmet, Onur, Kübra, Tuba, Duygu]
        list.addLast("Mahmut");
        System.out.println(list);//[Arslan, Mehmet, Enes, Ahmet, Onur, Kübra, Tuba, Duygu, Mahmut]
        list.remove("Mehmet");
        System.out.println(list);//[Arslan, Enes, Ahmet, Onur, Kübra, Tuba, Duygu, Mahmut]

        // peek neee demek.
       // Retrieves, but does not remove, the head (first element) of this list.
        // Returns:the head of this list, or null if this list is empty
        System.out.println(list.peek()); // Arslan ilk elemanı verir ama listeyi silmez. Asagıda olfugu gibi.
        System.out.println(list); //[Arslan, Enes, Ahmet, Onur, Kübra, Tuba, Duygu, Mahmut]

        //Retrieves and removes the head (first element) of this list.
        //Returns:the head of this list, or null if this list is empty
        System.out.println(list.poll());//Arslan ilk elemanı verir ama listyeden ilk elemanı siler. Asagıda old gibi
        System.out.println(list);//[Enes, Ahmet, Onur, Kübra, Tuba, Duygu, Mahmut]

        /*
        Note: peek () ile elemnt() methodu ilk elema  degerini silmeden verir.
        peek() list bos oldugunda bize "null" verir.
        element() ise hata verir.
         */
        System.out.println(list.element());//Enes
        System.out.println(list);//[Enes, Ahmet, Onur, Kübra, Tuba, Duygu, Mahmut]


        /*
        poll() ile pop() ikiside elemani siler
        poll() list bos oldugunda bize "null" verir.
        pop() ise hata verir.
         */
        System.out.println(list.pop());//Enes
        System.out.println(list);//[Ahmet, Onur, Kübra, Tuba, Duygu, Mahmut]



    }

}