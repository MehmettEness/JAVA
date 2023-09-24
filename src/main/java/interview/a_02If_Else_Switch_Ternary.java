package interview;

import java.util.Scanner;

public class a_02If_Else_Switch_Ternary {
    public static void main(String[] args) {

  //    Scanner scan = new Scanner(System.in);
  //    System.out.println("Lutfen sayi giriniz");
  //    int deger = scan.nextInt();
  //    ;
  //    if (deger > 0) {
  //        System.out.println("pozitif");
  //    } else if (deger < 0) {
  //        System.out.println("negatif");
  //    } else {
  //        System.out.println("notr");
  //    }
  //    Scanner input = new Scanner(System.in);
  //    System.out.println("Lutfen yasınızı girip aralıgı görünüz");
  //    byte yas = input.nextByte();
  //    if (yas<0){
  //        System.out.println("gecerli yas giriniz");

  //    } else if (yas<5) {
  //        System.out.println("bebek");

  //    }else if (yas<13) {
  //        System.out.println("cocuk");

  //    } else if (yas<21) {
  //        System.out.println("genc");
  //    }else if (yas<31) {
  //        System.out.println("yetiskin");
  //    }else if (yas>31) {
  //        System.out.println("olgun");
  //    }else{
  //        System.out.println("tanımlı degil");
  //    }
  //    Scanner scan1= new Scanner(System.in);
  //    System.out.println("Gün ismi giriniz");
  //    String gun = scan1.nextLine();

  //    boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
  //    boolean haftaIci = gun.equalsIgnoreCase("Pazartesi")||gun.equalsIgnoreCase("Salı")||gun.equalsIgnoreCase("Carsamba")||
  //            gun.equalsIgnoreCase("Persembe")||gun.equalsIgnoreCase("cuma");

  //    if (haftaSonu){
  //        System.out.println("Girdiginiz gün ismi haftasonuna aittir.");
  //    } else if (haftaIci) {
  //        System.out.println("Girdiginiz gün ismi haftaicine aittir.");
  //    }else  {
  //        System.out.println("Malesef boyle bir gun ismi mevcut degil");
  //    }
  //    System.out.println("--------------------------------------");

  //    Scanner scan3 = new Scanner(System.in);
  //    System.out.println("Lutfen gun ismi giriniz");
  //    String gunIsmi = scan3.next();

  //    switch (gunIsmi.toLowerCase()) {
  //        case "pazartesi":
  //            System.out.println(1); case "salı": System.out.println(2); case "carsamba" : System.out.println(3); case "persembe" : System.out.println(4); case "cuma" : System.out.println(5); case "cumartesi" : System.out.println(6); case "pazar" : System.out.println(7); default : System.out.println("tanımlanmamıs gün ismi");
  //    }

        /*
        Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
        Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


                NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
        4, 6, 9, 11. aylar 30 gun çeker
        2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen yil girinizz ");
        int yil = scann.nextInt();
        System.out.println("Lutfen ay giriniz");
        int ay = scann.nextInt();
        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Bu ay 31 gun ceker");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Bu ay 30 gun ceker");
                break;
            case 2:
            if (yil%4==0){
                System.out.println("Bu ay 29 gun ceker");
            } else{
                System.out.println("Bu ay 28 gün ceker");
                break;

            } default:
                System.out.println("Lutfen 1-12 aarası deger giriniz");


        }

        //Ternary
        //String ve int ifadeler varsa biz bunu Object kavanozuna koyarız.
        int a =10;
        int b = -15;
        Object result = (a<0 && b<0) || (a>0 && b>0) ? a*b : "Farklı isaretli sayilari carpamıyorum";
        System.out.println(result);

        //interview question
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */

        int yill = 1600;
        String cikti = yill%100==0 ? yill%400==0 ? "Leap" : "Leap degil" : yill%4==0 ? "Leap " : "Leap Degil";
        System.out.println(cikti);




    }
}















