package day18oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();
        // s1. dersek sadece stdName ve age görürüz neden cunku public oldukları icin

       //s1.getStdId() bunu görebiliriz okumak icin sonuna .sout getirirz.

        //getter icin

        System.out.println(s1.getStdId());//AC20231212121
        System.out.println(s1.getNotOrt());//3.13
        System.out.println(s1.isSuccesful());//false

        System.out.println("==================================");


        s1.setStdId("WE302fgh51");
        s1.setNotOrt(3.25);
        s1.setSuccesful(true);

        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        System.out.println("==================================");

        s1.setStdId("SA548755559");
        s1.setNotOrt(2.99);
        s1.setSuccesful(false);

        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());



    }
}
