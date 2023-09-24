package day17oop;

public class Honda extends Car{

    public Honda(){
        //super(); bunun gören java car classına gider car();
        super();
        System.out.println("super.km = " + super.km); //car daki km aldı
        System.out.println("super.model = " + super.model);//car daki modeli aldı
        System.out.println("this.km = " + this.km);//buradaki km aldı
        System.out.println("this.model = " + this.model);//buradaki modeli aldı
        System.out.println("Honda 1");
    }
    public Honda(String model, int year){

        System.out.println("Honda 2");
    }

    public String model ="Civic";
    public int km =10000;


}
