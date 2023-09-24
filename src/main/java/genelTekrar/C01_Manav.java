package genelTekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class C01_Manav {
    public static void main(String[] args) {
        /*
        kucuk bir manav uygulamasi yapın kullanicidan
        hangi sebzeyi almak istedigini sorun aldigi sebzeye gore islemlere devam edin
         */
        Scanner scan=new Scanner(System.in);
        ArrayList<String>sebzeler=new ArrayList<>();
        sebzeler.add("salatalik : 1");
        sebzeler.add("domates : 2");
        sebzeler.add("biber : 3");
        sebzeler.add("patlican : 4");
        sebzeler.add("kabak : 5");
        sebzeler.add("mantar : 6");
        int sebze;
        ArrayList<String>alinanListesi=new ArrayList<>();
        double kilo;
        double toplam=0;
        do {
            System.out.println("lutfen almak istediginiz sebzenin numarasini giriniz \n"+sebzeler+" burdan sırasiyla secinin siz 0'e basana kadar islem devam edicek");
            sebze= scan.nextInt();
            switch (sebze) {
                case 1:
                    System.out.println("salataliğin kilosu : 15$\nkaç kilo almak istersiniz");
                    kilo = scan.nextDouble();
                    toplam += kilo * 15;
                    alinanListesi.add("salataliktan "+kilo+"kilo aldiniz. "+kilo*15+" tl toplam salatalik tutari.");
                    break;
                case 2:
                    System.out.println("dometesin kilosu : 20\nkaç kilo almak istersiniz");
                    kilo = scan.nextDouble();
                    toplam += kilo * 20;
                    alinanListesi.add("domates "+kilo+" kilo aldiniz. "+kilo*20+" tl toplam domates tutari.");
                    break;
                case 3:
                    System.out.println("biberin kilosu : 25.5\nkaç kilo almak istersiniz");
                    kilo = scan.nextDouble();
                    toplam += kilo * 25.5;
                    alinanListesi.add("biber"+kilo+" aldiniz. "+kilo*25.5+" tl toplam biber tutari.");
                    break;
                case 4:
                    System.out.println("patlicanin kilosu : 10\nkaç kilo almak istersiniz");
                    kilo = scan.nextDouble();
                    toplam += kilo * 10;
                    alinanListesi.add("patlican"+kilo+" aldiniz. "+kilo*10+" tl toplam patlican tutari.");
                    break;
                case 5:
                    System.out.println("kabakin kilosu : 7\nkaç kilo almak istersiniz");
                    kilo = scan.nextDouble();
                    toplam += kilo * 7;
                    alinanListesi.add("kabak"+kilo+" aldiniz. "+kilo*7+" tl toplam kabak tutari.");
                    break;
                case 6:
                    System.out.println("mantarin kilosu : 12.5\nkaç kilo almak istersiniz");
                    kilo = scan.nextDouble();
                    toplam += kilo * 12.5;
                    alinanListesi.add("mantar"+kilo+" aldiniz. "+kilo*12.5+" tl toplam mantar tutari.");
                    break;
                case 0:
                    System.out.println("Manav uygulamasında cıkısı gerceklestirdiniz bizi tercih ettiginiz icin thx tekrar gorusmek uzere");
                    System.out.println("fişiniz burada mevcut");
                    for (String w:alinanListesi
                    ) {
                        System.out.println(w);
                    }
                    System.out.println("toplam tutar: "+toplam);


                    break;
                default:
                    System.out.println("yanliş bir tuslama yaptiniz lutfen tekrar deneyiniz");
                    break;

            }
        }while (sebze!=0);

    }
}