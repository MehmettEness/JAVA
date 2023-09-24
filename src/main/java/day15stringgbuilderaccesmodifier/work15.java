package day15stringgbuilderaccesmodifier;

public class work15 {
    public static void main(String[] args) {
        String s = "Java";
        String t = s + '!';
        String e = t + '6';
        System.out.println(e);


        StringBuilder sb4 = new StringBuilder("Mehmet");
        sb4.append(" Enes");
        System.out.println(sb4);

        StringBuilder sb1 = new StringBuilder();

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        sb1.append("Java");

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        StringBuilder sb5 = new StringBuilder(8);
        sb5.append("mehmetenes");
        System.out.println(sb5);

        StringBuilder sb9 = new StringBuilder("Mehmet enes arslan");
        sb9.reverse();
        System.out.println(sb9);
        sb9.deleteCharAt(0);
        System.out.println(sb9);
        sb9.delete(0,6);
        System.out.println(sb9);
        sb9.replace(0,4, "x");
        sb9.insert(2, "60");
        System.out.println(sb9);
        sb9.reverse();
        System.out.println(sb9);
        sb9.replace(8, 12, "arslan");
        System.out.println(sb9);
        sb9.delete(6,8);
        System.out.println(sb9);
        StringBuilder sb10 = new StringBuilder("Enes");
        StringBuilder sb11 = new StringBuilder("Anes");
        int r1 = sb10.compareTo(sb11);
        System.out.println(r1);//4 harf sonra




    }

}
