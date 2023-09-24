package day08loops;

public class ForLoops02 {
    public static void main(String[] args) {

        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) { // veya for (int i = 0 ; i <= s.length()-1 ; i++) yapilabilir

            char ch = s.charAt(i); // böyle yaparak sadeleştirmiş oluruz
            if (ch == 'a') {
                break; // a harfini bulduğu zaman geri kalanını atar ve yazdırır.
            }

            System.out.print(ch);


        }
    }
}