package day12arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists04 {
    public static void main(String[] args) {
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

    }
}
