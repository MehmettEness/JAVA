package super_this_sayilar.day14constructordatetime;

public class work14_runner {
    public static void main(String[] args) {

        work14 c1 = new work14("mehmet", "enes", 1991);
        System.out.println(c1.make);

        work14 c2 = new work14("enes" , "arslan", 2025);
        System.out.println(c2);

        c1.dur();
        c1.hareket();
    }

}
