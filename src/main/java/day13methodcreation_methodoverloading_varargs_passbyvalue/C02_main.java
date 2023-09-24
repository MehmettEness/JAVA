package day13methodcreation_methodoverloading_varargs_passbyvalue;
import java.util.Scanner;
public class C02_main {
    public static void main(String[] args) {
        C01_methodCreation.hosgeldinMesaji();
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen toplamak icin 1'i cıkarmak 2'yi carpmak icin 3 u bolmek 4u us almak icin 5i ");
        int sayi=scan.nextInt();

        switch (sayi) {
            case 1:
                HesapMakinesi.toplama();
                break;
            case 2:
                HesapMakinesi.cikartma();
                break;
            case 3:
                HesapMakinesi.carpma();
                break;
            case 4:
                HesapMakinesi.bolme();
                break;
            case 5:
                HesapMakinesi.usAlma();
                break;

            default:
                System.out.println("hatali giris yaptiniz lutfen duzgun giriniz");
                break;


        }

    }
}

