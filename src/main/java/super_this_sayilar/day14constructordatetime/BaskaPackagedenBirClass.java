package super_this_sayilar.day14constructordatetime;

import day15stringgbuilderaccesmodifier.Student;

public class BaskaPackagedenBirClass {
    public static void main(String[] args) {

        Student veli = new Student();
        System.out.println(veli.stdName); //Ali Can
        //sadece stdName görürüz çünkü public
        //bu class day15 den veri cekmek icin baktık
    }
}
