package super_this_sayilar.day14constructordatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {

        LocalDate myCurruntDate =LocalDate.now();
        System.out.println(myCurruntDate); // 2023-08-28 şimdiki tarihi verir
        // import java.time.LocalDateTime; javanın localdata kütüphanesinden aldı buraya koydu
        //.now dedigimizde şimdiki zamanı aldı

        System.out.println(myCurruntDate.getMonthValue()); //sadece ayı alabilmemiz icin myCurruntDate.getMonthValue() yazarız //8

        System.out.println(myCurruntDate.getYear()); //sadece yılı alabilmemiz icin // 2023

        System.out.println(myCurruntDate.getDayOfMonth());//28

        System.out.println(myCurruntDate.getMonth());//AUGUST // bu enamdır yani depodur getmonth dedigimizde bize 8.ay olan august getirir.

        System.out.println(myCurruntDate.getDayOfWeek()); //MONDAY // bu enamdır yani depodur getDayOfWeek dedigimizde bize 28.günün hangi gün ismi oldugunu verri

        //ileri tarihe nasıl gidilir?

        System.out.println(myCurruntDate.plusDays(3).plusMonths(2).plusYears(1)); // bugunden 1 yıl 2 ay 3 gün sonrasını verir 2024-10-31

        //gecmis tarihe nasıl gidilir

        System.out.println(myCurruntDate.minusYears(1).minusMonths(3).minusDays(9)); //bugunden 1 yıl 3 ay 9 gün öncesini verir 2022-05-19

        //spesifik bir tarih objesi nasıl olusturulur.


        LocalDate date1 =  LocalDate.of(1980,8,10); // LocalDate.of dedigimizde karşımıza cıkan secenekten seceriz.
        LocalDate date2 =  LocalDate.of(1990,8,10);
        System.out.println(date1); //1980-08-10

      boolean r1 = date1.isBefore(date2);  //1.tarih 2.tarihten önce mi dedik
        System.out.println(r1); // true

      boolean r2 = date1.isAfter(date2);//1.tarih 2.tarihten sonra mi dedik
        System.out.println(r2); //false

      boolean r3 =  date1.isEqual(date2); //1.tarih 2.tarihe eşit mi dedik
        System.out.println(r3); //false

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner scan = new Scanner(System.in); // kullanıcıdan istedik
        System.out.println("Lütfen sırasıyla yıl , ay , gün numarası giriniz");


       int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();


       LocalDate givenDate = LocalDate.of(year,month,day); // neden local date dedik çünkü spesifik olsun istiyoruz

       if(givenDate.isBefore(LocalDate.now())){ // şimdiki tarihten gecmis degeri girerse
            System.out.println("Gecersiz tarih girdiniz");
        }else{
            System.out.println("Zamani girebilirsiniz");
        }
        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.

        //yukarıda objeolusturduk tekrardan aynısını yazmaya gerek yok yani bir kalıp hazır

        System.out.println("Lütfen sırasıyla yıl , ay , gün numarası giriniz");
       int y = scan.nextInt();
        int a = scan.nextInt();
        int g = scan.nextInt();

        LocalDate date = LocalDate.of(y,a,g);

        System.out.println(date.getDayOfWeek());

    }
}
