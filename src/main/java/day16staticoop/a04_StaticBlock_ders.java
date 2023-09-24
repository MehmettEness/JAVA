package day16staticoop;
import java.time.LocalDate;

public class a04_StaticBlock_ders {
    //Bir variable olusturdugunuzda deger atamazsaniz o variable i initialize etmediniz demektir.
    static double pi;

    //Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekebilir
    //bu yuzden static block lar kullanilir
    //static variable lar static blocklar icinde initialize edilirse o classin icinde herseyden once
    //hazir hale getirilmis olur



    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println("main method");
    }
//şirketin subat ayında 1000 ama geri kalan aylarda 2000 olmasını saglayan
    public static int price;
    //birden fazla static block  var ise yukaridan asagiya calisir
    static {
        System.out.println("static block 2");

        LocalDate currentDate = LocalDate.now();
        if(currentDate.getMonthValue()==2){ // ne zaman subat ayı olur o zaman price mi 1000 yap
            price=1000;
        }else {
            price=2000; // subat ayı dısında degerimi 2000 yap dedik
        }
    }

    static {
        pi = 3.14;
        System.out.println("static block 1");
    }



}
