package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynepx");
        myList.add("Mustafa");



      //  removeIfLengthGreaterThanFive(myList);
      // removeIfElementsStartsWithZorEndWithf(myList);

        removeIfElementContainsX(myList);
    }
    //1) Character sayisi 5'ten fazla olan elemanları silen bir method oluşturun.

    public static void removeIfLengthGreaterThanFive( List<String> myList){
        myList.removeIf(t->t.length()>5);
        System.out.println(myList); //[Ali, Elif, Yusuf, Elif]
    }

    //2 ) 'Z' ile başlayan yada 'f' ile biten elemanları silen bir method oluşturun.

    //1.yol
    public static void removeIfElementsStartsWithZorEndWithf(List<String> myList){
        myList.removeIf(t-> t.charAt(0)=='Z' || t.charAt(t.length()-1)=='f');
        System.out.println(myList);

    }

    //X karakteri iceren elemanlari silen bir method olusturun

    public static void removeIfElementContainsX(List<String> myList){
        myList.removeIf(t->t.contains("x"));
        System.out.println(myList);
    }



}