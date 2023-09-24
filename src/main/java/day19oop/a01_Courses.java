package day19oop;

public abstract class a01_Courses {

    //Abstraction
    /*
    1) Eger bir classtan obje olusturulmasını istemiyorsak bu classı child classların yapmak zorunda oldukları görevleri
    belirlemek icin kullanıyorsak "Abstraction" yapariz
    2) Bazen parent class taki methodun bodysi "{}" hicbir child class tarafından kullanılmaz
    Bu durumda parentteki methoda body yazmak hic mantıklı degildir.
    3) Methodun bodysini yazmayınca java bize hata verir. Bu durumda bu hatayı düzeltmek icin abstract keywordunu kullanarak,
    javaya bu methodun bodysi olmayacak deriz.
    4)Abstract keywordunu kullanınca elde ettigimiz abstract method normal classlara konulamadıgını gördük,
    Bu durumu düzeltmek icin classı da abstract yapmalıyız.
    5) Parentteki method abstract ise butun concrete child classlar o methodu override etmek zorundadır.
    Bu yüzden tüm child lar ciin mecburi olmasını istedigimiz methodları abstract yaparız.
    6) Bodysi olan methodlar (concrete) abstract classların icine yazilabilir. Abstract methodlar concrete classların icine yazilamazlar.
    7) Abstract keyword ile method body bir methodta ayni ayna kullanılamaz.
    8) final methodlar abstract olamazlar neden cunku override edilemezler.
    Halbuki abstract methodlar override edilmek icin olusturulurlar. O yüzden bu yaman celişki diyebiliri
     public  final abstract void math(); ==> olamazzz....
     9) CoursesRunner classı icin yazıyoruz. Abstract classların icinde abstract methodlar olur, abstract methodlar bodysi olmadıgından eksik methodlar gibi düşünülebilir.
     Yani abstract class icinde eksik yapı barındrırı.Java appi korumak icin izin vermez
     10)Fifty class icin yazıyoruz. Abstract classın abstract childi veya concrete childi olabilir.
     Eger child abstract ise abstract methodlari override etmek zorunda degildir.


     */

    public abstract void  math();

    // System.out.println("Toplama"); toplama methodunu koydugumuzda diger child classlar toplama yapmıyor. Kullanılmayan kod yazılmaz mantıgıyla o kodu sileriz
    //public void math(); boyle yapınca kırmızı yanar. O yüzden abstract yazmak gerekiyor. public abstract void math(); olmalı
    //bu seferde abstract kırmızı yanıyor. Bu yüzden bunun methodunu abstract etmeliyiz.
    //Yani public class Courses { kısmını public abstact class Courses


        public void art(){
        System.out.println("Lear art");
        // buu yazarsak childlardan herhangi bir sikayet gelmiyor. Yani abstract method icinde normal class method olusturabiliriz.

    }


}
