package day19oop;

public class Accord implements Ac, Engine, Security{
    @Override
    public void cool() {
        System.out.println("Accord mükemmel sogutur.");
    }

    @Override
    public void run() {
        System.out.println("Accord cool");
    }
}
