package day15stringgbuilderaccesmodifier;

public class Sb02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy

        sb1.reverse();//ters cevir demek
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(0); //0.indeksi sil dedik
        System.out.println(sb1); //sae si avaJ

        //Baslangic indeksinden bitiş indeksi haric olan tüm karakterleri siler
        sb1.delete(0,3);
        System.out.println(sb1);// sae si avaJ ==> si avaJ sildi yani 0,1,2 sildi

        sb1.replace(0,3,"X");
        System.out.println(sb1);//  si avaJ degerimizi X avaJ olarak degistirdik yine 0,1,2 sildi space de var yerine X koydu

        sb1.insert(2,"999");//ilk 2 degeri say ve ondan sonra ekle
        System.out.println(sb1);//X avaJ da x ve boslugu yok saydı ve sonrasına 999 ekledi. //X 999avaJ



        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        int r1 = sb2.compareTo(sb3);//karsılastırma demek
        System.out.println(r1);//0

        StringBuilder sb4 = new StringBuilder("Java");
        StringBuilder sb5 = new StringBuilder("Kava");
        int r2 = sb4.compareTo(sb5);
        System.out.println(r2);//-1

        StringBuilder sb6 = new StringBuilder("Kava");
        StringBuilder sb7 = new StringBuilder("Java");
        int r3 = sb6.compareTo(sb7);
        System.out.println(r3);//1

        StringBuilder sb8 = new StringBuilder("Jbva");
        StringBuilder sb9 = new StringBuilder("Java");
        int r4 = sb8.compareTo(sb9);
        System.out.println(r4);//1

         /*
        compareTo(); iki StringBuilder i bastan baslayarak harf harf karsilastirir
        ilk harfler ayni ise ikinci harflere gecer
        ikincilerde ayni ise ucunculere gecer ....
        ve ilk farkli olan harfe gider, farkli olan iki harfin ascii kodlari arasindaki farki verir

        sonuc 0 ise alafabetik olarak ayni siradalar demektir
        sonuc -1 ise sb2 sb3 den alfabetik olarak onde demektir
        sonuc 1 ise sb2 sb3den alfabetik olarak sonra demektir
         */





        //String class da var olan ama StringBuilder class da var olamyan( split() method gibi ) methodlara
        //ihtiyac duydugumuzda toString() methodunu kullanarak String classa gecer ve o methodlari kullanabiliriz
        //büyük harfe cevirelim
        String str= sb1.toString().toUpperCase(); // artık toString kullanarak StringBuilder i  toString ceviririz çünkü StringBuilder da içerik çok fazla yok
        System.out.println(str); //X 999AVAJ

        //String nasıl StringBuilder cevrilir.
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1); // X 999AVAJ artık StringBuilder a cevirmis olduk.

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
