package day11mutidimensionalarrays;

public class Md03 {
    public static void main(String[] args) {

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


    }
}
