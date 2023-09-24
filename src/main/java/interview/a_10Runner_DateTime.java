package interview;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class a_10Runner_DateTime {
    public static void main(String[] args) {
        /*
    Constructor nedir ?
    Classtan obje olusturmamızı saglayan code bloklarıdır.Car(); Constructor dır
    Class olusturudugumuzda java bize otomatik olarak Constructor verir.
    Ama bu constructor göz ile görülmez, gözle görülmeyen otomatik olarak verilenm constructorlara default constructor denir.
    default constructor ==> Car () {}

    siz kendi constructor olusturdugunuz zaman java kendi constructor ini siler.
    COnstructor nasıl olusturulur?
    Access Modifier + Class ismi + () + {}

    Method ile Constructor arasındaki fark nedir?? (interwiev sorusu)
    1)Methodlardsa returnm type olur, constructorlarda olmaz.
    2)Metodlar yaptıklari işe göre isimlendirilir, constructorlar ise her zaman Class ismi ile isimlendirilir.
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir.
    4)Method isimleri kücük harfle baslar, consdtructor isimleri ise class ismi ile ayni oldugu için büyük harfle baslar
      Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip objecteler olusturabiliriz
    */



        //DateTime...................................................................................

        LocalTime simdikiZaman = LocalTime.now();
        System.out.println(simdikiZaman);//16:40:59.866111300

        LocalDate simdikiTarih = LocalDate.now();
        System.out.println(simdikiTarih);//2023-09-18

          /*
    DateTime Class ta kullanilan tarih saat formatlari
    HH : mm ==> 24'lu saat sistemi
    hh : mm ==> 12'li saat sistemi AM, PM gösterilmez
    hh : mm a ==> 12'li saat sistemi AM, PM
    HH : mm : ss==> saniyeyi gosterir
    HH : MM ==> yanlis format cunku MM aylar icin kullanilir
    "mm" "minute" demektir. "MM" "month" demektir.

    dd-MM-yyyy ==> gun - ay - yil
    MMM ==> Aug
    MMMM ==> August  */

        //saniyeyi kaldır

        DateTimeFormatter yeniZaman = DateTimeFormatter.ofPattern(" HH : mm ");
        String formatterTime = yeniZaman.format(simdikiZaman);
        System.out.println(formatterTime);

        //Geri kalanları day14 packageden bakabilirsin/*/*/*/*/*/*/*/*/*/*/*/***/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*202



    }



}
