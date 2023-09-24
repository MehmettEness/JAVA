package day03wrapperconcatenationoperators;

public class Operators {
    public static void main(String[] args) {
        /*
        1)+ - * / işlemleri javada matematikte kullanıldıgı gibi kullanılır
        Note 1: javada 1 tamsayıy 1 tamsayıya bölersek sonuç tam sayı verir
        Note 2: Eger sonuc tamsayı degilse java ondalİk kismini iptal eder onu int e cevirir.
        Note 3: Bir mat.islemde farkli data typelerini kullanirsaniz sonuç herzaman büyük data tipinde olur
         */

        int kisiSayisi = 10;
        int paraMiktari =25; //10 kişiye para miktarını paylaştırıcaz
        System.out.println(paraMiktari/kisiSayisi); //2 verdi yanlış javada 1 tamsayıy 1 tamsayıya bölersek sonuç tam sayı verir

        int ogrenciSayisi = 10;
        double ucretMiktari =25;
        System.out.println(ucretMiktari / ogrenciSayisi); /*2.5 verdi dogru bir mat.islemde farkli data
                                                             typelerini kullanirsaniz sonuç herzaman büyük data tipinde olur*/
        /*
         2) Java da "logical operator" ler AND VE OR islemler "logical operator" lardir


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
        System.out.println(first || second || third );//true

          */

    }
}
