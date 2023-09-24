package day19oop;

public class Civic implements Ac, Engine, Security {// expents olmuyor kırmızı yanıyor üzerine geldigimizde bize diyor ki implemets e cevir diyor
                                                    // kırmızının üzerine geldigimizde override etmemiz gerekiyor



    @Override
    public void cool() {
        System.out.println("Civic güzel sogutur");
    }

    @Override
    public void run() {
        System.out.println("AC runs supper");
    }


}














