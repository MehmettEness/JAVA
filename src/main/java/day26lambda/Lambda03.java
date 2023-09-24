package day26lambda;

import java.util.stream.IntStream;

public class Lambda03 {

    public static void main(String[] args) {
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine());
        System.out.println(getFactorial(4));
        System.out.println(getSumOfEvensBetweenTwoInteger(3,5));

        //4)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    }
    public static int getSumFromSevenToSeventy(){
       return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt(); //getAsInt() streami int methoduna cevirdi bunun nedeni başta puclic kısmına int yazmamız
    }

    //3den 9 a kadar tüm sayilarin carpımını veren methodu olusturun
    public static int getMultiplicationFromThreeToNine(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();

    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){   //kullanıcı verecekkk

        if (x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Faktöreyl işlemi negatif sayi ile yapamaz");
            return -1;
        }else {
            return IntStream.
                    rangeClosed(1,x).
                    reduce(Math::multiplyExact).
                    getAsInt(); //bunu 1 den başlattık ama kullanıcı - li ifade veya 0 yazabilir. o Yüzden if icinde yazarız

                    //hepsinde int kullanmamızın nedeni int kullanndıgımız icin yani her türlü return icine ifade yazmak zorundayız

        }
    }

    //Size verileb iki tamsayi arasındaki tüm cift sayilarin toplamını veren kodu yaziniz.

    public static int getSumOfEvensBetweenTwoInteger(int a , int b){

        if(a>b){
            int temp =a;

            a=b;

            b=temp;

        }

       return IntStream.

               range(a+1,b).

               filter(Utils::isNumberEven).

               sum(); //sum bize direk toplamı verir
    // range methodu ile a ve b yi dahil etmedik. Normalde range de a yi dahil b yi haric alır. a yi dahil etmemek icin +1 ekleriz

    }



//Distinct    :Tekrarsız
//Reduce      :Çoklu datanın teke indirilmesi(azaltılması)
//Sorted      :Küçükten büyüğe sıralar.
//RevoredOrder :Tersten sıralama yapar yani;büyükten küçüğe
//Collect     :Topla demek.
//Comparator  :Karşılaştırır ve sıralar(renkleri,uzunlukları)
//RemoveIf    :Belli kurala uyuyorsa sil demek.
//IntStream   :Tüm integerları stream formatında verir.Tam sayılardan oluşan aralık verir.
//Range       :Başlangıç dahil, bitiş hariç
//RangeClosed :Çoku teke redution yapmak. Seçim yapmak.
//LongSream   :Uzunlukları verir.
//GetAsInt    :Int gibi demek.







}
