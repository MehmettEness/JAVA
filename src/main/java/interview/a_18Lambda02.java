package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class a_18Lambda02 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


        listtekiEharfleriHaricElelmanalariVer(myList);
        System.out.println();

        listkarakterSayisiTekrarsiz(myList);
        System.out.println();

        List<String> newList = listKarakterlerinBestenbuyukolanlar(myList);
        System.out.println(newList);

        List<String> newwList = listkarakterBesAz(myList);
        System.out.println(newwList);

        tekrarsizElemnlariBuyukHarfleAl(myList);
        System.out.println();
    }
    //Example 1: Bir List'teki E ile baslayanlar haric tum elemanlari
    // console'a yazdiran method'u olusturunuz.

    public static void listtekiEharfleriHaricElelmanalariVer (List<String> myList){
        myList.stream().filter(t->!t.startsWith("E")).forEach(t-> System.out.print(t+ " "));
    }
    //Example 2: Bir List'te character sayisi 5 den az olan tum elemanlari tekrarsiz
    // olarak console'a yazdiran method'u olusturunuz.

    public static void listkarakterSayisiTekrarsiz (List<String> myList){
        myList.stream().filter(t->t.length()<5).distinct().forEach(t-> System.out.print(t+ " "));
    }
    //Example 3: Bir List'teki character sayisi 5 dahil ve cok olan tum elemanlari buyuk harflerle
    // bir listin icinde veren method'u olusturunuz.

    public static List<String> listKarakterlerinBestenbuyukolanlar (List<String> myList){
       return myList.stream().filter(t->t.length()>=5).map(t->t.toUpperCase()).collect(Collectors.toList());
    }
    //Example 4: Bir List'teki character sayisi 5 den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.

    public static List<String> listkarakterBesAz (List<String> myList){
        return myList.stream().distinct().filter(t->t.length()<5).map(t-> t.toLowerCase()).collect(Collectors.toList());
    }
    //Example 5: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada
    // console'a yazdiran method'u olusturunuz.

    public static void tekrarsizElemnlariBuyukHarfleAl (List<String> myList){
        myList.stream().distinct().map(t->t.toUpperCase()).forEach(t-> System.out.print(t+ " "));

    }




}
