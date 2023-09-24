package day19oop;

public interface  Ac {
    /*
    1) Bir interface i bir classın parenti yapmak icin implements keyword kullanırız
    2)Java parentlar class oldugunda multiple parente müsade etmez ama biz bazen multiple parente ihityac duyabiliriz.
    Bu ihtiyaci gidermek icin java interface isimli bir yeni yapı olusturdu.Bu yeni yapı sayesinde
    bir classın coklu interface parenti olabiliyor ((( public class Accord implements Ac, Engine, Security{ ))) gibi
    3) Interfacelerin icine concrete method konulamaz cunku concrete methodlarda body vardır
    ve body o methodun nasıl yapacagını belirtir. ısın nasıl yapılacagı bircok detay icerebilir.
    bu chlid classlarda kafa karısıklıgına neden olur. İsin nasıl yapılacagını childe bırakırsanız child kafa karısıklıgını engllemiş olursunuz.
    4) Interfacelerdeki tüm methodlar otomatik olarak publictir , abstracttir ama stastic degildir.
    5)Interfacenin diger adına yapılacaklar listesi de denir (to do list)
    6) coklu interface parentlerin herbirinin icine ayni isimli methodlar koyablirizi.
    Mesela AC nin Engine nin ve Security iclerine run() methodu koymak gibi..
    7)Child classı herhangi birini override ettiginde hepsini override etmis olur sonra body i child class yapmıs olur
    8) Interfacelerdeki tüm variablelar otomatik olarak (default) olarak finaldir. Bu yüzden mecburen deger ataması yapmaliyız. 2000, 3000 5000 gibi.
    9) Interfacelerdeki tüm variablelar otomatik olarak final, public ve static dir. Renksiz olmalarının nedeni budur
    10)void eco da oldugu gibi conceret method koymak istersek default koyarız ama bu access modifier degildir.
    11) Engine oldugu gibi static keywordunu kullanarak yapabiliriz.

  --> Sttatic keywordunu kullanarak olusturudugumuz concrete methodlara olusturmak icin object olusturmaya gerek yoktur. Interface ismi zaten yeterlidir.

   --> defaulkt keywordu kullanrak olusturdugumuz concrete methodlara interfacenin child classında object olusturarak ulasılabilir.

    12)Interfacelerden obje olusturulamaz.Interfacelerin constructorı yoktur.

    child                      parent
    class           ise         class           --> exteends     kullanırız
    interface       ise         interface       --> exteends     kullanırız
    class           ise         interface       --> implements   kullanırız
    interface       ise         class           --> yok kullanılmazz

    13)Abstract class ile Interface arasındaki farklar !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    a) Abstract classlar hem abstract method hemde concrte methodlar icerebiliri. fakat interfaceler abstract icerir.
        Amaaaa interfacelerde istersek default ve static keyworlareini kullanabiliriz.

    b) Abstract classlar multiple inheritance desteklemez

    c) Abstract classlar icind her türlü variable olusturulabilir. Interfaceler ıcındeki variableler public, stat,c ve final olmak zorundadırrr

    d) Interface classin childi olamaz ama abstract classın childi olabilir.

    e) Abstract classlar da constuructor vardır ama object üretemez, interfaceler de constuructor yoktur o yüzden zaten object üretemezler.


     */
    //7) den sonra yazdık - 1
    public static final int price= 2000 ; // bunlar public static final  rebnksiz oldukları icin ytazmasak da olur

    void cool();

    // interface methodlar abstract methodlardı o yüzden yazsak yazmasak faeketmz " public abstract void cool(); "
    //   public void cool(); child classlar tarafından kullanılması mecburidir. Override edilmesi gerekir.Bu yüzden yapılması gereken liste denir.



    //HondaRunnerdan sonra olusturduk alttakini
    void run(); // public class Accord implements Ac, Engine, Security{ buu methodlar kızardı üzerine gel ve düzeltt
   //("AC runs supper"); - ("Accord cool"); istedigimiz gibi kullanabiliriz.

    //10)dan sonra yazıldı
     default void eco (){
        System.out.println("Az yakıt tüketir."); // void eco (){ kırmız yanar süslü paranetz ve sout oldugu icin bundan kurtulmak ici default yazabiliriz
    }


}



