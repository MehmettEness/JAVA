package day12arrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class work12 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(9);//[9]
        ages.add(12);//[9,12]
        ages.add(57);//[9,12,57]
        ages.add(2, 99);//[9,12,99,57]
        System.out.println(ages);
        //Arraylistlere coklu eleman nasıl eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(5);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 12, 99, 57, 1, 2, 5]
        //kac adet sayi var
        int adet = ages.size();
        System.out.println(adet); //7
        //sayi cek
        int sayiCek = ages.get(4);
        System.out.println(sayiCek);//1
        //sayi degiştir
        ages.set(3, 27);
        System.out.println(ages);//57 sayisi 27 oldu

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(14);
        liste.add(27);
        liste.add(36);
        liste.add(87);

        for (Integer w : liste) {
            if (w % 2 != 0) {
                liste.set(liste.indexOf(w), 11);
            }
        }
        System.out.println(liste);

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]

        ArrayList<Character> t = new ArrayList<>();
        t.add('J');
        t.add('a');
        t.add('v');
        t.add('a');
        t.add('v');

        ArrayList<Character> newt = new ArrayList<>();
        for (Character w : t) {
            if (!newt.contains(w)) {

                newt.add(w);
            }
        }
        System.out.println(newt);

        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r);

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")) {
                r.remove(i);
                i--;

            }
        }
        System.out.println(r);

        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        ArrayList<Integer> listt = new ArrayList<>();
        listt.add(12);
        listt.add(23);
        listt.add(17);
        listt.add(19);

        Collections.sort(listt);

        int minnDiff =listt.get(1)- listt.get(0);

        for (int i = 1; i < listt.size(); i++) {

            if (listt.get(i) - listt.get(i-1) == minnDiff ){
                System.out.println(listt.get(i)  +  "ve " + listt.get(i-1));

            }

        }

    }
}
