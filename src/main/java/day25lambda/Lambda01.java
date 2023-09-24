package day25lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(12, 9, 131, 14, 9, 10, 4, 12, 15));

        //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
        // method'u olusturunuz.(Structured)

        printEvenElements1(nums);//12 14 10 4 12
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOrderElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElementss(nums);
        System.out.println();
        getMaxValue1(nums);
        System.out.println();
        getMaxValue2(nums);
        System.out.println();
        getMazValue4(nums);
        System.out.println();
        getMinGresyrtThanDrbrnEben(nums);
        System.out.println();


    }

    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //1a) Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran
    // method'u olusturunuz.(Functional)
    public static void printEvenElements2(List<Integer> nums) {
        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
        //filter = Adı üstünde filtrelemek demek biz burada 2 ye bölümünden kalan 0 lari al dedik

        //2) Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda  aralarina
        // bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    }

    public static void printSquareOfOrderElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 != 0).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
        //map methodu değiştirmek istedigimizde kullanırız

        //3) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina
        // bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    }

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));
        //distinct = tekrarsız olan elemanları alır

    }

    //4)Bir list'teki "tekrarsiz" "CIFT " ELEMANLARIN "karelerinin" "toplamını" hesaplayan method oluşturun
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        int sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.print(sum);
        //reduec = ne zaman bir stringe (stream().distinct().filter(t-> t%2==0).map(t->t*t).) yani toplu datayi
        // bir tane elemana indirgemek istiyorsak bunu kullanırız. Yani cogu teke indiririz.
        // reduce(0,(t,u)->t+u); 0 koyacagız cünkü toplamada etkisz eleman 0 dır.
        //t ve u degerleri de iki degeri topla demek yani ne kadar deger varsa topla dedik.

    }
    //5) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin" "çarpımını" hesaplayan bir method oluşturun

    public static void printSumOfSquaresOfDistinctEvenElementss(List<Integer> nums) {
        int sum1 =
                nums.
                        stream().
                        distinct().
                        filter(t -> t % 2 == 0).
                        map(t -> t * t).
                        reduce(1, (t, u) -> t * u);
        System.out.println(sum1);
    }

    //6)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

    //1.yoll
    public static void getMaxValue1(List<Integer> nums) {
        int max =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);//t ve u nun dgerleri icin her zaman büyük olanı sec
        System.out.println(max);
    }

    //2.yoll
    public static void getMaxValue2(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        sorted().    // sorted =alfabetik numeretik sıraya göre dizer
                        reduce((t, u) -> u).get(); // get methodu ile bize Integer verdi
        System.out.println(max);


    }

    //3.yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer max =
                nums.
                        stream().
                        distinct().
                        sorted().    // sorted =alfabetik numeretik sıraya göre dizer
                        reduce(Math::max).
                        get(); // get methodu ile bize Integer verdi
        System.out.println(max);
    }
    //7)Verilen List'teki "minimum değeri" bulmak için bir method oluşturun

    public static void getMazValue4(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted().reduce(Math::min).get();
        System.out.println(min);
    }

    //8)Verilen List'ten 7 den buyuk en kucuk cift sayi yi bulmak için bir method oluşturun
    public static void getMinGresyrtThanDrbrnEben(List<Integer> nums) {

        Integer min = nums.
                stream().
                filter(t -> t > 7 && t % 2 == 0).
                sorted().
                findFirst(). //ilk elemanı alır.
                        get();
        System.out.println(min);

    }
}