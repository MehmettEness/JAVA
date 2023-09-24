package day19oop;

public interface Engine {
    void run();

    public static final int price= 3000 ;

    //11 den sonra yazdık tek basına void stop(){ yazarsak olmaz kızzar ama static koyarsak olurr
    static void stop(){
        System.out.println("Güvenle durur");
    }
}
