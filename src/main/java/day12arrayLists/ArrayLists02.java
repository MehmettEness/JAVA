package day12arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]

        List<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a);//[J, a, v, a, v]

        List<Character> b = new ArrayList<>();

        //[J, a, v, a, v]
        for (Character w : a) {

            if (!b.contains(w)) { //w  konteynerinda yer alan harfleri b içermiyorsa ekle yap dedik
                b.add(w);
            }
        }
        System.out.println(b);//[J, a, v]

        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");
        System.out.println(r); // [Manisa, Nigde, Tokat, Van]
        /*for (String w : r) {

            if (w.contains("a")) {
                r.remove(w);
            }
            System.out.println(r); // sistem error veriyorr */

        for (int i = 0; i < r.size(); i++) { //foreach olmadı o yuüzden fori deneyecegiz
            //r.size() = [Manisa, Nigde, Tokat, Van] yani ==>4 0<4 true

            if (r.get(i).contains("a")) {
                // r.get(i) [Manisa, Nigde, Tokat, Van] degerleri geldi. contains("a") icinde "a" degeri var mı bak dedik
                //Manisa da a var True verdi
                r.remove(i);
                //remove() methodunu index ile de kullanabiliyoruz
                //Manisayi siler
                i--;
                //silme islemi oldugunda indexler azalacağı icin i degerini de azaltmaliyiz
                // Tekrar yukarı cıkar     (en asagıdaki notları oku)
            }
        }
        System.out.println(r);//[Nigde, Van] van silinmedi çünkü hep soldan saga yeni bir [] olusturdu

        //azaltarak gitmesi gerektigi icin i--; koyarsak // [Nigde] gelir.

        /*Tekrar yukaarı çıktıgında
        elimizde  [Nigde, Tokat, Van] kalır yani 0 , 1 , 2
        for da 0<3 True verir.
        if de r.get(i) icinde[Nigde, Tokat, Van) var contains("a") icinde "a" degeri var mı bak dedik
        Nigde de yok bize false verdi ve silmedi. Artık elimizde  [Nigde, Tokat, Van) var 0 ,1 ,2
        Tekrar yukaarı çıktıgında
        for da 1<3 True verir
         if de r.get(i) icinde[Nigde, Tokat, Van] var contains("a") icinde "a" degeri var mı bak dedik
         1 degeri oldugundan "Tokat" da a harfi var
         Tokati siler
         Tekrar yukaarı çıktıgında
        elimizde[Nigde,Van] var yani 0,1
        for da 1<2 True verir
        if de r.get(i) icinde[Nigde,Van] var contains("a") icinde "a" degeri var mı bak dedik
        Van i siler
        Tekrar yukari çıktıgında
        1<1 degeri var artık ve bu bize false degerini verir.
        Sonuc olarak karsımıza nigde cıkar



         */
    }
}