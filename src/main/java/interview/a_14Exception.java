package interview;

public class a_14Exception {

    public static void main(String[] args) {
        bolmeIslemi(12, 0);


        String s = "1234a";
        covertStringToInt(s);

        String b = "Java";
        stringdenKarakterAl(b, 5);

        String arr[] = {"j", "a", "v", "a"};
        ArraydenElemanVer(arr, 5);

        String t = "Mehmet Enes";
        int y = 12;
        int u = 1;
        elemanVer(t, y, u);
    }

    public static void bolmeIslemi(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Bu sayiyi 0 a bölemezsin...");
        }
        //////////////////////////////////////////////////////////////////////////


    }

    public static void covertStringToInt(String s) {
        try {
            int ints = Integer.valueOf(s);
            System.out.println(ints + 1);
        } catch (NumberFormatException e) {
            System.out.println("Bir stringin İnt e dönüşmesi icin rakam dısı karakter içermemsi gerekeri...");
            System.out.println(e.getMessage());
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


    }

    public static void stringdenKarakterAl(String b, int idx) {
        try {
            char ch = b.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Karakter dısına cıktınız o yüzden bu hatayı aldınız");
        }


    }

    public static void ArraydenElemanVer(String c[], int bdx) {
        try {
            String eleman = c[bdx];
            System.out.println(eleman);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Karakter dısına cıktınız tekrar deger giriniz.");

        }

    }

    public static void elemanVer(String t, int y, int u) {
        try {
            int deger = y / u;
            char chh = t.charAt(deger);
            System.out.println(chh);
        }catch (ArithmeticException e){
            System.out.println("Sayiyi 0 a bölemezsin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("karakter dısına cıktınız");
        }

    }
}
