package day25lambda;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
        public static void main(String[] args) {

            List<String> myList = new ArrayList<>();
            myList.add("Ali");
            myList.add("Elif");
            myList.add("Yusuf");
            myList.add("Elif");
            myList.add("Zeynep");
            myList.add("Mustafa");

            printElementsExceptStartWithE(myList); //Ali Yusuf Zeynep Mustafa
            System.out.println();
            printDistinctElementsLengthLessThanFive(myList);//Ali Elif
            System.out.println();
           List<String> newList= getElementLengthMoreThanFiveWithUpperCase(myList);//[ZEYNEP, MUSTAFA]
            System.out.println(newList);
            printElementsLengthLessThanFiveUniqueLowerCase(myList);//ali elif
            System.out.println();
            printElementsLengthLessThanFiveUniqueUpperCase(myList);//ALİ ELİF MUSTAFA YUSUF ZEYNEP
            System.out.println();
            printElementsUniqueLowerCaseSortWithLength(myList);//ali elif yusuf zeynep mustafa
            System.out.println();

        }
            //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
            // console'a yazdiran method'u olusturunuz.

            public static void printElementsExceptStartWithE (List<String> myList){

            myList.
                    stream().
                    filter(t->!t.startsWith("E")).
                    forEach(t-> System.out.print(t+ " "));

            }

            //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari tekrarsiz
            // olarak console'a yazdiran method'u olusturunuz.

            public static void printDistinctElementsLengthLessThanFive (List<String> myList){

            myList.stream().distinct().filter(t->t.length()<5).forEach(t-> System.out.print(t+" "));

            }


            //Example 3: Bir List'teki character sayisi 5 den cok olan tum elemanlari buyuk harflerle
            // bir listin icinde veren method'u olusturunuz.

        public static List<String> getElementLengthMoreThanFiveWithUpperCase (List<String> myList){

          return myList.stream().filter(t->t.length()>5).map(t->t.toUpperCase()).collect(Collectors.toList()); //collect(Collectors.toList()) = Stream alır ve liste döndürür
        }


            //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
            // natural order da console'a yazdiran method'u olusturunuz.

    public static void printElementsLengthLessThanFiveUniqueLowerCase (List<String> myList){

            myList.stream().distinct().filter(t->t.length()<5).map(t->t.toLowerCase()).sorted().forEach(t-> System.out.print(t+" "));
    }



            //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
            // console'a yazdiran method'u olusturunuz.

     public static void printElementsLengthLessThanFiveUniqueUpperCase (List<String> myList){
            myList.stream().distinct().sorted().map(t->t.toUpperCase()).forEach(t-> System.out.print(t +" "));

     }


            //Example 6: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten
            // buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElementsUniqueLowerCaseSortWithLength (List<String> myList){
            myList.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));

            //Comparator.comparing(t->t.length() uzunluklarına göre kıyasla karsılastır dedik.

    }


        }

