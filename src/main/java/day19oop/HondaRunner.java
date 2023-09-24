package day19oop;

public class HondaRunner {
    public static void main(String[] args) {
        Civic mycivic = new Civic();
        mycivic.cool();


        Accord yourAccord = new Accord();
        yourAccord.cool();

      //7)den sonra yazdık - 2
        System.out.println(Ac.price); //2000 //Ac. dedeigimizde price gelir

        //  public static final int price= 3000 ; degistirere engine ve security e yazdıkk
        System.out.println(Engine.price);//3000
        System.out.println(Security.price);//5000



        //default void eco (){ ulasmak icin
        mycivic.eco(); //Az yakıt tüketir.

        //engine deki stop methoduna ulasmak icin
        Engine.stop(); //Güvenle durur

    }
}
