package interview;

public class a_11StringBuilder {

     /*
        1)"StringBuilder" bir classtır.
        2)String class kullanarak String üretiriz. Java niçin StringBuilder classı olusturdu.
            -String class "immutable"(değiştirilemez) string üretir, StringBuilder Class "mutable"(değiştirilebilir) string üretir.
        3)  "immutable" olmak demek orjinal degerin her zaman korunması degistirilemez olması demek
            "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
         */
     public static void main(String[] args) {

         StringBuilder degisecek = new StringBuilder("Enes");
         degisecek.append("Mehmet");
         System.out.println(degisecek);

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

         StringBuilder yeni = new StringBuilder("Mehmet Enes Arslan");
         yeni.reverse();//ters cevir
         System.out.println(yeni);//nalsrA senE temheM

         yeni.delete(0,7);
         System.out.println(yeni);

         yeni.insert(2,"999");//ilk 2 degeri say ve ondan sonra ekle
         System.out.println(yeni);//se999nE temheM

          /*
        compareTo(); iki StringBuilder i bastan baslayarak harf harf karsilastirir
        ilk harfler ayni ise ikinci harflere gecer
        ikincilerde ayni ise ucunculere gecer ....
        ve ilk farkli olan harfe gider, farkli olan iki harfin ascii kodlari arasindaki farki verir

        sonuc 0 ise alafabetik olarak ayni siradalar demektir
        sonuc -1 ise sb2 sb3 den alfabetik olarak onde demektir
        sonuc 1 ise sb2 sb3den alfabetik olarak sonra demektir
         */
         StringBuilder sb4 = new StringBuilder("Java");
         StringBuilder sb5 = new StringBuilder("Kava");
         int r2 = sb4.compareTo(sb5);////karsılastırma demek
         System.out.println(r2);//-1

           /*
        1) StringBuffer java da string üreten bir diger classtir.
        2) StringBuffer javanin string üretmek icin olusturdugu ilk classtir.
        3) StringBuffer , StringBuilder'a cok benzer. İkis de "mutable" dir
        4) StringBuffer "multi-thread" (çoklu iş) dir ama StringBuilder "multi-thread" degildir.
        5) StringBuilder "multi-thread" olmadıgı için StringBuffer daha hizli calisir.

               3 tane String olusturan class ögrendik;
                1)immutable string lazimsa ==> String clas kullanacagız
                2)mutable string lazımsa ==> StringBuilder veya StringBuffer
                    a)StringBuilder multi thread gerekmezse kullaniriz
                    b)StringBuffer multi thread gerekirse kullaniriz.

         6) multi-thread yapilirken yapilan islerin siralamasi önem arzeder yai yapılan isleri mantikli sıraya koymaktır Buna synchronization denir
         StringBuffer muti thread oldugu icin ayni zamanda synchronization dir.
         */

         //String buffer nasil olusturulur?
         StringBuffer sbf = new StringBuffer("Java");
         System.out.println(sbf); // Java


























     }
}

