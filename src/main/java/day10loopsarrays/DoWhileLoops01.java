package day10loopsarrays;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {

         /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
         */

            Scanner input = new Scanner(System.in);
            int counter = 0;

            do{
                if(counter==4){
                    System.out.println("Hesabınız bloke olmustur!");
                    break;
                }

                System.out.println("Lutfen username giriniz");
                String userName = input.next();

                System.out.println("Lutfen password giriniz");
                String password = input.next();

                if(userName.equals("admin") && password.equals("pwd123")){ // equals kosul belirtildiğinde kullanılır yani username ve password belii
                    //if de deikki eger username admin ise ve password pwd123 ise hesabınıza hosgeldiniz yazdir.
                    System.out.println("Hesabınıza hosgeldiniz");
                    break;
                }
                counter++;//0 dan baslayarak 1 arttır ve en son 4 te bitir dedik
                System.out.println("yanlis girdiniz");
            }while (true);
        /*sonsuz döngü oluşturduk sürekli username ve password gir diyecek ama soruda 4 te bitir diyor
         if(counter==4){
                    System.out.println("Hesabınız bloke olmustur!");
                    break; bu kodu yazarak 4 kere girilmesini sagladık ve break ile bitirdik
         */
////////////////////////önemli olan teemel gereksinimlerden özele inmek mesela önce sout ve if kısmını gir ilk gereksinimleri karşıla
//////////////////////// sonra 1 arttırıarak  4 kere girme durumu ve 4 ten sonrasında yazı yazdırmaya baktık

    }
}
