package day14constructordatetime;

public class work14 {

    String make ="honda";
    String model ="civic";
    int year = 2022;

    public void hareket(){
        System.out.println("Motor saglam");
    }

    public void dur (){
        System.out.println("ABS mevcut");
    }
    public work14(String make , String model, int year){
        this.model=model;
        this.year=year;
        this.make=make;
    }

    @Override
    public String toString() {
        return "work14{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
