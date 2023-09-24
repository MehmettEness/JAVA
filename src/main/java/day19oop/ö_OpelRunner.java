package day19oop;

public class ö_OpelRunner {

    public static void main(String[] args) {

        ö_corsa Corsa = new ö_corsa();
        Corsa.cool();

        ö_astra Astra = new ö_astra();
        Astra.cool();


        System.out.println(ö_Klima.price);
        System.out.println(ö_Guvenlik.price);
        System.out.println(ö_Guc.price);

        System.out.println(ö_Guc.performan);

        ö_Guvenlik.stop();


    }
}