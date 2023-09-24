package day18oop;

public class Animal {
    //Overriding
    /*
    1)Parent class daki methodu child class icinde özelleştirerek kullanmaya Overriding yapmak denir.
    2)Overriding de methodun parantezine, methodun ismine dokunulmaz (eat()),yani signature degistirilemez
    methodun bodysi degistirilir.
    3)Child classtaki override eden eat() methoduna "Overriding" method denir.
    Parent class daki override edilmiş olan eat() methoduna "Overriden" method denir.
    4)private methodlar override edilemezler
    5)Child class daki methodun access modifiari parent class daki override edilmiş(overriden)
    methodundan access modifierindan dar olamaz. Aynisi olabilir yada daha geniş olabilir.
//Access modifier(public private defaul protected
    Overriden method==> protected --Overriding Method ==> protected veya public olabilir.
    Overriden method==> default --Overriding Method ==> default ,protected veya public olabilir.
    Overriden method==> private --Overriding Method ==> hicbir sey yapamazsın.
    (bkn.4.kural)
//return type void kısmı
    6)Child class da override edilen methodun return type ile Parent class taki methodun return type arasında
    iliskisi varsa return type edilebilir.

    7) public int add(int a , int b) privite oldugu icin
    public int add(int a, int b){
        return a+b;
    degistirilemez.

    8)Child da override edilen methodun return type i ile parent taki methodun return type i arasinda IS-A iliskisi
    yoksa return type degistirilemez, java bir wrapper classi digerinin childi yapmadigindan wrapper classlarda return type degistirilemez

    9)Methodun return type "void" ise type degistirilemez. Void ise void olarak kalmak zorundadır.

    10)Static methodlar override edilemezler.Çünkü static methodlar tüm childlar icin ortal methodlar
    Bir child ortak methodu degistirdiginde diger childlar bundan olumsuz etkilenebilir.
    Bu nedenle java static methodların override edilemsine müsade etmez.

    11) final methodlar oveeride edilemezler. Final bir keyworddur. Son noktasıdır.
    Eger final veriable olusturursanız deger atamak zorundayız.
    final  double pi; yazarsak kızar ama final  double pi=3.14 yazarsak kızmaz yani başlatmış oluruz
    final veriableye deger atarsak bu deger artık degistirilemez.
    final  double pi=3.14
    pi=3.13; olamazzz....

    12 )public class Animal { bu class final edilebilr ancak bu class kısırlastırılmıs olur. Yani child falan olamaz.

    13)final methodlar oveeride edilemezler. bodysi degistirilemez ama override edilirken
    method body degistiririz. Bu bir celiski oldugundan java final methodların override edilmesine
    müsade etmez....
        a)final keywordünü variable lar ile kullanabilirisiniz.
           i) final variablelarda mutlaka deger atanmalıdır
           ii) ilk atana deger degistirilemez.
        b)final keywordünü variable lar ile kullanabilirisiniz.
            i) method final ise methodun bodysi degistirilemez.
            ii) method bodysi degistirilemeyince override yapmak mümkün olmaz.
        c) final ketywordunu class larla kullanabilirsiniz.
            i) class final ise o classın childi olaammaazzz.

    14) Polymorphism == Method Overriding + Method Overloading denilir.
    Animals eat == Cats eat olması gibi
     */

    public void eat(){//public silip private yapamazsın ama default protected yapabilrsin
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");

        }
    public Animal create (){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
}

    public Integer carpma(Integer a , Integer b){ // ctrl Integer üzerine geldigimizxde Byte extends Number cıkar

        return a*b;
    }
    public final double daireyarıCapı(double r){
        return 3.14*r*r;
    }

}


