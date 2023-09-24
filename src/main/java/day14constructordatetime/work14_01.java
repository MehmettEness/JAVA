package day14constructordatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class work14_01 {
    public static void main(String[] args) {
        LocalDate dayy = LocalDate.now();
        System.out.println(dayy);//2023-09-04

        System.out.println(dayy.getMonthValue());//9
        System.out.println(dayy.getDayOfWeek());//MONDAY
        System.out.println(dayy.getMonth());//SEPTEMBER
        System.out.println(dayy.getYear());//2023
        System.out.println(dayy.getEra());//CE
        System.out.println(dayy.plusMonths(3));//2023-12-04
        System.out.println(dayy.plusDays(3));//2023-09-07
        System.out.println(dayy.minusYears(5));//2018-09-04

        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sırasıyla yil , ay, gün numarası giriniz");
        int year =scan.nextInt();
        int month =scan.nextInt();
        int day=scan.nextInt();

        LocalDate tarih=LocalDate.of(year, month, day);
        if (tarih.isBefore(LocalDate.now())){
            System.out.println("gecersiz tarih girdiniz");
        }else{
            System.out.println("Zamani girebilirsiniz");
        }
        LocalTime time = LocalTime.now();//23:39:24.502833900
        System.out.println(time);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH : mm : ss");
        String datee= dtf1.format(time);
        System.out.println(datee);

    }
}
