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

        /*
        stream() = verileni alt alta koymaya yarar
        filter() = filtrelemeye yarar
        map() = method degistirmek icin kullanırız
        distinct () =tekrarsiz elemanları alır.
        reduec () = toplu olan string ifadeyi teke düsürmeye yarar.
        sorted() =alfabetik numeretik sıraya göre dizer
        get() = methodu ile bize Integer verdi
        findFirst() = bize ilk elemanı verir.
         */


        List<Integer>nums = new ArrayList<>(Arrays.asList(12,9,131,14,9,10,4,12,15));

        printElement(nums);
        System.out.println();

        ciftElemanlar(nums);
        System.out.println();

        tekSayiElemanlariKareleri(nums);
        System.out.println();

        tekSayiKupleriniAl(nums);
        System.out.println();

        tekrarsizCıftElemanKarlerininToplamı(nums);
        System.out.println();

        tekrarsizCiftKaresininCarpimi(nums);
        System.out.println();

        maksimumDegeri(nums);
        System.out.println();

        yedidenBuykSayilar(nums);
        System.out.println();


    }
    public static void printElement (List<Integer>nums){
        nums.stream().forEach(t-> System.out.print(t + " "));
    }
    //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)

    public static void ciftElemanlar(List<Integer>nums){
        nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+ " "));
    }
    //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayiElemanlariKareleri (List<Integer>nums){
        nums.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t+ " "));
    }
    //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
    // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayiKupleriniAl (List<Integer>nums){
        nums.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+ " ") );

    }
    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun

    public static void tekrarsizCıftElemanKarlerininToplamı (List<Integer>nums){
     int  kavan =  nums.
             stream().
             distinct().
             filter(t->t%2==0).
             map(t-> t*t).
             reduce(0,(t,u)->t+u);
        System.out.println(kavan);

    }
    //5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin" "çarpımını" hesaplayan bir method oluşturun

    public static void tekrarsizCiftKaresininCarpimi(List<Integer>nums){
      int kavan1 =  nums.
              stream().
              distinct().
              filter(t->t%2==0).
              map(t->t*t).
              reduce(1,(t,u)->t*u);
        System.out.println(kavan1);
    }

    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    public static void maksimumDegeri (List<Integer>nums){
     int max =   nums.stream().distinct().sorted().reduce(Math::max).get();
        System.out.println(max);
    }
    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun

    public static void yedidenBuykSayilar (List<Integer>nums){
     int deger =   nums.stream().filter(t->t>7 && t%2==0).sorted().findFirst().get();
        System.out.println(deger);
    }

    }



