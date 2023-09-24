package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a_13Maps {
    public static void main(String[] args) {

        HashMap<String , Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany" , 30000000);
        countryPopulation.put("Türkiye", 210000);
        countryPopulation.put("Albania" , 1200000);
        countryPopulation.put("USA" , 230000000);
        countryPopulation.put("Netherland" , 3000000);

        System.out.println(countryPopulation.get("Türkiye")); //210000
        System.out.println(countryPopulation.keySet()); //[Netherland, USA, Türkiye, Germany, Albania]
        System.out.println(countryPopulation.values()); //[3000000, 230000000, 210000, 30000000, 1200000]


        //Example 2: countryPopulation Map'indeki ulkelerin isimlerinin character sayisi ile nufuslarinin
        //toplamini bulunuz.

        Set<Map.Entry<String , Integer>> entries = countryPopulation.entrySet();

        int toplam = 0;

        for ( Map.Entry<String , Integer> w  : entries ) {

            toplam = toplam + w.getKey().length() + w.getValue(); //// w.getKey().length() kısmı bize Netherland karakter sayisini verdi. w.getValue() ise 3000000 verdi. Sonra bunlari topladı.
        }

        System.out.println(toplam);

        countryPopulation.replace("Türkiye" , 50);
        System.out.println(countryPopulation);//Türkiyedeki sayiyi 50 ile degistir dedik.


        countryPopulation.putIfAbsent("Australia" , 5465165);
        System.out.println(countryPopulation);// Australia yoksa ekle dedik.
/////////////////////////////////////////ÖNEMLİ SORU//////////////////////////////////////////////
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1  ""key=value""

   String s = "I like you, like like!";
   String kelime = s.replaceAll("\\p{Punct}" , "");

    String []words = kelime.split(" ");
        System.out.println(Arrays.toString(words));


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

     String b= "Hello Henry!";
     String ifade = b.replaceAll("\\p{Punct}" , "").replaceAll(" " , "");
        System.out.println(ifade);

        String drr  [] = ifade.split("");
        System.out.println(Arrays.toString(drr));

        HashMap<String, Integer> yeniKelime = new HashMap<>();

        for (  String w : drr ) {
            Integer neww = yeniKelime.get(w);

            if(neww==null){
                yeniKelime.put(w,1);
            }else{
                yeniKelime.replace(w, neww+1);
            }
        }
        System.out.println(yeniKelime);
    }
}
