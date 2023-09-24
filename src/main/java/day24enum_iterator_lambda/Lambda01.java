package day24enum_iterator_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

         /*
        1)Lambda "Functional "(Method) programmingdir, digeri "Structured Programming"(yani öncekiler Structured di)
        2) Functional programmingte ne yapilacak uzerine yogunlasilir
           "Structured Programming" te nasil yapilacak uzerine yoğunlasilir
        3) Functional programming Collection lar ve Arrayler ile kullanilir
        4) Lambda (Functional programming) java 8 ile kullanilmaya baslanmistir
         */

        //Kısayoldan List olusturma
        List<Integer> nums = new ArrayList<>(Arrays.asList(12,9,131,14,9,100,4,12,15));

        //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
        // yazdiran method'u olusturunuz.(Structured == Yapisal)


        printElements1(nums);
        System.out.println(nums);
        System.out.println();
        printElements2(nums);
        System.out.println(nums);
    }

    public  static void printElements1(List<Integer> nums){
        for (  Integer w: nums ) {
            System.out.print(w+" ");
        }

    }

    //1) Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak
    // yazdiran method'u olusturunuz.(Functional)

    public  static void printElements2(List<Integer> nums){
        nums.stream().forEach(t-> System.out.print(t+" "));

        //stream methodu yukarıdan asagıya akıs demek

        //forEach = her bir eleman icin demek

        //akıstaki tüm akısı t  icine koyuyor yani t-> = t icin sout yap dedik
    }



}
