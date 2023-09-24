package day08loops;

public class ForLoops03 {
    public static void main(String[] args) {
        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz
        //"Pwd12?Ab" ==> P12?A

        String s1= "Pwd12?Ab";


        for (int v = 0; v < s1.length() ; v++) {

            char chh = s1.charAt(v);

            if(chh>='a' && chh<='z') {
                continue; // loop yaaparken bazi elemanlari islemem sokmamak icin kullanilir
            }else{
                System.out.print(chh);
            }
        }
        System.out.println();

        //break switch disina cikmak için kullanilir
        //loop yaaparken bazi elemanlari islemem sokmamak icin kullanilir


        //Ornek : Bir Stringi ters ceviren kodu yaziniz

        //      "Java"              ==>             "avaJ"

        String t = "Java";
        String ters = "";

        for (int i = t.length()-1 ;  i >=0 ; i--) {
            // t.legent sondan bir önceki alır( yani = 3 ) / i-- dememizdeki neden tersini aalabilmek eger ki i++ yaparsak sonsuz döngüye gireriz

          ters = ters  +  t.charAt(i);
        }
        System.out.println(ters);



    }
}

