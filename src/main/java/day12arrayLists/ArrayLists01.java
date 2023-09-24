package day12arrayLists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayListlere eleman nasıl eklenir?

        ages.add(9); //[9]
        ages.add(12);//[9,12]
        ages.add(10);//[9,12,10]
        ages.add(1, 656);//[9, 656, 12, 10]
        ages.add(888);//[9, 656, 12, 10, 888]

        System.out.println(ages);//[9, 656, 12, 10, 888]
        // ges.add(9); yazdıgımızda [9] çıkar // sonra ages.add(12); yazdıgımızda [9,12] // ages.add(10); [9,12,10]
        //ages.add(index:1, element 656); 9 ila 12 arasına 656 eklemek için 1.index yazıp sonra sayiyi yazarız.


        //Arraylistlere coklu eleman nasıl eklenir?

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges); // [1, 2, 3]

        ages.addAll(newAges); // bu yeni ages addAll yaparak en sona ekler. zaten eklenen sayi her zaman sona eklenir.

        System.out.println(ages); //[9, 656, 12, 10, 888, 1, 2, 3]

        int numOfelemant = ages.size(); // size() bize sayi verir
        System.out.println(numOfelemant); // toplam 8 ==> [9, 656, 12, 10, 888, 1, 2, 3]

        //verilen sayilardan istenilen degeri çekmek için
         //[9, 656, 12, 10, 888, 1, 2, 3]
         // 0 , 1, ,2 , 3,  4,  5, 6, 7

       int el= ages.get(1);
        System.out.println(el); // 656

        // bir indexte sayinin degerini degisatirme

        ages.set(1,313);//set methodu verilen index degerinin sayisini degistirmeye yariyor
        System.out.println(ages); //[9, 656, 12, 10, 888, 1, 2, 3] deger buna dönüstü [9, 313, 12, 10, 888, 1, 2, 3] yani1.indexi cevir dedik

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list); //[23, 24, 12, 9, 3]

        for ( Integer w : list ) { // list yer alan sayilari w konteyner koy dedik

            if (w%2!=0) {// w konteynerimda kalan 0 degilse bu tektir dedik

                list.set(list.indexOf(w),11); // list.indexOf methodu index vermeden hepsini sirayla alacak , 11 diyerek de tekleri 11 e cevirecek
                //zaten yukarıda yer alan set methodun degistiriyoruz. Burada da set kullandık tek olanları 11 e cevir dedik

            }
        }
            System.out.println(list);//[23, 24, 12, 9, 3] ==> [11, 24, 12, 11, 11]








    }
}
