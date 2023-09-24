package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators { //tekrarlayıcı, yineleyici

    public static void main(String[] args) {

         /*
        1) Iterator lar loop larin yaptigi ayni isi yapar
        2) Iterator larda sonsuz loop olusma ihtimali yoktur
        3) Iterator lar ile looplar arasinda performans farki yoktur
        4) Iterator lar bir collectiondan eleman silme ve bir collection daki elemani degistirme konusunda daha basarilidir
        5) iki tip iterator vardir

            a) Iterator :
                Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir

            b) ListIterator:
                Bu eleman silebilir, ekleyebilir ve degistirebilir

            Note==>
                Iterator sadece soldan saga (ilk elemandan son elemana ) calisir
                ListIterator iki yonlu calisabilir
         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");
        System.out.println(myList);//[Tom, Jim, Clara, Fatma, Mustafa]


        Iterator<String> myItr =  myList.iterator();

        while (myItr.hasNext()){ // java git sonraki eleman var mı dedik

            myItr.next(); //Tom bir karakter oldugu icin jim in onune pointeri koyuyor //suan elimizde Tom var

            myItr.remove();//pointerin üstünden atladıgını siler. Yani Tom ve Jim arasındaydı tomu sildi ve bu sekilde devam eder
        }
        System.out.println(myList);//[] verir yani hepsini sildi.


        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Ali");
        yourList.add("Can");
        yourList.add("Aliye");
        System.out.println(yourList);

        ListIterator<String> yourListIterator =  yourList.listIterator(); // artık elimizde listiterator var

        while (yourListIterator.hasNext()){

         String eleman = yourListIterator.next();

            yourListIterator.set(eleman+ "*");

        }

        System.out.println(yourList);//[Ali*, Can*, Aliye*]


        //ListIterator= soldan sağa ve sağdan sola gitme özelliği vardi

        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println(list3);//[Ali, Can, Aliye]

        ListIterator<String>listItr2 = list3.listIterator();//Bu artık bir iterator


        //bu loop pointeri en sağa almak icin yazildi
         while(listItr2.hasNext()){
             listItr2.next();
         }

         //elemanlari sondan basa dogru yazdırın(yani nextin tam tersi

        while (listItr2.hasPrevious()){
          String eleman =  listItr2.previous();
            System.out.println(eleman+ "<--");
            /*
            Aliye<--
            Can<--
            Ali<--
             */
        }

    }

}
