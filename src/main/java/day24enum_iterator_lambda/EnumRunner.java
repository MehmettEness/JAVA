package day24enum_iterator_lambda;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities hatay = new Cities(); bu sekilde olmuyor obje olusturmak icin

        //Enumda bir sabite nasıl ulasabiliriz.

        //String hatay = Cities.HATAY; burada hata verir

        Cities hatay = Cities.HATAY;
        System.out.println(hatay);//HATAY

        //Adana sabitinin ismine ulasalım

       String cityname = Cities.ADANA.getCityName();
        System.out.println(cityname);//Adana

        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu);//06000

        int plakaKodu = Cities.İSTANBUL.getPlateCode();
        System.out.println( plakaKodu);//34

        //Kullanıcıdan bir ilin plaka kodunu alarak bunun hangi il oldugunu consola yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Plaka kodunu giriniz");
        int plaka = scan.nextInt();

        //values () methodu enum icindeki tüm dataları bir array icinde bize verir

        Cities sehir [] =  Cities.values();
       //System.out.println(Arrays.toString(sehir)); tüm sehirleri array icine aldık

        if (plaka>81 || plaka<0){
            System.out.println("Yanlıs plaka degeri girdiniz");
            for ( Cities w : sehir ) {
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName()+ " iline aittir");
                    break;
        }
           }

        }

    }
}
