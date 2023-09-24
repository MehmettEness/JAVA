package day19oop;

public class ö_astra implements ö_Klima, ö_Guc, ö_Guvenlik {

    @Override
    public void cool() {
        System.out.println("astra hızlı sogutmaz");

    }
    @Override
    public void run() {
        System.out.println("astra çok hızlı gider");
    }
}
