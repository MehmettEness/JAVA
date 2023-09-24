package day16staticoop;

import java.time.LocalDate;

public class work16 {
    static double pi ;

    static {
        pi=3.14;
        System.out.println("static block 1");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }
    //şirketin subat ayında 1000 ama geri kalan aylarda 2000 olmasını saglayan

    public static int price;

    static {
        System.out.println("static block 2");
        LocalDate fiyat = LocalDate.now();
        if (fiyat.getMonthValue()==2){
            price=2000;
        }else{
            price=1000;
        }

    }
}
