package day15stringgbuilderaccesmodifier;

public class StudentRunner {

    public static void main(String[] args) {



        Student ali = new Student();
        //stdName ,address ,email görürüz ancak ssnId göremeyiz cünkü aynı classda degil.
        System.out.println(ali.stdName);//Ali Can
        System.out.println(ali.address);//Istanbul
        System.out.println(ali.email);//alican@gmail.com


        //public class StudentRunner { bir class private olamaz
        //private class StudentRunner { olamaz

        //public class StudentRunner { bir class protected olamaz
        //protected class StudentRunner { olamaz

    }
}
