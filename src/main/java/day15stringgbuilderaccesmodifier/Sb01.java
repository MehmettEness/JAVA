package day15stringgbuilderaccesmodifier;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1)"StringBuilder" bir classtır.
        2)String class kullanarak String üretiriz. Java niçin StringBuilder classı olusturdu.
            -String class "immutable"(değiştirilemez) string üretir, StringBuilder Class "mutable"(değiştirilebilir) string üretir.
        3)  "immutable" olmak demek orjinal degerin her zaman korunması degistirilemez olması demek
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
         */

        //immutable
        String s ="Java";//Java
        String t =s+"!";//Java!
        String w =t+"?";//Java!?

        /*
        Stringi degistirdikten sonra ayni stringi assign ederseniz java yine yeni bir kavanoz olusturur
        Degismis degeri bu yeni yeni kavanozun icine koyar
        Eski kavanpzu gösterern pointer yeni kavanoza yönlendirilir.
        Dolayısıyla eski kavanoz adressiz kalır ve "Garbage Clollector" (çöp kovası) adressiz olan kavanozları ekler.
         */

        String a ="Money";
        a= a+"More"; //MoneyMore
        System.out.println(a);

        //mutable
        StringBuilder sb1 = new StringBuilder("Python");
        System.out.println(sb1); // Pyhton
        sb1.append("!");//concatination methodu gibi
        System.out.println(sb1); // Python! yani degistirebildik

        //StringBuilder olusturmanın ikinci yolu

        StringBuilder sb2 = new StringBuilder(); // 16 tane bos kutu veriyor sabittir bu. O yü<den capacity bize 16 verir

        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");

        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        //capacity methodu
        //capacity ve length arasindaki fark nedir ?

        /*
        Capacity javanin size verdigi data depolama yer sayisidir, length ise size verilen data depolama yerinin kullanilan kismidir
        ==> Java baslangıc olarak size capacity 16 olarak verir.
        Siz eger verilen bu capacityi assarsaniz java yeni capacity varolanin 2 katini 2 fazlası olacak sekilde ayarlar
        16==> 16*2+2=34
        34==> 34*2+2=70
        ****
        ****
         */

        //StringBuilder olusturmanin 3. yolu
        StringBuilder sb3 = new StringBuilder(3);// 16 kişilik memory olusturmaktansa 3 kişilik de olusturabilirz
        sb3.append("ali");

    }
}
