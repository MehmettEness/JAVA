package day03wrapperconcatenationoperators;

public class work03 {
    public static void main(String[] args) {
        //**************************************************WRAPPER

/*      * primitive         :   char    - boolean - byte - short -  int    - long - float - double

        * Wrapper Class     : Character - Boolean - Byte - Short - Integer - Long - Float - Double */

        // Ornek: primitive int i wrapper Integar a çevirinizi (((((( Autoboxing))))))

        int num =13;
        Integer wrapperNum = num;

        int num1 =15;
        Integer num11= num1 ;

        int a = 15;
        Integer aa = a;

        //Ornek: Wrapper Byte i primitive byte a ceviriniz ((((((Unboxing))))))

        Byte b = 20;
        byte b1 = b;

        Long c = 1646351L;
        long c1 = c;

        char e = 'e';
        Character e1 = e;

        //**************************************************CONCATENATION

        // Ornek : Bir String ve iki integer variable olusturun. String degeri ile Integer larin toplamini console yazdirin

        String x = "elma";
        int z    = 5;
        int v    = 10;
        System.out.println(x+z+v);//elma510
        System.out.println(z+v+x);//15elma
        System.out.println(x+z*v);//elma50
        System.out.println(x+(z+v));//elma15
        System.out.println(z+x+v);//5elma10
        System.out.println(x+v/z);//elma2


        //**************************************************OPERATORS
        int kisiSayisi = 10;
        int paraMiktari =25; //10 kişiye para miktarını paylaştırıcaz
        System.out.println(paraMiktari/kisiSayisi); //2 verdi yanlış javada 1 tamsayıy 1 tamsayıya bölersek sonuç tam sayı verir

        int ogrenciSayisi = 10;
        double ucretMiktari =25;
        System.out.println(ucretMiktari / ogrenciSayisi); /*2.5 verdi dogru bir mat.islemde farkli data
                                                             typelerini kullanirsaniz sonuç herzaman büyük data tipinde olur*/

        /*2) Java da "logical operator" ler AND VE OR islemler "logical operator" lardir


        CAY       AND     KAHVE       SONUC
        true      &&      false       false
        false     &&      true        false
        false     &&      false       false
        true      &&      true        true

        NOTE: AND (&&) isleminden true alabilmek icin hersey true olmalidir.
                AND islemi "perfectionist" tir bir tane bile false sonucu false yapar

        CAY       OR      KAHVE       SONUC
        true      ||      false       true
        false     ||      true        true
        false     ||      false       false
        true      ||      true        true

        Note : OR(||) isleminde bir tane true sonucu true yapmaya yeterlidir
        OR isleminde sonucun false olabilmesi icin hersey false olmalidir

        3) NOT Operatoru (!) true olani false , false olani true yapar
        !true  ==> false
        !false ==> true
        !!true ==> true

        4) Comparison (Karsilastirma) Operators
                <,>,<=,>=, ==(eşittir), !=(eşit değil)

        Note==> Karsilastirma operatorlerini kullandiginizda sonuc kesinlikle boolean (true, false)alirsiniz


        boolean first = 3 < 5;          //true
        boolean second = 2 + 3 != 5;    //false
        boolean third = 2 + 3 * 5 >= 19;//false

        System.out.println(first && second );//false
        System.out.println(first || second || third );//true */

        //**************************************************TYPECASTING

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