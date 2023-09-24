package day19oop;

public class ö_corsa implements ö_Klima, ö_Guc, ö_Guvenlik {

    @Override
    public void cool() {
        System.out.println("Corsa hızlı sogutur");
    }

    @Override
    public void run() {
        System.out.println("Corsa hızlıdır");
    }
}
