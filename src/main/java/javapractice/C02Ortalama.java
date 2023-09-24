package javapractice;

public class C02Ortalama {
     /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
        ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine böl
     */

    public static void main(String[] args) {

        double num1 = 23.4;//ondalıklı sayılarda nokta kullanılır
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;
       double toplam = num1 + num2 + num3 + num4 + num5 ;
        System.out.println("toplam = " + toplam); //609.7

        //toplam /5 ile ortalamayı bulacagız
        double ortalama = toplam/5;
        System.out.println("ortalama = " + ortalama);
    }

}
