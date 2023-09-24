    package day13methodcreation_methodoverloading_varargs_passbyvalue;

    import java.util.Scanner;

    public class HesapMakinesi {

            static Scanner scan=new Scanner(System.in);
            static double sayi1;
            static double sayi2;
            public static void toplama(){
                System.out.println("lutfen toplamak istediginiz sayilari giriniz");
                sayi1 = scan.nextDouble();
                sayi2 = scan.nextDouble();
                System.out.println(sayi1+sayi2);
                //return a+b;
            }
            public static void cikartma() {
                System.out.println("lutfen cıkarmak istediginiz sayilari giriniz");
                sayi1 = scan.nextDouble();
                sayi2 = scan.nextDouble();
                System.out.println(sayi1-sayi2);
            }
            public static void bolme() {
                System.out.println("lutfen bolme istediginiz sayilari giriniz");
                sayi1 = scan.nextDouble();
                sayi2 = scan.nextDouble();
                if (sayi2>0) {
                    System.out.println(sayi1 / sayi2);
                }else System.out.println("payda 0 olur mu len!!");
            }
            public static void carpma() {
                System.out.println("lutfen carpma istediginiz sayilari giriniz");
                sayi1 = scan.nextDouble();
                sayi2 = scan.nextDouble();
                System.out.println(sayi1 * sayi2);
            }

            public static void usAlma() {
                System.out.println("lutfen istediginiz sayilari giriniz");
                sayi1 = scan.nextDouble();
                sayi2 = scan.nextDouble();
                double carpim=1;
                //4,3 4*4*4
                // for (double i = sayi2; i >0 ; i--) {
                //
                // }
                if (sayi2>0) {
                    for (; sayi2 > 0; sayi2--) {
                        carpim *= sayi1;
                    }
                    System.out.println(carpim);
                }//negatif kismi odev

            }
        }


