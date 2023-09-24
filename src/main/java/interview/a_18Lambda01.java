package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a_18Lambda01 {
    public static void main(String[] args) {
          /*
        1)Lambda "Functional "(Method) programmingdir, digeri "Structured Programming"(yani öncekiler Structured di)
        2) Functional programmingte ne yapilacak uzerine yogunlasilir
           "Structured Programming" te nasil yapilacak uzerine yoğunlasilir
        3) Functional programming Collection lar ve Arrayler ile kullanilir
        4) Lambda (Functional programming) java 8 ile kullanilmaya baslanmistir
         */

        List<Integer>nums = new ArrayList<>(Arrays.asList(12,9,131,14,19,100,4,12,15));

        printElement(nums);
        System.out.println(nums);


    }
    public static void printElement (List<Integer>nums){
        nums.stream().forEach(t-> System.out.println(t + " "));
    }

}
