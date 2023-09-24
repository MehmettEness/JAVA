package interview;

import java.util.Arrays;

public class a_06Arrays_Md {
    public static void main(String[] args) {
        String ogrIsmi[]=new String[3];

        ogrIsmi [2] = "Arslan";
        ogrIsmi [1]= "Mehmet";
        ogrIsmi [0]= "Enes";
        System.out.println(Arrays.toString(ogrIsmi));

        //yukaridaki ifadelerin karaketer sayisini toplamını al

        int num = 0;

        for ( String  w : ogrIsmi  ) {
            num = num+ w.length();
        }
        System.out.println(num);
        System.out.println("\n---------------------------------------------");

        /*Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
                    [12, 3, -3, 5, 23] ==> 3, -3 */

        int numbers[]= {12,3,-3,5,23};
        for ( int w : numbers) {
            if (w<5){
                System.out.print(w+ " ");
            }
        }
        System.out.println();
        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        String yazi [] = s.split(" ");
        System.out.println(yazi.length);

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]

        int r []= {0,2,3,0,12,0};
        int t []= new int[r.length];
        int deger =0;

        for ( int w  : r ) {
            if (w!=0){
                t[deger]=w;
                deger++;


                System.out.println(Arrays.toString(t));
            }
        }
        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        int numberss [][]= { {5,4} , {2,3,2} }; // int numbers [][]= { {} , {} };
        // soru bizden { {5,4} , {2,3,2} } => {5,4,2,3,2} cevir diyor

        //1.Adım : İki boyutlu arrayde kaç eleman oldugunu bulan kodu bulmalıyız

        int toplamElemanSayisi = 0;
        for ( int[] w: numberss) {//foreach yazıp int[] yazmalıyız cunku { {5,4} , {2,3,2} } int [] olur
            toplamElemanSayisi= toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);

        System.out.println("\n----------------------------------------------------------------------------------");

        //Example : Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int small = ages[0][0]; // 0  degerleri en basta baslayacagi için
        int big = ages[0][0];


        for (int[] w : ages) { //foreach /ilk döngü için {15, 4} degerini w koyuyoruz

            for (int k : w) { //burayaa 15 ve 4 degerlerini koyduk

                small = Math.min(small, k); //min(15,4) degerlerini aldık ve min methodu 4 u aldı
                //yukarıdaki işlemler sırasıyla devam etti.12  43  21 icin



                big = Math.max(big, k);
            }

        }
        System.out.println(small);//9  {15, 9} en kücük sayiyi verdi
        System.out.println(big);
        System.out.println(small+big);


        //Verilen String bir arraydeki en uzun ve en kisa Stringleri yazdıran bir method olusturun

        String isimler []={"Selma","Ahmet","Cigdem","Ayten","Zafer","Rümeysa","Enes"};
        enUzunveEnKisa(isimler);
    }
    private static void  enUzunveEnKisa(String[] isimler){
        String max=isimler[0];
        String min=isimler[0];
        for (  String w: isimler ) {
            if(max.length()<w.length()){
                max=w;
            }
            if (min.length()>w.length()){
                min=w;
            }
        }
        System.out.println("en kisa String :" +min);
        System.out.println("en uzun String :" +max);

        //Verilen bir arraye yeni bir element ekleyin

        int grr []={1,2,3,4,5,6,7,8,9};
        int sayi=12;

        int yeniArr[]=new int [grr.length+1];//[0,0,0,0,0,0,0,0,0,0]

        for (int i = 0; i < grr.length; i++) {

            yeniArr[i]=grr[i];

        }
        yeniArr[yeniArr.length-1]=sayi;
        System.out.println(Arrays.toString(yeniArr));

    }
}
