package interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class a_19Lambda03 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        lisetedekiEileBaslayanlar(myList);
        System.out.println();

        List<String> newlist = getElementLengthMoreThanFiveWithUpperCase(myList);
        System.out.println(newlist);

        printElementsUniqueToUpperCaseSorted(myList);
        System.out.println();

        printElementsUniqeLowerCaseSortWithLength(myList);
        System.out.println();

        removeIfLengthGreaterThanFive(myList);
        System.out.println();

        removeIfElementsStartsWithZorEndWithf(myList);
        System.out.println();

        int sum = yedidenYetmiseKadarElemanYazdır();
        System.out.println(sum);
        System.out.println();
        System.out.println(yedidenYetmiseKadarElemanYazdır());

        System.out.println(getMultiplicationFromThreeToNine());

        System.out.println(getFactorial(5));


    }
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void lisetedekiEileBaslayanlar(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.contains("E")).
                forEach(a_19Utils::konsolaYazdirmakIcinKullanabilirsin);
    }

    //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk harflerle
    // bir listin icinde veren method'u olusturunuz.
    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String> myList) {
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase). //class name :: method name--> method reference
                        collect(Collectors.toList());
    }

    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.
    public static void printElementsUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(a_19Utils::konsolaYazdirmakIcinKullanabilirsin);
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten
    // buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElementsUniqeLowerCaseSortWithLength(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                forEach(a_19Utils::konsolaYazdirmakIcinKullanabilirsin);

    }
    //1) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    public static void removeIfLengthGreaterThanFive(List<String> myList) {
        myList.removeIf(t -> t.length() > 5);
        System.out.println(myList);

    }
    //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    //1.yol
    public static void removeIfElementsStartsWithZorEndWithf(List<String> myList) {
        myList.removeIf(t -> t.charAt(0) == 'Z' || t.charAt(t.length() - 1) == 'f');
        System.out.println(myList);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //4)7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    public static int yedidenYetmiseKadarElemanYazdır() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt(); //Math::addExact toplamını vver
    }

    //3den 9 a kadar tüm sayilarin carpımını veren methodu olusturun
    public static int getMultiplicationFromThreeToNine() {
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();

    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.

    public static int getFactorial(int x) {   //kullanıcı verecekkk

        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("Faktöreyl işlemi negatif sayi ile yapamaz");
            return -1;
        } else {
            return IntStream.
                    rangeClosed(1, x).
                    reduce(Math::multiplyExact).
                    getAsInt();

        }
    }
    //Size verileb iki tamsayi arasındaki tüm cift sayilarin toplamını veren kodu yaziniz.

    public static int ikiTamSayi (int a , int b ){

        if (a>b);
        int temp=a;
        a=b;
        b= temp;
        //üstteki kodu yazmamızını nedeni a b den büyük olursa 0 veriyor o yüzden a ile b nin yerini degistirdik

     return IntStream.range(a,b).filter(t->t%2==0).sum();
    }
}













