package day03wrapperconcatenationoperators;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        Numeric primitive data type larinin oldugu birbirine donusturulmesine "Type Casting" denir
        numeric (sayisal) Data Type ==> char -  boolean - byte - short  -   int -  long -  float- double

        Note1 :Bunların belirli bir byte kapladıkları alan var. Bunları kücükten büyüge koyabiliriz. Buna "AutoWidening" denir
        Kucuk data type larini buyuk data type larina cevirmeyi java otomatik olarak yapabilir
        bu isleme "AutoWidening" (Otomatik genisletme) denir

        Note2 :Bunların belirli bir byte kapladıkları alan var. Bunları büyükten kücüge koyabilirz. Buna "ExplicitNarrowing" denir.
        Buyuk data type larini kucuk data type larina cevirmek riskli bir istir
        java bu riski otomatik olarak yapmaz.Bu islemi kod yazanlar yapar
        Bu isleme "Explicit Narrowing"(Aciktan Daraltma)denir.
        */

        //Ornek : byte data type ini int data type ina ceviriniz
        byte age = 13;
        int ageInt = age; // AutoWidenning

        //Ornek : int data type ini short data yype ina ceviriniz

        int weight =313 ;
        short weightShort=(short) weight; //Explicit Narrowing



    }

}
