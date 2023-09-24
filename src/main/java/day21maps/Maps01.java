package day21maps;

import java.util.*;

public class Maps01 {
    public static void main(String[] args) {
        //Ne zamanki Map görürsek aklımıza sözlük gelsin
       /*
        1) Maplered sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir
        2) Key kismi tekrarsiz, value kismi tekrarli olabilir
        3) Maplerdeke her bir elemana entry denir, tamamina EntrySet denir
        4) Entryler tekrarsiz oldugu ici EntrySet denilir
        5) Mapler collection degildir
        6) HashMap ler entry leri rastgele siralar bu yuzden en hizli mapdir.
         */

        //Map nasıl olusturulur.
        // HashMap<K , V> yazıyorr
        HashMap< String , Integer > countrtPopulation = new HashMap<>(); // Meomery de K ve V koyacagımız yapılar olusturduk. countrtPopulation yani sehirpopülasyonu iciin Stri,ng ve Integer ekleyecegiz
        countrtPopulation.put("Germany" , 83000000);   // bu durumda her zaman put kullanacagız.
        countrtPopulation.put("Albania" , 1200000);
        countrtPopulation.put("USA" , 230000000);
        countrtPopulation.put("Netherland" , 3000000);
        countrtPopulation.put("Turkiye" , 8300000);
        System.out.println(countrtPopulation); //{Netherland=3000000, Turkiye=8300000, USA=230000000, Germany=83000000, Albania=1200000} HashMap oldugu icin rastgele sıraladı.Bu yüzden en hızlıdır

        Integer usaPopulation = countrtPopulation.get("USA");
        System.out.println(usaPopulation); //230000000

       //Bütün keyleri nasıl alabilirz.
        System.out.println(countrtPopulation.keySet());
        Set<String> keys = countrtPopulation.keySet();  // keySet() mapin icinden bize key olan tüm kısmı verir.
        System.out.println(keys); //[Netherland, Turkiye, USA, Germany, Albania]

        //bütün value lar nasıl alırız?
        Collection <Integer> values= countrtPopulation.values();
        System.out.println(values); //[3000000, 8300000, 230000000, 83000000, 1200000]

        //Example 1: countryPopulation map'indeki ulkelerin nufuslarinin ortalamsi nedir?

        int toplam =0;
        for ( Integer w : values ) {
            toplam = toplam + w ;
        }
        System.out.println(toplam / values.size()); //65100000


        //Looplar mapler ile kullanılmaz, bunun icin entrySet methodu kullanırız.
        //entrySet() methodu mapdeki entryleri kalip haşlinde ize Setin icine koyarak verir.

        Set<Map.Entry<String , Integer>> entries = countrtPopulation.entrySet(); // Map.entry min set edip set datat type denir..

        System.out.println(entries); // [Netherland=3000000, Turkiye=8300000, USA=230000000, Germany=83000000, Albania=1200000]

        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        int sum =0;
        for ( Map.Entry<String , Integer> w :  entries  ) {
            sum = sum + w.getKey().length() + w.getValue(); // w.getKey().length() kısmı bize Netherland karakter sayisini verdi. w.getValue() ise 3000000 verdi. Sonra bunlari topladı.

        }
        System.out.println(sum); // 325500034
    }
}
