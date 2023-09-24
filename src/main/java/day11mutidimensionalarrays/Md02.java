package day11mutidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {


        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz

        int numbers [][]= { {5,4} , {2,3,2} }; // int numbers [][]= { {} , {} };
        // soru bizden { {5,4} , {2,3,2} } => {5,4,2,3,2} cevir diyor

        //1.Adım : İki boyutlu arrayde kaç eleman oldugunu bulan kodu bulmalıyız

        int toplamElemanSayisi = 0;
        for ( int[] w: numbers) {//foreach yazıp int[] yazmalıyız cunku { {5,4} , {2,3,2} } int [] olur
           toplamElemanSayisi= toplamElemanSayisi+w.length;
        }
        System.out.println(toplamElemanSayisi);

        //2.Adım : Tek boyulu arrayın iki boyutlu arrayin eleman sayisini kullanaral olusturmaliyiz

        int newArr []= new int[toplamElemanSayisi]; // [toplamElemanSayisi] [0,0,0,0,0] 5 tane

        //3.Adım : iki boyutlu arraydeki elemanları tek boyutlu arraye transfer etmeliyiz

        int idx=0;
        for ( int [] w : numbers ) {//foreach yazdık ve w kavanozumuzda [5,4] , [2,3,2] var ve sırayla k kavanozumuza koyacak
            for ( int k : w ) {

                newArr[idx]=k; //en üste int idx=0; yazmalıyız
              /*newArr [0] = 5
                newArr [1] = 4
                newArr [2] = 2
                newArr [3] = 3
                newArr [4] = 2
                                */
                idx++;
            }
        }

        System.out.println(Arrays.toString(newArr)); //[5, 4, 2, 3, 2]
    }
}
