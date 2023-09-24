package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a_07ArraysList {
    public static void main(String[] args) {
           /*
        1)Arrayler primitive data type lari ve reference lari depolayabilir ama Arraylistler non-primitive leri depolar
        2)ArrayListler memory de Arraylerden daha fazla yer kaplar
        3)Array ler olusturulurken bastan eleman sayisi belirtilmek zorundayiz
        4)ArrayListler eleman sayisinda esnek tirler.
        5) Arrayleri java niye iptal etmedi
            a) Arrayler super hizlidir
            b) Arrayler memory de cok az yer kaplarlar
            c) Bu nedenle eleman sayisi belli olan datalari depolamak icin Arrayler tercih edilir

         */
        //ArrayListler nasil olusturulr?
        ArrayList<Integer> ages = new ArrayList<>();
        // <> diomand denir/Integer bunu kullanarak non primitiver kullandık cünkü bunlar daha karmasık yapılar icindir.
        ages.add(15);
        ages.add(27);
        ages.add(1,16);
        System.out.println(ages);

        System.out.println("\n--------------------------------------------------------------");
        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList<Integer> listt = new ArrayList<>();
        listt.add(15);
        listt.add(26);
        listt.add(13);
        listt.add(29);
        listt.add(12);

        for ( Integer w  : listt ) {
            if (w%2!=0){
                listt.set(listt.indexOf(w),11);
            }
        }
        System.out.println(listt);

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
        //bir list oluşturmanın kısa yolu

        List<Integer> list = Arrays.asList(4,5,13,313,353);
        System.out.println(list); //[4, 5, 13, 313, 353]

        // list.remove(0 ); // 4 ü kaldırmak icin remove yazarsak java error verir asListte calışmaz

        //list.add(63); // 63 eklemek ici yazarsak java error verir asListte calışmaz

        //list.clear(); // kodlari silmek için kullanırız ama java error verir asListte calışmaz

        /*
        Not:Arrays.asList methodunu kullanarak bir list olusturursanız
        listin öge sayisini degistiren methodlari kullanamazsınız
        orn: remove() add() clear()
         */

        list.set(1,63); //1.indexteki sayiyi 63 e cevir dedik
        System.out.println(list);//[4, 5, 13, 313, 353] == [4, 63, 13, 313, 353]
        System.out.println(list.size());//5


        System.out.println("\n--------------------------------------------------------------");

        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10

        ArrayList<Integer> numara=new ArrayList<>();
        numara.add(12);
        numara.add(23);
        numara.add(10);
        numara.add(19);
        Collections.sort(numara);
        System.out.println(numara);

        int minn= numara.get(1)-numara.get(0);

        for (int i = 1; i < numara.size(); i++) {
            //i =1 ve 1<4 true

            Math.min(minn, numara.get(i) - numara.get(i-1));


        }

        System.out.println(minn);

        //Verilen bir listede tekrar eden sayilari sadece 1 yapan bir method olusturun
        //[1,3,5,3,5,6,1,7]
        //[1,3,5,6,7] olacak

        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(3);
        liste.add(5);
        liste.add(3);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(1);
        tekrarsizListOlustur(liste);


    }


    private static void tekrarsizListOlustur(ArrayList<Integer> liste) {

        ArrayList<Integer> tekrarsizList = new ArrayList<>();
        for (Integer w : liste) {
            if (tekrarsizList.contains(w)) {
                continue;
            } else {
                tekrarsizList.add(w);
            }
        }
        System.out.println(tekrarsizList);
    }
}
