package day07StringManipulations;

public class work06_07 {
    public static void main(String[] args) {
        String s = "Mehmet Enes Arslan";
        int crc = s.length();
        System.out.println(crc);

        char ilk = s.charAt(1);
        char son = s.charAt(s.length() - 1);

        System.out.println(ilk);
        System.out.println(son);

        String sub1 = s.substring(0, 6);
        System.out.println(sub1);
        String sub2 = s.substring(7, 11);
        System.out.println(sub2);
        String sub3 = s.substring(12, 18);
        System.out.println(sub3);
        String sub4 = s.substring(15);
        System.out.println(sub4);

        boolean sub5 = s.contains("Arslan");
        System.out.println(sub5);

        boolean sub6 = s.startsWith("Mehmet");
        System.out.println(sub6);

        boolean sub7=s.endsWith("Arslan");
        System.out.println(sub7);

        String k = "Ben javada 4000$ kazandim";
        String k1 = k.replace("kazandim", "kaybettim");
        System.out.println(k1);
        String k2 = k.replaceAll("[a-zA-Z]", "");
        System.out.println(k2);
        int num = k.replaceAll("[^0-9]" , "1").length();
        System.out.println(num);

        String name ="Yagmur Gurgen";
        int name1 = name.length();
        System.out.println(name1);
        char name2=name.charAt(0);
        System.out.println(name2);
        String name3 = name.substring(0,7);
        System.out.println(name3);
        boolean name4= name.contains("Gurgen");
        System.out.println(name4);
        boolean name5 =name.startsWith("Mehmet");
        System.out.println(name5);
        boolean name6 = name.endsWith("Gurgen");
        System.out.println(name6);


    }
}
