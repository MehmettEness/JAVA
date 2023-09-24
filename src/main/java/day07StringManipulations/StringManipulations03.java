package day07StringManipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht

        //lastIndexOf() methosu parantezi icine yazilan karakteri son gorunumunun indexini verir

        //indexOf ('m') m nin ilşk gorunumunun indexini verir indexOf ('m') ==> 0
        //lastIndexOf('m') m nin son gorunumunun indexini verir. lastIndexOf('m') ==>3

        /* m e h m e t
           0 1 2 3 4 5

           indexOf("m")     ==> 0 farkli tekrarli

           lastIndexOf("m") ==> 3 // sonraki m harfi verir

           indexOf("e")     ==> 1 farkli tekrarli

           lastIndexOf("e") ==> 4 // sonraki e harfi verir

           indexOf("h")     ==> 2 ayni tekrarsiz

           lastIndexOf("h") ==> 2
         */

        String s = "mehmet"; // indexof daki "m" degeri lastindexof daki "m" degerine esitmi ? bi kontrol et dedikk

        if(s.indexOf("m") == s.lastIndexOf("m") ) { // indexof daki "m" degeri lastindexof daki "m" degerine esitmi ? bi kontrol et dedikk

            //m == 0 m== 3 0==3 false
            System.out.print("m");
        }
        if(s.indexOf("e") == s.lastIndexOf("e") ) {

            //e == 1 e== 4 1==4 false
            System.out.print("e");
        }
        if(s.indexOf("h") == s.lastIndexOf("h") ) {

            //h == 2 h== 2 2==2 true
            System.out.print("h");
        }
        if(s.indexOf("t") == s.lastIndexOf("t") ) {

            //t == 5 t== 5 5==5 true
            System.out.print("t");
        }
        System.out.println();

        //burada if else kullanılmaz çunku olumsuz durum yok.

        //Example 1: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String number = "1234 6789 1234 6789" ;

        String first = number.substring(0,15 ) .replaceAll("[0-9]" , "*");
        System.out.println(first); //**** **** ****

        String last = number.substring(15);
        System.out.println(last);//6789

        //artık bu degerleri birlestirmemiz lazım

        String result1= first + last ;
        System.out.println(result1);

        String result2 = first.concat(last); // concat methodu istenen ne olursa olsun birleştiri
        System.out.println(result2);





    }
}
