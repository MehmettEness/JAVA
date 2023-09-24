package interview;

public class a_05Forloops {
    public static void main(String[] args) {
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String cumle = "I love Java";

        for (int i = 0; i < cumle.length(); i++) {
            char ch = cumle.charAt(i);
            if (ch=='a'){

 break;
            }
            System.out.print(ch);
        }

        System.out.println("\n--------------------------");
        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A


        String harf = "Pwd12?Ab";

        for (int i = 0; i < harf.length(); i++) {
            char cha= harf.charAt(i);
            if (cha>='a' && cha<='z'){
                continue;//bu karakterleri alma dedik..
            }else {
                System.out.print(cha);
            }
        }

        System.out.println();

        System.out.println("\n-------------------------------");

        String harf1 = "Pwd12?Ab";
        String ters = "";
        for (int i = harf1.length()-1; i >=0 ; i--) {
            ters = ters + harf1.charAt(i);
        }

        System.out.println(ters);

         /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....
    */

        for (int i = 1; i < 5; i++) {
            System.out.println("week :" + i);

            for (int j = 1; j < 8; j++) {
                System.out.println("day :" + j);

            }
        }

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }


    }
}
