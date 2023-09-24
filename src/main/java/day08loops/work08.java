package day08loops;

public class work08 {
    public static void main(String[] args) {

        //Ekrana 5 defa hi... yazdırınız
        for (int i = 1; i < 6 ; i++) {
            System.out.println("hi...");
        }

        //Example 3 : 40 dan 23 e kadar tüm cift sayilari ekrana yazdir
        for (int i = 40; i > 22; i--) {
            if (i%2==0){
                System.out.println(i);
        }
}
        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        //           "I love Java" ==> "I love J"

        String j="I love Java";
        for (int i = 0; i < j.length(); i++) {
            char a = j.charAt(i);
            if (a=='a'){
                break;
            }
            System.out.print(a);
        }
        //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String small = "Pwd12?Ab";
        for (int i = 0; i < small.length(); i++) {
            char ch = small.charAt(i);
            if (ch>='a' && ch<='z'){
                continue;
            }else{
                System.out.print(ch);

            }
            System.out.println();
          }
        //Ornek : Bir Stringi ters ceviren kodu yaziniz

        //      "enes"              ==>             "sene"

        String s1 = "enes";
        String s2 = "";

        for (int i =s1.length()-1; i >=0 ; i--) {

        s2 = s2+s1.charAt(i);
        }
        System.out.println('"' + s2 + '"');

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        int deger = 0 ;

        for (int i = 578; i >0 ; i=i/10) {

            deger=deger+ i%10;

        }
        System.out.println(deger);
    }
}
