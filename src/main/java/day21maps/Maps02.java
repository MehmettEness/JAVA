package day21maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali" , 18);
        stdAges.put("Can" , 19);
        stdAges.put("Tom" , 33);
        stdAges.put("Veli" , 63);
        stdAges.put("Ahmet" , 41);

        //keyi tekrarli kullandıgımızda hata vermez, en son verilen entry nin degerini kabul eder.
        stdAges.put("Tom" , 35);
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18} Tomu 35 aldı

        //replace() methodu degistirmeye yarar değistirmek istersen replace() kullan
        stdAges.replace("Tom" , 43);
        System.out.println(stdAges);// {Can=19, Ahmet=41, Tom=43, Veli=63, Ali=18} tom un yasını degistir bu daha kullanışlkı daha anlasılır.


        stdAges.replace("Tom" , 43 , 41); // stdAges bak Tom 43 ise 41 yap dedik. {Can=19, Ahmet=41, Tom=41, Veli=63, Ali=18}
        System.out.println(stdAges);

        stdAges.putIfAbsent("Ayse", 77); // eger "Ayse" yoksa ekle dedik. Ayse yok oldugu icin ekledi. Eger Tom yazsaydık eklemezdi.
        System.out.println(stdAges); //{Can=19, Ahmet=41, Tom=41, Veli=63, Ayse=77, Ali=18}


        // get() ve getOrDefault() methodları ikiside ayni isi yapar. valuelerini verir.
        System.out.println(stdAges.get("Tom"));//41
        System.out.println(stdAges.getOrDefault("Tom", 2));//41

        //Jerry yok o yüzden get () methodu null verir. amaaa getOrDefault() methodu ise defaultvalue ne belirtirsel onu verir.
        System.out.println(stdAges.get("Tom")); // null
        System.out.println(stdAges.getOrDefault("Tom", 2)); // 2 (defaultvalue ya ne yazarsak onu verir.

        System.out.println(stdAges.containsValue(18)); // true dedi cünkü 18 içeriyor...
        System.out.println(stdAges.containsValue(99)); // false dedi cünkü 99 icermiyor.

        System.out.println(stdAges.containsKey("TOM")); //false dedi cunkü TOM yok
        System.out.println(stdAges.containsKey("Tom")); // true dedi cunku Tom varr

        stdAges.remove("Tom"); // Tom u sil dedik
        System.out.println(stdAges); // {Can=19, Ahmet=41, Veli=63, Ayse=77, Ali=18}

        stdAges.remove("Can" ,9); // Can 9 varsa sil dedik. Silmez cunkü Can 19 var o yüzden eger Can 19 deseydik silerdi.
        System.out.println(stdAges); //{Can=19, Ahmet=41, Veli=63, Ayse=77, Ali=18}



    }
}
