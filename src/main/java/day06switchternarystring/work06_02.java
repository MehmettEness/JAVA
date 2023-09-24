package day06switchternarystring;

import java.util.Scanner;

public class work06_02 {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();
        if(sayi1>0 && sayi2>0){
            System.out.println("toplam=" + (sayi1 + sayi2));
        }else if(sayi1<0 && sayi2<0){
            System.out.println("carpma=" + (sayi1 * sayi2));
        } else if ((sayi1>0 && sayi2<0) || (sayi1<0 && sayi2>0) ) {
            System.out.println("Farkli isaretlerde sayilarla islem yapamam");
        }else{
            System.out.println("sıfır carpmaya göre yutan elemandır");
        }
        /*
      Kullanıcıdan sisteme bir numara girmesini isteyin.

      Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.

      Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Rakam" yazdırın,
      10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın.

  */
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam = scan1.nextInt();
        if (rakam<0){
            System.out.println("Negatif sayi");
        }else{
            if (rakam<10){
                System.out.println("Rakam");
            }else{
                System.out.println("pozitif sayi");
            }
        }
         /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        //condition ? code1  : code2

        Scanner scan2 = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int deger = scan2.nextInt();

        Object degerr = deger%2==0 ? "cift sayidir " : deger+3 ;
        System.out.println(degerr);

        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan3 = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        int sayii = scan3.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayii1= scan3.nextInt();

        Object degerrr = sayii==sayii1 ? "Sayilar birbirine esittir" : sayii>sayii1 ? sayii : sayii1 ;
        System.out.println(degerrr);

        /*
        Kullanıcıdan yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
        Girilen ay numarasına göre ayin kaç gün çektigini yazdırınız.


                NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun çeker
        4, 6, 9, 11. aylar 30 gun çeker
        2. ay 4 yılda bir 29 gun ceker, diger yıllarda 28 gun ceker
        */
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil = scan4.nextInt();
        System.out.println("Ay giriniz");
        int ay = scan4.nextInt();
        switch (ay){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 gün ceker");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 gün ceker");
            case 2:
                if (yil%4==0){
                    System.out.println("29 gün ceker");
                }else{
                    System.out.println("28 gün ceker");
                }
                break;
            default:
                System.out.println("1-12 arasında deger giriniz");
        }



    }
}
