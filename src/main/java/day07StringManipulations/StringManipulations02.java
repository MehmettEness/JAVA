package day07StringManipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        /*Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.

                     String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
           */

        String tv = "$456.99";
        String laptop = "$875.99";

        String newTv = tv.replace("$" , "");

        String newLaptop= laptop.replace("$" , "");

        Double totalPrice = Double.valueOf(newTv) + Double.valueOf(newLaptop); // valueOf ile buradan rakam olarak çıkmasını saglariz.Normalde "456.99" + "875.99" oalrak çıkar

        System.out.println(totalPrice);

        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "    ali cAN   " ==> AC

        String name = "    ali cAN   ";

        char first = name.trim().toUpperCase().charAt(0);

        //trim methodu kırpmak için kullanılırr.Yani bir stringin baş ve sondaki spaceleri siler. Ortadakilere karışmaz.
        //toUpperCase() tüm karakterleri büyülk harfe cevirir.
        //charAt ise o karakterlerden hangisi istersen 0 1 2 3 hangisi ise onu alır 0 yazdıgımızda ilk harfi alır.

        char last = name.trim().toUpperCase().split(" " )[1].charAt(0);

        //split methodu bölünmresi istediğimiz yerden böler   ali cAN için " " yaptıgımızda boşluktan kesmiş olur
        //[1] yaptıgımıada kağıdı ikiye böldük böylece 0 1 kagıtları olustu biz "can" alabilmemiz icin 1 almak zorundayız

        System.out.print(first);
        System.out.print(last);

        //System.out.print("" + first + last); bu şekilde de kısaltılmış olarak yazdırabilirz sadece bu char methodunda gecerlidir bu şekilde toplar ve yanına "" koymak zorunmdayız

        /*Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum karakterleri dynamic olarak aliniz

        abc@gmail.com ===> gmail
         */


        //1.yol hard coding tavsiye edilmez.Bu başka ihtimal olmaz demek
        String a = "abc@gmail.com" ;
        System.out.println(a.substring(4, 9));//gmail

        //2.yol

        //indexOf() methodu parantezi icerisine yazilan karakterin indexini verir

        //lastIndexOf() methosu parantezi icine yazilan karakteri son gorunumunun indexini verir

       int startingIndex = a.indexOf("@") +1 ; // +1 dememizdeki amaç @ sonraki ifadeyi alamamiz icin kullanmak zorundayiz

       int endingIndex = a.indexOf(".");

      String companyName = a.substring(startingIndex , endingIndex) ;
        System.out.println(companyName);







    }
}
