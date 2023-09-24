package day11mutidimensionalarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class work11_01 {
    public static void main(String[] args) {
        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int[][] arr = new int[3][2];
        System.out.println(Arrays.deepToString(arr));
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Lutfen eklemek istediginiz sayiyi yazınız");
                int sayi = scan.nextInt();
                arr[i][j] = sayi;


            }

        }
        System.out.println(Arrays.deepToString(arr));
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int toplam = 0;
            for (int j = 0; j < arr[i].length; j++) {
                toplam = toplam + arr[i][j];

            }

            brr[i] = toplam;
        }
        System.out.println(Arrays.toString(brr));

        // Verilen bir array'den tekrar eden elemanları silip
        // tekrarsız elemanlardan olusan bir array haline donusturun
        //  int arr[]={1,2,2,3,4,4,5};

        int drr[] = {1, 2, 2, 3, 4, 4, 5};

        ArrayList<Integer> tekrarsiz = new ArrayList<>();

        for (int w : drr) {
            if (!tekrarsiz.contains(w)) {
                tekrarsiz.add(w);
            }
        }
        System.out.println("array:" + tekrarsiz);
        /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("İşlem yapmak istediginiz +, - , * , / simgelerinden birini giriniz ");
        char islem = scan1.next().charAt(0);
        System.out.println("Birinci sayiyi giriniz");
        double sayi1 = scan1.nextDouble();
        System.out.println("İkinci sayiyi giriniz");
        double sayi2 = scan1.nextDouble();
        if (islem == '+' || islem == '-' || islem == '*' || islem == '/'){
            hesapMakinesi(islem, sayi1, sayi2);

        }else{
            System.out.println("Hatal igiris yaptınız");
        }
    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {

        switch (islem){
            case '+':
                System.out.println(sayi1 + sayi2);
                break;
            case'-':
                System.out.println(sayi1 - sayi2);
                break;
            case '*':
                System.out.println(sayi1 * sayi2);
                break;
            case'/':
                System.out.println(sayi1 / sayi2);
        }
    }

}

