package day21maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Maps03 {
    public static void main(String[] args) {

        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you, like like!"; // java acısından like ve like! farl-klıdır

        //Bu yüzden strinde bulunan tüm noktalama işaretlerinden  kurtulmamız lazım.

        s =  s.replaceAll("\\p{Punct}", ""); //\p{Punct} bu ifade noktalama işaretlerini temsil ediyor.
        System.out.println(s); //I like you like like noktalam işaretlerindenn kurtulduk

        //Kelimelerle calısacagımız icin split (" ")ile calısmalıyız

        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words)); // [I, like, you, like, like]


        //words arrayindeki kelimeler ([I, like, you, like, like]) birer birer map de var mı yokmu kontrol edilecek.
        //words arrayindeki kelimeler map de yoksa map e valuesi " olarak yerlestirilecek
        //words arrayindeki kelimeler var ise map e valuesi 1 artırılarak yerleştirilecek.
        HashMap<String , Integer> cikti= new HashMap<>();

        for ( String w : words ) {

          Integer gorunurSayisi =  cikti.get(w);//eger w icinde get varsa yani [I, like, you, like, like] var ise bize deger verecek yoksa null verecek.

            if(gorunurSayisi==null){
                cikti.put(w,1);//eger  null yok ise value sini 1 yerleştir dedik
            }else {
                cikti.replace(w, gorunurSayisi+1); // yani sepetimde o deger var ise 1 arttır. like 3 tane var like 3 oldu
            }
        }
        System.out.println(cikti);


        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String c = "Hello Henry!";
        c = c.replaceAll("\\p{Punct}" , "").replaceAll(" ", "");
        System.out.println(c);
        String chc [] =  c.split("");
        System.out.println(Arrays.toString(chc));
        HashMap<String, Integer> hashh = new HashMap<>();
        for ( String each: chc ) {
            Integer gorunurrSayi = hashh.get(each);
            if (gorunurrSayi==null){
                hashh.put(each,1);
            }else{
                hashh.replace(each , gorunurrSayi+1);
            }
        }
        System.out.println(hashh);

          /*
        HashMap ile HashTable arasindaki fark nedir?
        1) HashMap thread-safe ve synchronized degildir, HashTable thread-safe ve synchronized dir
        2) HashMap bir tane null key e ve istediginiz kadar null value a musaade eder
           HashTable keylerde ve value larda null kullanilmasina musaade etmez
        3) HashMap hizlidir, HashTable HashMap e gore yavastir

        Note: HashMap ler ve HashTable lar entry leri rastgele siralar
         */
        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Selma",70);
        ogrenciNotlari.put("Tuba",75);
        ogrenciNotlari.put("Ibrahim",85);
        ogrenciNotlari.put("Safa",87);
        //  ogrenciNotlari.put(null,50); Hashtable larda key kısmında null konulamaz
        //  ogrenciNotlari.put("Ahmet",null); Hashtable larda value kısmında null konulamaz
        /*
        HashTable ne zaman kullanmaliyiz?
        1) multithread ve synchronization kullanmamiz gerekirse
        2) key lerde ve value larda null kullanmak yasak ise kullanabiliriz
         */


        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali",18);
        stdAges.put("Can",19);
        stdAges.put("Tom",33);
        stdAges.put("Veli",63);
        stdAges.put("Ahmet",41);
        stdAges.put(null,41);
        stdAges.put(null,39);
        stdAges.put("a",null);
        stdAges.put("b",null);
        stdAges.put("c",null);
        System.out.println(stdAges);

        /*
        1) Treemap ler entry leri naturalorder a gore siraya koyar, Bu yuzden coook yavastir
        2) Treemap ler  thread-safe ve synchronized degildir,
        3) Treemaplerin key lerinde null kullanilamaz, ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key e bakarak siralama yapar
         */

        TreeMap<String,Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //  countryPopulation.put(null, 18000000);
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);


        System.out.println(countryPopulation);
    }
}